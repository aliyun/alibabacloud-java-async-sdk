// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateContentResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateTemplateContentResponseBody</p>
 */
public class ValidateTemplateContentResponseBody extends TeaModel {
    @NameInMap("Outputs")
    private String outputs;

    @NameInMap("Parameters")
    private String parameters;

    @NameInMap("RamRole")
    private String ramRole;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    private ValidateTemplateContentResponseBody(Builder builder) {
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.ramRole = builder.ramRole;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTemplateContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String outputs; 
        private String parameters; 
        private String ramRole; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 

        /**
         * Outputs.
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RamRole.
         */
        public Builder ramRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ValidateTemplateContentResponseBody build() {
            return new ValidateTemplateContentResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Outputs")
        private String outputs;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("Type")
        private String type;

        private Tasks(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.properties = builder.properties;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String outputs; 
            private String properties; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
