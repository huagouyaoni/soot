package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public class Qlocal_srcm_stmt_signature_kindTrad extends Qlocal_srcm_stmt_signature_kind {
    private ChunkedQueue q = new ChunkedQueue();
    
    public void add(Local _local, SootMethod _srcm, Unit _stmt, NumberedString _signature, Kind _kind) {
        q.add(_local);
        q.add(_srcm);
        q.add(_stmt);
        q.add(_signature);
        q.add(_kind);
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        Iterator it =
          new jedd.internal.RelationContainer(new Attribute[] { srcm.v(), local.v(), kind.v(), signature.v(), stmt.v() },
                                              new PhysicalDomain[] { T1.v(), V1.v(), FD.v(), H2.v(), ST.v() },
                                              ("in.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-2" +
                                               "-jedd/src/soot/jimple/paddle/queue/Qlocal_srcm_stmt_signatur" +
                                               "e_kindTrad.jedd:40,22-24"),
                                              in).iterator(new Attribute[] { local.v(), srcm.v(), stmt.v(), signature.v(), kind.v() });
        while (it.hasNext()) {
            Object[] tuple = (Object[]) it.next();
            for (int i = 0; i < 5; i++) {
                add((Local) tuple[0],
                    (SootMethod) tuple[1],
                    (Unit) tuple[2],
                    (NumberedString) tuple[3],
                    (Kind) tuple[4]);
            }
        }
    }
    
    public Rlocal_srcm_stmt_signature_kind reader() { return new Rlocal_srcm_stmt_signature_kindTrad(q.reader()); }
    
    public Qlocal_srcm_stmt_signature_kindTrad() { super(); }
}