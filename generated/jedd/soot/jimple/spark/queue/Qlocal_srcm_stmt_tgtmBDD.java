package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Qlocal_srcm_stmt_tgtmBDD extends Qlocal_srcm_stmt_tgtm {
    private LinkedList readers = new LinkedList();
    
    public void add(Local _local, SootMethod _srcm, Unit _stmt, SootMethod _tgtm) {
        this.add(new jedd.internal.RelationContainer(new Attribute[] { local.v(), srcm.v(), stmt.v(), tgtm.v() },
                                                     new PhysicalDomain[] { V1.v(), T1.v(), ST.v(), T2.v() },
                                                     ("this.add(jedd.internal.Jedd.v().literal(new java.lang.Object" +
                                                      "[...], new jedd.Attribute[...], new jedd.PhysicalDomain[...]" +
                                                      ")) at /home/olhotak/soot-2-jedd/src/soot/jimple/spark/queue/" +
                                                      "Qlocal_srcm_stmt_tgtmBDD.jedd:33,8"),
                                                     jedd.internal.Jedd.v().literal(new Object[] { _local, _srcm, _stmt, _tgtm },
                                                                                    new Attribute[] { local.v(), srcm.v(), stmt.v(), tgtm.v() },
                                                                                    new PhysicalDomain[] { V1.v(), T1.v(), ST.v(), T2.v() })));
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        for (Iterator it = readers.iterator(); it.hasNext(); ) {
            Rlocal_srcm_stmt_tgtmBDD reader = (Rlocal_srcm_stmt_tgtmBDD) it.next();
            reader.add(new jedd.internal.RelationContainer(new Attribute[] { tgtm.v(), local.v(), stmt.v(), srcm.v() },
                                                           new PhysicalDomain[] { T2.v(), V1.v(), ST.v(), T1.v() },
                                                           ("reader.add(in) at /home/olhotak/soot-2-jedd/src/soot/jimple/" +
                                                            "spark/queue/Qlocal_srcm_stmt_tgtmBDD.jedd:38,12"),
                                                           in));
        }
    }
    
    public Rlocal_srcm_stmt_tgtm reader() {
        Rlocal_srcm_stmt_tgtm ret = new Rlocal_srcm_stmt_tgtmBDD();
        readers.add(ret);
        return ret;
    }
    
    public Qlocal_srcm_stmt_tgtmBDD() { super(); }
}