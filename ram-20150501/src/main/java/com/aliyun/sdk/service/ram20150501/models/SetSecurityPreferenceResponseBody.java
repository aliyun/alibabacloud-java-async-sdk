// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SetSecurityPreferenceResponseBody model) {
            this.requestId = model.requestId;
            this.securityPreference = model.securityPreference;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A978915D-F279-4CA0-A89B-9A71219FFB3E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security preferences.</p>
         */
        public Builder securityPreference(SecurityPreference securityPreference) {
            this.securityPreference = securityPreference;
            return this;
        }

        public SetSecurityPreferenceResponseBody build() {
            return new SetSecurityPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityPreferenceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AccessKeyPreference model) {
                this.allowUserToManageAccessKeys = model.allowUserToManageAccessKeys;
            } 

            /**
             * <p>Indicates whether RAM users can manage their AccessKey pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityPreferenceResponseBody</p>
     */
    public static class LoginProfilePreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToChangePassword")
        private Boolean allowUserToChangePassword;

        @com.aliyun.core.annotation.NameInMap("EnableSaveMFATicket")
        private Boolean enableSaveMFATicket;

        @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
        private String loginNetworkMasks;

        @com.aliyun.core.annotation.NameInMap("LoginSessionDuration")
        private Integer loginSessionDuration;

        private LoginProfilePreference(Builder builder) {
            this.allowUserToChangePassword = builder.allowUserToChangePassword;
            this.enableSaveMFATicket = builder.enableSaveMFATicket;
            this.loginNetworkMasks = builder.loginNetworkMasks;
            this.loginSessionDuration = builder.loginSessionDuration;
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

        public static final class Builder {
            private Boolean allowUserToChangePassword; 
            private Boolean enableSaveMFATicket; 
            private String loginNetworkMasks; 
            private Integer loginSessionDuration; 

            private Builder() {
            } 

            private Builder(LoginProfilePreference model) {
                this.allowUserToChangePassword = model.allowUserToChangePassword;
                this.enableSaveMFATicket = model.enableSaveMFATicket;
                this.loginNetworkMasks = model.loginNetworkMasks;
                this.loginSessionDuration = model.loginSessionDuration;
            } 

            /**
             * <p>Indicates whether RAM users can change their passwords.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
                this.allowUserToChangePassword = allowUserToChangePassword;
                return this;
            }

            /**
             * <p>Indicates whether the MFA devices of RAM users are remembered.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
                this.enableSaveMFATicket = enableSaveMFATicket;
                return this;
            }

            /**
             * <p>The subnet mask.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder loginNetworkMasks(String loginNetworkMasks) {
                this.loginNetworkMasks = loginNetworkMasks;
                return this;
            }

            /**
             * <p>The validity period of the logon session of RAM users.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder loginSessionDuration(Integer loginSessionDuration) {
                this.loginSessionDuration = loginSessionDuration;
                return this;
            }

            public LoginProfilePreference build() {
                return new LoginProfilePreference(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityPreferenceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(MFAPreference model) {
                this.allowUserToManageMFADevices = model.allowUserToManageMFADevices;
            } 

            /**
             * <p>Indicates whether RAM users can manage their MFA devices.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityPreferenceResponseBody</p>
     */
    public static class PublicKeyPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToManagePublicKeys")
        private Boolean allowUserToManagePublicKeys;

        private PublicKeyPreference(Builder builder) {
            this.allowUserToManagePublicKeys = builder.allowUserToManagePublicKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicKeyPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToManagePublicKeys
         */
        public Boolean getAllowUserToManagePublicKeys() {
            return this.allowUserToManagePublicKeys;
        }

        public static final class Builder {
            private Boolean allowUserToManagePublicKeys; 

            private Builder() {
            } 

            private Builder(PublicKeyPreference model) {
                this.allowUserToManagePublicKeys = model.allowUserToManagePublicKeys;
            } 

            /**
             * <p>Indicates whether RAM users can manage their public keys.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
                this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
                return this;
            }

            public PublicKeyPreference build() {
                return new PublicKeyPreference(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityPreferenceResponseBody</p>
     */
    public static class SecurityPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyPreference")
        private AccessKeyPreference accessKeyPreference;

        @com.aliyun.core.annotation.NameInMap("LoginProfilePreference")
        private LoginProfilePreference loginProfilePreference;

        @com.aliyun.core.annotation.NameInMap("MFAPreference")
        private MFAPreference MFAPreference;

        @com.aliyun.core.annotation.NameInMap("PublicKeyPreference")
        private PublicKeyPreference publicKeyPreference;

        private SecurityPreference(Builder builder) {
            this.accessKeyPreference = builder.accessKeyPreference;
            this.loginProfilePreference = builder.loginProfilePreference;
            this.MFAPreference = builder.MFAPreference;
            this.publicKeyPreference = builder.publicKeyPreference;
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
         * @return publicKeyPreference
         */
        public PublicKeyPreference getPublicKeyPreference() {
            return this.publicKeyPreference;
        }

        public static final class Builder {
            private AccessKeyPreference accessKeyPreference; 
            private LoginProfilePreference loginProfilePreference; 
            private MFAPreference MFAPreference; 
            private PublicKeyPreference publicKeyPreference; 

            private Builder() {
            } 

            private Builder(SecurityPreference model) {
                this.accessKeyPreference = model.accessKeyPreference;
                this.loginProfilePreference = model.loginProfilePreference;
                this.MFAPreference = model.MFAPreference;
                this.publicKeyPreference = model.publicKeyPreference;
            } 

            /**
             * <p>The AccessKey pair preference.</p>
             */
            public Builder accessKeyPreference(AccessKeyPreference accessKeyPreference) {
                this.accessKeyPreference = accessKeyPreference;
                return this;
            }

            /**
             * <p>The logon preference.</p>
             */
            public Builder loginProfilePreference(LoginProfilePreference loginProfilePreference) {
                this.loginProfilePreference = loginProfilePreference;
                return this;
            }

            /**
             * <p>The MFA preference.</p>
             */
            public Builder MFAPreference(MFAPreference MFAPreference) {
                this.MFAPreference = MFAPreference;
                return this;
            }

            /**
             * <p>The public key preference.</p>
             * <blockquote>
             * <p> This parameter is valid only for the Japan site.</p>
             * </blockquote>
             */
            public Builder publicKeyPreference(PublicKeyPreference publicKeyPreference) {
                this.publicKeyPreference = publicKeyPreference;
                return this;
            }

            public SecurityPreference build() {
                return new SecurityPreference(this);
            } 

        } 

    }
}
