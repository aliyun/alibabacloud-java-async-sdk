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
 * {@link FindBestMatchSecurityStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>FindBestMatchSecurityStrategyResponseBody</p>
 */
public class FindBestMatchSecurityStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FindBestMatchSecurityStrategyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindBestMatchSecurityStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(FindBestMatchSecurityStrategyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindBestMatchSecurityStrategyResponseBody build() {
            return new FindBestMatchSecurityStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindBestMatchSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>FindBestMatchSecurityStrategyResponseBody</p>
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
             * BasicEditionDefaultValue.
             */
            public Builder basicEditionDefaultValue(Object basicEditionDefaultValue) {
                this.basicEditionDefaultValue = basicEditionDefaultValue;
                return this;
            }

            /**
             * BasicEditionIntervalValue.
             */
            public Builder basicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
                this.basicEditionIntervalValue = basicEditionIntervalValue;
                return this;
            }

            /**
             * Controller.
             */
            public Builder controller(String controller) {
                this.controller = controller;
                return this;
            }

            /**
             * ControllerValueType.
             */
            public Builder controllerValueType(String controllerValueType) {
                this.controllerValueType = controllerValueType;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayNameEn.
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EnterpriseEditionDefaultValue.
             */
            public Builder enterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
                this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
                return this;
            }

            /**
             * EnterpriseEditionIntervalValue.
             */
            public Builder enterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
                this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
                return this;
            }

            /**
             * ProfessionalEditionDefaultValue.
             */
            public Builder professionalEditionDefaultValue(Object professionalEditionDefaultValue) {
                this.professionalEditionDefaultValue = professionalEditionDefaultValue;
                return this;
            }

            /**
             * ProfessionalEditionIntervalValue.
             */
            public Builder professionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
                this.professionalEditionIntervalValue = professionalEditionIntervalValue;
                return this;
            }

            /**
             * StandardEditionDefaultValue.
             */
            public Builder standardEditionDefaultValue(Object standardEditionDefaultValue) {
                this.standardEditionDefaultValue = standardEditionDefaultValue;
                return this;
            }

            /**
             * StandardEditionIntervalValue.
             */
            public Builder standardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
                this.standardEditionIntervalValue = standardEditionIntervalValue;
                return this;
            }

            /**
             * UserConfigValue.
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
     * {@link FindBestMatchSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>FindBestMatchSecurityStrategyResponseBody</p>
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
             * ControlDwScope.
             */
            public Builder controlDwScope(String controlDwScope) {
                this.controlDwScope = controlDwScope;
                return this;
            }

            /**
             * ControlModule.
             */
            public Builder controlModule(String controlModule) {
                this.controlModule = controlModule;
                return this;
            }

            /**
             * ControlSubModule.
             */
            public Builder controlSubModule(String controlSubModule) {
                this.controlSubModule = controlSubModule;
                return this;
            }

            /**
             * Controllers.
             */
            public Builder controllers(java.util.List<Controllers> controllers) {
                this.controllers = controllers;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayNameEn.
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SystemPolicyDisplayName.
             */
            public Builder systemPolicyDisplayName(String systemPolicyDisplayName) {
                this.systemPolicyDisplayName = systemPolicyDisplayName;
                return this;
            }

            /**
             * SystemPolicyName.
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
     * {@link FindBestMatchSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>FindBestMatchSecurityStrategyResponseBody</p>
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
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * ControlDwScope.
             */
            public Builder controlDwScope(String controlDwScope) {
                this.controlDwScope = controlDwScope;
                return this;
            }

            /**
             * ControlModule.
             */
            public Builder controlModule(String controlModule) {
                this.controlModule = controlModule;
                return this;
            }

            /**
             * ControlSubModule.
             */
            public Builder controlSubModule(String controlSubModule) {
                this.controlSubModule = controlSubModule;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OriginPolicyId.
             */
            public Builder originPolicyId(Long originPolicyId) {
                this.originPolicyId = originPolicyId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Updater.
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * Workspaces.
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
    /**
     * 
     * {@link FindBestMatchSecurityStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>FindBestMatchSecurityStrategyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("EditionDisplayName")
        private String editionDisplayName;

        @com.aliyun.core.annotation.NameInMap("SecurityStrategy")
        private SecurityStrategy securityStrategy;

        private Data(Builder builder) {
            this.edition = builder.edition;
            this.editionDisplayName = builder.editionDisplayName;
            this.securityStrategy = builder.securityStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return editionDisplayName
         */
        public String getEditionDisplayName() {
            return this.editionDisplayName;
        }

        /**
         * @return securityStrategy
         */
        public SecurityStrategy getSecurityStrategy() {
            return this.securityStrategy;
        }

        public static final class Builder {
            private String edition; 
            private String editionDisplayName; 
            private SecurityStrategy securityStrategy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.edition = model.edition;
                this.editionDisplayName = model.editionDisplayName;
                this.securityStrategy = model.securityStrategy;
            } 

            /**
             * Edition.
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * EditionDisplayName.
             */
            public Builder editionDisplayName(String editionDisplayName) {
                this.editionDisplayName = editionDisplayName;
                return this;
            }

            /**
             * SecurityStrategy.
             */
            public Builder securityStrategy(SecurityStrategy securityStrategy) {
                this.securityStrategy = securityStrategy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
