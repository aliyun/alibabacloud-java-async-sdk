// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecurityPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityPreferenceRequest</p>
 */
public class SetSecurityPreferenceRequest extends Request {
    @Query
    @NameInMap("AllowUserToChangePassword")
    private Boolean allowUserToChangePassword;

    @Query
    @NameInMap("AllowUserToManageAccessKeys")
    private Boolean allowUserToManageAccessKeys;

    @Query
    @NameInMap("AllowUserToManageMFADevices")
    private Boolean allowUserToManageMFADevices;

    @Query
    @NameInMap("AllowUserToManagePersonalDingTalk")
    private Boolean allowUserToManagePersonalDingTalk;

    @Query
    @NameInMap("EnableSaveMFATicket")
    private Boolean enableSaveMFATicket;

    @Query
    @NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    @Query
    @NameInMap("LoginSessionDuration")
    private Integer loginSessionDuration;

    @Query
    @NameInMap("MFAOperationForLogin")
    private String MFAOperationForLogin;

    @Query
    @NameInMap("OperationForRiskLogin")
    private String operationForRiskLogin;

    private SetSecurityPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToChangePassword = builder.allowUserToChangePassword;
        this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        this.allowUserToManagePersonalDingTalk = builder.allowUserToManagePersonalDingTalk;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
        this.MFAOperationForLogin = builder.MFAOperationForLogin;
        this.operationForRiskLogin = builder.operationForRiskLogin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityPreferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUserToChangePassword
     */
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    /**
     * @return allowUserToManageAccessKeys
     */
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    /**
     * @return allowUserToManageMFADevices
     */
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    /**
     * @return allowUserToManagePersonalDingTalk
     */
    public Boolean getAllowUserToManagePersonalDingTalk() {
        return this.allowUserToManagePersonalDingTalk;
    }

    /**
     * @return enableSaveMFATicket
     */
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    /**
     * @return loginNetworkMasks
     */
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    /**
     * @return loginSessionDuration
     */
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    /**
     * @return MFAOperationForLogin
     */
    public String getMFAOperationForLogin() {
        return this.MFAOperationForLogin;
    }

    /**
     * @return operationForRiskLogin
     */
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

    public static final class Builder extends Request.Builder<SetSecurityPreferenceRequest, Builder> {
        private Boolean allowUserToChangePassword; 
        private Boolean allowUserToManageAccessKeys; 
        private Boolean allowUserToManageMFADevices; 
        private Boolean allowUserToManagePersonalDingTalk; 
        private Boolean enableSaveMFATicket; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 
        private String MFAOperationForLogin; 
        private String operationForRiskLogin; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityPreferenceRequest request) {
            super(request);
            this.allowUserToChangePassword = request.allowUserToChangePassword;
            this.allowUserToManageAccessKeys = request.allowUserToManageAccessKeys;
            this.allowUserToManageMFADevices = request.allowUserToManageMFADevices;
            this.allowUserToManagePersonalDingTalk = request.allowUserToManagePersonalDingTalk;
            this.enableSaveMFATicket = request.enableSaveMFATicket;
            this.loginNetworkMasks = request.loginNetworkMasks;
            this.loginSessionDuration = request.loginSessionDuration;
            this.MFAOperationForLogin = request.MFAOperationForLogin;
            this.operationForRiskLogin = request.operationForRiskLogin;
        } 

        /**
         * AllowUserToChangePassword.
         */
        public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.putQueryParameter("AllowUserToChangePassword", allowUserToChangePassword);
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }

        /**
         * AllowUserToManageAccessKeys.
         */
        public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.putQueryParameter("AllowUserToManageAccessKeys", allowUserToManageAccessKeys);
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }

        /**
         * AllowUserToManageMFADevices.
         */
        public Builder allowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.putQueryParameter("AllowUserToManageMFADevices", allowUserToManageMFADevices);
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }

        /**
         * AllowUserToManagePersonalDingTalk.
         */
        public Builder allowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
            this.putQueryParameter("AllowUserToManagePersonalDingTalk", allowUserToManagePersonalDingTalk);
            this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
            return this;
        }

        /**
         * EnableSaveMFATicket.
         */
        public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.putQueryParameter("EnableSaveMFATicket", enableSaveMFATicket);
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }

        /**
         * LoginNetworkMasks.
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        /**
         * LoginSessionDuration.
         */
        public Builder loginSessionDuration(Integer loginSessionDuration) {
            this.putQueryParameter("LoginSessionDuration", loginSessionDuration);
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }

        /**
         * MFAOperationForLogin.
         */
        public Builder MFAOperationForLogin(String MFAOperationForLogin) {
            this.putQueryParameter("MFAOperationForLogin", MFAOperationForLogin);
            this.MFAOperationForLogin = MFAOperationForLogin;
            return this;
        }

        /**
         * OperationForRiskLogin.
         */
        public Builder operationForRiskLogin(String operationForRiskLogin) {
            this.putQueryParameter("OperationForRiskLogin", operationForRiskLogin);
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }

        @Override
        public SetSecurityPreferenceRequest build() {
            return new SetSecurityPreferenceRequest(this);
        } 

    } 

}
