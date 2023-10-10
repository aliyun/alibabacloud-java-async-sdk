// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewStackResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewStackResponseBody</p>
 */
public class PreviewStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stack")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the stack that is previewed.
         */
        public Builder stack(Stack stack) {
            this.stack = stack;
            return this;
        }

        public PreviewStackResponseBody build() {
            return new PreviewStackResponseBody(this);
        } 

    } 

    public static class TerraformLogs extends TeaModel {
        @NameInMap("Command")
        private String command;

        @NameInMap("Content")
        private String content;

        @NameInMap("Stream")
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
             * The name of the Terraform command that is run. Valid values:
             * <p>
             * 
             * *   apply
             * *   plan
             * *   destroy
             * *   version
             * 
             * For more information about Terraform commands, see [Basic CLI Features](https://www.terraform.io/cli/commands).
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The content of the output stream that is returned after the command is run.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The output stream. Valid values:
             * <p>
             * 
             * *   stdout: standard output stream
             * *   stderr: standard error stream
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
    public static class Log extends TeaModel {
        @NameInMap("TerraformLogs")
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
             * The Terraform logs. This parameter is returned only if the stack is a Terraform stack.
             * <p>
             * 
             * > This parameter contains the logs of previewing the stack.
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
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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
             * The name of the parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter.
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
    public static class Resources extends TeaModel {
        @NameInMap("AcsResourceType")
        private String acsResourceType;

        @NameInMap("Action")
        private String action;

        @NameInMap("Description")
        private String description;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("Properties")
        private java.util.Map < String, ? > properties;

        @NameInMap("Replacement")
        private String replacement;

        @NameInMap("RequiredBy")
        private java.util.List < String > requiredBy;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Stack")
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
             * The resource type of an Alibaba Cloud service.
             */
            public Builder acsResourceType(String acsResourceType) {
                this.acsResourceType = acsResourceType;
                return this;
            }

            /**
             * The action that is performed on the resource. Valid values:
             * <p>
             * 
             * *   Add
             * *   Modify
             * *   Remove
             * *   None
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The description of the resource.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The logical ID of the resource.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The physical ID of the resource.
             * <p>
             * 
             * This parameter is returned only if Action is set to Modify or Remove.
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * The resource properties.
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Indicates whether a replacement update is performed on the template. Valid values:
             * <p>
             * 
             * *   True: A replacement update is performed on the template.
             * *   False: A change is made on the template.
             * *   Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.
             * 
             * > This parameter is returned only if Action is set to Modify.
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            /**
             * The resources on which the stack depends.
             */
            public Builder requiredBy(java.util.List < String > requiredBy) {
                this.requiredBy = requiredBy;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The information about the nested stack. The data structure of the value is the same as the data structure of the entire response.
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
    public static class Stack extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisableRollback")
        private Boolean disableRollback;

        @NameInMap("Log")
        private Log log;

        @NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Resources")
        private java.util.List < Resources> resources;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("StackPolicyBody")
        private java.util.Map < String, ? > stackPolicyBody;

        @NameInMap("TemplateDescription")
        private String templateDescription;

        @NameInMap("TimeoutInMinutes")
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
             * The description of the stack.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether rollback is disabled for the resources when the stack fails to be created.
             */
            public Builder disableRollback(Boolean disableRollback) {
                this.disableRollback = disableRollback;
                return this;
            }

            /**
             * The log that is generated when the stack is run.
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * The parameters of the stack.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The region where the stack resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resources in the stack.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The stack name.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * The structure that contains the stack policy body.
             */
            public Builder stackPolicyBody(java.util.Map < String, ? > stackPolicyBody) {
                this.stackPolicyBody = stackPolicyBody;
                return this;
            }

            /**
             * The description of the template.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * The timeout period for creating the stack.
             * <p>
             * 
             * Unit: minutes.
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
