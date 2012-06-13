package com.shastram.web8085.client;

public class MicrocodeTable {

    /**
     * Instructions arranged according to their microcode.
     */
    public static MicroCode.OneInstruction[] table = new MicroCode.OneInstruction[] {
            new MicroCode.OneInstruction(0x00, "nop", "nop", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x01, "lxi", "lxi b", MicroCode.wordOperand, MicroCode.lxi),
            new MicroCode.OneInstruction(0x02, "stax", "stax b", MicroCode.noOperand, MicroCode.stax),
            new MicroCode.OneInstruction(0x03, "inx", "inx b", MicroCode.noOperand, MicroCode.inx),
            new MicroCode.OneInstruction(0x04, "inr", "inr b", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x05, "dcr", "dcr b", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x06, "mvi", "mvi b", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x07, "rlc", "rlc", MicroCode.noOperand, MicroCode.rlc),
            new MicroCode.OneInstruction(0x08, "", "assert", MicroCode.noOperand, MicroCode.assertRunner),
            new MicroCode.OneInstruction(0x09, "dad", "dad b", MicroCode.noOperand, MicroCode.dad),
            new MicroCode.OneInstruction(0x0a, "ldax", "ldax b", MicroCode.noOperand, MicroCode.ldax),
            new MicroCode.OneInstruction(0x0b, "dcx", "dcx b", MicroCode.noOperand, MicroCode.dcx),
            new MicroCode.OneInstruction(0x0c, "inr", "inr c", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x0d, "dcr", "dcr c", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x0e, "mvi", "mvi c", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x0f, "rrc", "rrc", MicroCode.noOperand, MicroCode.rrc),

            new MicroCode.OneInstruction(0x10, ".break", "invalid", MicroCode.noOperand, MicroCode.breakRunner),
            new MicroCode.OneInstruction(0x11, "lxi", "lxi d", MicroCode.wordOperand, MicroCode.lxi),
            new MicroCode.OneInstruction(0x12, "stax", "stax d", MicroCode.noOperand, MicroCode.stax),
            new MicroCode.OneInstruction(0x13, "inx", "inx d", MicroCode.noOperand, MicroCode.inx),
            new MicroCode.OneInstruction(0x14, "inr", "inr d", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x15, "dcr", "dcr d", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x16, "mvi", "mvi d", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x17, "ral", "ral", MicroCode.noOperand, MicroCode.ral),
            new MicroCode.OneInstruction(0x18, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x19, "dad", "dad d", MicroCode.noOperand, MicroCode.dad),
            new MicroCode.OneInstruction(0x1a, "ldax", "ldax d", MicroCode.noOperand, MicroCode.ldax),
            new MicroCode.OneInstruction(0x1b, "dcx", "dcx d", MicroCode.noOperand, MicroCode.dcx),
            new MicroCode.OneInstruction(0x1c, "inr", "inr e", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x1d, "dcr", "dcr e", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x1e, "mvi", "mvi e", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x1f, "rar", "rar", MicroCode.noOperand, MicroCode.rar),

            new MicroCode.OneInstruction(0x20, "rim", "rim", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x21, "lxi", "lxi h", MicroCode.wordOperand, MicroCode.lxi),
            new MicroCode.OneInstruction(0x22, "shld", "shld", MicroCode.wordOperand, MicroCode.shld),
            new MicroCode.OneInstruction(0x23, "inx", "inx h", MicroCode.noOperand, MicroCode.inx),
            new MicroCode.OneInstruction(0x24, "inr", "inr h", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x25, "dcr", "dcr h", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x26, "mvi", "mvi h", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x27, "daa", "daa", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x28, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x29, "dad", "dad h", MicroCode.noOperand, MicroCode.dad),
            new MicroCode.OneInstruction(0x2a, "lhld", "lhld", MicroCode.wordOperand, MicroCode.lhld),
            new MicroCode.OneInstruction(0x2b, "dcx", "dcx h", MicroCode.noOperand, MicroCode.dcx),
            new MicroCode.OneInstruction(0x2c, "inr", "inr l", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x2d, "dcr", "dcr l", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x2e, "mvi", "mvi l", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x2f, "cma", "cma", MicroCode.noOperand, MicroCode.cma),

            new MicroCode.OneInstruction(0x30, "sim", "sim", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x31, "lxi", "lxi sp", MicroCode.wordOperand, MicroCode.lxi),
            new MicroCode.OneInstruction(0x32, "sta", "sta", MicroCode.wordOperand, MicroCode.sta),
            new MicroCode.OneInstruction(0x33, "inx", "inx sp", MicroCode.noOperand, MicroCode.inx),
            new MicroCode.OneInstruction(0x34, "inr", "inr m", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x35, "dcr", "dcr m", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x36, "mvi", "mvi m", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x37, "stc", "stc", MicroCode.noOperand, MicroCode.stc),
            new MicroCode.OneInstruction(0x38, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0x39, "dad", "dad sp", MicroCode.noOperand, MicroCode.dad),
            new MicroCode.OneInstruction(0x3a, "lda", "lda", MicroCode.wordOperand, MicroCode.lda),
            new MicroCode.OneInstruction(0x3b, "dcx", "dcx sp", MicroCode.noOperand, MicroCode.dcx),
            new MicroCode.OneInstruction(0x3c, "inr", "inr a", MicroCode.noOperand, MicroCode.inr),
            new MicroCode.OneInstruction(0x3d, "dcr", "dcr a", MicroCode.noOperand, MicroCode.dcr),
            new MicroCode.OneInstruction(0x3e, "mvi", "mvi a", MicroCode.byteOperand, MicroCode.mvi),
            new MicroCode.OneInstruction(0x3f, "cmc", "cmc", MicroCode.noOperand, MicroCode.cmc),

            new MicroCode.OneInstruction(0x40, "mov", "mov b,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x41, "mov", "mov b,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x42, "mov", "mov b,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x43, "mov", "mov b,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x44, "mov", "mov b,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x45, "mov", "mov b,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x46, "mov", "mov b,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x47, "mov", "mov b,a", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x48, "mov", "mov c,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x49, "mov", "mov c,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4a, "mov", "mov c,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4b, "mov", "mov c,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4c, "mov", "mov c,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4d, "mov", "mov c,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4e, "mov", "mov c,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x4f, "mov", "mov c,a", MicroCode.noOperand, MicroCode.move),

            new MicroCode.OneInstruction(0x50, "mov", "mov d,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x51, "mov", "mov d,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x52, "mov", "mov d,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x53, "mov", "mov d,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x54, "mov", "mov d,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x55, "mov", "mov d,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x56, "mov", "mov d,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x57, "mov", "mov d,a", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x58, "mov", "mov e,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x59, "mov", "mov e,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5a, "mov", "mov e,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5b, "mov", "mov e,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5c, "mov", "mov e,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5d, "mov", "mov e,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5e, "mov", "mov e,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x5f, "mov", "mov e,a", MicroCode.noOperand, MicroCode.move),

            new MicroCode.OneInstruction(0x60, "mov", "mov h,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x61, "mov", "mov h,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x62, "mov", "mov h,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x63, "mov", "mov h,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x64, "mov", "mov h,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x65, "mov", "mov h,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x66, "mov", "mov h,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x67, "mov", "mov h,a", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x68, "mov", "mov l,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x69, "mov", "mov l,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6a, "mov", "mov l,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6b, "mov", "mov l,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6c, "mov", "mov l,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6d, "mov", "mov l,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6e, "mov", "mov l,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x6f, "mov", "mov l,a", MicroCode.noOperand, MicroCode.move),

            new MicroCode.OneInstruction(0x70, "mov", "mov m,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x71, "mov", "mov m,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x72, "mov", "mov m,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x73, "mov", "mov m,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x74, "mov", "mov m,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x75, "mov", "mov m,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x76, "hlt", "hlt", MicroCode.noOperand, MicroCode.hlt),
            new MicroCode.OneInstruction(0x77, "mov", "mov m,a", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x78, "mov", "mov a,b", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x79, "mov", "mov a,c", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7a, "mov", "mov a,d", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7b, "mov", "mov a,e", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7c, "mov", "mov a,h", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7d, "mov", "mov a,l", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7e, "mov", "mov a,m", MicroCode.noOperand, MicroCode.move),
            new MicroCode.OneInstruction(0x7f, "mov", "mov a,a", MicroCode.noOperand, MicroCode.move),

            new MicroCode.OneInstruction(0x80, "add", "add b", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x81, "add", "add c", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x82, "add", "add d", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x83, "add", "add e", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x84, "add", "add h", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x85, "add", "add l", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x86, "add", "add m", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x87, "add", "add a", MicroCode.noOperand, MicroCode.add),
            new MicroCode.OneInstruction(0x88, "adc", "adc b", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x89, "adc", "adc c", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8a, "adc", "adc d", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8b, "adc", "adc e", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8c, "adc", "adc h", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8d, "adc", "adc l", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8e, "adc", "adc m", MicroCode.noOperand, MicroCode.adc),
            new MicroCode.OneInstruction(0x8f, "adc", "adc a", MicroCode.noOperand, MicroCode.adc),

            new MicroCode.OneInstruction(0x90, "sub", "sub b", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x91, "sub", "sub c", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x92, "sub", "sub d", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x93, "sub", "sub e", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x94, "sub", "sub h", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x95, "sub", "sub l", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x96, "sub", "sub m", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x97, "sub", "sub a", MicroCode.noOperand, MicroCode.sub),
            new MicroCode.OneInstruction(0x98, "sbb", "sbb b", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x99, "sbb", "sbb c", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9a, "sbb", "sbb d", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9b, "sbb", "sbb e", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9c, "sbb", "sbb h", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9d, "sbb", "sbb l", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9e, "sbb", "sbb m", MicroCode.noOperand, MicroCode.sbb),
            new MicroCode.OneInstruction(0x9f, "sbb", "sbb a", MicroCode.noOperand, MicroCode.sbb),

            new MicroCode.OneInstruction(0xa0, "ana", "ana b", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa1, "ana", "ana c", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa2, "ana", "ana d", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa3, "ana", "ana d", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa4, "ana", "ana h", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa5, "ana", "ana l", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa6, "ana", "ana m", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa7, "ana", "ana a", MicroCode.noOperand, MicroCode.ana),
            new MicroCode.OneInstruction(0xa8, "xra", "xra b", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xa9, "xra", "xra c", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xaa, "xra", "xra d", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xab, "xra", "xra d", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xac, "xra", "xra h", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xad, "xra", "xra l", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xae, "xra", "xra m", MicroCode.noOperand, MicroCode.xra),
            new MicroCode.OneInstruction(0xaf, "xra", "xra a", MicroCode.noOperand, MicroCode.xra),

            new MicroCode.OneInstruction(0xb0, "ora", "ora b", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb1, "ora", "ora c", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb2, "ora", "ora d", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb3, "ora", "ora d", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb4, "ora", "ora h", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb5, "ora", "ora l", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb6, "ora", "ora m", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb7, "ora", "ora a", MicroCode.noOperand, MicroCode.ora),
            new MicroCode.OneInstruction(0xb8, "cmp", "cmp b", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xb9, "cmp", "cmp c", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xba, "cmp", "cmp d", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xbb, "cmp", "cmp d", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xbc, "cmp", "cmp h", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xbd, "cmp", "cmp l", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xbe, "cmp", "cmp m", MicroCode.noOperand, MicroCode.cmp),
            new MicroCode.OneInstruction(0xbf, "cmp", "cmp a", MicroCode.noOperand, MicroCode.cmp),

            new MicroCode.OneInstruction(0xc0, "rnz", "rnz", MicroCode.noOperand, MicroCode.rnz),
            new MicroCode.OneInstruction(0xc1, "pop", "pop b", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xc2, "jnz", "jnz", MicroCode.wordOperand, MicroCode.jnz),
            new MicroCode.OneInstruction(0xc3, "jmp", "jmp", MicroCode.wordOperand, MicroCode.jmp),
            new MicroCode.OneInstruction(0xc4, "cnz", "cnz", MicroCode.wordOperand, MicroCode.cnz),
            new MicroCode.OneInstruction(0xc5, "push", "push b", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xc6, "adi", "adi", MicroCode.byteOperand, MicroCode.adi),
            new MicroCode.OneInstruction(0xc7, "rst", "rst 0", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xc8, "rz", "rz", MicroCode.noOperand, MicroCode.rz),
            new MicroCode.OneInstruction(0xc9, "ret", "ret", MicroCode.noOperand, MicroCode.ret),
            new MicroCode.OneInstruction(0xca, "jz", "jz", MicroCode.wordOperand, MicroCode.jz),
            new MicroCode.OneInstruction(0xcb, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xcc, "cz", "cz", MicroCode.wordOperand, MicroCode.cz),
            new MicroCode.OneInstruction(0xcd, "call", "call", MicroCode.wordOperand, MicroCode.call),
            new MicroCode.OneInstruction(0xce, "aci", "aci", MicroCode.byteOperand, MicroCode.aci),
            new MicroCode.OneInstruction(0xcf, "rst", "rst 1", MicroCode.noOperand, MicroCode.nop),

            new MicroCode.OneInstruction(0xd0, "rnc", "rnc", MicroCode.noOperand, MicroCode.rnc),
            new MicroCode.OneInstruction(0xd1, "pop", "pop d", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xd2, "jnc", "jnc", MicroCode.noOperand, MicroCode.jnc),
            new MicroCode.OneInstruction(0xd3, "out", "out", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xd4, "cnc", "cnc", MicroCode.noOperand, MicroCode.cnc),
            new MicroCode.OneInstruction(0xd5, "push", "push", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xd6, "sui", "sui", MicroCode.byteOperand, MicroCode.sui),
            new MicroCode.OneInstruction(0xd7, "rst", "rst 2", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xd8, "rc", "rc", MicroCode.noOperand, MicroCode.rnc),
            new MicroCode.OneInstruction(0xd9, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xda, "jc", "jc", MicroCode.wordOperand, MicroCode.jc),
            new MicroCode.OneInstruction(0xdb, "in", "in", MicroCode.byteOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xdc, "cc", "cc", MicroCode.wordOperand, MicroCode.cc),
            new MicroCode.OneInstruction(0xdd, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xde, "sbi", "sbi", MicroCode.noOperand, MicroCode.sbi),
            new MicroCode.OneInstruction(0xdf, "rst", "rst 3", MicroCode.noOperand, MicroCode.nop),

            new MicroCode.OneInstruction(0xe0, "rpo", "rpo", MicroCode.noOperand, MicroCode.rpo),
            new MicroCode.OneInstruction(0xe1, "pop", "pop h", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xe2, "jpo", "jpo", MicroCode.wordOperand, MicroCode.jpo),
            new MicroCode.OneInstruction(0xe3, "xthl", "xthl", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xe4, "cpo", "cpo", MicroCode.wordOperand, MicroCode.cpo),
            new MicroCode.OneInstruction(0xe5, "push", "push h", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xe6, "ani", "ani", MicroCode.wordOperand, MicroCode.ani),
            new MicroCode.OneInstruction(0xe7, "rst", "rst 4", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xe8, "rpe", "rpe", MicroCode.noOperand, MicroCode.rpe),
            new MicroCode.OneInstruction(0xe9, "pchl", "pchl", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xea, "jpe", "jpe", MicroCode.wordOperand, MicroCode.jpe),
            new MicroCode.OneInstruction(0xeb, "xchg", "xchg", MicroCode.noOperand, MicroCode.xchg),
            new MicroCode.OneInstruction(0xec, "cpe", "cpe", MicroCode.wordOperand, MicroCode.cpe),
            new MicroCode.OneInstruction(0xed, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xee, "xri", "xri", MicroCode.noOperand, MicroCode.xri),
            new MicroCode.OneInstruction(0xef, "rst", "rst 5", MicroCode.noOperand, MicroCode.nop),

            new MicroCode.OneInstruction(0xf0, "rp", "rp", MicroCode.noOperand, MicroCode.rp),
            new MicroCode.OneInstruction(0xf1, "pop", "pop psw", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xf2, "jp", "jp", MicroCode.wordOperand, MicroCode.jp),
            new MicroCode.OneInstruction(0xf3, "di", "di", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xf4, "cp", "cp", MicroCode.wordOperand, MicroCode.cp),
            new MicroCode.OneInstruction(0xf5, "push", "push psw", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xf6, "ori", "ori", MicroCode.byteOperand, MicroCode.ori),
            new MicroCode.OneInstruction(0xf7, "rst", "rst 6", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xf8, "rm", "rm", MicroCode.noOperand, MicroCode.rm),
            new MicroCode.OneInstruction(0xf9, "sphl", "sphl", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xfa, "jm", "jm", MicroCode.wordOperand, MicroCode.jm),
            new MicroCode.OneInstruction(0xfb, "ei", "ei", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xfc, "cm", "cm", MicroCode.wordOperand, MicroCode.cm),
            new MicroCode.OneInstruction(0xfd, "", "invalid", MicroCode.noOperand, MicroCode.nop),
            new MicroCode.OneInstruction(0xfe, "cpi", "cpi", MicroCode.byteOperand, MicroCode.cpi),
            new MicroCode.OneInstruction(0xff, "rst", "rst 7", MicroCode.noOperand, MicroCode.nop),
    };

}
