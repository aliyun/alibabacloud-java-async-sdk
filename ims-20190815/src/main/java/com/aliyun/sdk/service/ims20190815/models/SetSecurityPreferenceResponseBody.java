// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>SetSecurityPreferenceResponseBody</p>
 */
public class SetSecurityPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPreference")
    private SecurityPreference securityPreference;

    private SetSecurityPreferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityPreference = builder.securityPreference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityPreferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityPreference
     */
    public SecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityPreference securityPreference; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of security preferences.
         */
        public Builder securityPreference(SecurityPreference securityPreference) {
            this.securityPreference = securityPreference;
            return this;
        }

        public SetSecurityPreferenceResponseBody build() {
            return new SetSecurityPreferenceResponseBody(this);
        } 

    } 

    public static class AccessKeyPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToManageAccessKeys")
        private Boolean allowUserToManageAccessKeys;

        private AccessKeyPreference(Builder builder) {
            this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKeyPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToManageAccessKeys
         */
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

        public static final class Builder {
            private Boolean allowUserToManageAccessKeys; 

            /**
             * Indicates whether RAM users can manage their AccessKey pairs.
             */
            public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
                this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
                return this;
            }

            public AccessKeyPreference build() {
                return new AccessKeyPreference(this);
            } 

        } 

    }
    public static class LoginProfilePreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToChangePassword")
        private Boolean allowUserToChangePassword;

        @com.aliyun.core.annotation.NameInMap("EnableSaveMFATicket")
        private Boolean enableSaveMFATicket;

        @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
        private String loginNetworkMasks;

        @com.aliyun.core.annotation.NameInMap("LoginSessionDuration")
        private Integer loginSessionDuration;

        @com.aliyun.core.annotation.NameInMap("MFAOperationForLogin")
        private String MFAOperationForLogin;

        @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
        private String operationForRiskLogin;

        private LoginProfilePreference(Builder builder) {
            this.allowUserToChangePassword = builder.allowUserToChangePassword;
            this.enableSaveMFATicket = builder.enableSaveMFATicket;
            this.loginNetworkMasks = builder.loginNetworkMasks;
            this.loginSessionDuration = builder.loginSessionDuration;
            this.MFAOperationForLogin = builder.MFAOperationForLogin;
            this.operationForRiskLogin = builder.operationForRiskLogin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginProfilePreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToChangePassword
         */
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
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

        public static final class Builder {
            private Boolean allowUserToChangePassword; 
            private Boolean enableSaveMFATicket; 
            private String loginNetworkMasks; 
            private Integer loginSessionDuration; 
            private String MFAOperationForLogin; 
            private String operationForRiskLogin; 

            /**
             * Indicates whether RAM users can change their passwords.
             */
            public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
                this.allowUserToChangePassword = allowUserToChangePassword;
                return this;
            }

            /**
             * Indicates whether RAM users can remember the MFA devices for seven days.
             */
            public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
                this.enableSaveMFATicket = enableSaveMFATicket;
                return this;
            }

            /**
             * The subnet mask.
             */
            public Builder loginNetworkMasks(String loginNetworkMasks) {
                this.loginNetworkMasks = loginNetworkMasks;
                return this;
            }

            /**
             * The validity period of the logon session of RAM users.
             */
            public Builder loginSessionDuration(Integer loginSessionDuration) {
                this.loginSessionDuration = loginSessionDuration;
                return this;
            }

            /**
             * Indicates whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console.
             */
            public Builder MFAOperationForLogin(String MFAOperationForLogin) {
                this.MFAOperationForLogin = MFAOperationForLogin;
                return this;
            }

            /**
             * Indicates whether to enable MFA for RAM users who initiated unusual logons.
             */
            public Builder operationForRiskLogin(String operationForRiskLogin) {
                this.operationForRiskLogin = operationForRiskLogin;
                return this;
            }

            public LoginProfilePreference build() {
                return new LoginProfilePreference(this);
            } 

        } 

    }
    public static class MFAPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToManageMFADevices")
        private Boolean allowUserToManageMFADevices;

        private MFAPreference(Builder builder) {
            this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MFAPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToManageMFADevices
         */
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

        public static final class Builder {
            private Boolean allowUserToManageMFADevices; 

            /**
             * Indicates whether RAM users can manage their MFA devices.
             */
            public Builder allowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
                this.allowUserToManageMFADevices = allowUserToManageMFADevices;
                return this;
            }

            public MFAPreference build() {
                return new MFAPreference(this);
            } 

        } 

    }
    public static class PersonalInfoPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToManagePersonalDingTalk")
        private Boolean allowUserToManagePersonalDingTalk;

        private PersonalInfoPreference(Builder builder) {
            this.allowUserToManagePersonalDingTalk = builder.allowUserToManagePersonalDingTalk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonalInfoPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToManagePersonalDingTalk
         */
        public Boolean getAllowUserToManagePersonalDingTalk() {
            return this.allowUserToManagePersonalDingTalk;
        }

        public static final class Builder {
            private Boolean allowUserToManagePersonalDingTalk; 

            /**
             * Indicates whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts.
             */
            public Builder allowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
                this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
                return this;
            }

            public PersonalInfoPreference build() {
                return new PersonalInfoPreference(this);
            } 

        } 

    }
    public static class VerificationPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VerificationTypes")
        private java.util.List < String > verificationTypes;

        private VerificationPreference(Builder builder) {
            this.verificationTypes = builder.verificationTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VerificationPreference create() {
            return builder().build();
        }

        /**
         * @return verificationTypes
         */
        public java.util.List < String > getVerificationTypes() {
            return this.verificationTypes;
        }

        public static final class Builder {
            private java.util.List < String > verificationTypes; 

            /**
             * The MFA methods.
             */
            public Builder verificationTypes(java.util.List < String > verificationTypes) {
                this.verificationTypes = verificationTypes;
                return this;
            }

            public VerificationPreference build() {
                return new VerificationPreference(this);
            } 

        } 

    }
    public static class SecurityPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyPreference")
        private AccessKeyPreference accessKeyPreference;

        @com.aliyun.core.annotation.NameInMap("LoginProfilePreference")
        private LoginProfilePreference loginProfilePreference;

        @com.aliyun.core.annotation.NameInMap("MFAPreference")
        private MFAPreference MFAPreference;

        @com.aliyun.core.annotation.NameInMap("PersonalInfoPreference")
        private PersonalInfoPreference personalInfoPreference;

        @com.aliyun.core.annotation.NameInMap("VerificationPreference")
        private VerificationPreference verificationPreference;

        private SecurityPreference(Builder builder) {
            this.accessKeyPreference = builder.accessKeyPreference;
            this.loginProfilePreference = builder.loginProfilePreference;
            this.MFAPreference = builder.MFAPreference;
            this.personalInfoPreference = builder.personalInfoPreference;
            this.verificationPreference = builder.verificationPreference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPreference create() {
            return builder().build();
        }

        /**
         * @return accessKeyPreference
         */
        public AccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        /**
         * @return loginProfilePreference
         */
        public LoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        /**
         * @return MFAPreference
         */
        public MFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

        /**
         * @return personalInfoPreference
         */
        public PersonalInfoPreference getPersonalInfoPreference() {
            return this.personalInfoPreference;
        }

        /**
         * @return verificationPreference
         */
        public VerificationPreference getVerificationPreference() {
            return this.verificationPreference;
        }

        public static final class Builder {
            private AccessKeyPreference accessKeyPreference; 
            private LoginProfilePreference loginProfilePreference; 
            private MFAPreference MFAPreference; 
            private PersonalInfoPreference personalInfoPreference; 
            private VerificationPreference verificationPreference; 

            /**
             * The AccessKey pair preference.
             */
            public Builder accessKeyPreference(AccessKeyPreference accessKeyPreference) {
                this.accessKeyPreference = accessKeyPreference;
                return this;
            }

            /**
             * The logon preference.
             */
            public Builder loginProfilePreference(LoginProfilePreference loginProfilePreference) {
                this.loginProfilePreference = loginProfilePreference;
                return this;
            }

            /**
             * The MFA preference.
             */
            public Builder MFAPreference(MFAPreference MFAPreference) {
                this.MFAPreference = MFAPreference;
                return this;
            }

            /**
             * The personal information preference.
             */
            public Builder personalInfoPreference(PersonalInfoPreference personalInfoPreference) {
                this.personalInfoPreference = personalInfoPreference;
                return this;
            }

            /**
             * The MFA method preference.
             */
            public Builder verificationPreference(VerificationPreference verificationPreference) {
                this.verificationPreference = verificationPreference;
                return this;
            }

            public SecurityPreference build() {
                return new SecurityPreference(this);
            } 

        } 

    }
}
