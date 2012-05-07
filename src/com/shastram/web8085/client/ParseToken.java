package com.shastram.web8085.client;

public class ParseToken {
    private InstructionParser ix;
    private Type type;
    private String token;

    public ParseToken(InstructionParser instruction, String token) {
        this.ix = instruction;
        this.token = token;
        // TODO: Maybe there is a better way to differentiate between asserts and instructions?
        type = instruction.name.equalsIgnoreCase("assert") ? Type.ASSERT : Type.INSTRUCTION;
    }

    public ParseToken(Type type, String token) {
        this.type = type;
        this.token = token;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InstructionParser getIx() {
        return ix;
    }

    public void setIx(InstructionParser ix) {
        this.ix = ix;
    }
}
