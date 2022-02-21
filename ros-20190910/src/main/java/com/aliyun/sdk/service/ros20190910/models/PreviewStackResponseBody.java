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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Stack.
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
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Stream.
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
             * TerraformLogs.
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
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("Properties")
        private java.util.Map < String, ? > properties;

        @NameInMap("RequiredBy")
        private java.util.List < String > requiredBy;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Stack")
        private java.util.Map < String, ? > stack;

        private Resources(Builder builder) {
            this.description = builder.description;
            this.logicalResourceId = builder.logicalResourceId;
            this.properties = builder.properties;
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
         * @return properties
         */
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
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
            private String description; 
            private String logicalResourceId; 
            private java.util.Map < String, ? > properties; 
            private java.util.List < String > requiredBy; 
            private String resourceType; 
            private java.util.Map < String, ? > stack; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LogicalResourceId.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RequiredBy.
             */
            public Builder requiredBy(java.util.List < String > requiredBy) {
                this.requiredBy = requiredBy;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Stack.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisableRollback.
             */
            public Builder disableRollback(Boolean disableRollback) {
                this.disableRollback = disableRollback;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * StackPolicyBody.
             */
            public Builder stackPolicyBody(java.util.Map < String, ? > stackPolicyBody) {
                this.stackPolicyBody = stackPolicyBody;
                return this;
            }

            /**
             * TemplateDescription.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * TimeoutInMinutes.
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
