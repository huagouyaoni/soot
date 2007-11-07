/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AImplementsClause extends PImplementsClause
{
    private TImplements _implements_;
    private PClassNameList _classNameList_;

    public AImplementsClause()
    {
    }

    public AImplementsClause(
        TImplements _implements_,
        PClassNameList _classNameList_)
    {
        setImplements(_implements_);

        setClassNameList(_classNameList_);

    }
    public Object clone()
    {
        return new AImplementsClause(
            (TImplements) cloneNode(_implements_),
            (PClassNameList) cloneNode(_classNameList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAImplementsClause(this);
    }

    public TImplements getImplements()
    {
        return _implements_;
    }

    public void setImplements(TImplements node)
    {
        if(_implements_ != null)
        {
            _implements_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _implements_ = node;
    }

    public PClassNameList getClassNameList()
    {
        return _classNameList_;
    }

    public void setClassNameList(PClassNameList node)
    {
        if(_classNameList_ != null)
        {
            _classNameList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _classNameList_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_implements_)
            + toString(_classNameList_);
    }

    void removeChild(Node child)
    {
        if(_implements_ == child)
        {
            _implements_ = null;
            return;
        }

        if(_classNameList_ == child)
        {
            _classNameList_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_implements_ == oldChild)
        {
            setImplements((TImplements) newChild);
            return;
        }

        if(_classNameList_ == oldChild)
        {
            setClassNameList((PClassNameList) newChild);
            return;
        }

    }
}
