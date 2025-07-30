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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    private String logoUrl;

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
        this.clientToken = builder.clientToken;
        this.dingtalkAppConfig = builder.dingtalkAppConfig;
        this.identityProviderName = builder.identityProviderName;
        this.identityProviderType = builder.identityProviderType;
        this.instanceId = builder.instanceId;
        this.larkConfig = builder.larkConfig;
        this.ldapConfig = builder.ldapConfig;
        this.logoUrl = builder.logoUrl;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
        private String clientToken; 
        private DingtalkAppConfig dingtalkAppConfig; 
        private String identityProviderName; 
        private String identityProviderType; 
        private String instanceId; 
        private LarkConfig larkConfig; 
        private LdapConfig ldapConfig; 
        private String logoUrl; 
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
            this.clientToken = request.clientToken;
            this.dingtalkAppConfig = request.dingtalkAppConfig;
            this.identityProviderName = request.identityProviderName;
            this.identityProviderType = request.identityProviderType;
            this.instanceId = request.instanceId;
            this.larkConfig = request.larkConfig;
            this.ldapConfig = request.ldapConfig;
            this.logoUrl = request.logoUrl;
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
         * <p>Authentication configuration information.</p>
         */
        public Builder authnConfig(AuthnConfig authnConfig) {
            this.putQueryParameter("AuthnConfig", authnConfig);
            this.authnConfig = authnConfig;
            return this;
        }

        /**
         * <p>Auto-create account rule configuration.</p>
         */
        public Builder autoCreateUserConfig(AutoCreateUserConfig autoCreateUserConfig) {
            this.putQueryParameter("AutoCreateUserConfig", autoCreateUserConfig);
            this.autoCreateUserConfig = autoCreateUserConfig;
            return this;
        }

        /**
         * <p>Auto-update account rule configuration.</p>
         */
        public Builder autoUpdateUserConfig(AutoUpdateUserConfig autoUpdateUserConfig) {
            this.putQueryParameter("AutoUpdateUserConfig", autoUpdateUserConfig);
            this.autoUpdateUserConfig = autoUpdateUserConfig;
            return this;
        }

        /**
         * <p>OIDC identity provider account binding rule configuration.</p>
         */
        public Builder bindingConfig(BindingConfig bindingConfig) {
            this.putQueryParameter("BindingConfig", bindingConfig);
            this.bindingConfig = bindingConfig;
            return this;
        }

        /**
         * <p>Idp client token.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>DingTalk configuration information.</p>
         */
        public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
            this.putQueryParameter("DingtalkAppConfig", dingtalkAppConfig);
            this.dingtalkAppConfig = dingtalkAppConfig;
            return this;
        }

        /**
         * <p>Identity provider name.</p>
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
         * <p>Identity provider synchronization type.</p>
         * <ul>
         * <li><p>Inbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
         * </li>
         * <li><p>Outbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         * </li>
         * <li><p>Inbound to WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
         * </li>
         * <li><p>Inbound to Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
         * </li>
         * <li><p>Inbound to AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
         * </li>
         * <li><p>Inbound to LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
         * </li>
         * <li><p>Standard OIDC: urn:alibaba:idaas:idp:standard:oidc</p>
         * </li>
         * <li><p>SASE Custom OIDC: urn:alibaba:idaas:idp:alibaba:sase</p>
         * </li>
         * </ul>
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
         * <p>Instance ID.</p>
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
         * <p>Lark (Feishu) configuration information.</p>
         */
        public Builder larkConfig(LarkConfig larkConfig) {
            this.putQueryParameter("LarkConfig", larkConfig);
            this.larkConfig = larkConfig;
            return this;
        }

        /**
         * <p>AD/LDAP configuration information.</p>
         */
        public Builder ldapConfig(LdapConfig ldapConfig) {
            this.putQueryParameter("LdapConfig", ldapConfig);
            this.ldapConfig = ldapConfig;
            return this;
        }

        /**
         * <p>IdP logo url.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-image://idaas_23aqr2ye554csg33dqpch5eu3q/tmp/d17d9adc-a943-45e7-ba0c-2838dddexxxxx</p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * <p>The unique identifier of the network access endpoint.</p>
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
         * <p>OIDC IdP configuration.</p>
         */
        public Builder oidcConfig(OidcConfig oidcConfig) {
            this.putQueryParameter("OidcConfig", oidcConfig);
            this.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * <p>Inbound synchronization configuration information.</p>
         */
        public Builder udPullConfig(UdPullConfig udPullConfig) {
            this.putQueryParameter("UdPullConfig", udPullConfig);
            this.udPullConfig = udPullConfig;
            return this;
        }

        /**
         * <p>Outbound synchronization configuration information.</p>
         */
        public Builder udPushConfig(UdPushConfig udPushConfig) {
            this.putQueryParameter("UdPushConfig", udPushConfig);
            this.udPushConfig = udPushConfig;
            return this;
        }

        /**
         * <p>WeCom configuration information.</p>
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
        @com.aliyun.core.annotation.Validation(maxLength = 32)
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

            private Builder() {
            } 

            private Builder(AuthnConfig model) {
                this.authnStatus = model.authnStatus;
                this.autoUpdatePasswordStatus = model.autoUpdatePasswordStatus;
            } 

            /**
             * <p>Whether the corresponding IdP supports authentication. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * <p>Whether automatic password update is supported. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
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
        private java.util.List<String> targetOrganizationalUnitIds;

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
        public java.util.List<String> getTargetOrganizationalUnitIds() {
            return this.targetOrganizationalUnitIds;
        }

        public static final class Builder {
            private String autoCreateUserStatus; 
            private java.util.List<String> targetOrganizationalUnitIds; 

            private Builder() {
            } 

            private Builder(AutoCreateUserConfig model) {
                this.autoCreateUserStatus = model.autoCreateUserStatus;
                this.targetOrganizationalUnitIds = model.targetOrganizationalUnitIds;
            } 

            /**
             * <p>Whether auto-creation of accounts is enabled. Possible values:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder autoCreateUserStatus(String autoCreateUserStatus) {
                this.autoCreateUserStatus = autoCreateUserStatus;
                return this;
            }

            /**
             * <p>Target organizational unit IDs collection.</p>
             */
            public Builder targetOrganizationalUnitIds(java.util.List<String> targetOrganizationalUnitIds) {
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

            private Builder() {
            } 

            private Builder(AutoUpdateUserConfig model) {
                this.autoUpdateUserStatus = model.autoUpdateUserStatus;
            } 

            /**
             * <p>Whether auto-updating of accounts is enabled. Possible values:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
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
        private String expressionMappingType;

        @com.aliyun.core.annotation.NameInMap("SourceValueExpression")
        private String sourceValueExpression;

        @com.aliyun.core.annotation.NameInMap("TargetField")
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

            private Builder() {
            } 

            private Builder(AutoMatchUserProfileExpressions model) {
                this.expressionMappingType = model.expressionMappingType;
                this.sourceValueExpression = model.sourceValueExpression;
                this.targetField = model.targetField;
                this.targetFieldDescription = model.targetFieldDescription;
            } 

            /**
             * <p>Type of the expression. Value range:</p>
             * <ul>
             * <li><p>Field: filed</p>
             * </li>
             * <li><p>Expression: expression</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>filed</p>
             */
            public Builder expressionMappingType(String expressionMappingType) {
                this.expressionMappingType = expressionMappingType;
                return this;
            }

            /**
             * <p>Expression for the mapped attribute value.</p>
             * 
             * <strong>example:</strong>
             * <p>idpUser.phoneNumber</p>
             */
            public Builder sourceValueExpression(String sourceValueExpression) {
                this.sourceValueExpression = sourceValueExpression;
                return this;
            }

            /**
             * <p>Name of the target attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>user.username</p>
             */
            public Builder targetField(String targetField) {
                this.targetField = targetField;
                return this;
            }

            /**
             * <p>Description of the target attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>user.username</p>
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
        private java.util.List<AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

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
        public java.util.List<AutoMatchUserProfileExpressions> getAutoMatchUserProfileExpressions() {
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
            private java.util.List<AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions; 
            private String autoMatchUserStatus; 
            private String mappingBindingStatus; 

            private Builder() {
            } 

            private Builder(BindingConfig model) {
                this.autoMatchUserProfileExpressions = model.autoMatchUserProfileExpressions;
                this.autoMatchUserStatus = model.autoMatchUserStatus;
                this.mappingBindingStatus = model.mappingBindingStatus;
            } 

            /**
             * <p>List of rules for automatically matching accounts.</p>
             */
            public Builder autoMatchUserProfileExpressions(java.util.List<AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions) {
                this.autoMatchUserProfileExpressions = autoMatchUserProfileExpressions;
                return this;
            }

            /**
             * <p>Whether automatic account matching is enabled. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder autoMatchUserStatus(String autoMatchUserStatus) {
                this.autoMatchUserStatus = autoMatchUserStatus;
                return this;
            }

            /**
             * <p>Whether the user manual account binding function is enabled. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
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
             * <p>AppKey of the DingTalk application.</p>
             * 
             * <strong>example:</strong>
             * <p>Xczngvfemo4e</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>AppSecret of the DingTalk application.</p>
             * 
             * <strong>example:</strong>
             * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>CorpId of the DingTalk application.</p>
             * 
             * <strong>example:</strong>
             * <p>3075680424786133505</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>DingTalk edition. Valid values:</p>
             * <p>public_dingtalk – Standard DingTalk.</p>
             * <p>private_dingtalk – Dedicated DingTalk.</p>
             * 
             * <strong>example:</strong>
             * <p>public_dingtalk</p>
             */
            public Builder dingtalkVersion(String dingtalkVersion) {
                this.dingtalkVersion = dingtalkVersion;
                return this;
            }

            /**
             * <p>DingTalk encrypt key.</p>
             * 
             * <strong>example:</strong>
             * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>DingTalk verification token.</p>
             * 
             * <strong>example:</strong>
             * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class LarkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EnterpriseNumber")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * <p>Lark (Feishu) app appId.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_xxxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Lark (Feishu) app secret.</p>
             * 
             * <strong>example:</strong>
             * <p>KiiLzh5Dueh4wbLxxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>Lark (Feishu) encrypt key.</p>
             * 
             * <strong>example:</strong>
             * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>Lark (Feishu) enterprise number.</p>
             * 
             * <strong>example:</strong>
             * <p>FSX123111xxx</p>
             */
            public Builder enterpriseNumber(String enterpriseNumber) {
                this.enterpriseNumber = enterpriseNumber;
                return this;
            }

            /**
             * <p>Lark (Feishu)  verification token.</p>
             * 
             * <strong>example:</strong>
             * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
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
        private java.util.List<String> certificateFingerprints;

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
        public java.util.List<String> getCertificateFingerprints() {
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
            private java.util.List<String> certificateFingerprints; 
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

            private Builder() {
            } 

            private Builder(LdapConfig model) {
                this.administratorPassword = model.administratorPassword;
                this.administratorUsername = model.administratorUsername;
                this.certificateFingerprintStatus = model.certificateFingerprintStatus;
                this.certificateFingerprints = model.certificateFingerprints;
                this.groupMemberAttributeName = model.groupMemberAttributeName;
                this.groupObjectClass = model.groupObjectClass;
                this.groupObjectClassCustomFilter = model.groupObjectClassCustomFilter;
                this.ldapProtocol = model.ldapProtocol;
                this.ldapServerHost = model.ldapServerHost;
                this.ldapServerPort = model.ldapServerPort;
                this.organizationUnitObjectClass = model.organizationUnitObjectClass;
                this.startTlsStatus = model.startTlsStatus;
                this.userLoginIdentifier = model.userLoginIdentifier;
                this.userObjectClass = model.userObjectClass;
                this.userObjectClassCustomFilter = model.userObjectClassCustomFilter;
            } 

            /**
             * <p>Administrator password.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>Administrator username.</p>
             * 
             * <strong>example:</strong>
             * <p>DC=example,DC=com</p>
             */
            public Builder administratorUsername(String administratorUsername) {
                this.administratorUsername = administratorUsername;
                return this;
            }

            /**
             * <p>Whether to verify the certificate fingerprint. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder certificateFingerprintStatus(String certificateFingerprintStatus) {
                this.certificateFingerprintStatus = certificateFingerprintStatus;
                return this;
            }

            /**
             * <p>List of certificate fingerprints.</p>
             */
            public Builder certificateFingerprints(java.util.List<String> certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>Group member attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p>member</p>
             */
            public Builder groupMemberAttributeName(String groupMemberAttributeName) {
                this.groupMemberAttributeName = groupMemberAttributeName;
                return this;
            }

            /**
             * <p>Group ObjectClass.</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder groupObjectClass(String groupObjectClass) {
                this.groupObjectClass = groupObjectClass;
                return this;
            }

            /**
             * <p>Custom filter for Group ObjectClass.</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder groupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
                this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
                return this;
            }

            /**
             * <p>Communication protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder ldapProtocol(String ldapProtocol) {
                this.ldapProtocol = ldapProtocol;
                return this;
            }

            /**
             * <p>AD/LDAP server address.</p>
             * 
             * <strong>example:</strong>
             * <p>123.xx.xx.89</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>AD/LDAP port number.</p>
             * 
             * <strong>example:</strong>
             * <p>636</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>Organization Unit ObjectClass.</p>
             * 
             * <strong>example:</strong>
             * <p>organizationUnit,top</p>
             */
            public Builder organizationUnitObjectClass(String organizationUnitObjectClass) {
                this.organizationUnitObjectClass = organizationUnitObjectClass;
                return this;
            }

            /**
             * <p>Whether startTLS is enabled. Value range:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder startTlsStatus(String startTlsStatus) {
                this.startTlsStatus = startTlsStatus;
                return this;
            }

            /**
             * <p>User login identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>userPrincipalName, mail</p>
             */
            public Builder userLoginIdentifier(String userLoginIdentifier) {
                this.userLoginIdentifier = userLoginIdentifier;
                return this;
            }

            /**
             * <p>User ObjectClass.</p>
             * 
             * <strong>example:</strong>
             * <p>person,user</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>Custom filter for User ObjectClass.</p>
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

            private Builder() {
            } 

            private Builder(AuthnParam model) {
                this.authnMethod = model.authnMethod;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>OIDC authentication method. Value range:</p>
             * <ul>
             * <li><p>client_secret_basic</p>
             * </li>
             * <li><p>client_secret_post</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>The ID of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The  secret of the client.</p>
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
             * <p>OIDC authorization endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/authorize">https://example.com/auth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>OIDC issuer information.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>OIDC jwks uri.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/jwks">https://example.com/auth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>OIDC token endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth/token">https://example.com/auth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC user info endpoint.</p>
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
             * <p>OIDC grant scopes collection.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>OIDC grant type.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>PKCE algorithm. Possible values:</p>
             * <ul>
             * <li><p>SHA256: S256</p>
             * </li>
             * <li><p>Plain text: plain</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>Whether to use PKCE in the AuthorizationCode grant mode.</p>
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
    public static class PeriodicSyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodicSyncCron")
        private String periodicSyncCron;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncTimes")
        private java.util.List<Integer> periodicSyncTimes;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncType")
        private String periodicSyncType;

        private PeriodicSyncConfig(Builder builder) {
            this.periodicSyncCron = builder.periodicSyncCron;
            this.periodicSyncTimes = builder.periodicSyncTimes;
            this.periodicSyncType = builder.periodicSyncType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodicSyncConfig create() {
            return builder().build();
        }

        /**
         * @return periodicSyncCron
         */
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        /**
         * @return periodicSyncTimes
         */
        public java.util.List<Integer> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        /**
         * @return periodicSyncType
         */
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

        public static final class Builder {
            private String periodicSyncCron; 
            private java.util.List<Integer> periodicSyncTimes; 
            private String periodicSyncType; 

            private Builder() {
            } 

            private Builder(PeriodicSyncConfig model) {
                this.periodicSyncCron = model.periodicSyncCron;
                this.periodicSyncTimes = model.periodicSyncTimes;
                this.periodicSyncType = model.periodicSyncType;
            } 

            /**
             * <p>cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 45 1 * * ?</p>
             */
            public Builder periodicSyncCron(String periodicSyncCron) {
                this.periodicSyncCron = periodicSyncCron;
                return this;
            }

            /**
             * <p>Collection of time points.</p>
             */
            public Builder periodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
                this.periodicSyncTimes = periodicSyncTimes;
                return this;
            }

            /**
             * <p>type.</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder periodicSyncType(String periodicSyncType) {
                this.periodicSyncType = periodicSyncType;
                return this;
            }

            public PeriodicSyncConfig build() {
                return new PeriodicSyncConfig(this);
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
             * <p>List of source nodes for synchronization.</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Synchronize target node, and fill in the IDaaS organization ID.</p>
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

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncConfig")
        private PeriodicSyncConfig periodicSyncConfig;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String periodicSyncStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfig")
        private UdSyncScopeConfig udSyncScopeConfig;

        private UdPullConfig(Builder builder) {
            this.groupSyncStatus = builder.groupSyncStatus;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.periodicSyncConfig = builder.periodicSyncConfig;
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
         * @return periodicSyncConfig
         */
        public PeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
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
            private PeriodicSyncConfig periodicSyncConfig; 
            private String periodicSyncStatus; 
            private UdSyncScopeConfig udSyncScopeConfig; 

            private Builder() {
            } 

            private Builder(UdPullConfig model) {
                this.groupSyncStatus = model.groupSyncStatus;
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.periodicSyncConfig = model.periodicSyncConfig;
                this.periodicSyncStatus = model.periodicSyncStatus;
                this.udSyncScopeConfig = model.udSyncScopeConfig;
            } 

            /**
             * <p>Whether group synchronization is supported. The default value is disabled. Possible values:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder groupSyncStatus(String groupSyncStatus) {
                this.groupSyncStatus = groupSyncStatus;
                return this;
            }

            /**
             * <p>Incremental callback status, indicating whether to process incremental callback data from the IdP. Possible values:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>Scheduled configuration verification.</p>
             */
            public Builder periodicSyncConfig(PeriodicSyncConfig periodicSyncConfig) {
                this.periodicSyncConfig = periodicSyncConfig;
                return this;
            }

            /**
             * <p>Periodic check status, indicating whether to periodically check the data differences between EIAM and the identity provider. Possible values:</p>
             * <ul>
             * <li><p>Disabled: disabled</p>
             * </li>
             * <li><p>Enabled: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>Synchronization scope configuration information.</p>
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
             * <p>List of source nodes for synchronization.</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Target node for synchronization.</p>
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
        private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs;

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
        public java.util.List<UdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

        public static final class Builder {
            private String incrementalCallbackStatus; 
            private String periodicSyncStatus; 
            private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs; 

            private Builder() {
            } 

            private Builder(UdPushConfig model) {
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.periodicSyncStatus = model.periodicSyncStatus;
                this.udSyncScopeConfigs = model.udSyncScopeConfigs;
            } 

            /**
             * <p>Incremental callback status. This field is reserved and currently not in use; please ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>Periodic check status. This field is currently not in use, please ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>Outbound synchronization configuration information.</p>
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
             * <p>Agent ID of the self-built WeCom application.</p>
             * 
             * <strong>example:</strong>
             * <p>278231941749863339</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Authorization callback domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com/xxxx">https://xxx.aliyunidaas.com/xxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * <p>Corp ID of the self-built WeCom application.</p>
             * 
             * <strong>example:</strong>
             * <p>3756043633237690761</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>Corp Secret of the self-built WeCom application.</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>Trusted domain.</p>
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
