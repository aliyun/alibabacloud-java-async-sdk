// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CreateStateConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStateConfigurationResponseBody</p>
 */
public class CreateStateConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StateConfiguration")
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
     * @return stateConfiguration
     */
    public StateConfiguration getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private StateConfiguration stateConfiguration; 

        private Builder() {
        } 

        private Builder(CreateStateConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.stateConfiguration = model.stateConfiguration;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1306108F-610C-40FD-AAD5-DA13E8B00BE9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the desired-state configuration.</p>
         */
        public Builder stateConfiguration(StateConfiguration stateConfiguration) {
            this.stateConfiguration = stateConfiguration;
            return this;
        }

        public CreateStateConfigurationResponseBody build() {
            return new CreateStateConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateStateConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateStateConfigurationResponseBody</p>
     */
    public static class StateConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigureMode")
        private String configureMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScheduleExpression")
        private String scheduleExpression;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("StateConfigurationId")
        private String stateConfigurationId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private String targets;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
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
        public java.util.Map<String, ?> getParameters() {
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
        public java.util.Map<String, ?> getTags() {
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
            private java.util.Map<String, ?> parameters; 
            private String resourceGroupId; 
            private String scheduleExpression; 
            private String scheduleType; 
            private String stateConfigurationId; 
            private java.util.Map<String, ?> tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 

            private Builder() {
            } 

            private Builder(StateConfiguration model) {
                this.configureMode = model.configureMode;
                this.createTime = model.createTime;
                this.description = model.description;
                this.parameters = model.parameters;
                this.resourceGroupId = model.resourceGroupId;
                this.scheduleExpression = model.scheduleExpression;
                this.scheduleType = model.scheduleType;
                this.stateConfigurationId = model.stateConfigurationId;
                this.tags = model.tags;
                this.targets = model.targets;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateVersion = model.templateVersion;
            } 

            /**
             * <p>The configuration mode. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ApplyAndAutoCorrect</p>
             */
            public Builder configureMode(String configureMode) {
                this.configureMode = configureMode;
                return this;
            }

            /**
             * <p>The time when the desired-state configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-22T03:13:32Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>collect inventory data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;policy&quot;: {&quot;ACS:Network&quot;: {&quot;Collection&quot;: &quot;Enabled&quot;}, &quot;ACS:Application&quot;: {&quot;Collection&quot;: &quot;Enabled&quot;}}}</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The schedule expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1 hour</p>
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * <p>The schedule type.</p>
             * 
             * <strong>example:</strong>
             * <p>rate</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The ID of the desired-state configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>sc-a538febe18fabcdef</p>
             */
            public Builder stateConfigurationId(String stateConfigurationId) {
                this.stateConfigurationId = stateConfigurationId;
                return this;
            }

            /**
             * <p>The tags added to the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;inventory&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The queried resources.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;,     &quot;Filters&quot;: [       {         &quot;Type&quot;: &quot;All&quot;,         &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,         &quot;Parameters&quot;: {           &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,           &quot;Status&quot;: &quot;Running&quot;         }       }     ]   }</p>
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-1234asadf</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-ECS-InventoryDataCollection</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The name of the template version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
