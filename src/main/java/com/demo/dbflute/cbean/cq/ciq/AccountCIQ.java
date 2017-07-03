package com.demo.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.demo.dbflute.cbean.*;
import com.demo.dbflute.cbean.cq.bs.*;
import com.demo.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of account.
 * @author DBFlute(AutoGenerator)
 */
public class AccountCIQ extends AbstractBsAccountCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAccountCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AccountCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAccountCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueAccountId() { return _myCQ.xdfgetAccountId(); }
    protected ConditionValue xgetCValueAccountName() { return _myCQ.xdfgetAccountName(); }
    protected ConditionValue xgetCValueAccountDisplayId() { return _myCQ.xdfgetAccountDisplayId(); }
    protected ConditionValue xgetCValueFirstName() { return _myCQ.xdfgetFirstName(); }
    protected ConditionValue xgetCValueLastName() { return _myCQ.xdfgetLastName(); }
    protected ConditionValue xgetCValueEmailAddress() { return _myCQ.xdfgetEmailAddress(); }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueAccoutStatusCd() { return _myCQ.xdfgetAccoutStatusCd(); }
    protected ConditionValue xgetCValueInsDatetime() { return _myCQ.xdfgetInsDatetime(); }
    protected ConditionValue xgetCValueInsTrace() { return _myCQ.xdfgetInsTrace(); }
    protected ConditionValue xgetCValueUpdDatetime() { return _myCQ.xdfgetUpdDatetime(); }
    protected ConditionValue xgetCValueUpdTrace() { return _myCQ.xdfgetUpdTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AccountCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(AccountCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(AccountCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(AccountCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AccountCB.class.getName(); }
    protected String xinCQ() { return AccountCQ.class.getName(); }
}
