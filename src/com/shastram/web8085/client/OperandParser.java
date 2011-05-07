package com.shastram.web8085.client;

import java.util.HashMap;

import com.shastram.web8085.client.InstructionParser.Operand;

public abstract class OperandParser {
    private static HashMap<String, InstructionParser.Operand> map = createOperandMap();

    public abstract void parse(Parser parser, InstructionParser i,String line) throws Exception;

    private static HashMap<String, Operand> createOperandMap() {
        HashMap<String, Operand> map = new HashMap<String, Operand>();
        map.put("a", InstructionParser.Operand.A);
        map.put("b", InstructionParser.Operand.B);
        map.put("c", InstructionParser.Operand.C);
        map.put("d", InstructionParser.Operand.D);
        map.put("f", InstructionParser.Operand.E);
        map.put("h", InstructionParser.Operand.H);
        map.put("l", InstructionParser.Operand.L);
        return map;
    }

    /**
     * Registers must be in the range B..A
     * @param i
     * @param operands
     * @throws Exception
     */
    public static void parse2Register(InstructionParser i,String operands) throws Exception {
        String[] parts = getTwoOperands(operands);
        i.op1 = parseNormalRegister(parts[0]);
        i.op2 = parseNormalRegister(parts[1]);
    }

    public static String[] getTwoOperands(String operands) throws Exception {
        String[] parts = operands.split(",", 2);
        if(parts.length < 2) {
            throw new Exception("Expected two operands");
        }
        return parts;
    }

    public static void parseRegAndImmediate(InstructionParser i, String operands) throws Exception {
        String[] parts = getTwoOperands(operands);
        i.op1 = parseNormalRegister(parts[0]);

        short num = 0;
        try {
            num = parseNumber(parts[1]);
            i.setImmediate(num);
        } catch(NumberFormatException e) {
            throw new Exception("Not a valid number", e);
        }
    }

    /**
     * parse the string as one of the following register
     * B,C,D,E,H,L,M,A
     * @param reg
     * @return
     * @throws Exception
     */
    private static Operand parseNormalRegister(String reg) throws Exception {
        Operand op = map.get(reg);
        if(op == null) {
            throw new Exception(reg + " is not a valid register");
        }
        if(op.ordinal() >= InstructionParser.Operand.B.ordinal() &&
                op.ordinal() <= InstructionParser.Operand.A.ordinal()) {
            return op;
        }
        throw new Exception(reg + " is not a valid register");
    }

    public static void parseMovOperands(InstructionParser i,String operands) throws Exception {
        parse2Register(i, operands);
        if(i.op1 == InstructionParser.Operand.M && i.op2 == InstructionParser.Operand.M) {
            throw new Exception("Mov operand cannot have both operand set to memory");
        }
        i.code = 0x40 + i.op1.ordinal() * 8 + i.op2.ordinal();
    }

    protected static void parseMviOperands(InstructionParser i, String operands) throws Exception {
        parseRegAndImmediate(i, operands);
        i.code = i.op1.ordinal() * 8 + 6;
    }

    public static OperandParser zeroOperand = new OperandParser() {
        @Override
        public void parse(Parser parser, InstructionParser i, String line) throws Exception {
            i.code = i.baseCode;
        }
    };

    public static OperandParser oneOperand = new OperandParser() {
        @Override
        public void parse(Parser parser, InstructionParser i, String operands) throws Exception {
            i.op1 = parseNormalRegister(operands);
            i.code = i.baseCode + i.op1.ordinal();
        }
    };

    /**
     * Parse an immediate value operand.  The value must be within 16 bits.
     */
    public static OperandParser immediateOperand = new OperandParser() {
        @Override
        public void parse(Parser parser, InstructionParser i, String line)
                throws Exception {
            i.setImmediate(parseNumber(line));
            i.code = i.baseCode;
        }
    };

    public static OperandParser remainingLine = new OperandParser() {
        @Override
        public void parse(Parser parser, InstructionParser i, String line) throws Exception {
            parser.insertAssertion(i.ip, line);
            i.code = i.baseCode;
        }
    };

    private static Operand getOperand(String operands) throws Exception {
        Operand operand = map.get(operands.trim());
        if(operand == null) {
            throw new Exception("Operand expected. " + operands);
        }
        return operand;
    }

    /**
     * parse a string as a number. If the number ends with a H or an h
     * then it is considered a hex number
     * @param str
     * @return
     * @throws NumberFormatException if it cannot be parsed.
     */
    public static short parseNumber(String str) {
        short num = 0;
        str = str.trim();
        int base = 10;
        if(str.endsWith("h") || str.endsWith("H")) {
            base = 16;
            str = str.substring(0, str.length()-1);
        }
        num = Short.parseShort(str, base);
        return num;
    }
}
