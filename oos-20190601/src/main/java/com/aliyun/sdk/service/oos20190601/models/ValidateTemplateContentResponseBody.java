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
 * {@link ValidateTemplateContentResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateTemplateContentResponseBody</p>
 */
public class ValidateTemplateContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Outputs")
    private String outputs;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

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
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String outputs; 
        private String parameters; 
        private String ramRole; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        /**
         * <p>The outputs of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The parameters of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Status&quot;: { &quot;Description&quot;: &quot;(Required) The status of the Ecs instance.&quot;, &quot;Type&quot;: &quot;String&quot; } }</p>
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>OOSServiceRole</p>
         */
        public Builder ramRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D5EE9591-1F2D-573E-8751-7F08BBB388D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task defined in the template.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ValidateTemplateContentResponseBody build() {
            return new ValidateTemplateContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValidateTemplateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateTemplateContentResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>(Required) The status of the Ecs instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>foo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The outputs of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>.instanceId</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The properties of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;API&quot;: &quot;DescribeInstances&quot;,&quot;Parameters&quot;: {&quot;Status&quot;: &quot;{{ Status }}&quot;},&quot;Service&quot;: &quot;Ecs&quot;}</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ExecuteAPI</p>
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
