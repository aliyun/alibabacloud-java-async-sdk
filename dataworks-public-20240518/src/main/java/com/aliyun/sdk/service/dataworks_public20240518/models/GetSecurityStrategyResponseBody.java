// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetSecurityStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityStrategyResponseBody</p>
 */
public class GetSecurityStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityStrategy")
    private SecurityStrategy securityStrategy;

    private GetSecurityStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityStrategy = builder.securityStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityStrategyResponseBody create() {
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
     * @return securityStrategy
     */
    public SecurityStrategy getSecurityStrategy() {
        return this.securityStrategy;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityStrategy securityStrategy; 

        private Builder() {
        } 

        private Builder(GetSecurityStrategyResponseBody model) {
            this.requestId = model.requestId;
            this.securityStrategy = model.securityStrategy;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc5df3a17****903790e8e8a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security policy.</p>
         */
        public Builder securityStrategy(SecurityStrategy securityStrategy) {
            this.securityStrategy = securityStrategy;
            return this;
        }

        public GetSecurityStrategyResponseBody build() {
            return new GetSecurityStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityStrategyResponseBody</p>
     */
    public static class Controllers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicEditionDefaultValue")
        private Object basicEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("BasicEditionIntervalValue")
        private java.util.List<Integer> basicEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("Controller")
        private String controller;

        @com.aliyun.core.annotation.NameInMap("ControllerValueType")
        private String controllerValueType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameEn")
        private String displayNameEn;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEditionDefaultValue")
        private Object enterpriseEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEditionIntervalValue")
        private java.util.List<Integer> enterpriseEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("ProfessionalEditionDefaultValue")
        private Object professionalEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("ProfessionalEditionIntervalValue")
        private java.util.List<Integer> professionalEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("StandardEditionDefaultValue")
        private Object standardEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("StandardEditionIntervalValue")
        private java.util.List<Integer> standardEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("UserConfigValue")
        private Object userConfigValue;

        private Controllers(Builder builder) {
            this.basicEditionDefaultValue = builder.basicEditionDefaultValue;
            this.basicEditionIntervalValue = builder.basicEditionIntervalValue;
            this.controller = builder.controller;
            this.controllerValueType = builder.controllerValueType;
            this.displayName = builder.displayName;
            this.displayNameEn = builder.displayNameEn;
            this.enable = builder.enable;
            this.enterpriseEditionDefaultValue = builder.enterpriseEditionDefaultValue;
            this.enterpriseEditionIntervalValue = builder.enterpriseEditionIntervalValue;
            this.professionalEditionDefaultValue = builder.professionalEditionDefaultValue;
            this.professionalEditionIntervalValue = builder.professionalEditionIntervalValue;
            this.standardEditionDefaultValue = builder.standardEditionDefaultValue;
            this.standardEditionIntervalValue = builder.standardEditionIntervalValue;
            this.userConfigValue = builder.userConfigValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Controllers create() {
            return builder().build();
        }

        /**
         * @return basicEditionDefaultValue
         */
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        /**
         * @return basicEditionIntervalValue
         */
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        /**
         * @return controller
         */
        public String getController() {
            return this.controller;
        }

        /**
         * @return controllerValueType
         */
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNameEn
         */
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return enterpriseEditionDefaultValue
         */
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        /**
         * @return enterpriseEditionIntervalValue
         */
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        /**
         * @return professionalEditionDefaultValue
         */
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        /**
         * @return professionalEditionIntervalValue
         */
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        /**
         * @return standardEditionDefaultValue
         */
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        /**
         * @return standardEditionIntervalValue
         */
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        /**
         * @return userConfigValue
         */
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

        public static final class Builder {
            private Object basicEditionDefaultValue; 
            private java.util.List<Integer> basicEditionIntervalValue; 
            private String controller; 
            private String controllerValueType; 
            private String displayName; 
            private String displayNameEn; 
            private Boolean enable; 
            private Object enterpriseEditionDefaultValue; 
            private java.util.List<Integer> enterpriseEditionIntervalValue; 
            private Object professionalEditionDefaultValue; 
            private java.util.List<Integer> professionalEditionIntervalValue; 
            private Object standardEditionDefaultValue; 
            private java.util.List<Integer> standardEditionIntervalValue; 
            private Object userConfigValue; 

            private Builder() {
            } 

            private Builder(Controllers model) {
                this.basicEditionDefaultValue = model.basicEditionDefaultValue;
                this.basicEditionIntervalValue = model.basicEditionIntervalValue;
                this.controller = model.controller;
                this.controllerValueType = model.controllerValueType;
                this.displayName = model.displayName;
                this.displayNameEn = model.displayNameEn;
                this.enable = model.enable;
                this.enterpriseEditionDefaultValue = model.enterpriseEditionDefaultValue;
                this.enterpriseEditionIntervalValue = model.enterpriseEditionIntervalValue;
                this.professionalEditionDefaultValue = model.professionalEditionDefaultValue;
                this.professionalEditionIntervalValue = model.professionalEditionIntervalValue;
                this.standardEditionDefaultValue = model.standardEditionDefaultValue;
                this.standardEditionIntervalValue = model.standardEditionIntervalValue;
                this.userConfigValue = model.userConfigValue;
            } 

            /**
             * <p>The default value for Basic Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder basicEditionDefaultValue(Object basicEditionDefaultValue) {
                this.basicEditionDefaultValue = basicEditionDefaultValue;
                return this;
            }

            /**
             * <p>The valid value range for Basic Edition, specified as an array <code>[min, max]</code>.</p>
             */
            public Builder basicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
                this.basicEditionIntervalValue = basicEditionIntervalValue;
                return this;
            }

            /**
             * <p>The identifier for the controller. For valid values, see the documentation for the relevant schema.</p>
             * 
             * <strong>example:</strong>
             * <p>viewCount</p>
             */
            public Builder controller(String controller) {
                this.controller = controller;
                return this;
            }

            /**
             * <p>The value type of the controller. Valid values are <code>Boolean</code>, <code>Integer</code>, <code>Long</code>, and <code>String</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Integer</p>
             */
            public Builder controllerValueType(String controllerValueType) {
                this.controllerValueType = controllerValueType;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>查询结果-单次展示记录值上限</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The display name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Query Results - Single Display Record Limit</p>
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * <p>Whether the controller is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The default value for Enterprise Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder enterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
                this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
                return this;
            }

            /**
             * <p>The valid value range for Enterprise Edition, specified as an array <code>[min, max]</code>.</p>
             */
            public Builder enterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
                this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
                return this;
            }

            /**
             * <p>The default value for Professional Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder professionalEditionDefaultValue(Object professionalEditionDefaultValue) {
                this.professionalEditionDefaultValue = professionalEditionDefaultValue;
                return this;
            }

            /**
             * <p>The valid value range for Professional Edition, specified as an array <code>[min, max]</code>.</p>
             */
            public Builder professionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
                this.professionalEditionIntervalValue = professionalEditionIntervalValue;
                return this;
            }

            /**
             * <p>The default value for Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder standardEditionDefaultValue(Object standardEditionDefaultValue) {
                this.standardEditionDefaultValue = standardEditionDefaultValue;
                return this;
            }

            /**
             * <p>The valid value range for Standard Edition, specified as an array <code>[min, max]</code>.</p>
             */
            public Builder standardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
                this.standardEditionIntervalValue = standardEditionIntervalValue;
                return this;
            }

            /**
             * <p>The value configured by the user. The data type of this value is specified by the <code>ControllerValueType</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder userConfigValue(Object userConfigValue) {
                this.userConfigValue = userConfigValue;
                return this;
            }

            public Controllers build() {
                return new Controllers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityStrategyResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlDwScope")
        private String controlDwScope;

        @com.aliyun.core.annotation.NameInMap("ControlModule")
        private String controlModule;

        @com.aliyun.core.annotation.NameInMap("ControlSubModule")
        private String controlSubModule;

        @com.aliyun.core.annotation.NameInMap("Controllers")
        private java.util.List<Controllers> controllers;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameEn")
        private String displayNameEn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SystemPolicyDisplayName")
        private String systemPolicyDisplayName;

        @com.aliyun.core.annotation.NameInMap("SystemPolicyName")
        private String systemPolicyName;

        private Content(Builder builder) {
            this.controlDwScope = builder.controlDwScope;
            this.controlModule = builder.controlModule;
            this.controlSubModule = builder.controlSubModule;
            this.controllers = builder.controllers;
            this.displayName = builder.displayName;
            this.displayNameEn = builder.displayNameEn;
            this.name = builder.name;
            this.systemPolicyDisplayName = builder.systemPolicyDisplayName;
            this.systemPolicyName = builder.systemPolicyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return controlDwScope
         */
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        /**
         * @return controlModule
         */
        public String getControlModule() {
            return this.controlModule;
        }

        /**
         * @return controlSubModule
         */
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        /**
         * @return controllers
         */
        public java.util.List<Controllers> getControllers() {
            return this.controllers;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNameEn
         */
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return systemPolicyDisplayName
         */
        public String getSystemPolicyDisplayName() {
            return this.systemPolicyDisplayName;
        }

        /**
         * @return systemPolicyName
         */
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

        public static final class Builder {
            private String controlDwScope; 
            private String controlModule; 
            private String controlSubModule; 
            private java.util.List<Controllers> controllers; 
            private String displayName; 
            private String displayNameEn; 
            private String name; 
            private String systemPolicyDisplayName; 
            private String systemPolicyName; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.controlDwScope = model.controlDwScope;
                this.controlModule = model.controlModule;
                this.controlSubModule = model.controlSubModule;
                this.controllers = model.controllers;
                this.displayName = model.displayName;
                this.displayNameEn = model.displayNameEn;
                this.name = model.name;
                this.systemPolicyDisplayName = model.systemPolicyDisplayName;
                this.systemPolicyName = model.systemPolicyName;
            } 

            /**
             * <p>The scope where the policy is effective. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant</p>
             */
            public Builder controlDwScope(String controlDwScope) {
                this.controlDwScope = controlDwScope;
                return this;
            }

            /**
             * <p>The control module. This value corresponds to <code>controlModule</code> in the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>DataQuery</p>
             */
            public Builder controlModule(String controlModule) {
                this.controlModule = controlModule;
                return this;
            }

            /**
             * <p>The control submodule. This value corresponds to <code>controlSubModule</code> in the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>MyCatalog</p>
             */
            public Builder controlSubModule(String controlSubModule) {
                this.controlSubModule = controlSubModule;
                return this;
            }

            /**
             * <p>A list of controllers.</p>
             * <p><strong>Note:</strong> The available controllers depend on the selected schema. See the documentation for your schema for a list of valid controllers.</p>
             */
            public Builder controllers(java.util.List<Controllers> controllers) {
                this.controllers = controllers;
                return this;
            }

            /**
             * <p>The <code>displayName</code> field from the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>数据分析</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The <code>displayNameEn</code> field from the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Query</p>
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * <p>The <code>name</code> field from the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>DataQuerySecurityStrategySchema</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display name of the system policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Default system generate data query policy</p>
             */
            public Builder systemPolicyDisplayName(String systemPolicyDisplayName) {
                this.systemPolicyDisplayName = systemPolicyDisplayName;
                return this;
            }

            /**
             * <p>The name of the system policy. If specified, a default policy is automatically created.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_GENERATE_DEFAULT_DATA_QUERY</p>
             */
            public Builder systemPolicyName(String systemPolicyName) {
                this.systemPolicyName = systemPolicyName;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityStrategyResponseBody</p>
     */
    public static class SecurityStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("ControlDwScope")
        private String controlDwScope;

        @com.aliyun.core.annotation.NameInMap("ControlModule")
        private String controlModule;

        @com.aliyun.core.annotation.NameInMap("ControlSubModule")
        private String controlSubModule;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OriginPolicyId")
        private Long originPolicyId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        @com.aliyun.core.annotation.NameInMap("Workspaces")
        private java.util.List<Long> workspaces;

        private SecurityStrategy(Builder builder) {
            this.content = builder.content;
            this.controlDwScope = builder.controlDwScope;
            this.controlModule = builder.controlModule;
            this.controlSubModule = builder.controlSubModule;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.originPolicyId = builder.originPolicyId;
            this.schemaName = builder.schemaName;
            this.updateTime = builder.updateTime;
            this.updater = builder.updater;
            this.workspaces = builder.workspaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityStrategy create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return controlDwScope
         */
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        /**
         * @return controlModule
         */
        public String getControlModule() {
            return this.controlModule;
        }

        /**
         * @return controlSubModule
         */
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return originPolicyId
         */
        public Long getOriginPolicyId() {
            return this.originPolicyId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updater
         */
        public String getUpdater() {
            return this.updater;
        }

        /**
         * @return workspaces
         */
        public java.util.List<Long> getWorkspaces() {
            return this.workspaces;
        }

        public static final class Builder {
            private Content content; 
            private String controlDwScope; 
            private String controlModule; 
            private String controlSubModule; 
            private String createTime; 
            private String creator; 
            private String description; 
            private Boolean enabled; 
            private Long id; 
            private String name; 
            private Long originPolicyId; 
            private String schemaName; 
            private String updateTime; 
            private String updater; 
            private java.util.List<Long> workspaces; 

            private Builder() {
            } 

            private Builder(SecurityStrategy model) {
                this.content = model.content;
                this.controlDwScope = model.controlDwScope;
                this.controlModule = model.controlModule;
                this.controlSubModule = model.controlSubModule;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.name = model.name;
                this.originPolicyId = model.originPolicyId;
                this.schemaName = model.schemaName;
                this.updateTime = model.updateTime;
                this.updater = model.updater;
                this.workspaces = model.workspaces;
            } 

            /**
             * <p>The content of the security policy. Its structure is defined by the <code>SecurityStrategySchema</code>.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The scope where the policy is effective. Valid values: <code>Workspace</code> or <code>Tenant</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant</p>
             */
            public Builder controlDwScope(String controlDwScope) {
                this.controlDwScope = controlDwScope;
                return this;
            }

            /**
             * <p>The control module.</p>
             * 
             * <strong>example:</strong>
             * <p>DataQuery</p>
             */
            public Builder controlModule(String controlModule) {
                this.controlModule = controlModule;
                return this;
            }

            /**
             * <p>The control submodule.</p>
             * 
             * <strong>example:</strong>
             * <p>MyCatalog</p>
             */
            public Builder controlSubModule(String controlSubModule) {
                this.controlSubModule = controlSubModule;
                return this;
            }

            /**
             * <p>The time when the security policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-25T20:46:19</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>203322746501002787</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>控制数据分析模块的查询结果安全行为</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Whether the security policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>默认数据分析策略</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source ID of the default system policy.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder originPolicyId(Long originPolicyId) {
                this.originPolicyId = originPolicyId;
                return this;
            }

            /**
             * <p>The name of the schema template.</p>
             * 
             * <strong>example:</strong>
             * <p>DataQuerySecurityStrategySchema</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The time when the security policy was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-25T20:46:19</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the last updater.</p>
             * 
             * <strong>example:</strong>
             * <p>203322746501002787</p>
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * <p>The list of associated workspace IDs.</p>
             */
            public Builder workspaces(java.util.List<Long> workspaces) {
                this.workspaces = workspaces;
                return this;
            }

            public SecurityStrategy build() {
                return new SecurityStrategy(this);
            } 

        } 

    }
}
