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
    @NameInMap("EnforceMFAForLogin")
    private Boolean enforceMFAForLogin;

    @Query
    @NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    @Query
    @NameInMap("LoginSessionDuration")
    private Integer loginSessionDuration;

    @Query
    @NameInMap("VerificationTypes")
    private java.util.List < String > verificationTypes;

    private SetSecurityPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToChangePassword = builder.allowUserToChangePassword;
        this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        this.allowUserToManagePersonalDingTalk = builder.allowUserToManagePersonalDingTalk;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.enforceMFAForLogin = builder.enforceMFAForLogin;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
        this.verificationTypes = builder.verificationTypes;
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
     * @return enforceMFAForLogin
     */
    public Boolean getEnforceMFAForLogin() {
        return this.enforceMFAForLogin;
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
     * @return verificationTypes
     */
    public java.util.List < String > getVerificationTypes() {
        return this.verificationTypes;
    }

    public static final class Builder extends Request.Builder<SetSecurityPreferenceRequest, Builder> {
        private Boolean allowUserToChangePassword; 
        private Boolean allowUserToManageAccessKeys; 
        private Boolean allowUserToManageMFADevices; 
        private Boolean allowUserToManagePersonalDingTalk; 
        private Boolean enableSaveMFATicket; 
        private Boolean enforceMFAForLogin; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 
        private java.util.List < String > verificationTypes; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityPreferenceRequest response) {
            super(response);
            this.allowUserToChangePassword = response.allowUserToChangePassword;
            this.allowUserToManageAccessKeys = response.allowUserToManageAccessKeys;
            this.allowUserToManageMFADevices = response.allowUserToManageMFADevices;
            this.allowUserToManagePersonalDingTalk = response.allowUserToManagePersonalDingTalk;
            this.enableSaveMFATicket = response.enableSaveMFATicket;
            this.enforceMFAForLogin = response.enforceMFAForLogin;
            this.loginNetworkMasks = response.loginNetworkMasks;
            this.loginSessionDuration = response.loginSessionDuration;
            this.verificationTypes = response.verificationTypes;
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
         * EnforceMFAForLogin.
         */
        public Builder enforceMFAForLogin(Boolean enforceMFAForLogin) {
            this.putQueryParameter("EnforceMFAForLogin", enforceMFAForLogin);
            this.enforceMFAForLogin = enforceMFAForLogin;
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
         * VerificationTypes.
         */
        public Builder verificationTypes(java.util.List < String > verificationTypes) {
            this.putQueryParameter("VerificationTypes", verificationTypes);
            this.verificationTypes = verificationTypes;
            return this;
        }

        @Override
        public SetSecurityPreferenceRequest build() {
            return new SetSecurityPreferenceRequest(this);
        } 

    } 

}
