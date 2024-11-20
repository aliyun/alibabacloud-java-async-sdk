// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreviewStackResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewStackResponseBody</p>
 */
public class PreviewStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stack")
    private Stack stack;

    private PreviewStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stack = builder.stack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewStackResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stack
     */
    public Stack getStack() {
        return this.stack;
    }

    public static final class Builder {
        private String requestId; 
        private Stack stack; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the stack that is previewed.</p>
         */
        public Builder stack(Stack stack) {
            this.stack = stack;
            return this;
        }

        public PreviewStackResponseBody build() {
            return new PreviewStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewStackResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewStackResponseBody</p>
     */
    public static class TerraformLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        private TerraformLogs(Builder builder) {
            this.command = builder.command;
            this.content = builder.content;
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformLogs create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return stream
         */
        public String getStream() {
            return this.stream;
        }

        public static final class Builder {
            private String command; 
            private String content; 
            private String stream; 

            /**
             * <p>The name of the Terraform command that is run. Valid values:</p>
             * <ul>
             * <li>apply</li>
             * <li>plan</li>
             * <li>destroy</li>
             * <li>version</li>
             * </ul>
             * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Basic CLI Features</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>apply</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The content of the output stream that is returned after the command is run.</p>
             * 
             * <strong>example:</strong>
             * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The output stream. Valid values:</p>
             * <ul>
             * <li>stdout: standard output stream</li>
             * <li>stderr: standard error stream</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stdout</p>
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            public TerraformLogs build() {
                return new TerraformLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewStackResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewStackResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TerraformLogs")
        private java.util.List < TerraformLogs> terraformLogs;

        private Log(Builder builder) {
            this.terraformLogs = builder.terraformLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return terraformLogs
         */
        public java.util.List < TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List < TerraformLogs> terraformLogs; 

            /**
             * <p>The Terraform logs. This parameter is returned only if the stack is a Terraform stack.</p>
             * <blockquote>
             * <p>This parameter contains the logs of previewing the stack.</p>
             * </blockquote>
             */
            public Builder terraformLogs(java.util.List < TerraformLogs> terraformLogs) {
                this.terraformLogs = terraformLogs;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewStackResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewStackResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::AccountId</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewStackResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewStackResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcsResourceType")
        private String acsResourceType;

        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map < String, ? > properties;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        @com.aliyun.core.annotation.NameInMap("RequiredBy")
        private java.util.List < String > requiredBy;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Stack")
        private java.util.Map < String, ? > stack;

        private Resources(Builder builder) {
            this.acsResourceType = builder.acsResourceType;
            this.action = builder.action;
            this.description = builder.description;
            this.logicalResourceId = builder.logicalResourceId;
            this.physicalResourceId = builder.physicalResourceId;
            this.properties = builder.properties;
            this.replacement = builder.replacement;
            this.requiredBy = builder.requiredBy;
            this.resourceType = builder.resourceType;
            this.stack = builder.stack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return acsResourceType
         */
        public String getAcsResourceType() {
            return this.acsResourceType;
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        /**
         * @return requiredBy
         */
        public java.util.List < String > getRequiredBy() {
            return this.requiredBy;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return stack
         */
        public java.util.Map < String, ? > getStack() {
            return this.stack;
        }

        public static final class Builder {
            private String acsResourceType; 
            private String action; 
            private String description; 
            private String logicalResourceId; 
            private String physicalResourceId; 
            private java.util.Map < String, ? > properties; 
            private String replacement; 
            private java.util.List < String > requiredBy; 
            private String resourceType; 
            private java.util.Map < String, ? > stack; 

            /**
             * <p>The resource type of an Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder acsResourceType(String acsResourceType) {
                this.acsResourceType = acsResourceType;
                return this;
            }

            /**
             * <p>The action that is performed on the resource. Valid values:</p>
             * <ul>
             * <li>Add</li>
             * <li>Modify</li>
             * <li>Remove</li>
             * <li>None</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Add</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The description of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The logical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>WebServer</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The physical ID of the resource.</p>
             * <p>This parameter is returned only if Action is set to Modify or Remove.</p>
             * 
             * <strong>example:</strong>
             * <p>i-a1b2c3***</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>The resource properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;DiskMappings&quot;: [     {       &quot;Category&quot;: &quot;cloud_ssd&quot;,       &quot;Size&quot;: &quot;20&quot;     }   ],   &quot;SystemDisk_Category&quot;: &quot;cloud_ssd&quot;,   &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,   &quot;AutoRenew&quot;: &quot;False&quot;,   &quot;WillReplace&quot;: true,   &quot;ImageId&quot;: &quot;centos_7&quot;,   &quot;InstanceType&quot;: &quot;ecs.g6.large&quot;,   &quot;AllocatePublicIP&quot;: true,   &quot;AutoRenewPeriod&quot;: 1,   &quot;IoOptimized&quot;: &quot;optimized&quot;,   &quot;ZoneId&quot;: &quot;cn-beijing-g&quot;,   &quot;VSwitchId&quot;: &quot;&quot;,   &quot;SecurityGroupId&quot;: &quot;&quot;,   &quot;Period&quot;: 1,   &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,   &quot;SystemDiskCategory&quot;: &quot;cloud_efficiency&quot;,   &quot;InternetMaxBandwidthOut&quot;: 1,   &quot;VpcId&quot;: &quot;&quot;,   &quot;InternetMaxBandwidthIn&quot;: 200,   &quot;PeriodUnit&quot;: &quot;Month&quot; }</p>
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>Indicates whether a replacement update is performed on the template. Valid values:</p>
             * <ul>
             * <li>True: A replacement update is performed on the template.</li>
             * <li>False: A change is made on the template.</li>
             * <li>Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if Action is set to Modify.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            /**
             * <p>The resources on which the stack depends.</p>
             */
            public Builder requiredBy(java.util.List < String > requiredBy) {
                this.requiredBy = requiredBy;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The information about the nested stack. The data structure of the value is the same as the data structure of the entire response.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder stack(java.util.Map < String, ? > stack) {
                this.stack = stack;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewStackResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewStackResponseBody</p>
     */
    public static class Stack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisableRollback")
        private Boolean disableRollback;

        @com.aliyun.core.annotation.NameInMap("Log")
        private Log log;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < Resources> resources;

        @com.aliyun.core.annotation.NameInMap("StackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("StackPolicyBody")
        private java.util.Map < String, ? > stackPolicyBody;

        @com.aliyun.core.annotation.NameInMap("TemplateDescription")
        private String templateDescription;

        @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
        private Integer timeoutInMinutes;

        private Stack(Builder builder) {
            this.description = builder.description;
            this.disableRollback = builder.disableRollback;
            this.log = builder.log;
            this.parameters = builder.parameters;
            this.regionId = builder.regionId;
            this.resources = builder.resources;
            this.stackName = builder.stackName;
            this.stackPolicyBody = builder.stackPolicyBody;
            this.templateDescription = builder.templateDescription;
            this.timeoutInMinutes = builder.timeoutInMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stack create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disableRollback
         */
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        /**
         * @return log
         */
        public Log getLog() {
            return this.log;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resources
         */
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return stackPolicyBody
         */
        public java.util.Map < String, ? > getStackPolicyBody() {
            return this.stackPolicyBody;
        }

        /**
         * @return templateDescription
         */
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        /**
         * @return timeoutInMinutes
         */
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public static final class Builder {
            private String description; 
            private Boolean disableRollback; 
            private Log log; 
            private java.util.List < Parameters> parameters; 
            private String regionId; 
            private java.util.List < Resources> resources; 
            private String stackName; 
            private java.util.Map < String, ? > stackPolicyBody; 
            private String templateDescription; 
            private Integer timeoutInMinutes; 

            /**
             * <p>The description of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>One ECS instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether rollback is disabled for the resources when the stack fails to be created.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableRollback(Boolean disableRollback) {
                this.disableRollback = disableRollback;
                return this;
            }

            /**
             * <p>The log that is generated when the stack is run.</p>
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The parameters of the stack.</p>
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The region where the stack resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resources in the stack.</p>
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The stack name.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStack</p>
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * <p>The structure that contains the stack policy body.</p>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;Statement&quot;: [     {       &quot;Action&quot;: &quot;Update:<em>&quot;,       &quot;Resource&quot;: &quot;</em>&quot;,       &quot;Effect&quot;: &quot;Allow&quot;,       &quot;Principal&quot;: &quot;<em>&quot;     },     {       &quot;Action&quot;: &quot;Update:</em>&quot;,       &quot;Resource&quot;: &quot;LogicalResourceId/apple1&quot;,       &quot;Effect&quot;: &quot;Deny&quot;,       &quot;Principal&quot;: &quot;*&quot;     }   ] }</p>
             */
            public Builder stackPolicyBody(java.util.Map < String, ? > stackPolicyBody) {
                this.stackPolicyBody = stackPolicyBody;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>One ECS instance.</p>
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * <p>The timeout period for creating the stack.</p>
             * <p>Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeoutInMinutes(Integer timeoutInMinutes) {
                this.timeoutInMinutes = timeoutInMinutes;
                return this;
            }

            public Stack build() {
                return new Stack(this);
            } 

        } 

    }
}
