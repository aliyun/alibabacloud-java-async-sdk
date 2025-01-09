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

        /**
         * IdentityProviderDetail.
         */
        public Builder identityProviderDetail(IdentityProviderDetail identityProviderDetail) {
            this.identityProviderDetail = identityProviderDetail;
            return this;
        }

        /**
         * RequestId.
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

        private DingtalkAppConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.corpId = builder.corpId;
            this.dingtalkVersion = builder.dingtalkVersion;
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

        public static final class Builder {
            private String appKey; 
            private String appSecret; 
            private String corpId; 
            private String dingtalkVersion; 

            /**
             * <p>IDaaS EIAM 钉钉一方应用的AppKey</p>
             * 
             * <strong>example:</strong>
             * <p>41reopmwoy9s</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉一方应用的AppSecret</p>
             * 
             * <strong>example:</strong>
             * <p>REOQ6Cl55kriOd8NOBeqWYLKpHR4p6fdZxxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉一方应用的corpId</p>
             * 
             * <strong>example:</strong>
             * <p>3756043633237690761</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉版本</p>
             * 
             * <strong>example:</strong>
             * <p>public_dingtalk</p>
             */
            public Builder dingtalkVersion(String dingtalkVersion) {
                this.dingtalkVersion = dingtalkVersion;
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

            /**
             * <p>钉钉部门Id</p>
             * 
             * <strong>example:</strong>
             * <p>123xxx444</p>
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * <p>钉钉部门名称</p>
             * 
             * <strong>example:</strong>
             * <p>测试部门</p>
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

            /**
             * <p>钉钉用户名称</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>钉钉用户userId</p>
             * 
             * <strong>example:</strong>
             * <p>130308333929200479</p>
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

            /**
             * <p>授权的钉钉部门</p>
             */
            public Builder authedDepartmentIds(java.util.List<AuthedDepartmentIds> authedDepartmentIds) {
                this.authedDepartmentIds = authedDepartmentIds;
                return this;
            }

            /**
             * <p>授权的钉钉账户列表</p>
             */
            public Builder authedUsers(java.util.List<AuthedUsers> authedUsers) {
                this.authedUsers = authedUsers;
                return this;
            }

            /**
             * <p>钉钉企业corpId</p>
             * 
             * <strong>example:</strong>
             * <p>ding_xxxxx</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>钉钉企业名称</p>
             * 
             * <strong>example:</strong>
             * <p>测试企业</p>
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

        @com.aliyun.core.annotation.NameInMap("EnterpriseNumber")
        private String enterpriseNumber;

        private LarkConfig(Builder builder) {
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.enterpriseNumber = builder.enterpriseNumber;
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
         * @return enterpriseNumber
         */
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

        public static final class Builder {
            private String appId; 
            private String appSecret; 
            private String enterpriseNumber; 

            /**
             * <p>IDaaS EIAM 飞书自建应用的corpId</p>
             * 
             * <strong>example:</strong>
             * <p>cli_a7a99f53a317100c</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 飞书自建应用的AppSecret</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>IDaaS EIAM 飞书企业编码</p>
             * 
             * <strong>example:</strong>
             * <p>FX1231xxxx</p>
             */
            public Builder enterpriseNumber(String enterpriseNumber) {
                this.enterpriseNumber = enterpriseNumber;
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

            /**
             * <p>管理员密码</p>
             * 
             * <strong>example:</strong>
             * <p>XXXX</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>管理员账号</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder administratorUsername(String administratorUsername) {
                this.administratorUsername = administratorUsername;
                return this;
            }

            /**
             * <p>是否验证指纹证书</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder certificateFingerprintStatus(String certificateFingerprintStatus) {
                this.certificateFingerprintStatus = certificateFingerprintStatus;
                return this;
            }

            /**
             * <p>证书指纹列表</p>
             */
            public Builder certificateFingerprints(java.util.List<String> certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>通信协议</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder ldapProtocol(String ldapProtocol) {
                this.ldapProtocol = ldapProtocol;
                return this;
            }

            /**
             * <p>ad/ldap 服务器地址</p>
             * 
             * <strong>example:</strong>
             * <p>127.xx.xx.100</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>ad/ldap 服务器地址</p>
             * 
             * <strong>example:</strong>
             * <p>389</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>startTls是否开启</p>
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

            /**
             * <p>OIDC/oAuth2 认证方法。</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>OIDC/oAuth2 客户端ID。</p>
             * 
             * <strong>example:</strong>
             * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>OIDC/oAuth2 客户端密钥。</p>
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

            /**
             * <p>oAuth2 授权端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>OIDC issuer信息。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>OIDC jwks地址。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>oAuth2 Token端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC 用户信息端点。</p>
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

            /**
             * <p>OIDC客户端认证配置。</p>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>OIDC 端点配置。</p>
             */
            public Builder endpointConfig(EndpointConfig endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>OIDC标准参数，如profile、email等</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>OIDC授权类型。</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>支持的PKCE算法类型。</p>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>AuthorizationCode授权模式下是否使用PKCE。</p>
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

            /**
             * <p>同步来源节点</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>同步目标节点</p>
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

            /**
             * GroupSyncStatus.
             */
            public Builder groupSyncStatus(String groupSyncStatus) {
                this.groupSyncStatus = groupSyncStatus;
                return this;
            }

            /**
             * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>同步入配置信息</p>
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

            /**
             * <p>同步来源节点</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>同步目标节点</p>
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

            /**
             * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>同步出配置信息</p>
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

            /**
             * <p>IDaaS EIAM 企业微信自建应用的Id</p>
             * 
             * <strong>example:</strong>
             * <p>1242350</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>授权回调域</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/xxxx">https://example.com/xxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * <p>IDaaS EIAM 企业微信自建应用的corpId</p>
             * 
             * <strong>example:</strong>
             * <p>3562012953454577801</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 企业微信自建应用的corpSecret</p>
             * 
             * <strong>example:</strong>
             * <p>weaseiszjskejskaj12sjeszojxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>可信域名</p>
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

            /**
             * <p>高阶配置能力</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder advancedStatus(String advancedStatus) {
                this.advancedStatus = advancedStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 对应的认证来源产品，okta or google or azure ad</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
             */
            public Builder authnSourceSupplier(String authnSourceSupplier) {
                this.authnSourceSupplier = authnSourceSupplier;
                return this;
            }

            /**
             * <p>IDaaS EIAM 认证方式类型 oidc or saml</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:authntype:oidc</p>
             */
            public Builder authnSourceType(String authnSourceType) {
                this.authnSourceType = authnSourceType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 对应IdP是否支持认证</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1726021079000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方描述</p>
             * 
             * <strong>example:</strong>
             * <p>for poc test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>钉钉基础配置</p>
             */
            public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
                this.dingtalkAppConfig = dingtalkAppConfig;
                return this;
            }

            /**
             * <p>钉钉同步配置</p>
             */
            public Builder dingtalkProvisioningConfig(DingtalkProvisioningConfig dingtalkProvisioningConfig) {
                this.dingtalkProvisioningConfig = dingtalkProvisioningConfig;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方外部ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_xxxx</p>
             */
            public Builder identityProviderExternalId(String identityProviderExternalId) {
                this.identityProviderExternalId = identityProviderExternalId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_mwpcwnhrimlr2horx7xgg7pp7y</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方名称</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>身份提供方同步类型</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_x2df3bak3uwnapqm6xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>飞书配置</p>
             */
            public Builder larkConfig(LarkConfig larkConfig) {
                this.larkConfig = larkConfig;
                return this;
            }

            /**
             * <p>最后一次状态检查结果</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder lastStatusCheckJobResult(String lastStatusCheckJobResult) {
                this.lastStatusCheckJobResult = lastStatusCheckJobResult;
                return this;
            }

            /**
             * <p>AD/LDAP身份提供方相关信息</p>
             */
            public Builder ldapConfig(LdapConfig ldapConfig) {
                this.ldapConfig = ldapConfig;
                return this;
            }

            /**
             * <p>锁定原因</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * LogoUrl.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>网络端点ID</p>
             * 
             * <strong>example:</strong>
             * <p>nae_mx4vsadfe6govkqkwckxxxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>OIDC IdP配置。</p>
             */
            public Builder oidcConfig(OidcConfig oidcConfig) {
                this.oidcConfig = oidcConfig;
                return this;
            }

            /**
             * <p>同步入配置</p>
             */
            public Builder udPullConfig(UdPullConfig udPullConfig) {
                this.udPullConfig = udPullConfig;
                return this;
            }

            /**
             * <p>IDaaS EIAM 是否支持UD同步</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPullStatus(String udPullStatus) {
                this.udPullStatus = udPullStatus;
                return this;
            }

            /**
             * <p>同步出配置</p>
             */
            public Builder udPushConfig(UdPushConfig udPushConfig) {
                this.udPushConfig = udPushConfig;
                return this;
            }

            /**
             * <p>同步出能力</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPushStatus(String udPushStatus) {
                this.udPushStatus = udPushStatus;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1726021079000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>企业微信</p>
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
