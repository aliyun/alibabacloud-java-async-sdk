// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ListExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionsResponseBody</p>
 */
public class ListExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List<Executions> executions;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executions
     */
    public java.util.List<Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Executions> executions; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListExecutionsResponseBody model) {
            this.executions = model.executions;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about executions.</p>
         */
        public Builder executions(java.util.List<Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * <p>The start key for the next query. This parameter is not returned if this is the last query.</p>
         * <blockquote>
         * <p> This parameter may not be displayed in the response because no next page exists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>exec2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExecutionsResponseBody build() {
            return new ListExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionsResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionsResponseBody</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Environment(Builder builder) {
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.variables = model.variables;
            } 

            /**
             * Variables.
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionsResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("FlowDefinition")
        private String flowDefinition;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private String startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StoppedTime")
        private String stoppedTime;

        private Executions(Builder builder) {
            this.environment = builder.environment;
            this.flowDefinition = builder.flowDefinition;
            this.flowName = builder.flowName;
            this.input = builder.input;
            this.name = builder.name;
            this.output = builder.output;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.stoppedTime = builder.stoppedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return environment
         */
        public Environment getEnvironment() {
            return this.environment;
        }

        /**
         * @return flowDefinition
         */
        public String getFlowDefinition() {
            return this.flowDefinition;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return startedTime
         */
        public String getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stoppedTime
         */
        public String getStoppedTime() {
            return this.stoppedTime;
        }

        public static final class Builder {
            private Environment environment; 
            private String flowDefinition; 
            private String flowName; 
            private String input; 
            private String name; 
            private String output; 
            private String startedTime; 
            private String status; 
            private String stoppedTime; 

            private Builder() {
            } 

            private Builder(Executions model) {
                this.environment = model.environment;
                this.flowDefinition = model.flowDefinition;
                this.flowName = model.flowName;
                this.input = model.input;
                this.name = model.name;
                this.output = model.output;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.stoppedTime = model.stoppedTime;
            } 

            /**
             * Environment.
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The definition of the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n  - type: pass\n    name: mypass</p>
             */
            public Builder flowDefinition(String flowDefinition) {
                this.flowDefinition = flowDefinition;
                return this;
            }

            /**
             * <p>The name of the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>flow</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>The input of the execution, which is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;:&quot;value&quot;}</p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The name of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output of the execution, which is in the JSON format</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;:&quot;value&quot;}</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The time when the execution started.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:01:01.001Z</p>
             */
            public Builder startedTime(String startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The status of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the execution stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:01:01.001Z</p>
             */
            public Builder stoppedTime(String stoppedTime) {
                this.stoppedTime = stoppedTime;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
