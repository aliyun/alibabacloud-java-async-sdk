// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateIdentityProviderRequest</p>
 */
public class CreateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthnConfig")
    private AuthnConfig authnConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateUserConfig")
    private AutoCreateUserConfig autoCreateUserConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpdateUserConfig")
    private AutoUpdateUserConfig autoUpdateUserConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindingConfig")
    private BindingConfig bindingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingtalkAppConfig")
    private DingtalkAppConfig dingtalkAppConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LarkConfig")
    private LarkConfig larkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LdapConfig")
    private LdapConfig ldapConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
    private String networkAccessEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcConfig")
    private OidcConfig oidcConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdPullConfig")
    private UdPullConfig udPullConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdPushConfig")
    private UdPushConfig udPushConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeComConfig")
    private WeComConfig weComConfig;

    private CreateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authnConfig = builder.authnConfig;
        this.autoCreateUserConfig = builder.autoCreateUserConfig;
        this.autoUpdateUserConfig = builder.autoUpdateUserConfig;
        this.bindingConfig = builder.bindingConfig;
        this.dingtalkAppConfig = builder.dingtalkAppConfig;
        this.identityProviderName = builder.identityProviderName;
        this.identityProviderType = builder.identityProviderType;
        this.instanceId = builder.instanceId;
        this.larkConfig = builder.larkConfig;
        this.ldapConfig = builder.ldapConfig;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.oidcConfig = builder.oidcConfig;
        this.udPullConfig = builder.udPullConfig;
        this.udPushConfig = builder.udPushConfig;
        this.weComConfig = builder.weComConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentityProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authnConfig
     */
    public AuthnConfig getAuthnConfig() {
        return this.authnConfig;
    }

    /**
     * @return autoCreateUserConfig
     */
    public AutoCreateUserConfig getAutoCreateUserConfig() {
        return this.autoCreateUserConfig;
    }

    /**
     * @return autoUpdateUserConfig
     */
    public AutoUpdateUserConfig getAutoUpdateUserConfig() {
        return this.autoUpdateUserConfig;
    }

    /**
     * @return bindingConfig
     */
    public BindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    /**
     * @return dingtalkAppConfig
     */
    public DingtalkAppConfig getDingtalkAppConfig() {
        return this.dingtalkAppConfig;
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
     * @return ldapConfig
     */
    public LdapConfig getLdapConfig() {
        return this.ldapConfig;
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
     * @return udPushConfig
     */
    public UdPushConfig getUdPushConfig() {
        return this.udPushConfig;
    }

    /**
     * @return weComConfig
     */
    public WeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static final class Builder extends Request.Builder<CreateIdentityProviderRequest, Builder> {
        private String regionId; 
        private AuthnConfig authnConfig; 
        private AutoCreateUserConfig autoCreateUserConfig; 
        private AutoUpdateUserConfig autoUpdateUserConfig; 
        private BindingConfig bindingConfig; 
        private DingtalkAppConfig dingtalkAppConfig; 
        private String identityProviderName; 
        private String identityProviderType; 
        private String instanceId; 
        private LarkConfig larkConfig; 
        private LdapConfig ldapConfig; 
        private String networkAccessEndpointId; 
        private OidcConfig oidcConfig; 
        private UdPullConfig udPullConfig; 
        private UdPushConfig udPushConfig; 
        private WeComConfig weComConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdentityProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authnConfig = request.authnConfig;
            this.autoCreateUserConfig = request.autoCreateUserConfig;
            this.autoUpdateUserConfig = request.autoUpdateUserConfig;
            this.bindingConfig = request.bindingConfig;
            this.dingtalkAppConfig = request.dingtalkAppConfig;
            this.identityProviderName = request.identityProviderName;
            this.identityProviderType = request.identityProviderType;
            this.instanceId = request.instanceId;
            this.larkConfig = request.larkConfig;
            this.ldapConfig = request.ldapConfig;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.oidcConfig = request.oidcConfig;
            this.udPullConfig = request.udPullConfig;
            this.udPushConfig = request.udPushConfig;
            this.weComConfig = request.weComConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>认证配置</p>
         */
        public Builder authnConfig(AuthnConfig authnConfig) {
            this.putQueryParameter("AuthnConfig", authnConfig);
            this.authnConfig = authnConfig;
            return this;
        }

        /**
         * <p>自动创建账户账户规则配置。</p>
         */
        public Builder autoCreateUserConfig(AutoCreateUserConfig autoCreateUserConfig) {
            this.putQueryParameter("AutoCreateUserConfig", autoCreateUserConfig);
            this.autoCreateUserConfig = autoCreateUserConfig;
            return this;
        }

        /**
         * <p>自动更新账户规则配置。</p>
         */
        public Builder autoUpdateUserConfig(AutoUpdateUserConfig autoUpdateUserConfig) {
            this.putQueryParameter("AutoUpdateUserConfig", autoUpdateUserConfig);
            this.autoUpdateUserConfig = autoUpdateUserConfig;
            return this;
        }

        /**
         * <p>账户绑定规则配置。</p>
         */
        public Builder bindingConfig(BindingConfig bindingConfig) {
            this.putQueryParameter("BindingConfig", bindingConfig);
            this.bindingConfig = bindingConfig;
            return this;
        }

        /**
         * <p>钉钉配置</p>
         */
        public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
            this.putQueryParameter("DingtalkAppConfig", dingtalkAppConfig);
            this.dingtalkAppConfig = dingtalkAppConfig;
            return this;
        }

        /**
         * <p>身份提供方名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putQueryParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        /**
         * <p>身份提供发类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putQueryParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>飞书配置</p>
         */
        public Builder larkConfig(LarkConfig larkConfig) {
            this.putQueryParameter("LarkConfig", larkConfig);
            this.larkConfig = larkConfig;
            return this;
        }

        /**
         * <p>AD/LDAP配置</p>
         */
        public Builder ldapConfig(LdapConfig ldapConfig) {
            this.putQueryParameter("LdapConfig", ldapConfig);
            this.ldapConfig = ldapConfig;
            return this;
        }

        /**
         * <p>网络端点ID</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxxx</p>
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * <p>OIDC IdP配置。</p>
         */
        public Builder oidcConfig(OidcConfig oidcConfig) {
            this.putQueryParameter("OidcConfig", oidcConfig);
            this.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * <p>同步入配置</p>
         */
        public Builder udPullConfig(UdPullConfig udPullConfig) {
            this.putQueryParameter("UdPullConfig", udPullConfig);
            this.udPullConfig = udPullConfig;
            return this;
        }

        /**
         * <p>同步出配置</p>
         */
        public Builder udPushConfig(UdPushConfig udPushConfig) {
            this.putQueryParameter("UdPushConfig", udPushConfig);
            this.udPushConfig = udPushConfig;
            return this;
        }

        /**
         * <p>WeCom配置</p>
         */
        public Builder weComConfig(WeComConfig weComConfig) {
            this.putQueryParameter("WeComConfig", weComConfig);
            this.weComConfig = weComConfig;
            return this;
        }

        @Override
        public CreateIdentityProviderRequest build() {
            return new CreateIdentityProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class AuthnConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnStatus")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
        private String authnStatus;

        @com.aliyun.core.annotation.NameInMap("AutoUpdatePasswordStatus")
        private String autoUpdatePasswordStatus;

        private AuthnConfig(Builder builder) {
            this.authnStatus = builder.authnStatus;
            this.autoUpdatePasswordStatus = builder.autoUpdatePasswordStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthnConfig create() {
            return builder().build();
        }

        /**
         * @return authnStatus
         */
        public String getAuthnStatus() {
            return this.authnStatus;
        }

        /**
         * @return autoUpdatePasswordStatus
         */
        public String getAutoUpdatePasswordStatus() {
            return this.autoUpdatePasswordStatus;
        }

        public static final class Builder {
            private String authnStatus; 
            private String autoUpdatePasswordStatus; 

            /**
             * <p>对应IdP是否支持认证</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * <p>是否支持自动更新密码</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder autoUpdatePasswordStatus(String autoUpdatePasswordStatus) {
                this.autoUpdatePasswordStatus = autoUpdatePasswordStatus;
                return this;
            }

            public AuthnConfig build() {
                return new AuthnConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class AutoCreateUserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreateUserStatus")
        private String autoCreateUserStatus;

        @com.aliyun.core.annotation.NameInMap("TargetOrganizationalUnitIds")
        private java.util.List < String > targetOrganizationalUnitIds;

        private AutoCreateUserConfig(Builder builder) {
            this.autoCreateUserStatus = builder.autoCreateUserStatus;
            this.targetOrganizationalUnitIds = builder.targetOrganizationalUnitIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoCreateUserConfig create() {
            return builder().build();
        }

        /**
         * @return autoCreateUserStatus
         */
        public String getAutoCreateUserStatus() {
            return this.autoCreateUserStatus;
        }

        /**
         * @return targetOrganizationalUnitIds
         */
        public java.util.List < String > getTargetOrganizationalUnitIds() {
            return this.targetOrganizationalUnitIds;
        }

        public static final class Builder {
            private String autoCreateUserStatus; 
            private java.util.List < String > targetOrganizationalUnitIds; 

            /**
             * <p>自动创建账户是否开启</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder autoCreateUserStatus(String autoCreateUserStatus) {
                this.autoCreateUserStatus = autoCreateUserStatus;
                return this;
            }

            /**
             * TargetOrganizationalUnitIds.
             */
            public Builder targetOrganizationalUnitIds(java.util.List < String > targetOrganizationalUnitIds) {
                this.targetOrganizationalUnitIds = targetOrganizationalUnitIds;
                return this;
            }

            public AutoCreateUserConfig build() {
                return new AutoCreateUserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class AutoUpdateUserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpdateUserStatus")
        private String autoUpdateUserStatus;

        private AutoUpdateUserConfig(Builder builder) {
            this.autoUpdateUserStatus = builder.autoUpdateUserStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoUpdateUserConfig create() {
            return builder().build();
        }

        /**
         * @return autoUpdateUserStatus
         */
        public String getAutoUpdateUserStatus() {
            return this.autoUpdateUserStatus;
        }

        public static final class Builder {
            private String autoUpdateUserStatus; 

            /**
             * <p>自动更新账户是否开启</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder autoUpdateUserStatus(String autoUpdateUserStatus) {
                this.autoUpdateUserStatus = autoUpdateUserStatus;
                return this;
            }

            public AutoUpdateUserConfig build() {
                return new AutoUpdateUserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class AutoMatchUserProfileExpressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionMappingType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expressionMappingType;

        @com.aliyun.core.annotation.NameInMap("SourceValueExpression")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceValueExpression;

        @com.aliyun.core.annotation.NameInMap("TargetField")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetField;

        @com.aliyun.core.annotation.NameInMap("TargetFieldDescription")
        private String targetFieldDescription;

        private AutoMatchUserProfileExpressions(Builder builder) {
            this.expressionMappingType = builder.expressionMappingType;
            this.sourceValueExpression = builder.sourceValueExpression;
            this.targetField = builder.targetField;
            this.targetFieldDescription = builder.targetFieldDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoMatchUserProfileExpressions create() {
            return builder().build();
        }

        /**
         * @return expressionMappingType
         */
        public String getExpressionMappingType() {
            return this.expressionMappingType;
        }

        /**
         * @return sourceValueExpression
         */
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        /**
         * @return targetField
         */
        public String getTargetField() {
            return this.targetField;
        }

        /**
         * @return targetFieldDescription
         */
        public String getTargetFieldDescription() {
            return this.targetFieldDescription;
        }

        public static final class Builder {
            private String expressionMappingType; 
            private String sourceValueExpression; 
            private String targetField; 
            private String targetFieldDescription; 

            /**
             * <p>表达式的类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>filed</p>
             */
            public Builder expressionMappingType(String expressionMappingType) {
                this.expressionMappingType = expressionMappingType;
                return this;
            }

            /**
             * <p>映射属性取值表达式</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>idpUser.phoneNumber</p>
             */
            public Builder sourceValueExpression(String sourceValueExpression) {
                this.sourceValueExpression = sourceValueExpression;
                return this;
            }

            /**
             * <p>映射目标属性名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user.username</p>
             */
            public Builder targetField(String targetField) {
                this.targetField = targetField;
                return this;
            }

            /**
             * <p>映射目标属性名称</p>
             */
            public Builder targetFieldDescription(String targetFieldDescription) {
                this.targetFieldDescription = targetFieldDescription;
                return this;
            }

            public AutoMatchUserProfileExpressions build() {
                return new AutoMatchUserProfileExpressions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class BindingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoMatchUserProfileExpressions")
        private java.util.List < AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

        @com.aliyun.core.annotation.NameInMap("AutoMatchUserStatus")
        private String autoMatchUserStatus;

        @com.aliyun.core.annotation.NameInMap("MappingBindingStatus")
        private String mappingBindingStatus;

        private BindingConfig(Builder builder) {
            this.autoMatchUserProfileExpressions = builder.autoMatchUserProfileExpressions;
            this.autoMatchUserStatus = builder.autoMatchUserStatus;
            this.mappingBindingStatus = builder.mappingBindingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingConfig create() {
            return builder().build();
        }

        /**
         * @return autoMatchUserProfileExpressions
         */
        public java.util.List < AutoMatchUserProfileExpressions> getAutoMatchUserProfileExpressions() {
            return this.autoMatchUserProfileExpressions;
        }

        /**
         * @return autoMatchUserStatus
         */
        public String getAutoMatchUserStatus() {
            return this.autoMatchUserStatus;
        }

        /**
         * @return mappingBindingStatus
         */
        public String getMappingBindingStatus() {
            return this.mappingBindingStatus;
        }

        public static final class Builder {
            private java.util.List < AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions; 
            private String autoMatchUserStatus; 
            private String mappingBindingStatus; 

            /**
             * <p>自动匹配账户的规则</p>
             */
            public Builder autoMatchUserProfileExpressions(java.util.List < AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions) {
                this.autoMatchUserProfileExpressions = autoMatchUserProfileExpressions;
                return this;
            }

            /**
             * <p>自动匹配账户是否开启</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder autoMatchUserStatus(String autoMatchUserStatus) {
                this.autoMatchUserStatus = autoMatchUserStatus;
                return this;
            }

            /**
             * <p>用户手动绑定账户功能是否开启</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder mappingBindingStatus(String mappingBindingStatus) {
                this.mappingBindingStatus = mappingBindingStatus;
                return this;
            }

            public BindingConfig build() {
                return new BindingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class DingtalkAppConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("DingtalkVersion")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
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
             * <p>钉钉一方应用的AppKey</p>
             * 
             * <strong>example:</strong>
             * <p>Xczngvfemo4e</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>钉钉一方应用的AppSecret</p>
             * 
             * <strong>example:</strong>
             * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>钉钉一方应用的corpId</p>
             * 
             * <strong>example:</strong>
             * <p>3075680424786133505</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>钉钉版本</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class LarkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("EnterpriseNumber")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>钉钉一方应用的AppSecret</p>
             * 
             * <strong>example:</strong>
             * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * EnterpriseNumber.
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class LdapConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdministratorPassword")
        private String administratorPassword;

        @com.aliyun.core.annotation.NameInMap("AdministratorUsername")
        private String administratorUsername;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprintStatus")
        private String certificateFingerprintStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprints")
        private java.util.List < String > certificateFingerprints;

        @com.aliyun.core.annotation.NameInMap("GroupMemberAttributeName")
        private String groupMemberAttributeName;

        @com.aliyun.core.annotation.NameInMap("GroupObjectClass")
        private String groupObjectClass;

        @com.aliyun.core.annotation.NameInMap("GroupObjectClassCustomFilter")
        private String groupObjectClassCustomFilter;

        @com.aliyun.core.annotation.NameInMap("LdapProtocol")
        private String ldapProtocol;

        @com.aliyun.core.annotation.NameInMap("LdapServerHost")
        private String ldapServerHost;

        @com.aliyun.core.annotation.NameInMap("LdapServerPort")
        private Integer ldapServerPort;

        @com.aliyun.core.annotation.NameInMap("OrganizationUnitObjectClass")
        private String organizationUnitObjectClass;

        @com.aliyun.core.annotation.NameInMap("StartTlsStatus")
        private String startTlsStatus;

        @com.aliyun.core.annotation.NameInMap("UserLoginIdentifier")
        private String userLoginIdentifier;

        @com.aliyun.core.annotation.NameInMap("UserObjectClass")
        private String userObjectClass;

        @com.aliyun.core.annotation.NameInMap("UserObjectClassCustomFilter")
        private String userObjectClassCustomFilter;

        private LdapConfig(Builder builder) {
            this.administratorPassword = builder.administratorPassword;
            this.administratorUsername = builder.administratorUsername;
            this.certificateFingerprintStatus = builder.certificateFingerprintStatus;
            this.certificateFingerprints = builder.certificateFingerprints;
            this.groupMemberAttributeName = builder.groupMemberAttributeName;
            this.groupObjectClass = builder.groupObjectClass;
            this.groupObjectClassCustomFilter = builder.groupObjectClassCustomFilter;
            this.ldapProtocol = builder.ldapProtocol;
            this.ldapServerHost = builder.ldapServerHost;
            this.ldapServerPort = builder.ldapServerPort;
            this.organizationUnitObjectClass = builder.organizationUnitObjectClass;
            this.startTlsStatus = builder.startTlsStatus;
            this.userLoginIdentifier = builder.userLoginIdentifier;
            this.userObjectClass = builder.userObjectClass;
            this.userObjectClassCustomFilter = builder.userObjectClassCustomFilter;
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
        public java.util.List < String > getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        /**
         * @return groupMemberAttributeName
         */
        public String getGroupMemberAttributeName() {
            return this.groupMemberAttributeName;
        }

        /**
         * @return groupObjectClass
         */
        public String getGroupObjectClass() {
            return this.groupObjectClass;
        }

        /**
         * @return groupObjectClassCustomFilter
         */
        public String getGroupObjectClassCustomFilter() {
            return this.groupObjectClassCustomFilter;
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
         * @return organizationUnitObjectClass
         */
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        /**
         * @return startTlsStatus
         */
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

        /**
         * @return userLoginIdentifier
         */
        public String getUserLoginIdentifier() {
            return this.userLoginIdentifier;
        }

        /**
         * @return userObjectClass
         */
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        /**
         * @return userObjectClassCustomFilter
         */
        public String getUserObjectClassCustomFilter() {
            return this.userObjectClassCustomFilter;
        }

        public static final class Builder {
            private String administratorPassword; 
            private String administratorUsername; 
            private String certificateFingerprintStatus; 
            private java.util.List < String > certificateFingerprints; 
            private String groupMemberAttributeName; 
            private String groupObjectClass; 
            private String groupObjectClassCustomFilter; 
            private String ldapProtocol; 
            private String ldapServerHost; 
            private Integer ldapServerPort; 
            private String organizationUnitObjectClass; 
            private String startTlsStatus; 
            private String userLoginIdentifier; 
            private String userObjectClass; 
            private String userObjectClassCustomFilter; 

            /**
             * <p>管理员密码</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>管理员账号</p>
             * 
             * <strong>example:</strong>
             * <p>DC=example,DC=com</p>
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
            public Builder certificateFingerprints(java.util.List < String > certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>组成员标识</p>
             * 
             * <strong>example:</strong>
             * <p>member</p>
             */
            public Builder groupMemberAttributeName(String groupMemberAttributeName) {
                this.groupMemberAttributeName = groupMemberAttributeName;
                return this;
            }

            /**
             * <p>组objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder groupObjectClass(String groupObjectClass) {
                this.groupObjectClass = groupObjectClass;
                return this;
            }

            /**
             * <p>组自定义Filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder groupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
                this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
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
             * <p>123.xx.xx.89</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>端口号</p>
             * 
             * <strong>example:</strong>
             * <p>636</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>组织objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>organizationUnit,top</p>
             */
            public Builder organizationUnitObjectClass(String organizationUnitObjectClass) {
                this.organizationUnitObjectClass = organizationUnitObjectClass;
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

            /**
             * <p>用户登录标识</p>
             * 
             * <strong>example:</strong>
             * <p>userPrincipalName, mail</p>
             */
            public Builder userLoginIdentifier(String userLoginIdentifier) {
                this.userLoginIdentifier = userLoginIdentifier;
                return this;
            }

            /**
             * <p>用户objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>person,user</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>用户自定义Filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder userObjectClassCustomFilter(String userObjectClassCustomFilter) {
                this.userObjectClassCustomFilter = userObjectClassCustomFilter;
                return this;
            }

            public LdapConfig build() {
                return new LdapConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
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
             * <p><a href="https://example.com/auth/authorize">https://example.com/auth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>OIDC issuer信息。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>OIDC jwks地址。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/jwks">https://example.com/auth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>oAuth2 Token端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/token">https://example.com/auth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC 用户信息端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/userinfo">https://example.com/auth/userinfo</a></p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class OidcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnParam")
        private AuthnParam authnParam;

        @com.aliyun.core.annotation.NameInMap("EndpointConfig")
        private EndpointConfig endpointConfig;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List < String > grantScopes;

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
        public java.util.List < String > getGrantScopes() {
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
            private java.util.List < String > grantScopes; 
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
            public Builder grantScopes(java.util.List < String > grantScopes) {
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class UdSyncScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List < String > sourceScopes;

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
        public java.util.List < String > getSourceScopes() {
            return this.sourceScopes;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List < String > sourceScopes; 
            private String targetScope; 

            /**
             * <p>同步来源节点</p>
             */
            public Builder sourceScopes(java.util.List < String > sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>同步目标节点</p>
             * 
             * <strong>example:</strong>
             * <p>ou_lyhyy6p7yf7mdrdiq5xxxx</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class UdPullConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupSyncStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String groupSyncStatus;

        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String periodicSyncStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private UdSyncScopeConfig udSyncScopeConfig;

        private UdPullConfig(Builder builder) {
            this.groupSyncStatus = builder.groupSyncStatus;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.periodicSyncStatus = builder.periodicSyncStatus;
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
         * @return periodicSyncStatus
         */
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
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
            private String periodicSyncStatus; 
            private UdSyncScopeConfig udSyncScopeConfig; 

            /**
             * <p>是否支持组同步，默认为disabled</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
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
             * PeriodicSyncStatus.
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>同步入配置信息</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class UdSyncScopeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List < String > sourceScopes;

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
        public java.util.List < String > getSourceScopes() {
            return this.sourceScopes;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List < String > sourceScopes; 
            private String targetScope; 

            /**
             * <p>同步来源节点</p>
             */
            public Builder sourceScopes(java.util.List < String > sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>同步目标节点</p>
             * 
             * <strong>example:</strong>
             * <p>ou_lyhyy6p7yf7mdrdiq5xxxx</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class UdPushConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String periodicSyncStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfigs")
        private java.util.List < UdSyncScopeConfigs> udSyncScopeConfigs;

        private UdPushConfig(Builder builder) {
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.periodicSyncStatus = builder.periodicSyncStatus;
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
         * @return periodicSyncStatus
         */
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        /**
         * @return udSyncScopeConfigs
         */
        public java.util.List < UdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

        public static final class Builder {
            private String incrementalCallbackStatus; 
            private String periodicSyncStatus; 
            private java.util.List < UdSyncScopeConfigs> udSyncScopeConfigs; 

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
             * PeriodicSyncStatus.
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>同步出配置信息</p>
             */
            public Builder udSyncScopeConfigs(java.util.List < UdSyncScopeConfigs> udSyncScopeConfigs) {
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
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
             * <p>企业微信自建应用的Id</p>
             * 
             * <strong>example:</strong>
             * <p>278231941749863339</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>授权回调域</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com/xxxx">https://xxx.aliyunidaas.com/xxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * <p>企业微信自建应用的corpId</p>
             * 
             * <strong>example:</strong>
             * <p>3756043633237690761</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>企业微信自建应用的corpSecret</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>可信域名</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com/">https://xxx.aliyunidaas.com/</a></p>
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
}
