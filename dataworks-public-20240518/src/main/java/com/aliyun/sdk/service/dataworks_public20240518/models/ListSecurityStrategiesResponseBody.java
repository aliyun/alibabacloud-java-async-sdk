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
 * {@link ListSecurityStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityStrategiesResponseBody</p>
 */
public class ListSecurityStrategiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSecurityStrategiesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityStrategiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSecurityStrategiesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination result.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
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

        public ListSecurityStrategiesResponseBody build() {
            return new ListSecurityStrategiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityStrategiesResponseBody</p>
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
             * <p>The valid value range for Basic Edition, specified as [min, max].</p>
             */
            public Builder basicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
                this.basicEditionIntervalValue = basicEditionIntervalValue;
                return this;
            }

            /**
             * <p>The identifier of the control item. For valid values, see the list of control items for each schema.</p>
             * 
             * <strong>example:</strong>
             * <p>viewCount</p>
             */
            public Builder controller(String controller) {
                this.controller = controller;
                return this;
            }

            /**
             * <p>The data type of the value. Valid values: <code>Boolean</code>, <code>Integer</code>, <code>Long</code>, and <code>String</code>.</p>
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
             * <p>Whether the control item is enabled.</p>
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
             * <p>The valid value range for Enterprise Edition, specified as [min, max].</p>
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
             * <p>The valid value range for Professional Edition, specified as [min, max].</p>
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
             * <p>The valid value range for Standard Edition, specified as [min, max].</p>
             */
            public Builder standardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
                this.standardEditionIntervalValue = standardEditionIntervalValue;
                return this;
            }

            /**
             * <p>The value set for the control item. The data type of this value is specified by <code>ControllerValueType</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link ListSecurityStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityStrategiesResponseBody</p>
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
             * <p>The control scope.</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant</p>
             */
            public Builder controlDwScope(String controlDwScope) {
                this.controlDwScope = controlDwScope;
                return this;
            }

            /**
             * <p>The control module. This value is from the <code>controlModule</code> property of the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>DataQuery</p>
             */
            public Builder controlModule(String controlModule) {
                this.controlModule = controlModule;
                return this;
            }

            /**
             * <p>The control submodule. This value is from the <code>controlSubModule</code> property of the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>MyCatalog</p>
             */
            public Builder controlSubModule(String controlSubModule) {
                this.controlSubModule = controlSubModule;
                return this;
            }

            /**
             * <p>A list of control items. The available items depend on the schema. For details, see the <code>Controller</code> definition and the list of control items for each schema.</p>
             */
            public Builder controllers(java.util.List<Controllers> controllers) {
                this.controllers = controllers;
                return this;
            }

            /**
             * <p>The <code>displayName</code> of the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>数据分析</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The <code>displayNameEn</code> of the associated <code>SecurityStrategySchema</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Query</p>
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * <p>The <code>name</code> of the associated <code>SecurityStrategySchema</code>.</p>
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
             * <p>The name of the system policy. If this property is not empty, the system automatically creates a default policy.</p>
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
     * {@link ListSecurityStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityStrategiesResponseBody</p>
     */
    public static class SecurityStrategies extends TeaModel {
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
        private String id;

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

        private SecurityStrategies(Builder builder) {
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

        public static SecurityStrategies create() {
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
        public String getId() {
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
            private String id; 
            private String name; 
            private Long originPolicyId; 
            private String schemaName; 
            private String updateTime; 
            private String updater; 
            private java.util.List<Long> workspaces; 

            private Builder() {
            } 

            private Builder(SecurityStrategies model) {
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
             * <p>The policy content. The content is constrained by <code>SecurityStrategySchema</code>.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The control scope. Valid values: <code>Workspace</code> and <code>Tenant</code>.</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-25T20:46:19</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
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
             * <p>Whether the policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(String id) {
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
             * <p>The source ID of the system default policy.</p>
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
             * <p>The time of the last update.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-25T20:46:19</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user who last updated the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>203322746501002787</p>
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * <p>The associated workspace IDs.</p>
             */
            public Builder workspaces(java.util.List<Long> workspaces) {
                this.workspaces = workspaces;
                return this;
            }

            public SecurityStrategies build() {
                return new SecurityStrategies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecurityStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityStrategiesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SecurityStrategies")
        private java.util.List<SecurityStrategies> securityStrategies;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.securityStrategies = builder.securityStrategies;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return securityStrategies
         */
        public java.util.List<SecurityStrategies> getSecurityStrategies() {
            return this.securityStrategies;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<SecurityStrategies> securityStrategies; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.securityStrategies = model.securityStrategies;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of security policies.</p>
             */
            public Builder securityStrategies(java.util.List<SecurityStrategies> securityStrategies) {
                this.securityStrategies = securityStrategies;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
