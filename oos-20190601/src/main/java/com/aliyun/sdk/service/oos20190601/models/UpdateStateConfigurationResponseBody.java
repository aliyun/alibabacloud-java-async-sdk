// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStateConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStateConfigurationResponseBody</p>
 */
public class UpdateStateConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StateConfiguration")
    private java.util.List < StateConfiguration> stateConfiguration;

    private UpdateStateConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateConfiguration = builder.stateConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStateConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateConfiguration
     */
    public java.util.List < StateConfiguration> getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StateConfiguration> stateConfiguration; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the configuration.
         */
        public Builder stateConfiguration(java.util.List < StateConfiguration> stateConfiguration) {
            this.stateConfiguration = stateConfiguration;
            return this;
        }

        public UpdateStateConfigurationResponseBody build() {
            return new UpdateStateConfigurationResponseBody(this);
        } 

    } 

    public static class StateConfiguration extends TeaModel {
        @NameInMap("ConfigureMode")
        private String configureMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScheduleExpression")
        private String scheduleExpression;

        @NameInMap("ScheduleType")
        private String scheduleType;

        @NameInMap("StateConfigurationId")
        private String stateConfigurationId;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("Targets")
        private String targets;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private StateConfiguration(Builder builder) {
            this.configureMode = builder.configureMode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.parameters = builder.parameters;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduleExpression = builder.scheduleExpression;
            this.scheduleType = builder.scheduleType;
            this.stateConfigurationId = builder.stateConfigurationId;
            this.tags = builder.tags;
            this.targets = builder.targets;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateConfiguration create() {
            return builder().build();
        }

        /**
         * @return configureMode
         */
        public String getConfigureMode() {
            return this.configureMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scheduleExpression
         */
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return stateConfigurationId
         */
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        /**
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return targets
         */
        public String getTargets() {
            return this.targets;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String configureMode; 
            private String createTime; 
            private String description; 
            private String parameters; 
            private String resourceGroupId; 
            private String scheduleExpression; 
            private String scheduleType; 
            private String stateConfigurationId; 
            private java.util.Map < String, ? > tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateTime; 

            /**
             * The configuration mode. Valid values:
             */
            public Builder configureMode(String configureMode) {
                this.configureMode = configureMode;
                return this;
            }

            /**
             * The time when the configuration was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the desired-state configuration.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The CRON expression.
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * The schedule type.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * The ID of the desired-state configuration.
             */
            public Builder stateConfigurationId(String stateConfigurationId) {
                this.stateConfigurationId = stateConfigurationId;
                return this;
            }

            /**
             * The tags added to the configuration.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The queried resources.
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The template ID.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The name of the template version.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The time when the configuration was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StateConfiguration build() {
                return new StateConfiguration(this);
            } 

        } 

    }
}
