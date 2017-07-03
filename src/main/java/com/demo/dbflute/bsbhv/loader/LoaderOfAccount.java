package com.demo.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.demo.dbflute.exbhv.*;
import com.demo.dbflute.exentity.*;

/**
 * The referrer loader of account as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAccount {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Account> _selectedList;
    protected BehaviorSelector _selector;
    protected AccountBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAccount ready(List<Account> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AccountBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AccountBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Account> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
