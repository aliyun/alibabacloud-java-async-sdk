// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityPreferenceResponseBody</p>
 */
public class GetSecurityPreferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityPreference")
    private SecurityPreference securityPreference;

    private GetSecurityPreferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityPreference = builder.securityPreference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityPreferenceResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityPreference.
         */
        public Builder securityPreference(SecurityPreference securityPreference) {
            this.securityPreference = securityPreference;
            return this;
        }

        public GetSecurityPreferenceResponseBody build() {
            return new GetSecurityPreferenceResponseBody(this);
        } 

    } 

    public static class AccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
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
             * AllowUserToManageAccessKeys.
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
        @NameInMap("AllowUserToChangePassword")
        private Boolean allowUserToChangePassword;

        @NameInMap("EnableSaveMFATicket")
        private Boolean enableSaveMFATicket;

        @NameInMap("LoginNetworkMasks")
        private String loginNetworkMasks;

        @NameInMap("LoginSessionDuration")
        private Integer loginSessionDuration;

        @NameInMap("MFAOperationForLogin")
        private String MFAOperationForLogin;

        @NameInMap("OperationForRiskLogin")
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
             * AllowUserToChangePassword.
             */
            public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
                this.allowUserToChangePassword = allowUserToChangePassword;
                return this;
            }

            /**
             * EnableSaveMFATicket.
             */
            public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
                this.enableSaveMFATicket = enableSaveMFATicket;
                return this;
            }

            /**
             * LoginNetworkMasks.
             */
            public Builder loginNetworkMasks(String loginNetworkMasks) {
                this.loginNetworkMasks = loginNetworkMasks;
                return this;
            }

            /**
             * LoginSessionDuration.
             */
            public Builder loginSessionDuration(Integer loginSessionDuration) {
                this.loginSessionDuration = loginSessionDuration;
                return this;
            }

            /**
             * MFAOperationForLogin.
             */
            public Builder MFAOperationForLogin(String MFAOperationForLogin) {
                this.MFAOperationForLogin = MFAOperationForLogin;
                return this;
            }

            /**
             * OperationForRiskLogin.
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
        @NameInMap("AllowUserToManageMFADevices")
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
             * AllowUserToManageMFADevices.
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
        @NameInMap("AllowUserToManagePersonalDingTalk")
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
             * AllowUserToManagePersonalDingTalk.
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
    public static class SecurityPreference extends TeaModel {
        @NameInMap("AccessKeyPreference")
        private AccessKeyPreference accessKeyPreference;

        @NameInMap("LoginProfilePreference")
        private LoginProfilePreference loginProfilePreference;

        @NameInMap("MFAPreference")
        private MFAPreference MFAPreference;

        @NameInMap("PersonalInfoPreference")
        private PersonalInfoPreference personalInfoPreference;

        private SecurityPreference(Builder builder) {
            this.accessKeyPreference = builder.accessKeyPreference;
            this.loginProfilePreference = builder.loginProfilePreference;
            this.MFAPreference = builder.MFAPreference;
            this.personalInfoPreference = builder.personalInfoPreference;
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

        public static final class Builder {
            private AccessKeyPreference accessKeyPreference; 
            private LoginProfilePreference loginProfilePreference; 
            private MFAPreference MFAPreference; 
            private PersonalInfoPreference personalInfoPreference; 

            /**
             * AccessKeyPreference.
             */
            public Builder accessKeyPreference(AccessKeyPreference accessKeyPreference) {
                this.accessKeyPreference = accessKeyPreference;
                return this;
            }

            /**
             * LoginProfilePreference.
             */
            public Builder loginProfilePreference(LoginProfilePreference loginProfilePreference) {
                this.loginProfilePreference = loginProfilePreference;
                return this;
            }

            /**
             * MFAPreference.
             */
            public Builder MFAPreference(MFAPreference MFAPreference) {
                this.MFAPreference = MFAPreference;
                return this;
            }

            /**
             * PersonalInfoPreference.
             */
            public Builder personalInfoPreference(PersonalInfoPreference personalInfoPreference) {
                this.personalInfoPreference = personalInfoPreference;
                return this;
            }

            public SecurityPreference build() {
                return new SecurityPreference(this);
            } 

        } 

    }
}
