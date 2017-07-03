package com.demo.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.demo.dbflute.cbean.cq.ciq.*;
import com.demo.dbflute.cbean.*;
import com.demo.dbflute.cbean.cq.*;

/**
 * The base condition-query of account.
 * @author DBFlute(AutoGenerator)
 */
public class BsAccountCQ extends AbstractBsAccountCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AccountCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAccountCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from account) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AccountCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AccountCIQ xcreateCIQ() {
        AccountCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AccountCIQ xnewCIQ() {
        return new AccountCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join account on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AccountCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AccountCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _accountName;
    public ConditionValue xdfgetAccountName()
    { if (_accountName == null) { _accountName = nCV(); }
      return _accountName; }
    protected ConditionValue xgetCValueAccountName() { return xdfgetAccountName(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountName_Asc() { regOBA("ACCOUNT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountName_Desc() { regOBD("ACCOUNT_NAME"); return this; }

    protected ConditionValue _accountDisplayId;
    public ConditionValue xdfgetAccountDisplayId()
    { if (_accountDisplayId == null) { _accountDisplayId = nCV(); }
      return _accountDisplayId; }
    protected ConditionValue xgetCValueAccountDisplayId() { return xdfgetAccountDisplayId(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountDisplayId_Asc() { regOBA("ACCOUNT_DISPLAY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountDisplayId_Desc() { regOBD("ACCOUNT_DISPLAY_ID"); return this; }

    protected ConditionValue _firstName;
    public ConditionValue xdfgetFirstName()
    { if (_firstName == null) { _firstName = nCV(); }
      return _firstName; }
    protected ConditionValue xgetCValueFirstName() { return xdfgetFirstName(); }

    /** 
     * Add order-by as ascend. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_FirstName_Asc() { regOBA("FIRST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_FirstName_Desc() { regOBD("FIRST_NAME"); return this; }

    protected ConditionValue _lastName;
    public ConditionValue xdfgetLastName()
    { if (_lastName == null) { _lastName = nCV(); }
      return _lastName; }
    protected ConditionValue xgetCValueLastName() { return xdfgetLastName(); }

    /** 
     * Add order-by as ascend. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_LastName_Asc() { regOBA("LAST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_LastName_Desc() { regOBD("LAST_NAME"); return this; }

    protected ConditionValue _emailAddress;
    public ConditionValue xdfgetEmailAddress()
    { if (_emailAddress == null) { _emailAddress = nCV(); }
      return _emailAddress; }
    protected ConditionValue xgetCValueEmailAddress() { return xdfgetEmailAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmailAddress_Asc() { regOBA("EMAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmailAddress_Desc() { regOBD("EMAIL_ADDRESS"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _accoutStatusCd;
    public ConditionValue xdfgetAccoutStatusCd()
    { if (_accoutStatusCd == null) { _accoutStatusCd = nCV(); }
      return _accoutStatusCd; }
    protected ConditionValue xgetCValueAccoutStatusCd() { return xdfgetAccoutStatusCd(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccoutStatusCd_Asc() { regOBA("ACCOUT_STATUS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccoutStatusCd_Desc() { regOBD("ACCOUT_STATUS_CD"); return this; }

    protected ConditionValue _insDatetime;
    public ConditionValue xdfgetInsDatetime()
    { if (_insDatetime == null) { _insDatetime = nCV(); }
      return _insDatetime; }
    protected ConditionValue xgetCValueInsDatetime() { return xdfgetInsDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_InsDatetime_Asc() { regOBA("INS_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_InsDatetime_Desc() { regOBD("INS_DATETIME"); return this; }

    protected ConditionValue _insTrace;
    public ConditionValue xdfgetInsTrace()
    { if (_insTrace == null) { _insTrace = nCV(); }
      return _insTrace; }
    protected ConditionValue xgetCValueInsTrace() { return xdfgetInsTrace(); }

    /** 
     * Add order-by as ascend. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_InsTrace_Asc() { regOBA("INS_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_InsTrace_Desc() { regOBD("INS_TRACE"); return this; }

    protected ConditionValue _updDatetime;
    public ConditionValue xdfgetUpdDatetime()
    { if (_updDatetime == null) { _updDatetime = nCV(); }
      return _updDatetime; }
    protected ConditionValue xgetCValueUpdDatetime() { return xdfgetUpdDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_UpdDatetime_Asc() { regOBA("UPD_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_UpdDatetime_Desc() { regOBD("UPD_DATETIME"); return this; }

    protected ConditionValue _updTrace;
    public ConditionValue xdfgetUpdTrace()
    { if (_updTrace == null) { _updTrace = nCV(); }
      return _updTrace; }
    protected ConditionValue xgetCValueUpdTrace() { return xdfgetUpdTrace(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_UpdTrace_Asc() { regOBA("UPD_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_UpdTrace_Desc() { regOBD("UPD_TRACE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAccountCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAccountCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AccountCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AccountCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AccountCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AccountCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AccountCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AccountCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AccountCQ> _myselfExistsMap;
    public Map<String, AccountCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AccountCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AccountCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AccountCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AccountCB.class.getName(); }
    protected String xCQ() { return AccountCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
