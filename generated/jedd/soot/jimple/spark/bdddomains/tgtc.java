package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class tgtc extends Attribute {
    public final CONTEXT domain = (CONTEXT) CONTEXT.v();
    
    public Domain domain() { return domain; }
    
    public static Attribute v() { return instance; }
    
    private static Attribute instance = new tgtc();
    
    public tgtc() { super(); }
}