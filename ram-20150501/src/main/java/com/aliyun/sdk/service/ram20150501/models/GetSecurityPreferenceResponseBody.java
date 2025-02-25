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
 * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityPreferenceResponseBody</p>
 */
public class GetSecurityPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPreference")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC1213F1-A9D5-4A01-A996-44983689126C</p>
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

        public GetSecurityPreferenceResponseBody build() {
            return new GetSecurityPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityPreferenceResponseBody</p>
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

            /**
             * <p>Indicates whether RAM users can manage their AccessKey pairs. Valid values:</p>
             * <ul>
             * <li>true: RAM users can manage their AccessKey pairs.</li>
             * <li>false: RAM users cannot manage their AccessKey pairs.</li>
             * </ul>
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
     * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityPreferenceResponseBody</p>
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

            /**
             * <p>Indicates whether RAM users can change their passwords. Valid values:</p>
             * <ul>
             * <li>true: RAM users can change their passwords.</li>
             * <li>false: RAM users cannot change their passwords.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
                this.allowUserToChangePassword = allowUserToChangePassword;
                return this;
            }

            /**
             * <p>Indicates whether RAM users can save security codes for multi-factor authentication (MFA) during logon. Each security code is valid for seven days. Valid values:</p>
             * <ul>
             * <li>true: RAM users can save MFA security codes during logon.</li>
             * <li>false: RAM users cannot save MFA security codes during logon.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
                this.enableSaveMFATicket = enableSaveMFATicket;
                return this;
            }

            /**
             * <p>The subnet mask that indicates the IP addresses from which logon to the Alibaba Cloud Management Console is allowed. This parameter applies to password-based logon and single sign-on (SSO). However, this parameter does not apply to API calls that are authenticated based on AccessKey pairs.</p>
             * <ul>
             * <li>If a subnet mask is specified, RAM users can log on to the Alibaba Cloud Management Console only by using the IP addresses in the subnetwork.</li>
             * <li>If no subnet mask is specified, RAM users can log on to the Alibaba Cloud Management Console by using all IP addresses.</li>
             * </ul>
             * <p>If more than one subnet mask is specified, the masks are separated with semicolons (;), for example, 192.168.0.0/16;10.0.0.0/8.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder loginNetworkMasks(String loginNetworkMasks) {
                this.loginNetworkMasks = loginNetworkMasks;
                return this;
            }

            /**
             * <p>The validity period of a logon session of a RAM user. Unit: hours.</p>
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
     * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityPreferenceResponseBody</p>
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

            /**
             * <p>Indicates whether RAM users can manage their MFA devices. Valid values:</p>
             * <ul>
             * <li>true: RAM users can manage their MFA devices.</li>
             * <li>false: RAM users cannot manage their MFA devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityPreferenceResponseBody</p>
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

            /**
             * <p>Indicates whether RAM users can manage their public keys. Valid values:</p>
             * <ul>
             * <li>true: RAM users can manage their public keys.</li>
             * <li>false: RAM users cannot manage their public keys.</li>
             * </ul>
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
     * {@link GetSecurityPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityPreferenceResponseBody</p>
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

            /**
             * <p>The AccessKey pair preference.</p>
             */
            public Builder accessKeyPreference(AccessKeyPreference accessKeyPreference) {
                this.accessKeyPreference = accessKeyPreference;
                return this;
            }

            /**
             * <p>The logon preferences.</p>
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
             * <p> The public key preference is valid only for the Japan site.</p>
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
