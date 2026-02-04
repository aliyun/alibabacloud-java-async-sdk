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
 * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetIdentityProviderAuthnConfigurationRequest</p>
 */
public class SetIdentityProviderAuthnConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LdapAuthnConfig")
    private LdapAuthnConfig ldapAuthnConfig;

    private SetIdentityProviderAuthnConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateUserConfig = builder.autoCreateUserConfig;
        this.autoUpdateUserConfig = builder.autoUpdateUserConfig;
        this.bindingConfig = builder.bindingConfig;
        this.identityProviderId = builder.identityProviderId;
        this.instanceId = builder.instanceId;
        this.ldapAuthnConfig = builder.ldapAuthnConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIdentityProviderAuthnConfigurationRequest create() {
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
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ldapAuthnConfig
     */
    public LdapAuthnConfig getLdapAuthnConfig() {
        return this.ldapAuthnConfig;
    }

    public static final class Builder extends Request.Builder<SetIdentityProviderAuthnConfigurationRequest, Builder> {
        private String regionId; 
        private AutoCreateUserConfig autoCreateUserConfig; 
        private AutoUpdateUserConfig autoUpdateUserConfig; 
        private BindingConfig bindingConfig; 
        private String identityProviderId; 
        private String instanceId; 
        private LdapAuthnConfig ldapAuthnConfig; 

        private Builder() {
            super();
        } 

        private Builder(SetIdentityProviderAuthnConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateUserConfig = request.autoCreateUserConfig;
            this.autoUpdateUserConfig = request.autoUpdateUserConfig;
            this.bindingConfig = request.bindingConfig;
            this.identityProviderId = request.identityProviderId;
            this.instanceId = request.instanceId;
            this.ldapAuthnConfig = request.ldapAuthnConfig;
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
         * <p>自动创建账户账户规则配置。</p>
         */
        public Builder autoCreateUserConfig(AutoCreateUserConfig autoCreateUserConfig) {
            this.putQueryParameter("AutoCreateUserConfig", autoCreateUserConfig);
            this.autoCreateUserConfig = autoCreateUserConfig;
            return this;
        }

        /**
         * AutoUpdateUserConfig.
         */
        public Builder autoUpdateUserConfig(AutoUpdateUserConfig autoUpdateUserConfig) {
            this.putQueryParameter("AutoUpdateUserConfig", autoUpdateUserConfig);
            this.autoUpdateUserConfig = autoUpdateUserConfig;
            return this;
        }

        /**
         * <p>账户绑定规则配置</p>
         */
        public Builder bindingConfig(BindingConfig bindingConfig) {
            this.putQueryParameter("BindingConfig", bindingConfig);
            this.bindingConfig = bindingConfig;
            return this;
        }

        /**
         * <p>IDaaS的身份提供方主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_11111</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
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
         * <p>AD/LDAP配置</p>
         */
        public Builder ldapAuthnConfig(LdapAuthnConfig ldapAuthnConfig) {
            this.putQueryParameter("LdapAuthnConfig", ldapAuthnConfig);
            this.ldapAuthnConfig = ldapAuthnConfig;
            return this;
        }

        @Override
        public SetIdentityProviderAuthnConfigurationRequest build() {
            return new SetIdentityProviderAuthnConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderAuthnConfigurationRequest</p>
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
     * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderAuthnConfigurationRequest</p>
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
             * AutoUpdateUserStatus.
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
     * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderAuthnConfigurationRequest</p>
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

            private Builder() {
            } 

            private Builder(AutoMatchUserProfileExpressions model) {
                this.expressionMappingType = model.expressionMappingType;
                this.sourceValueExpression = model.sourceValueExpression;
                this.targetField = model.targetField;
                this.targetFieldDescription = model.targetFieldDescription;
            } 

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
             * <p>idpUser.userId</p>
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
             * 
             * <strong>example:</strong>
             * <p>username</p>
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
     * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderAuthnConfigurationRequest</p>
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
             * <p>自动匹配账户的规则</p>
             */
            public Builder autoMatchUserProfileExpressions(java.util.List<AutoMatchUserProfileExpressions> autoMatchUserProfileExpressions) {
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
     * {@link SetIdentityProviderAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderAuthnConfigurationRequest</p>
     */
    public static class LdapAuthnConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpdatePasswordStatus")
        private String autoUpdatePasswordStatus;

        @com.aliyun.core.annotation.NameInMap("UserLoginIdentifier")
        private String userLoginIdentifier;

        @com.aliyun.core.annotation.NameInMap("UserObjectClass")
        private String userObjectClass;

        private LdapAuthnConfig(Builder builder) {
            this.autoUpdatePasswordStatus = builder.autoUpdatePasswordStatus;
            this.userLoginIdentifier = builder.userLoginIdentifier;
            this.userObjectClass = builder.userObjectClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LdapAuthnConfig create() {
            return builder().build();
        }

        /**
         * @return autoUpdatePasswordStatus
         */
        public String getAutoUpdatePasswordStatus() {
            return this.autoUpdatePasswordStatus;
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

        public static final class Builder {
            private String autoUpdatePasswordStatus; 
            private String userLoginIdentifier; 
            private String userObjectClass; 

            private Builder() {
            } 

            private Builder(LdapAuthnConfig model) {
                this.autoUpdatePasswordStatus = model.autoUpdatePasswordStatus;
                this.userLoginIdentifier = model.userLoginIdentifier;
                this.userObjectClass = model.userObjectClass;
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

            /**
             * <p>用户登录标识</p>
             * 
             * <strong>example:</strong>
             * <p>email</p>
             */
            public Builder userLoginIdentifier(String userLoginIdentifier) {
                this.userLoginIdentifier = userLoginIdentifier;
                return this;
            }

            /**
             * <p>用户ObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>posixAccount</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            public LdapAuthnConfig build() {
                return new LdapAuthnConfig(this);
            } 

        } 

    }
}
