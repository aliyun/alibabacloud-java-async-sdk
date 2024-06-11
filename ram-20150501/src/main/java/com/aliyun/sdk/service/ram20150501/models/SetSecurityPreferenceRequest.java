// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecurityPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityPreferenceRequest</p>
 */
public class SetSecurityPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToChangePassword")
    private Boolean allowUserToChangePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManageAccessKeys")
    private Boolean allowUserToManageAccessKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManageMFADevices")
    private Boolean allowUserToManageMFADevices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManagePublicKeys")
    private Boolean allowUserToManagePublicKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSaveMFATicket")
    private Boolean enableSaveMFATicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginSessionDuration")
    private Integer loginSessionDuration;

    private SetSecurityPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToChangePassword = builder.allowUserToChangePassword;
        this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        this.allowUserToManagePublicKeys = builder.allowUserToManagePublicKeys;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
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
     * @return allowUserToManagePublicKeys
     */
    public Boolean getAllowUserToManagePublicKeys() {
        return this.allowUserToManagePublicKeys;
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

    public static final class Builder extends Request.Builder<SetSecurityPreferenceRequest, Builder> {
        private Boolean allowUserToChangePassword; 
        private Boolean allowUserToManageAccessKeys; 
        private Boolean allowUserToManageMFADevices; 
        private Boolean allowUserToManagePublicKeys; 
        private Boolean enableSaveMFATicket; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityPreferenceRequest request) {
            super(request);
            this.allowUserToChangePassword = request.allowUserToChangePassword;
            this.allowUserToManageAccessKeys = request.allowUserToManageAccessKeys;
            this.allowUserToManageMFADevices = request.allowUserToManageMFADevices;
            this.allowUserToManagePublicKeys = request.allowUserToManagePublicKeys;
            this.enableSaveMFATicket = request.enableSaveMFATicket;
            this.loginNetworkMasks = request.loginNetworkMasks;
            this.loginSessionDuration = request.loginSessionDuration;
        } 

        /**
         * Specifies whether RAM users can change their passwords. Valid values:
         * <p>
         * 
         * *   true: RAM users can change their passwords. This is the default value.
         * *   false: RAM users cannot change their passwords.
         */
        public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.putQueryParameter("AllowUserToChangePassword", allowUserToChangePassword);
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }

        /**
         * Specifies whether RAM users can manage their AccessKey pairs. Valid values:
         * <p>
         * 
         * *   true: RAM users can manage their AccessKey pairs.
         * *   false: RAM users cannot manage their AccessKey pairs. This is the default value.
         */
        public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.putQueryParameter("AllowUserToManageAccessKeys", allowUserToManageAccessKeys);
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }

        /**
         * Specifies whether RAM users can manage their MFA devices. Valid values:
         * <p>
         * 
         * *   true: RAM users can manage their MFA devices. This is the default value.
         * *   false: RAM users cannot manage their MFA devices.
         */
        public Builder allowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.putQueryParameter("AllowUserToManageMFADevices", allowUserToManageMFADevices);
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }

        /**
         * Specifies whether RAM users can manage their public keys. Valid values:
         * <p>
         * 
         * *   true: RAM users can manage their public keys.
         * *   false: RAM users cannot manage their public keys. This is the default value.
         * 
         * >  This parameter is valid only for the Japan site.
         */
        public Builder allowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
            this.putQueryParameter("AllowUserToManagePublicKeys", allowUserToManagePublicKeys);
            this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
            return this;
        }

        /**
         * Specifies whether to remember the multi-factor authentication (MFA) devices of Resource Access Management (RAM) users for seven days. Valid values:
         * <p>
         * 
         * *   true: remembers the MFA devices of RAM users for seven days.
         * *   false: does not remember the MFA devices of RAM users for seven days.
         */
        public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.putQueryParameter("EnableSaveMFATicket", enableSaveMFATicket);
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }

        /**
         * The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.
         * <p>
         * 
         * *   If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
         * *   If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
         * 
         * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
         * 
         * You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        /**
         * The validity period of the logon session of RAM users.
         * <p>
         * 
         * Valid values: 1 to 24. Default value: 6. Unit: hours.
         */
        public Builder loginSessionDuration(Integer loginSessionDuration) {
            this.putQueryParameter("LoginSessionDuration", loginSessionDuration);
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }

        @Override
        public SetSecurityPreferenceRequest build() {
            return new SetSecurityPreferenceRequest(this);
        } 

    } 

}
