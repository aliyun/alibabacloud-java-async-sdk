// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStateConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStateConfigurationResponseBody</p>
 */
public class CreateStateConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StateConfiguration")
    private StateConfiguration stateConfiguration;

    private CreateStateConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateConfiguration = builder.stateConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStateConfigurationResponseBody create() {
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
    public StateConfiguration getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private StateConfiguration stateConfiguration; 

        /**
         * The configuration mode.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag.
         */
        public Builder stateConfiguration(StateConfiguration stateConfiguration) {
            this.stateConfiguration = stateConfiguration;
            return this;
        }

        public CreateStateConfigurationResponseBody build() {
            return new CreateStateConfigurationResponseBody(this);
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
        private java.util.Map < String, ? > parameters;

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
        public java.util.Map < String, ? > getParameters() {
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

        public static final class Builder {
            private String configureMode; 
            private String createTime; 
            private String description; 
            private java.util.Map < String, ? > parameters; 
            private String resourceGroupId; 
            private String scheduleExpression; 
            private String scheduleType; 
            private String stateConfigurationId; 
            private java.util.Map < String, ? > tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 

            /**
             * The parameters.
             */
            public Builder configureMode(String configureMode) {
                this.configureMode = configureMode;
                return this;
            }

            /**
             * The desired-state configuration.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * WB502027
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * CreateStateConfiguration
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The version number. If you do not specify this parameter, the system uses the latest version.
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * Creates a desired-state configuration.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * 收集Inventory数据
             */
            public Builder stateConfigurationId(String stateConfigurationId) {
                this.stateConfigurationId = stateConfigurationId;
                return this;
            }

            /**
             * The required resources.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 1 hour 或 30 minutes
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * TemplateId.
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
             * The ID of the request.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            public StateConfiguration build() {
                return new StateConfiguration(this);
            } 

        } 

    }
}
