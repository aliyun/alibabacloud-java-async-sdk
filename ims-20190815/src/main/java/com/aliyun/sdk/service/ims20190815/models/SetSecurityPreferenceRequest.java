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
    @com.aliyun.core.annotation.NameInMap("AllowUserToManageServiceCredentials")
    private Boolean allowUserToManageServiceCredentials;

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
    @com.aliyun.core.annotation.NameInMap("MaxIdleDaysForAccessKeys")
    private Integer maxIdleDaysForAccessKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxIdleDaysForUsers")
    private Integer maxIdleDaysForUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
    @Deprecated
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
        this.allowUserToManageServiceCredentials = builder.allowUserToManageServiceCredentials;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
        this.MFAOperationForLogin = builder.MFAOperationForLogin;
        this.maxIdleDaysForAccessKeys = builder.maxIdleDaysForAccessKeys;
        this.maxIdleDaysForUsers = builder.maxIdleDaysForUsers;
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
     * @return allowUserToManageServiceCredentials
     */
    public Boolean getAllowUserToManageServiceCredentials() {
        return this.allowUserToManageServiceCredentials;
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
     * @return maxIdleDaysForAccessKeys
     */
    public Integer getMaxIdleDaysForAccessKeys() {
        return this.maxIdleDaysForAccessKeys;
    }

    /**
     * @return maxIdleDaysForUsers
     */
    public Integer getMaxIdleDaysForUsers() {
        return this.maxIdleDaysForUsers;
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
        private Boolean allowUserToManageServiceCredentials; 
        private Boolean enableSaveMFATicket; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 
        private String MFAOperationForLogin; 
        private Integer maxIdleDaysForAccessKeys; 
        private Integer maxIdleDaysForUsers; 
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
            this.allowUserToManageServiceCredentials = request.allowUserToManageServiceCredentials;
            this.enableSaveMFATicket = request.enableSaveMFATicket;
            this.loginNetworkMasks = request.loginNetworkMasks;
            this.loginSessionDuration = request.loginSessionDuration;
            this.MFAOperationForLogin = request.MFAOperationForLogin;
            this.maxIdleDaysForAccessKeys = request.maxIdleDaysForAccessKeys;
            this.maxIdleDaysForUsers = request.maxIdleDaysForUsers;
            this.operationForRiskLogin = request.operationForRiskLogin;
            this.verificationTypes = request.verificationTypes;
        } 

        /**
         * <p>Specifies whether RAM users can change their own passwords. Valid values:</p>
         * <ul>
         * <li><p>true (default): Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
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
         * <p>Specifies whether RAM users can use passkeys to log on to the console. Valid values:</p>
         * <ul>
         * <li><p>true (default): Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
            this.putQueryParameter("AllowUserToLoginWithPasskey", allowUserToLoginWithPasskey);
            this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
            return this;
        }

        /**
         * <p>Specifies whether RAM users can manage their own AccessKeys. Valid values:</p>
         * <ul>
         * <li><p>true: Allowed.</p>
         * </li>
         * <li><p>false (default): Not allowed.</p>
         * </li>
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
         * <p>Specifies whether RAM users can manage their own MFA devices. Valid values:</p>
         * <ul>
         * <li><p>true (default): Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
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
         * <p>Specifies whether RAM users can link or unlink their personal DingTalk accounts. Valid values:</p>
         * <ul>
         * <li><p>true (default): Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
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
         * <p>Specifies whether RAM users can manage their own API keys. Valid values:</p>
         * <ul>
         * <li><p>true: Allowed.</p>
         * </li>
         * <li><p>false: Not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUserToManageServiceCredentials(Boolean allowUserToManageServiceCredentials) {
            this.putQueryParameter("AllowUserToManageServiceCredentials", allowUserToManageServiceCredentials);
            this.allowUserToManageServiceCredentials = allowUserToManageServiceCredentials;
            return this;
        }

        /**
         * <p>Specifies whether a RAM user who logs on with multi-factor authentication (MFA) can skip MFA for the next seven days. Valid values:</p>
         * <ul>
         * <li><p>true: Allowed.</p>
         * </li>
         * <li><p>false (default): Not allowed.</p>
         * </li>
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
         * <p>The IP address mask that is used to log on to the console. This mask applies to password-based logons and single sign-on (SSO) logons, but does not affect API calls that are initiated by using an AccessKey pair.</p>
         * <ul>
         * <li><p>If you specify a mask, RAM users can log on to the console only from the specified IP addresses.</p>
         * </li>
         * <li><p>If you do not specify a mask, RAM users can log on to the console from all IP addresses.</p>
         * </li>
         * </ul>
         * <p>If you need to specify multiple masks, separate them with semicolons (<code>;</code>). Example: <code>192.168.0.0/16;10.0.0.0/8</code>.</p>
         * <p>You can specify up to 40 masks. The total length cannot exceed 512 characters.</p>
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
         * <p>The session duration of a RAM user who logs on to the console. Unit: hours.</p>
         * <p>Valid values: 1 to 24.</p>
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
         * <p>Specifies the MFA policy for user logon. This parameter replaces <code>EnforceMFAForLogin</code>. We recommend that you use this parameter. <code>EnforceMFAForLogin</code> is still valid. Valid values:</p>
         * <ul>
         * <li><p><code>mandatory</code>: enforces MFA for all RAM users. This is equivalent to setting <code>EnforceMFAForLogin</code> to <code>true</code>.</p>
         * </li>
         * <li><p><code>independent</code> (default): The MFA settings for each RAM user are not affected. This is equivalent to setting <code>EnforceMFAForLogin</code> to <code>false</code>.</p>
         * </li>
         * <li><p><code>adaptive</code>: enforces MFA only for unusual logons.</p>
         * </li>
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
         * <p>The maximum idle period of the AccessKey pairs of RAM users. An AccessKey pair that is not used for the specified period of time is automatically disabled on the next day. You can set the value to one of the following numbers:</p>
         * <ul>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>365</p>
         * </li>
         * <li><p>730 (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder maxIdleDaysForAccessKeys(Integer maxIdleDaysForAccessKeys) {
            this.putQueryParameter("MaxIdleDaysForAccessKeys", maxIdleDaysForAccessKeys);
            this.maxIdleDaysForAccessKeys = maxIdleDaysForAccessKeys;
            return this;
        }

        /**
         * <p>The maximum idle period of RAM users. If a RAM user who can log on to the console does not log on to the console for the specified period of time (SSO logons are not included), the console logon feature of the RAM user is disabled on the next day. You can set the value to one of the following numbers:</p>
         * <ul>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>365</p>
         * </li>
         * <li><p>730 (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder maxIdleDaysForUsers(Integer maxIdleDaysForUsers) {
            this.putQueryParameter("MaxIdleDaysForUsers", maxIdleDaysForUsers);
            this.maxIdleDaysForUsers = maxIdleDaysForUsers;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
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
