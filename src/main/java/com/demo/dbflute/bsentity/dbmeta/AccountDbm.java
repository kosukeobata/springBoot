package com.demo.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.demo.dbflute.allcommon.*;
import com.demo.dbflute.exentity.*;

/**
 * The DB meta of account. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AccountDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AccountDbm _instance = new AccountDbm();
    private AccountDbm() {}
    public static AccountDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Account)et).getAccountId(), (et, vl) -> ((Account)et).setAccountId(ctl(vl)), "accountId");
        setupEpg(_epgMap, et -> ((Account)et).getAccountName(), (et, vl) -> ((Account)et).setAccountName((String)vl), "accountName");
        setupEpg(_epgMap, et -> ((Account)et).getAccountDisplayId(), (et, vl) -> ((Account)et).setAccountDisplayId((String)vl), "accountDisplayId");
        setupEpg(_epgMap, et -> ((Account)et).getFirstName(), (et, vl) -> ((Account)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((Account)et).getLastName(), (et, vl) -> ((Account)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((Account)et).getEmailAddress(), (et, vl) -> ((Account)et).setEmailAddress((String)vl), "emailAddress");
        setupEpg(_epgMap, et -> ((Account)et).getPassword(), (et, vl) -> ((Account)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((Account)et).getAccoutStatusCd(), (et, vl) -> ((Account)et).setAccoutStatusCd((String)vl), "accoutStatusCd");
        setupEpg(_epgMap, et -> ((Account)et).getInsDatetime(), (et, vl) -> ((Account)et).setInsDatetime(ctldt(vl)), "insDatetime");
        setupEpg(_epgMap, et -> ((Account)et).getInsTrace(), (et, vl) -> ((Account)et).setInsTrace((String)vl), "insTrace");
        setupEpg(_epgMap, et -> ((Account)et).getUpdDatetime(), (et, vl) -> ((Account)et).setUpdDatetime(ctldt(vl)), "updDatetime");
        setupEpg(_epgMap, et -> ((Account)et).getUpdTrace(), (et, vl) -> ((Account)et).setUpdTrace((String)vl), "updTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "account";
    protected final String _tableDispName = "account";
    protected final String _tablePropertyName = "account";
    protected final TableSqlName _tableSqlName = new TableSqlName("account", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, null, Long.class, "accountId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountName = cci("ACCOUNT_NAME", "ACCOUNT_NAME", null, null, String.class, "accountName", null, false, false, true, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountDisplayId = cci("ACCOUNT_DISPLAY_ID", "ACCOUNT_DISPLAY_ID", null, null, String.class, "accountDisplayId", null, false, false, true, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("FIRST_NAME", "FIRST_NAME", null, null, String.class, "firstName", null, false, false, false, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("LAST_NAME", "LAST_NAME", null, null, String.class, "lastName", null, false, false, false, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmailAddress = cci("EMAIL_ADDRESS", "EMAIL_ADDRESS", null, null, String.class, "emailAddress", null, false, false, true, "VARCHAR", 256, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 256, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccoutStatusCd = cci("ACCOUT_STATUS_CD", "ACCOUT_STATUS_CD", null, null, String.class, "accoutStatusCd", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsDatetime = cci("INS_DATETIME", "INS_DATETIME", null, null, java.time.LocalDateTime.class, "insDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsTrace = cci("INS_TRACE", "INS_TRACE", null, null, String.class, "insTrace", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDatetime = cci("UPD_DATETIME", "UPD_DATETIME", null, null, java.time.LocalDateTime.class, "updDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTrace = cci("UPD_TRACE", "UPD_TRACE", null, null, String.class, "updTrace", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);

    /**
     * ACCOUNT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * ACCOUNT_NAME: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountName() { return _columnAccountName; }
    /**
     * ACCOUNT_DISPLAY_ID: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountDisplayId() { return _columnAccountDisplayId; }
    /**
     * FIRST_NAME: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * LAST_NAME: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * EMAIL_ADDRESS: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmailAddress() { return _columnEmailAddress; }
    /**
     * PASSWORD: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * ACCOUT_STATUS_CD: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccoutStatusCd() { return _columnAccoutStatusCd; }
    /**
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsDatetime() { return _columnInsDatetime; }
    /**
     * INS_TRACE: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsTrace() { return _columnInsTrace; }
    /**
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDatetime() { return _columnUpdDatetime; }
    /**
     * UPD_TRACE: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdTrace() { return _columnUpdTrace; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAccountId());
        ls.add(columnAccountName());
        ls.add(columnAccountDisplayId());
        ls.add(columnFirstName());
        ls.add(columnLastName());
        ls.add(columnEmailAddress());
        ls.add(columnPassword());
        ls.add(columnAccoutStatusCd());
        ls.add(columnInsDatetime());
        ls.add(columnInsTrace());
        ls.add(columnUpdDatetime());
        ls.add(columnUpdTrace());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAccountId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnAccountDisplayId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnInsDatetime(), columnInsTrace(), columnUpdDatetime(), columnUpdTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnInsDatetime(), columnInsTrace(), columnUpdDatetime(), columnUpdTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDatetime(), columnUpdTrace()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.demo.dbflute.exentity.Account"; }
    public String getConditionBeanTypeName() { return "com.demo.dbflute.cbean.AccountCB"; }
    public String getBehaviorTypeName() { return "com.demo.dbflute.exbhv.AccountBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Account> getEntityType() { return Account.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Account newEntity() { return new Account(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Account)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Account)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
