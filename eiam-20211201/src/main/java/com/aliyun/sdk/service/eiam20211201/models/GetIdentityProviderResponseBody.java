// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderResponseBody</p>
 */
public class GetIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviderDetail")
    private IdentityProviderDetail identityProviderDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIdentityProviderResponseBody(Builder builder) {
        this.identityProviderDetail = builder.identityProviderDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderDetail
     */
    public IdentityProviderDetail getIdentityProviderDetail() {
        return this.identityProviderDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IdentityProviderDetail identityProviderDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderResponseBody model) {
            this.identityProviderDetail = model.identityProviderDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Identity provider Information.</p>
         */
        public Builder identityProviderDetail(IdentityProviderDetail identityProviderDetail) {
            this.identityProviderDetail = identityProviderDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIdentityProviderResponseBody build() {
            return new GetIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class DingtalkAppConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("DingtalkVersion")
        private String dingtalkVersion;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("VerificationToken")
        private String verificationToken;

        private DingtalkAppConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.corpId = builder.corpId;
            this.dingtalkVersion = builder.dingtalkVersion;
            this.encryptKey = builder.encryptKey;
            this.verificationToken = builder.verificationToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkAppConfig create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dingtalkVersion
         */
        public String getDingtalkVersion() {
            return this.dingtalkVersion;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String appKey; 
            private String appSecret; 
            private String corpId; 
            private String dingtalkVersion; 
            private String encryptKey; 
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(DingtalkAppConfig model) {
                this.appKey = model.appKey;
                this.appSecret = model.appSecret;
                this.corpId = model.corpId;
                this.dingtalkVersion = model.dingtalkVersion;
                this.encryptKey = model.encryptKey;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * <p>The AppKey for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>41reopmwoy9s</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The details of the application secret.</p>
             * 
             * <strong>example:</strong>
             * <p>REOQ6Cl55kriOd8NOBeqWYLKpHR4p6fdZxxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>DingTalk corpId.</p>
             * 
             * <strong>example:</strong>
             * <p>3756043633237690761</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>DingTalk Version.</p>
             * 
             * <strong>example:</strong>
             * <p>public_dingtalk</p>
             */
            public Builder dingtalkVersion(String dingtalkVersion) {
                this.dingtalkVersion = dingtalkVersion;
                return this;
            }

            /**
             * <p>DingTalk  encrypt key.</p>
             * 
             * <strong>example:</strong>
             * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffdxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>DingTalk  verification token.</p>
             * 
             * <strong>example:</strong>
             * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffxxxxx</p>
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public DingtalkAppConfig build() {
                return new DingtalkAppConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class AuthedDepartmentIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptId")
        private String deptId;

        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        private AuthedDepartmentIds(Builder builder) {
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthedDepartmentIds create() {
            return builder().build();
        }

        /**
         * @return deptId
         */
        public String getDeptId() {
            return this.deptId;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        public static final class Builder {
            private String deptId; 
            private String deptName; 

            private Builder() {
            } 

            private Builder(AuthedDepartmentIds model) {
                this.deptId = model.deptId;
                this.deptName = model.deptName;
            } 

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxx444</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>Department name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_xxx</p>
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            public AuthedDepartmentIds build() {
                return new AuthedDepartmentIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class AuthedUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AuthedUsers(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthedUsers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String name; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AuthedUsers model) {
                this.name = model.name;
                this.userId = model.userId;
            } 

            /**
             * <p>DingTalk user name.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>DingTalk user id.</p>
             * 
             * <strong>example:</strong>
             * <p>13030833392920xxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AuthedUsers build() {
                return new AuthedUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class DingtalkProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthedDepartmentIds")
        private java.util.List<AuthedDepartmentIds> authedDepartmentIds;

        @com.aliyun.core.annotation.NameInMap("AuthedUsers")
        private java.util.List<AuthedUsers> authedUsers;

        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("CorpName")
        private String corpName;

        private DingtalkProvisioningConfig(Builder builder) {
            this.authedDepartmentIds = builder.authedDepartmentIds;
            this.authedUsers = builder.authedUsers;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkProvisioningConfig create() {
            return builder().build();
        }

        /**
         * @return authedDepartmentIds
         */
        public java.util.List<AuthedDepartmentIds> getAuthedDepartmentIds() {
            return this.authedDepartmentIds;
        }

        /**
         * @return authedUsers
         */
        public java.util.List<AuthedUsers> getAuthedUsers() {
            return this.authedUsers;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        public static final class Builder {
            private java.util.List<AuthedDepartmentIds> authedDepartmentIds; 
            private java.util.List<AuthedUsers> authedUsers; 
            private String corpId; 
            private String corpName; 

            private Builder() {
            } 

            private Builder(DingtalkProvisioningConfig model) {
                this.authedDepartmentIds = model.authedDepartmentIds;
                this.authedUsers = model.authedUsers;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
            } 

            /**
             * <p>List of authorized DingTalk departments.</p>
             */
            public Builder authedDepartmentIds(java.util.List<AuthedDepartmentIds> authedDepartmentIds) {
                this.authedDepartmentIds = authedDepartmentIds;
                return this;
            }

            /**
             * <p>Authorized DingTalk account list.</p>
             */
            public Builder authedUsers(java.util.List<AuthedUsers> authedUsers) {
                this.authedUsers = authedUsers;
                return this;
            }

            /**
             * <p>DingTalk enterprise corpId.</p>
             * 
             * <strong>example:</strong>
             * <p>ding_xxxxx</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>The name of the company.</p>
             * 
             * <strong>example:</strong>
             * <p>test_xxx</p>
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            public DingtalkProvisioningConfig build() {
                return new DingtalkProvisioningConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class LarkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EnterpriseNumber")
        private String enterpriseNumber;

        @com.aliyun.core.annotation.NameInMap("VerificationToken")
        private String verificationToken;

        private LarkConfig(Builder builder) {
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.encryptKey = builder.encryptKey;
            this.enterpriseNumber = builder.enterpriseNumber;
            this.verificationToken = builder.verificationToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LarkConfig create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return enterpriseNumber
         */
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String appId; 
            private String appSecret; 
            private String encryptKey; 
            private String enterpriseNumber; 
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(LarkConfig model) {
                this.appId = model.appId;
                this.appSecret = model.appSecret;
                this.encryptKey = model.encryptKey;
                this.enterpriseNumber = model.enterpriseNumber;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_a7a99f53a317xxxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>Feishu encryptKey.</p>
             * 
             * <strong>example:</strong>
             * <p>c5db46da8d4b751a7878e5d670402fb60e4d2391de3fa01f7c9e6353f6d1xxxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>Feishu enterprise code.</p>
             * 
             * <strong>example:</strong>
             * <p>FX1231xxxx</p>
             */
            public Builder enterpriseNumber(String enterpriseNumber) {
                this.enterpriseNumber = enterpriseNumber;
                return this;
            }

            /**
             * <p>Feishu verificationToken.</p>
             * 
             * <strong>example:</strong>
             * <p>c5db46da8d4b751a7878e5d670402fb60e4d2391de3fa01f7c9e6353f6d1xxxxx</p>
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public LarkConfig build() {
                return new LarkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class LdapConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdministratorPassword")
        private String administratorPassword;

        @com.aliyun.core.annotation.NameInMap("AdministratorUsername")
        private String administratorUsername;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprintStatus")
        private String certificateFingerprintStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprints")
        private java.util.List<String> certificateFingerprints;

        @com.aliyun.core.annotation.NameInMap("LdapProtocol")
        private String ldapProtocol;

        @com.aliyun.core.annotation.NameInMap("LdapServerHost")
        private String ldapServerHost;

        @com.aliyun.core.annotation.NameInMap("LdapServerPort")
        private Integer ldapServerPort;

        @com.aliyun.core.annotation.NameInMap("StartTlsStatus")
        private String startTlsStatus;

        private LdapConfig(Builder builder) {
            this.administratorPassword = builder.administratorPassword;
            this.administratorUsername = builder.administratorUsername;
            this.certificateFingerprintStatus = builder.certificateFingerprintStatus;
            this.certificateFingerprints = builder.certificateFingerprints;
            this.ldapProtocol = builder.ldapProtocol;
            this.ldapServerHost = builder.ldapServerHost;
            this.ldapServerPort = builder.ldapServerPort;
            this.startTlsStatus = builder.startTlsStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LdapConfig create() {
            return builder().build();
        }

        /**
         * @return administratorPassword
         */
        public String getAdministratorPassword() {
            return this.administratorPassword;
        }

        /**
         * @return administratorUsername
         */
        public String getAdministratorUsername() {
            return this.administratorUsername;
        }

        /**
         * @return certificateFingerprintStatus
         */
        public String getCertificateFingerprintStatus() {
            return this.certificateFingerprintStatus;
        }

        /**
         * @return certificateFingerprints
         */
        public java.util.List<String> getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        /**
         * @return ldapProtocol
         */
        public String getLdapProtocol() {
            return this.ldapProtocol;
        }

        /**
         * @return ldapServerHost
         */
        public String getLdapServerHost() {
            return this.ldapServerHost;
        }

        /**
         * @return ldapServerPort
         */
        public Integer getLdapServerPort() {
            return this.ldapServerPort;
        }

        /**
         * @return startTlsStatus
         */
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

        public static final class Builder {
            private String administratorPassword; 
            private String administratorUsername; 
            private String certificateFingerprintStatus; 
            private java.util.List<String> certificateFingerprints; 
            private String ldapProtocol; 
            private String ldapServerHost; 
            private Integer ldapServerPort; 
            private String startTlsStatus; 

            private Builder() {
            } 

            private Builder(LdapConfig model) {
                this.administratorPassword = model.administratorPassword;
                this.administratorUsername = model.administratorUsername;
                this.certificateFingerprintStatus = model.certificateFingerprintStatus;
                this.certificateFingerprints = model.certificateFingerprints;
                this.ldapProtocol = model.ldapProtocol;
                this.ldapServerHost = model.ldapServerHost;
                this.ldapServerPort = model.ldapServerPort;
                this.startTlsStatus = model.startTlsStatus;
            } 

            /**
             * <p>Administrator password.</p>
             * 
             * <strong>example:</strong>
             * <p>XXXX</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>Administrator username.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder administratorUsername(String administratorUsername) {
                this.administratorUsername = administratorUsername;
                return this;
            }

            /**
             * <p>Whether to verify the fingerprint certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder certificateFingerprintStatus(String certificateFingerprintStatus) {
                this.certificateFingerprintStatus = certificateFingerprintStatus;
                return this;
            }

            /**
             * <p>Certificate fingerprint list.</p>
             */
            public Builder certificateFingerprints(java.util.List<String> certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>Ldap protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder ldapProtocol(String ldapProtocol) {
                this.ldapProtocol = ldapProtocol;
                return this;
            }

            /**
             * <p>ldap server host.</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.100</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>ldap server port.</p>
             * 
             * <strong>example:</strong>
             * <p>389</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>StartTls status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder startTlsStatus(String startTlsStatus) {
                this.startTlsStatus = startTlsStatus;
                return this;
            }

            public LdapConfig build() {
                return new LdapConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class AuthnParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnMethod")
        private String authnMethod;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        private AuthnParam(Builder builder) {
            this.authnMethod = builder.authnMethod;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthnParam create() {
            return builder().build();
        }

        /**
         * @return authnMethod
         */
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String authnMethod; 
            private String clientId; 
            private String clientSecret; 

            private Builder() {
            } 

            private Builder(AuthnParam model) {
                this.authnMethod = model.authnMethod;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>OIDC/OAuth2 authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>The client ID of the device whose access credential you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The application secret registered with the OIDC authentication service.</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public AuthnParam build() {
                return new AuthnParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class EndpointConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksUri")
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("UserinfoEndpoint")
        private String userinfoEndpoint;

        private EndpointConfig(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.issuer = builder.issuer;
            this.jwksUri = builder.jwksUri;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfig create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksUri
         */
        public String getJwksUri() {
            return this.jwksUri;
        }

        /**
         * @return tokenEndpoint
         */
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        /**
         * @return userinfoEndpoint
         */
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

        public static final class Builder {
            private String authorizationEndpoint; 
            private String issuer; 
            private String jwksUri; 
            private String tokenEndpoint; 
            private String userinfoEndpoint; 

            private Builder() {
            } 

            private Builder(EndpointConfig model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.issuer = model.issuer;
                this.jwksUri = model.jwksUri;
                this.tokenEndpoint = model.tokenEndpoint;
                this.userinfoEndpoint = model.userinfoEndpoint;
            } 

            /**
             * <p>OAuth2 authorization endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The CA that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Jwks uri.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>Token endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC user info endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/userinfo">https://example.com/oauth/userinfo</a></p>
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public EndpointConfig build() {
                return new EndpointConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class OidcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnParam")
        private AuthnParam authnParam;

        @com.aliyun.core.annotation.NameInMap("EndpointConfig")
        private EndpointConfig endpointConfig;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List<String> grantScopes;

        @com.aliyun.core.annotation.NameInMap("GrantType")
        private String grantType;

        @com.aliyun.core.annotation.NameInMap("PkceChallengeMethod")
        private String pkceChallengeMethod;

        @com.aliyun.core.annotation.NameInMap("PkceRequired")
        private Boolean pkceRequired;

        private OidcConfig(Builder builder) {
            this.authnParam = builder.authnParam;
            this.endpointConfig = builder.endpointConfig;
            this.grantScopes = builder.grantScopes;
            this.grantType = builder.grantType;
            this.pkceChallengeMethod = builder.pkceChallengeMethod;
            this.pkceRequired = builder.pkceRequired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcConfig create() {
            return builder().build();
        }

        /**
         * @return authnParam
         */
        public AuthnParam getAuthnParam() {
            return this.authnParam;
        }

        /**
         * @return endpointConfig
         */
        public EndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        /**
         * @return grantScopes
         */
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        /**
         * @return grantType
         */
        public String getGrantType() {
            return this.grantType;
        }

        /**
         * @return pkceChallengeMethod
         */
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        /**
         * @return pkceRequired
         */
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public static final class Builder {
            private AuthnParam authnParam; 
            private EndpointConfig endpointConfig; 
            private java.util.List<String> grantScopes; 
            private String grantType; 
            private String pkceChallengeMethod; 
            private Boolean pkceRequired; 

            private Builder() {
            } 

            private Builder(OidcConfig model) {
                this.authnParam = model.authnParam;
                this.endpointConfig = model.endpointConfig;
                this.grantScopes = model.grantScopes;
                this.grantType = model.grantType;
                this.pkceChallengeMethod = model.pkceChallengeMethod;
                this.pkceRequired = model.pkceRequired;
            } 

            /**
             * <p>OIDC client authentication configuration.</p>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>OIDC endpoint configuration.</p>
             */
            public Builder endpointConfig(EndpointConfig endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>OIDC authorization scope list.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>OIDC authorization grant type.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>Supported PKCE code challenge methods.</p>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>Whether to use PKCE in authorization code grant flow.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            public OidcConfig build() {
                return new OidcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class UdSyncScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List<String> sourceScopes;

        @com.aliyun.core.annotation.NameInMap("TargetScope")
        private String targetScope;

        private UdSyncScopeConfig(Builder builder) {
            this.sourceScopes = builder.sourceScopes;
            this.targetScope = builder.targetScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdSyncScopeConfig create() {
            return builder().build();
        }

        /**
         * @return sourceScopes
         */
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List<String> sourceScopes; 
            private String targetScope; 

            private Builder() {
            } 

            private Builder(UdSyncScopeConfig model) {
                this.sourceScopes = model.sourceScopes;
                this.targetScope = model.targetScope;
            } 

            /**
             * <p>Synchronization source node.</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Synchronization target node.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_123xxxx</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            public UdSyncScopeConfig build() {
                return new UdSyncScopeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class UdPullConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupSyncStatus")
        private String groupSyncStatus;

        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfig")
        private UdSyncScopeConfig udSyncScopeConfig;

        private UdPullConfig(Builder builder) {
            this.groupSyncStatus = builder.groupSyncStatus;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.udSyncScopeConfig = builder.udSyncScopeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdPullConfig create() {
            return builder().build();
        }

        /**
         * @return groupSyncStatus
         */
        public String getGroupSyncStatus() {
            return this.groupSyncStatus;
        }

        /**
         * @return incrementalCallbackStatus
         */
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        /**
         * @return udSyncScopeConfig
         */
        public UdSyncScopeConfig getUdSyncScopeConfig() {
            return this.udSyncScopeConfig;
        }

        public static final class Builder {
            private String groupSyncStatus; 
            private String incrementalCallbackStatus; 
            private UdSyncScopeConfig udSyncScopeConfig; 

            private Builder() {
            } 

            private Builder(UdPullConfig model) {
                this.groupSyncStatus = model.groupSyncStatus;
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.udSyncScopeConfig = model.udSyncScopeConfig;
            } 

            /**
             * <p>Whether to enable group synchronization. Possible values:</p>
             * <p>Disabled: disabled</p>
             * <p>Enabled: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder groupSyncStatus(String groupSyncStatus) {
                this.groupSyncStatus = groupSyncStatus;
                return this;
            }

            /**
             * <p>Incremental callback status: Whether to process incremental callback data from the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>Inbound synchronization configuration Information.</p>
             */
            public Builder udSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
                this.udSyncScopeConfig = udSyncScopeConfig;
                return this;
            }

            public UdPullConfig build() {
                return new UdPullConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class UdSyncScopeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List<String> sourceScopes;

        @com.aliyun.core.annotation.NameInMap("TargetScope")
        private String targetScope;

        private UdSyncScopeConfigs(Builder builder) {
            this.sourceScopes = builder.sourceScopes;
            this.targetScope = builder.targetScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdSyncScopeConfigs create() {
            return builder().build();
        }

        /**
         * @return sourceScopes
         */
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List<String> sourceScopes; 
            private String targetScope; 

            private Builder() {
            } 

            private Builder(UdSyncScopeConfigs model) {
                this.sourceScopes = model.sourceScopes;
                this.targetScope = model.targetScope;
            } 

            /**
             * <p>Synchronization source node.</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Synchronization target node.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_123xxxx</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            public UdSyncScopeConfigs build() {
                return new UdSyncScopeConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class UdPushConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfigs")
        private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs;

        private UdPushConfig(Builder builder) {
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.udSyncScopeConfigs = builder.udSyncScopeConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdPushConfig create() {
            return builder().build();
        }

        /**
         * @return incrementalCallbackStatus
         */
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        /**
         * @return udSyncScopeConfigs
         */
        public java.util.List<UdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

        public static final class Builder {
            private String incrementalCallbackStatus; 
            private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs; 

            private Builder() {
            } 

            private Builder(UdPushConfig model) {
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.udSyncScopeConfigs = model.udSyncScopeConfigs;
            } 

            /**
             * <p>Incremental callback status: Whether to process incremental callback data from the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>Outbound synchronization configuration Information.</p>
             */
            public Builder udSyncScopeConfigs(java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs) {
                this.udSyncScopeConfigs = udSyncScopeConfigs;
                return this;
            }

            public UdPushConfig build() {
                return new UdPushConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class WeComConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AuthorizeCallbackDomain")
        private String authorizeCallbackDomain;

        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("CorpSecret")
        private String corpSecret;

        @com.aliyun.core.annotation.NameInMap("TrustableDomain")
        private String trustableDomain;

        private WeComConfig(Builder builder) {
            this.agentId = builder.agentId;
            this.authorizeCallbackDomain = builder.authorizeCallbackDomain;
            this.corpId = builder.corpId;
            this.corpSecret = builder.corpSecret;
            this.trustableDomain = builder.trustableDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeComConfig create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return authorizeCallbackDomain
         */
        public String getAuthorizeCallbackDomain() {
            return this.authorizeCallbackDomain;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpSecret
         */
        public String getCorpSecret() {
            return this.corpSecret;
        }

        /**
         * @return trustableDomain
         */
        public String getTrustableDomain() {
            return this.trustableDomain;
        }

        public static final class Builder {
            private String agentId; 
            private String authorizeCallbackDomain; 
            private String corpId; 
            private String corpSecret; 
            private String trustableDomain; 

            private Builder() {
            } 

            private Builder(WeComConfig model) {
                this.agentId = model.agentId;
                this.authorizeCallbackDomain = model.authorizeCallbackDomain;
                this.corpId = model.corpId;
                this.corpSecret = model.corpSecret;
                this.trustableDomain = model.trustableDomain;
            } 

            /**
             * <p>The ID of the load generator. This parameter is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1242350</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Authorization callback domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/xxxx">https://example.com/xxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * <p>CorpId.</p>
             * 
             * <strong>example:</strong>
             * <p>356201295345457xxxxx</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>Corp secret.</p>
             * 
             * <strong>example:</strong>
             * <p>weaseiszjskejskaj12sjeszojxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>Trusted domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder trustableDomain(String trustableDomain) {
                this.trustableDomain = trustableDomain;
                return this;
            }

            public WeComConfig build() {
                return new WeComConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class IdentityProviderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedStatus")
        private String advancedStatus;

        @com.aliyun.core.annotation.NameInMap("AuthnSourceSupplier")
        private String authnSourceSupplier;

        @com.aliyun.core.annotation.NameInMap("AuthnSourceType")
        private String authnSourceType;

        @com.aliyun.core.annotation.NameInMap("AuthnStatus")
        private String authnStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DingtalkAppConfig")
        private DingtalkAppConfig dingtalkAppConfig;

        @com.aliyun.core.annotation.NameInMap("DingtalkProvisioningConfig")
        private DingtalkProvisioningConfig dingtalkProvisioningConfig;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderExternalId")
        private String identityProviderExternalId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LarkConfig")
        private LarkConfig larkConfig;

        @com.aliyun.core.annotation.NameInMap("LastStatusCheckJobResult")
        private String lastStatusCheckJobResult;

        @com.aliyun.core.annotation.NameInMap("LdapConfig")
        private LdapConfig ldapConfig;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LogoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("OidcConfig")
        private OidcConfig oidcConfig;

        @com.aliyun.core.annotation.NameInMap("UdPullConfig")
        private UdPullConfig udPullConfig;

        @com.aliyun.core.annotation.NameInMap("UdPullStatus")
        private String udPullStatus;

        @com.aliyun.core.annotation.NameInMap("UdPushConfig")
        private UdPushConfig udPushConfig;

        @com.aliyun.core.annotation.NameInMap("UdPushStatus")
        private String udPushStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("WeComConfig")
        private WeComConfig weComConfig;

        private IdentityProviderDetail(Builder builder) {
            this.advancedStatus = builder.advancedStatus;
            this.authnSourceSupplier = builder.authnSourceSupplier;
            this.authnSourceType = builder.authnSourceType;
            this.authnStatus = builder.authnStatus;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dingtalkAppConfig = builder.dingtalkAppConfig;
            this.dingtalkProvisioningConfig = builder.dingtalkProvisioningConfig;
            this.identityProviderExternalId = builder.identityProviderExternalId;
            this.identityProviderId = builder.identityProviderId;
            this.identityProviderName = builder.identityProviderName;
            this.identityProviderType = builder.identityProviderType;
            this.instanceId = builder.instanceId;
            this.larkConfig = builder.larkConfig;
            this.lastStatusCheckJobResult = builder.lastStatusCheckJobResult;
            this.ldapConfig = builder.ldapConfig;
            this.lockReason = builder.lockReason;
            this.logoUrl = builder.logoUrl;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.oidcConfig = builder.oidcConfig;
            this.udPullConfig = builder.udPullConfig;
            this.udPullStatus = builder.udPullStatus;
            this.udPushConfig = builder.udPushConfig;
            this.udPushStatus = builder.udPushStatus;
            this.updateTime = builder.updateTime;
            this.weComConfig = builder.weComConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProviderDetail create() {
            return builder().build();
        }

        /**
         * @return advancedStatus
         */
        public String getAdvancedStatus() {
            return this.advancedStatus;
        }

        /**
         * @return authnSourceSupplier
         */
        public String getAuthnSourceSupplier() {
            return this.authnSourceSupplier;
        }

        /**
         * @return authnSourceType
         */
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        /**
         * @return authnStatus
         */
        public String getAuthnStatus() {
            return this.authnStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dingtalkAppConfig
         */
        public DingtalkAppConfig getDingtalkAppConfig() {
            return this.dingtalkAppConfig;
        }

        /**
         * @return dingtalkProvisioningConfig
         */
        public DingtalkProvisioningConfig getDingtalkProvisioningConfig() {
            return this.dingtalkProvisioningConfig;
        }

        /**
         * @return identityProviderExternalId
         */
        public String getIdentityProviderExternalId() {
            return this.identityProviderExternalId;
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return larkConfig
         */
        public LarkConfig getLarkConfig() {
            return this.larkConfig;
        }

        /**
         * @return lastStatusCheckJobResult
         */
        public String getLastStatusCheckJobResult() {
            return this.lastStatusCheckJobResult;
        }

        /**
         * @return ldapConfig
         */
        public LdapConfig getLdapConfig() {
            return this.ldapConfig;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return networkAccessEndpointId
         */
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        /**
         * @return oidcConfig
         */
        public OidcConfig getOidcConfig() {
            return this.oidcConfig;
        }

        /**
         * @return udPullConfig
         */
        public UdPullConfig getUdPullConfig() {
            return this.udPullConfig;
        }

        /**
         * @return udPullStatus
         */
        public String getUdPullStatus() {
            return this.udPullStatus;
        }

        /**
         * @return udPushConfig
         */
        public UdPushConfig getUdPushConfig() {
            return this.udPushConfig;
        }

        /**
         * @return udPushStatus
         */
        public String getUdPushStatus() {
            return this.udPushStatus;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return weComConfig
         */
        public WeComConfig getWeComConfig() {
            return this.weComConfig;
        }

        public static final class Builder {
            private String advancedStatus; 
            private String authnSourceSupplier; 
            private String authnSourceType; 
            private String authnStatus; 
            private Long createTime; 
            private String description; 
            private DingtalkAppConfig dingtalkAppConfig; 
            private DingtalkProvisioningConfig dingtalkProvisioningConfig; 
            private String identityProviderExternalId; 
            private String identityProviderId; 
            private String identityProviderName; 
            private String identityProviderType; 
            private String instanceId; 
            private LarkConfig larkConfig; 
            private String lastStatusCheckJobResult; 
            private LdapConfig ldapConfig; 
            private String lockReason; 
            private String logoUrl; 
            private String networkAccessEndpointId; 
            private OidcConfig oidcConfig; 
            private UdPullConfig udPullConfig; 
            private String udPullStatus; 
            private UdPushConfig udPushConfig; 
            private String udPushStatus; 
            private Long updateTime; 
            private WeComConfig weComConfig; 

            private Builder() {
            } 

            private Builder(IdentityProviderDetail model) {
                this.advancedStatus = model.advancedStatus;
                this.authnSourceSupplier = model.authnSourceSupplier;
                this.authnSourceType = model.authnSourceType;
                this.authnStatus = model.authnStatus;
                this.createTime = model.createTime;
                this.description = model.description;
                this.dingtalkAppConfig = model.dingtalkAppConfig;
                this.dingtalkProvisioningConfig = model.dingtalkProvisioningConfig;
                this.identityProviderExternalId = model.identityProviderExternalId;
                this.identityProviderId = model.identityProviderId;
                this.identityProviderName = model.identityProviderName;
                this.identityProviderType = model.identityProviderType;
                this.instanceId = model.instanceId;
                this.larkConfig = model.larkConfig;
                this.lastStatusCheckJobResult = model.lastStatusCheckJobResult;
                this.ldapConfig = model.ldapConfig;
                this.lockReason = model.lockReason;
                this.logoUrl = model.logoUrl;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.oidcConfig = model.oidcConfig;
                this.udPullConfig = model.udPullConfig;
                this.udPullStatus = model.udPullStatus;
                this.udPushConfig = model.udPushConfig;
                this.udPushStatus = model.udPushStatus;
                this.updateTime = model.updateTime;
                this.weComConfig = model.weComConfig;
            } 

            /**
             * <p>Advanced configuration capability. 
             * Value range:<br>Disabled: disabled<br>Enable: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder advancedStatus(String advancedStatus) {
                this.advancedStatus = advancedStatus;
                return this;
            }

            /**
             * <p>The corresponding identity provider product, e.g., Okta, Google, or Azure AD. Possible values:</p>
             * <p>DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk</p>
             * <p>LDAP: urn:alibaba:idaas:idp:unknown:ldap</p>
             * <p>Alibaba Cloud IDaaS: urn:alibaba:idaas:idp:alibaba:idaas</p>
             * <p>WeCom (Enterprise WeChat): urn:alibaba:idaas:idp:tencent:wecom</p>
             * <p>Lark (Feishu): urn:alibaba:idaas:idp:bytedance:lark</p>
             * <p>Active Directory: urn:alibaba:idaas:idp:microsoft:ad</p>
             * <p>Azure Active Directory: urn:alibaba:idaas:idp:microsoft:aad</p>
             * <p>Alibaba Cloud SASE: urn:alibaba:idaas:idp:alibaba:sase</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
             */
            public Builder authnSourceSupplier(String authnSourceSupplier) {
                this.authnSourceSupplier = authnSourceSupplier;
                return this;
            }

            /**
             * <p>Authentication type — OIDC or SAML. Possible values:</p>
             * <p>OIDC: urn:alibaba:idaas:authntype:oidc</p>
             * <p>SAML: urn:alibaba:idaas:authntype:saml2</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:authntype:oidc</p>
             */
            public Builder authnSourceType(String authnSourceType) {
                this.authnSourceType = authnSourceType;
                return this;
            }

            /**
             * <p>Whether the corresponding IdP supports authentication. Value range: 
             * Disabled: disabled<br>Enabled: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * <p>The time when the version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1726021079000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Identity provider description.</p>
             * 
             * <strong>example:</strong>
             * <p>for poc test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>DingTalk Basic Configuration</p>
             */
            public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
                this.dingtalkAppConfig = dingtalkAppConfig;
                return this;
            }

            /**
             * <p>DingTalk synchronous configuration.</p>
             */
            public Builder dingtalkProvisioningConfig(DingtalkProvisioningConfig dingtalkProvisioningConfig) {
                this.dingtalkProvisioningConfig = dingtalkProvisioningConfig;
                return this;
            }

            /**
             * <p>Identity provider external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idp_xxxx</p>
             */
            public Builder identityProviderExternalId(String identityProviderExternalId) {
                this.identityProviderExternalId = identityProviderExternalId;
                return this;
            }

            /**
             * <p>Identity provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idp_mwpcwnhrimlr2horx7xgg7xxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>Identity provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>Identity provider type.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_x2df3bak3uwnapqm6xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Lark configuration.</p>
             */
            public Builder larkConfig(LarkConfig larkConfig) {
                this.larkConfig = larkConfig;
                return this;
            }

            /**
             * <p>Last status check result.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder lastStatusCheckJobResult(String lastStatusCheckJobResult) {
                this.lastStatusCheckJobResult = lastStatusCheckJobResult;
                return this;
            }

            /**
             * <p>AD/LDAP Identity provider information.</p>
             */
            public Builder ldapConfig(LdapConfig ldapConfig) {
                this.ldapConfig = ldapConfig;
                return this;
            }

            /**
             * <p>The reason why write operations on the instance are locked.</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The URL of the application logo.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01OB8fJj22fpoZm4sd0_!!6000000007148-2-tps-149-xxx.png">https://img.alicdn.com/imgextra/i4/O1CN01OB8fJj22fpoZm4sd0_!!6000000007148-2-tps-149-xxx.png</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>The unique identifier of the network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>nae_mx4vsadfe6govkqkwckxxxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>OIDC IdP configuration.</p>
             */
            public Builder oidcConfig(OidcConfig oidcConfig) {
                this.oidcConfig = oidcConfig;
                return this;
            }

            /**
             * <p>Sync in configuration.</p>
             */
            public Builder udPullConfig(UdPullConfig udPullConfig) {
                this.udPullConfig = udPullConfig;
                return this;
            }

            /**
             * <p>Indicates whether the IDaaS EIAM system supports UD (User Directory) synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPullStatus(String udPullStatus) {
                this.udPullStatus = udPullStatus;
                return this;
            }

            /**
             * <p>Outbound synchronization configuration.</p>
             */
            public Builder udPushConfig(UdPushConfig udPushConfig) {
                this.udPushConfig = udPushConfig;
                return this;
            }

            /**
             * <p>Outbound synchronization capability.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPushStatus(String udPushStatus) {
                this.udPushStatus = udPushStatus;
                return this;
            }

            /**
             * <p>The time when the serviceInstance  was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1726021079000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>WeCom configuration.</p>
             */
            public Builder weComConfig(WeComConfig weComConfig) {
                this.weComConfig = weComConfig;
                return this;
            }

            public IdentityProviderDetail build() {
                return new IdentityProviderDetail(this);
            } 

        } 

    }
}
