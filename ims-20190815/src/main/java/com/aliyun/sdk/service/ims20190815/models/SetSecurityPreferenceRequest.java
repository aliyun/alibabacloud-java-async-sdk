// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSecurityPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityPreferenceRequest</p>
 */
public class SetSecurityPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToChangePassword")
    private Boolean allowUserToChangePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToLoginWithPasskey")
    private Boolean allowUserToLoginWithPasskey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManageAccessKeys")
    private Boolean allowUserToManageAccessKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManageMFADevices")
    private Boolean allowUserToManageMFADevices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToManagePersonalDingTalk")
    private Boolean allowUserToManagePersonalDingTalk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSaveMFATicket")
    private Boolean enableSaveMFATicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginSessionDuration")
    private Integer loginSessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MFAOperationForLogin")
    private String MFAOperationForLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
    private String operationForRiskLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationTypes")
    private java.util.List<String> verificationTypes;

    private SetSecurityPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToChangePassword = builder.allowUserToChangePassword;
        this.allowUserToLoginWithPasskey = builder.allowUserToLoginWithPasskey;
        this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        this.allowUserToManagePersonalDingTalk = builder.allowUserToManagePersonalDingTalk;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
        this.MFAOperationForLogin = builder.MFAOperationForLogin;
        this.operationForRiskLogin = builder.operationForRiskLogin;
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
     * @return allowUserToLoginWithPasskey
     */
    public Boolean getAllowUserToLoginWithPasskey() {
        return this.allowUserToLoginWithPasskey;
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

    /**
     * @return verificationTypes
     */
    public java.util.List<String> getVerificationTypes() {
        return this.verificationTypes;
    }

    public static final class Builder extends Request.Builder<SetSecurityPreferenceRequest, Builder> {
        private Boolean allowUserToChangePassword; 
        private Boolean allowUserToLoginWithPasskey; 
        private Boolean allowUserToManageAccessKeys; 
        private Boolean allowUserToManageMFADevices; 
        private Boolean allowUserToManagePersonalDingTalk; 
        private Boolean enableSaveMFATicket; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 
        private String MFAOperationForLogin; 
        private String operationForRiskLogin; 
        private java.util.List<String> verificationTypes; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityPreferenceRequest request) {
            super(request);
            this.allowUserToChangePassword = request.allowUserToChangePassword;
            this.allowUserToLoginWithPasskey = request.allowUserToLoginWithPasskey;
            this.allowUserToManageAccessKeys = request.allowUserToManageAccessKeys;
            this.allowUserToManageMFADevices = request.allowUserToManageMFADevices;
            this.allowUserToManagePersonalDingTalk = request.allowUserToManagePersonalDingTalk;
            this.enableSaveMFATicket = request.enableSaveMFATicket;
            this.loginNetworkMasks = request.loginNetworkMasks;
            this.loginSessionDuration = request.loginSessionDuration;
            this.MFAOperationForLogin = request.MFAOperationForLogin;
            this.operationForRiskLogin = request.operationForRiskLogin;
            this.verificationTypes = request.verificationTypes;
        } 

        /**
         * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.putQueryParameter("AllowUserToChangePassword", allowUserToChangePassword);
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }

        /**
         * AllowUserToLoginWithPasskey.
         */
        public Builder allowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
            this.putQueryParameter("AllowUserToLoginWithPasskey", allowUserToLoginWithPasskey);
            this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
            return this;
        }

        /**
         * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.putQueryParameter("AllowUserToManageAccessKeys", allowUserToManageAccessKeys);
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }

        /**
         * <p>Specifies whether RAM users can manage their MFA devices. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.putQueryParameter("AllowUserToManageMFADevices", allowUserToManageMFADevices);
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }

        /**
         * <p>Specifies whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
            this.putQueryParameter("AllowUserToManagePersonalDingTalk", allowUserToManagePersonalDingTalk);
            this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
            return this;
        }

        /**
         * <p>Specifies whether RAM users can remember the MFA devices for seven days. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.putQueryParameter("EnableSaveMFATicket", enableSaveMFATicket);
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }

        /**
         * <p>The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). This parameter does not take effect on API calls that are authenticated by using AccessKey pairs.</p>
         * <ul>
         * <li>If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.</li>
         * <li>If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.</li>
         * </ul>
         * <p>If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.</p>
         * <p>You can specify up to 40 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        /**
         * <p>The validity period of the logon session of RAM users.</p>
         * <p>Valid values: 1 to 24. Unit: hours.</p>
         * <p>Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder loginSessionDuration(Integer loginSessionDuration) {
            this.putQueryParameter("LoginSessionDuration", loginSessionDuration);
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }

        /**
         * <p>Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console. This parameter is used to replace EnforceMFAForLogin. EnforceMFAForLogin is still valid. However, we recommend that you use MFAOperationForLogin. Valid values:</p>
         * <ul>
         * <li>mandatory: MFA is required for all RAM users. If you use EnforceMFAForLogin, set the value to true.</li>
         * <li>independent (default): User-specific settings are applied. If you use EnforceMFAForLogin, set the value to false.</li>
         * <li>adaptive: MFA is required only for RAM users who initiated unusual logons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        public Builder MFAOperationForLogin(String MFAOperationForLogin) {
            this.putQueryParameter("MFAOperationForLogin", MFAOperationForLogin);
            this.MFAOperationForLogin = MFAOperationForLogin;
            return this;
        }

        /**
         * <p>Specifies whether to enable MFA for RAM users who initiated unusual logons. Valid values:</p>
         * <ul>
         * <li>autonomous (default): yes. MFA is prompted for RAM users who initiated unusual logons. However, the RAM users are allowed to skip MFA.</li>
         * <li>enforceVerify: MFA is prompted for RAM users who initiated unusual logons and the RAM users cannot skip MFA.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>autonomous</p>
         */
        public Builder operationForRiskLogin(String operationForRiskLogin) {
            this.putQueryParameter("OperationForRiskLogin", operationForRiskLogin);
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }

        /**
         * <p>The MFA methods.</p>
         */
        public Builder verificationTypes(java.util.List<String> verificationTypes) {
            String verificationTypesShrink = shrink(verificationTypes, "VerificationTypes", "json");
            this.putQueryParameter("VerificationTypes", verificationTypesShrink);
            this.verificationTypes = verificationTypes;
            return this;
        }

        @Override
        public SetSecurityPreferenceRequest build() {
            return new SetSecurityPreferenceRequest(this);
        } 

    } 

}
