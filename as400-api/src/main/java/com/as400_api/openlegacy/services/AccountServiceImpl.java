package com.as400_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.as400_sdk.openlegacy.Accntmgt;
import com.as400_sdk.openlegacy.AccntmgtWsAccount;
import com.as400_sdk.openlegacy.AccntmgtWsAddress;
import com.as400_sdk.openlegacy.AccntmgtWsBankDet;
import com.as400_sdk.openlegacy.AccntmgtWsBirthDate;
import com.as400_sdk.openlegacy.AccntmgtWsLoc;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;

import org.openlegacy.core.annotations.services.*;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.openlegacy.utils.ActionUtil;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test AccountServiceTest.
 *  The interface AccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "Account")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getAccount", entities = {
            @EntityMapping(alias="accntmgt", entity=com.as400_sdk.openlegacy.Accntmgt.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "accntmgt.wsAccount.action_", expression = "wsAction"),
            @BindTo(endpoint = "accntmgt.wsAccount.wsIban", expression = "wsIban")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "wsAccount", expression = "accntmgt.wsAccount")})
    public AccountOut getAccount(AccountIn accountIn) throws Exception {
        AccountOut accountOut = new AccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession as400SdkSession = applicationContext.getBean("as400SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Accntmgt accntmgt = serviceBinder.bindInputs(this, "getAccount", "accntmgt", new Accntmgt(), accountIn);
            accntmgt = as400SdkSession.doAction(ActionUtil.getRpcAction(Accntmgt.class), accntmgt);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            accountOut = serviceBinder.bindOutput(this, "getAccount", accountOut, new String[]{"accountIn", "accntmgt"}, accountIn, accntmgt);
            /* autogenerated - output block end */;

            return accountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            as400SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}