package com.demo.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.demo.dbflute.allcommon.*;
import com.demo.dbflute.cbean.*;
import com.demo.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of account.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAccountCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAccountCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "account";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_Equal(Long accountId) {
        doSetAccountId_Equal(accountId);
    }

    protected void doSetAccountId_Equal(Long accountId) {
        regAccountId(CK_EQ, accountId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_NotEqual(Long accountId) {
        doSetAccountId_NotEqual(accountId);
    }

    protected void doSetAccountId_NotEqual(Long accountId) {
        regAccountId(CK_NES, accountId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Long accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Long accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Long accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Long accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of accountId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of accountId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAccountId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAccountId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of accountId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of accountId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountIdList The collection of accountId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountId_InScope(Collection<Long> accountIdList) {
        doSetAccountId_InScope(accountIdList);
    }

    protected void doSetAccountId_InScope(Collection<Long> accountIdList) {
        regINS(CK_INS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountIdList The collection of accountId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountId_NotInScope(Collection<Long> accountIdList) {
        doSetAccountId_NotInScope(accountIdList);
    }

    protected void doSetAccountId_NotInScope(Collection<Long> accountIdList) {
        regINS(CK_NINS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setAccountId_IsNull() { regAccountId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setAccountId_IsNotNull() { regAccountId(CK_ISNN, DOBJ); }

    protected void regAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountId(), "ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueAccountId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_Equal(String accountName) {
        doSetAccountName_Equal(fRES(accountName));
    }

    protected void doSetAccountName_Equal(String accountName) {
        regAccountName(CK_EQ, accountName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_NotEqual(String accountName) {
        doSetAccountName_NotEqual(fRES(accountName));
    }

    protected void doSetAccountName_NotEqual(String accountName) {
        regAccountName(CK_NES, accountName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_GreaterThan(String accountName) {
        regAccountName(CK_GT, fRES(accountName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_LessThan(String accountName) {
        regAccountName(CK_LT, fRES(accountName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_GreaterEqual(String accountName) {
        regAccountName(CK_GE, fRES(accountName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_LessEqual(String accountName) {
        regAccountName(CK_LE, fRES(accountName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountNameList The collection of accountName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_InScope(Collection<String> accountNameList) {
        doSetAccountName_InScope(accountNameList);
    }

    protected void doSetAccountName_InScope(Collection<String> accountNameList) {
        regINS(CK_INS, cTL(accountNameList), xgetCValueAccountName(), "ACCOUNT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountNameList The collection of accountName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountName_NotInScope(Collection<String> accountNameList) {
        doSetAccountName_NotInScope(accountNameList);
    }

    protected void doSetAccountName_NotInScope(Collection<String> accountNameList) {
        regINS(CK_NINS, cTL(accountNameList), xgetCValueAccountName(), "ACCOUNT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setAccountName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accountName The value of accountName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountName_LikeSearch(String accountName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountName_LikeSearch(accountName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setAccountName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountName The value of accountName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccountName_LikeSearch(String accountName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountName), xgetCValueAccountName(), "ACCOUNT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountName_NotLikeSearch(String accountName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountName_NotLikeSearch(accountName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @param accountName The value of accountName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccountName_NotLikeSearch(String accountName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountName), xgetCValueAccountName(), "ACCOUNT_NAME", likeSearchOption);
    }

    protected void regAccountName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountName(), "ACCOUNT_NAME"); }
    protected abstract ConditionValue xgetCValueAccountName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_Equal(String accountDisplayId) {
        doSetAccountDisplayId_Equal(fRES(accountDisplayId));
    }

    protected void doSetAccountDisplayId_Equal(String accountDisplayId) {
        regAccountDisplayId(CK_EQ, accountDisplayId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_NotEqual(String accountDisplayId) {
        doSetAccountDisplayId_NotEqual(fRES(accountDisplayId));
    }

    protected void doSetAccountDisplayId_NotEqual(String accountDisplayId) {
        regAccountDisplayId(CK_NES, accountDisplayId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_GreaterThan(String accountDisplayId) {
        regAccountDisplayId(CK_GT, fRES(accountDisplayId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_LessThan(String accountDisplayId) {
        regAccountDisplayId(CK_LT, fRES(accountDisplayId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_GreaterEqual(String accountDisplayId) {
        regAccountDisplayId(CK_GE, fRES(accountDisplayId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_LessEqual(String accountDisplayId) {
        regAccountDisplayId(CK_LE, fRES(accountDisplayId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayIdList The collection of accountDisplayId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_InScope(Collection<String> accountDisplayIdList) {
        doSetAccountDisplayId_InScope(accountDisplayIdList);
    }

    protected void doSetAccountDisplayId_InScope(Collection<String> accountDisplayIdList) {
        regINS(CK_INS, cTL(accountDisplayIdList), xgetCValueAccountDisplayId(), "ACCOUNT_DISPLAY_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayIdList The collection of accountDisplayId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccountDisplayId_NotInScope(Collection<String> accountDisplayIdList) {
        doSetAccountDisplayId_NotInScope(accountDisplayIdList);
    }

    protected void doSetAccountDisplayId_NotInScope(Collection<String> accountDisplayIdList) {
        regINS(CK_NINS, cTL(accountDisplayIdList), xgetCValueAccountDisplayId(), "ACCOUNT_DISPLAY_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setAccountDisplayId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accountDisplayId The value of accountDisplayId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountDisplayId_LikeSearch(String accountDisplayId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountDisplayId_LikeSearch(accountDisplayId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setAccountDisplayId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountDisplayId The value of accountDisplayId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccountDisplayId_LikeSearch(String accountDisplayId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountDisplayId), xgetCValueAccountDisplayId(), "ACCOUNT_DISPLAY_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountDisplayId_NotLikeSearch(String accountDisplayId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountDisplayId_NotLikeSearch(accountDisplayId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @param accountDisplayId The value of accountDisplayId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccountDisplayId_NotLikeSearch(String accountDisplayId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountDisplayId), xgetCValueAccountDisplayId(), "ACCOUNT_DISPLAY_ID", likeSearchOption);
    }

    protected void regAccountDisplayId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountDisplayId(), "ACCOUNT_DISPLAY_ID"); }
    protected abstract ConditionValue xgetCValueAccountDisplayId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_Equal(String firstName) {
        doSetFirstName_Equal(fRES(firstName));
    }

    protected void doSetFirstName_Equal(String firstName) {
        regFirstName(CK_EQ, firstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_NotEqual(String firstName) {
        doSetFirstName_NotEqual(fRES(firstName));
    }

    protected void doSetFirstName_NotEqual(String firstName) {
        regFirstName(CK_NES, firstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_GreaterThan(String firstName) {
        regFirstName(CK_GT, fRES(firstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_LessThan(String firstName) {
        regFirstName(CK_LT, fRES(firstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_GreaterEqual(String firstName) {
        regFirstName(CK_GE, fRES(firstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_LessEqual(String firstName) {
        regFirstName(CK_LE, fRES(firstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstNameList The collection of firstName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_InScope(Collection<String> firstNameList) {
        doSetFirstName_InScope(firstNameList);
    }

    protected void doSetFirstName_InScope(Collection<String> firstNameList) {
        regINS(CK_INS, cTL(firstNameList), xgetCValueFirstName(), "FIRST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstNameList The collection of firstName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_NotInScope(Collection<String> firstNameList) {
        doSetFirstName_NotInScope(firstNameList);
    }

    protected void doSetFirstName_NotInScope(Collection<String> firstNameList) {
        regINS(CK_NINS, cTL(firstNameList), xgetCValueFirstName(), "FIRST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstName The value of firstName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_LikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_LikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstName The value of firstName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstName_LikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstName), xgetCValueFirstName(), "FIRST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_NotLikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_NotLikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     * @param firstName The value of firstName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstName_NotLikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstName), xgetCValueFirstName(), "FIRST_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     */
    public void setFirstName_IsNull() { regFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     */
    public void setFirstName_IsNullOrEmpty() { regFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {VARCHAR(30)}
     */
    public void setFirstName_IsNotNull() { regFirstName(CK_ISNN, DOBJ); }

    protected void regFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstName(), "FIRST_NAME"); }
    protected abstract ConditionValue xgetCValueFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_Equal(String lastName) {
        doSetLastName_Equal(fRES(lastName));
    }

    protected void doSetLastName_Equal(String lastName) {
        regLastName(CK_EQ, lastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_NotEqual(String lastName) {
        doSetLastName_NotEqual(fRES(lastName));
    }

    protected void doSetLastName_NotEqual(String lastName) {
        regLastName(CK_NES, lastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_GreaterThan(String lastName) {
        regLastName(CK_GT, fRES(lastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_LessThan(String lastName) {
        regLastName(CK_LT, fRES(lastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_GreaterEqual(String lastName) {
        regLastName(CK_GE, fRES(lastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_LessEqual(String lastName) {
        regLastName(CK_LE, fRES(lastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastNameList The collection of lastName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_InScope(Collection<String> lastNameList) {
        doSetLastName_InScope(lastNameList);
    }

    protected void doSetLastName_InScope(Collection<String> lastNameList) {
        regINS(CK_INS, cTL(lastNameList), xgetCValueLastName(), "LAST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastNameList The collection of lastName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_NotInScope(Collection<String> lastNameList) {
        doSetLastName_NotInScope(lastNameList);
    }

    protected void doSetLastName_NotInScope(Collection<String> lastNameList) {
        regINS(CK_NINS, cTL(lastNameList), xgetCValueLastName(), "LAST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lastName The value of lastName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_LikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_LikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastName The value of lastName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLastName_LikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastName), xgetCValueLastName(), "LAST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_NotLikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_NotLikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     * @param lastName The value of lastName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLastName_NotLikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastName), xgetCValueLastName(), "LAST_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     */
    public void setLastName_IsNull() { regLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     */
    public void setLastName_IsNullOrEmpty() { regLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {VARCHAR(30)}
     */
    public void setLastName_IsNotNull() { regLastName(CK_ISNN, DOBJ); }

    protected void regLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastName(), "LAST_NAME"); }
    protected abstract ConditionValue xgetCValueLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_Equal(String emailAddress) {
        doSetEmailAddress_Equal(fRES(emailAddress));
    }

    protected void doSetEmailAddress_Equal(String emailAddress) {
        regEmailAddress(CK_EQ, emailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_NotEqual(String emailAddress) {
        doSetEmailAddress_NotEqual(fRES(emailAddress));
    }

    protected void doSetEmailAddress_NotEqual(String emailAddress) {
        regEmailAddress(CK_NES, emailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_GreaterThan(String emailAddress) {
        regEmailAddress(CK_GT, fRES(emailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_LessThan(String emailAddress) {
        regEmailAddress(CK_LT, fRES(emailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_GreaterEqual(String emailAddress) {
        regEmailAddress(CK_GE, fRES(emailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_LessEqual(String emailAddress) {
        regEmailAddress(CK_LE, fRES(emailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddressList The collection of emailAddress as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_InScope(Collection<String> emailAddressList) {
        doSetEmailAddress_InScope(emailAddressList);
    }

    protected void doSetEmailAddress_InScope(Collection<String> emailAddressList) {
        regINS(CK_INS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddressList The collection of emailAddress as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_NotInScope(Collection<String> emailAddressList) {
        doSetEmailAddress_NotInScope(emailAddressList);
    }

    protected void doSetEmailAddress_NotInScope(Collection<String> emailAddressList) {
        regINS(CK_NINS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_LikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_LikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmailAddress_LikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_NotLikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_NotLikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmailAddress_NotLikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    protected void regEmailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmailAddress(), "EMAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueEmailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_Equal(String accoutStatusCd) {
        doSetAccoutStatusCd_Equal(fRES(accoutStatusCd));
    }

    protected void doSetAccoutStatusCd_Equal(String accoutStatusCd) {
        regAccoutStatusCd(CK_EQ, accoutStatusCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_NotEqual(String accoutStatusCd) {
        doSetAccoutStatusCd_NotEqual(fRES(accoutStatusCd));
    }

    protected void doSetAccoutStatusCd_NotEqual(String accoutStatusCd) {
        regAccoutStatusCd(CK_NES, accoutStatusCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_GreaterThan(String accoutStatusCd) {
        regAccoutStatusCd(CK_GT, fRES(accoutStatusCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_LessThan(String accoutStatusCd) {
        regAccoutStatusCd(CK_LT, fRES(accoutStatusCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_GreaterEqual(String accoutStatusCd) {
        regAccoutStatusCd(CK_GE, fRES(accoutStatusCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_LessEqual(String accoutStatusCd) {
        regAccoutStatusCd(CK_LE, fRES(accoutStatusCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCdList The collection of accoutStatusCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_InScope(Collection<String> accoutStatusCdList) {
        doSetAccoutStatusCd_InScope(accoutStatusCdList);
    }

    protected void doSetAccoutStatusCd_InScope(Collection<String> accoutStatusCdList) {
        regINS(CK_INS, cTL(accoutStatusCdList), xgetCValueAccoutStatusCd(), "ACCOUT_STATUS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCdList The collection of accoutStatusCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccoutStatusCd_NotInScope(Collection<String> accoutStatusCdList) {
        doSetAccoutStatusCd_NotInScope(accoutStatusCdList);
    }

    protected void doSetAccoutStatusCd_NotInScope(Collection<String> accoutStatusCdList) {
        regINS(CK_NINS, cTL(accoutStatusCdList), xgetCValueAccoutStatusCd(), "ACCOUT_STATUS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setAccoutStatusCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accoutStatusCd The value of accoutStatusCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccoutStatusCd_LikeSearch(String accoutStatusCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccoutStatusCd_LikeSearch(accoutStatusCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setAccoutStatusCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accoutStatusCd The value of accoutStatusCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccoutStatusCd_LikeSearch(String accoutStatusCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accoutStatusCd), xgetCValueAccoutStatusCd(), "ACCOUT_STATUS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccoutStatusCd_NotLikeSearch(String accoutStatusCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccoutStatusCd_NotLikeSearch(accoutStatusCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @param accoutStatusCd The value of accoutStatusCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccoutStatusCd_NotLikeSearch(String accoutStatusCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accoutStatusCd), xgetCValueAccoutStatusCd(), "ACCOUT_STATUS_CD", likeSearchOption);
    }

    protected void regAccoutStatusCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccoutStatusCd(), "ACCOUT_STATUS_CD"); }
    protected abstract ConditionValue xgetCValueAccoutStatusCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @param insDatetime The value of insDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInsDatetime_Equal(java.time.LocalDateTime insDatetime) {
        regInsDatetime(CK_EQ,  insDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @param insDatetime The value of insDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInsDatetime_GreaterThan(java.time.LocalDateTime insDatetime) {
        regInsDatetime(CK_GT,  insDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @param insDatetime The value of insDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInsDatetime_LessThan(java.time.LocalDateTime insDatetime) {
        regInsDatetime(CK_LT,  insDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @param insDatetime The value of insDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInsDatetime_GreaterEqual(java.time.LocalDateTime insDatetime) {
        regInsDatetime(CK_GE,  insDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @param insDatetime The value of insDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInsDatetime_LessEqual(java.time.LocalDateTime insDatetime) {
        regInsDatetime(CK_LE, insDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setInsDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setInsDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setInsDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setInsDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setInsDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "INS_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueInsDatetime(), nm, op);
    }

    protected void regInsDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsDatetime(), "INS_DATETIME"); }
    protected abstract ConditionValue xgetCValueInsDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_Equal(String insTrace) {
        doSetInsTrace_Equal(fRES(insTrace));
    }

    protected void doSetInsTrace_Equal(String insTrace) {
        regInsTrace(CK_EQ, insTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_NotEqual(String insTrace) {
        doSetInsTrace_NotEqual(fRES(insTrace));
    }

    protected void doSetInsTrace_NotEqual(String insTrace) {
        regInsTrace(CK_NES, insTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_GreaterThan(String insTrace) {
        regInsTrace(CK_GT, fRES(insTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_LessThan(String insTrace) {
        regInsTrace(CK_LT, fRES(insTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_GreaterEqual(String insTrace) {
        regInsTrace(CK_GE, fRES(insTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_LessEqual(String insTrace) {
        regInsTrace(CK_LE, fRES(insTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTraceList The collection of insTrace as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_InScope(Collection<String> insTraceList) {
        doSetInsTrace_InScope(insTraceList);
    }

    protected void doSetInsTrace_InScope(Collection<String> insTraceList) {
        regINS(CK_INS, cTL(insTraceList), xgetCValueInsTrace(), "INS_TRACE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTraceList The collection of insTrace as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInsTrace_NotInScope(Collection<String> insTraceList) {
        doSetInsTrace_NotInScope(insTraceList);
    }

    protected void doSetInsTrace_NotInScope(Collection<String> insTraceList) {
        regINS(CK_NINS, cTL(insTraceList), xgetCValueInsTrace(), "INS_TRACE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setInsTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param insTrace The value of insTrace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInsTrace_LikeSearch(String insTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInsTrace_LikeSearch(insTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setInsTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param insTrace The value of insTrace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setInsTrace_LikeSearch(String insTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(insTrace), xgetCValueInsTrace(), "INS_TRACE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInsTrace_NotLikeSearch(String insTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInsTrace_NotLikeSearch(insTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @param insTrace The value of insTrace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setInsTrace_NotLikeSearch(String insTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(insTrace), xgetCValueInsTrace(), "INS_TRACE", likeSearchOption);
    }

    protected void regInsTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsTrace(), "INS_TRACE"); }
    protected abstract ConditionValue xgetCValueInsTrace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @param updDatetime The value of updDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDatetime_Equal(java.time.LocalDateTime updDatetime) {
        regUpdDatetime(CK_EQ,  updDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @param updDatetime The value of updDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDatetime_GreaterThan(java.time.LocalDateTime updDatetime) {
        regUpdDatetime(CK_GT,  updDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @param updDatetime The value of updDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDatetime_LessThan(java.time.LocalDateTime updDatetime) {
        regUpdDatetime(CK_LT,  updDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @param updDatetime The value of updDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDatetime_GreaterEqual(java.time.LocalDateTime updDatetime) {
        regUpdDatetime(CK_GE,  updDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @param updDatetime The value of updDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDatetime_LessEqual(java.time.LocalDateTime updDatetime) {
        regUpdDatetime(CK_LE, updDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPD_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdDatetime(), nm, op);
    }

    protected void regUpdDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDatetime(), "UPD_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_Equal(String updTrace) {
        doSetUpdTrace_Equal(fRES(updTrace));
    }

    protected void doSetUpdTrace_Equal(String updTrace) {
        regUpdTrace(CK_EQ, updTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_NotEqual(String updTrace) {
        doSetUpdTrace_NotEqual(fRES(updTrace));
    }

    protected void doSetUpdTrace_NotEqual(String updTrace) {
        regUpdTrace(CK_NES, updTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_GreaterThan(String updTrace) {
        regUpdTrace(CK_GT, fRES(updTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_LessThan(String updTrace) {
        regUpdTrace(CK_LT, fRES(updTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_GreaterEqual(String updTrace) {
        regUpdTrace(CK_GE, fRES(updTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_LessEqual(String updTrace) {
        regUpdTrace(CK_LE, fRES(updTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTraceList The collection of updTrace as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_InScope(Collection<String> updTraceList) {
        doSetUpdTrace_InScope(updTraceList);
    }

    protected void doSetUpdTrace_InScope(Collection<String> updTraceList) {
        regINS(CK_INS, cTL(updTraceList), xgetCValueUpdTrace(), "UPD_TRACE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTraceList The collection of updTrace as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdTrace_NotInScope(Collection<String> updTraceList) {
        doSetUpdTrace_NotInScope(updTraceList);
    }

    protected void doSetUpdTrace_NotInScope(Collection<String> updTraceList) {
        regINS(CK_NINS, cTL(updTraceList), xgetCValueUpdTrace(), "UPD_TRACE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updTrace The value of updTrace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdTrace_LikeSearch(String updTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdTrace_LikeSearch(updTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updTrace The value of updTrace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdTrace_LikeSearch(String updTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updTrace), xgetCValueUpdTrace(), "UPD_TRACE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdTrace_NotLikeSearch(String updTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdTrace_NotLikeSearch(updTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @param updTrace The value of updTrace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdTrace_NotLikeSearch(String updTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updTrace), xgetCValueUpdTrace(), "UPD_TRACE", likeSearchOption);
    }

    protected void regUpdTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTrace(), "UPD_TRACE"); }
    protected abstract ConditionValue xgetCValueUpdTrace();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AccountCB&gt;() {
     *     public void query(AccountCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AccountCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AccountCQ sq);

    protected AccountCB xcreateScalarConditionCB() {
        AccountCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AccountCB xcreateScalarConditionPartitionByCB() {
        AccountCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AccountCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = new AccountCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ACCOUNT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AccountCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AccountCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AccountCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = new AccountCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ACCOUNT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AccountCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AccountCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountCB cb = new AccountCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AccountCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected AccountCB newMyCB() {
        return new AccountCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AccountCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
