package com.demo.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.demo.dbflute.allcommon.EntityDefinedCommonColumn;
import com.demo.dbflute.allcommon.DBMetaInstanceHandler;
import com.demo.dbflute.exentity.*;

/**
 * The entity of account as TABLE. <br>
 * アカウント
 * <pre>
 * [primary-key]
 *     ACCOUNT_ID
 *
 * [column]
 *     ACCOUNT_ID, ACCOUNT_NAME, ACCOUNT_DISPLAY_ID, FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, PASSWORD, ACCOUT_STATUS_CD, INS_DATETIME, INS_TRACE, UPD_DATETIME, UPD_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long accountId = entity.getAccountId();
 * String accountName = entity.getAccountName();
 * String accountDisplayId = entity.getAccountDisplayId();
 * String firstName = entity.getFirstName();
 * String lastName = entity.getLastName();
 * String emailAddress = entity.getEmailAddress();
 * String password = entity.getPassword();
 * String accoutStatusCd = entity.getAccoutStatusCd();
 * java.time.LocalDateTime insDatetime = entity.getInsDatetime();
 * String insTrace = entity.getInsTrace();
 * java.time.LocalDateTime updDatetime = entity.getUpdDatetime();
 * String updTrace = entity.getUpdTrace();
 * entity.setAccountId(accountId);
 * entity.setAccountName(accountName);
 * entity.setAccountDisplayId(accountDisplayId);
 * entity.setFirstName(firstName);
 * entity.setLastName(lastName);
 * entity.setEmailAddress(emailAddress);
 * entity.setPassword(password);
 * entity.setAccoutStatusCd(accoutStatusCd);
 * entity.setInsDatetime(insDatetime);
 * entity.setInsTrace(insTrace);
 * entity.setUpdDatetime(updDatetime);
 * entity.setUpdTrace(updTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAccount extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _accountId;

    /** ACCOUNT_NAME: {NotNull, VARCHAR(30)} */
    protected String _accountName;

    /** ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)} */
    protected String _accountDisplayId;

    /** FIRST_NAME: {VARCHAR(30)} */
    protected String _firstName;

    /** LAST_NAME: {VARCHAR(30)} */
    protected String _lastName;

    /** EMAIL_ADDRESS: {NotNull, VARCHAR(256)} */
    protected String _emailAddress;

    /** PASSWORD: {NotNull, VARCHAR(256)} */
    protected String _password;

    /** ACCOUT_STATUS_CD: {NotNull, CHAR(3)} */
    protected String _accoutStatusCd;

    /** INS_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _insDatetime;

    /** INS_TRACE: {NotNull, VARCHAR(200)} */
    protected String _insTrace;

    /** UPD_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updDatetime;

    /** UPD_TRACE: {NotNull, VARCHAR(200)} */
    protected String _updTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "account";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_accountId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param accountDisplayId : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String accountDisplayId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("accountDisplayId");
        setAccountDisplayId(accountDisplayId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAccount) {
            BsAccount other = (BsAccount)obj;
            if (!xSV(_accountId, other._accountId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _accountId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_accountName));
        sb.append(dm).append(xfND(_accountDisplayId));
        sb.append(dm).append(xfND(_firstName));
        sb.append(dm).append(xfND(_lastName));
        sb.append(dm).append(xfND(_emailAddress));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_accoutStatusCd));
        sb.append(dm).append(xfND(_insDatetime));
        sb.append(dm).append(xfND(_insTrace));
        sb.append(dm).append(xfND(_updDatetime));
        sb.append(dm).append(xfND(_updTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Account clone() {
        return (Account)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * アカウントID
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * アカウントID
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(Long accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] ACCOUNT_NAME: {NotNull, VARCHAR(30)} <br>
     * アカウント名
     * @return The value of the column 'ACCOUNT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getAccountName() {
        checkSpecifiedProperty("accountName");
        return _accountName;
    }

    /**
     * [set] ACCOUNT_NAME: {NotNull, VARCHAR(30)} <br>
     * アカウント名
     * @param accountName The value of the column 'ACCOUNT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setAccountName(String accountName) {
        registerModifiedProperty("accountName");
        _accountName = accountName;
    }

    /**
     * [get] ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * アカウント表示ID
     * @return The value of the column 'ACCOUNT_DISPLAY_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getAccountDisplayId() {
        checkSpecifiedProperty("accountDisplayId");
        return _accountDisplayId;
    }

    /**
     * [set] ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * アカウント表示ID
     * @param accountDisplayId The value of the column 'ACCOUNT_DISPLAY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountDisplayId(String accountDisplayId) {
        registerModifiedProperty("accountDisplayId");
        _accountDisplayId = accountDisplayId;
    }

    /**
     * [get] FIRST_NAME: {VARCHAR(30)} <br>
     * 苗字
     * @return The value of the column 'FIRST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return _firstName;
    }

    /**
     * [set] FIRST_NAME: {VARCHAR(30)} <br>
     * 苗字
     * @param firstName The value of the column 'FIRST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        _firstName = firstName;
    }

    /**
     * [get] LAST_NAME: {VARCHAR(30)} <br>
     * 名前
     * @return The value of the column 'LAST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return _lastName;
    }

    /**
     * [set] LAST_NAME: {VARCHAR(30)} <br>
     * 名前
     * @param lastName The value of the column 'LAST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        _lastName = lastName;
    }

    /**
     * [get] EMAIL_ADDRESS: {NotNull, VARCHAR(256)} <br>
     * メールアドレス
     * @return The value of the column 'EMAIL_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getEmailAddress() {
        checkSpecifiedProperty("emailAddress");
        return _emailAddress;
    }

    /**
     * [set] EMAIL_ADDRESS: {NotNull, VARCHAR(256)} <br>
     * メールアドレス
     * @param emailAddress The value of the column 'EMAIL_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setEmailAddress(String emailAddress) {
        registerModifiedProperty("emailAddress");
        _emailAddress = emailAddress;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(256)} <br>
     * パスワード
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(256)} <br>
     * パスワード
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] ACCOUT_STATUS_CD: {NotNull, CHAR(3)} <br>
     * アカウントステータス
     * @return The value of the column 'ACCOUT_STATUS_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getAccoutStatusCd() {
        checkSpecifiedProperty("accoutStatusCd");
        return _accoutStatusCd;
    }

    /**
     * [set] ACCOUT_STATUS_CD: {NotNull, CHAR(3)} <br>
     * アカウントステータス
     * @param accoutStatusCd The value of the column 'ACCOUT_STATUS_CD'. (basically NotNull if update: for the constraint)
     */
    public void setAccoutStatusCd(String accoutStatusCd) {
        registerModifiedProperty("accoutStatusCd");
        _accoutStatusCd = accoutStatusCd;
    }

    /**
     * [get] INS_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'INS_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getInsDatetime() {
        checkSpecifiedProperty("insDatetime");
        return _insDatetime;
    }

    /**
     * [set] INS_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @param insDatetime The value of the column 'INS_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setInsDatetime(java.time.LocalDateTime insDatetime) {
        registerModifiedProperty("insDatetime");
        _insDatetime = insDatetime;
    }

    /**
     * [get] INS_TRACE: {NotNull, VARCHAR(200)} <br>
     * 登録ユーザー
     * @return The value of the column 'INS_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getInsTrace() {
        checkSpecifiedProperty("insTrace");
        return _insTrace;
    }

    /**
     * [set] INS_TRACE: {NotNull, VARCHAR(200)} <br>
     * 登録ユーザー
     * @param insTrace The value of the column 'INS_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setInsTrace(String insTrace) {
        registerModifiedProperty("insTrace");
        _insTrace = insTrace;
    }

    /**
     * [get] UPD_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdDatetime() {
        checkSpecifiedProperty("updDatetime");
        return _updDatetime;
    }

    /**
     * [set] UPD_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時
     * @param updDatetime The value of the column 'UPD_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdDatetime(java.time.LocalDateTime updDatetime) {
        registerModifiedProperty("updDatetime");
        _updDatetime = updDatetime;
    }

    /**
     * [get] UPD_TRACE: {NotNull, VARCHAR(200)} <br>
     * 更新ユーザー
     * @return The value of the column 'UPD_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdTrace() {
        checkSpecifiedProperty("updTrace");
        return _updTrace;
    }

    /**
     * [set] UPD_TRACE: {NotNull, VARCHAR(200)} <br>
     * 更新ユーザー
     * @param updTrace The value of the column 'UPD_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setUpdTrace(String updTrace) {
        registerModifiedProperty("updTrace");
        _updTrace = updTrace;
    }
}
