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
 * {@link DescribeFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowResponseBody</p>
 */
public class DescribeFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Environment")
    private Environment environment;

    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeFlowResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.definition = builder.definition;
        this.description = builder.description;
        this.environment = builder.environment;
        this.executionMode = builder.executionMode;
        this.id = builder.id;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environment
     */
    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String createdTime; 
        private String definition; 
        private String description; 
        private Environment environment; 
        private String executionMode; 
        private String id; 
        private String lastModifiedTime; 
        private String name; 
        private String requestId; 
        private String roleArn; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeFlowResponseBody model) {
            this.createdTime = model.createdTime;
            this.definition = model.definition;
            this.description = model.description;
            this.environment = model.environment;
            this.executionMode = model.executionMode;
            this.id = model.id;
            this.lastModifiedTime = model.lastModifiedTime;
            this.name = model.name;
            this.requestId = model.requestId;
            this.roleArn = model.roleArn;
            this.type = model.type;
        } 

        /**
         * <p>The time when the flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports the flow definition specifications of the old version and new version.</p>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n - type: pass\n name: mypass</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>The description of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test flow</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * <p>The execution mode or the enumeration type. Valid values: Express and Standard. A value of Standard indicates an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The unique ID of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>e589e092-e2c0-4dee-b306-3574ddfdddf5****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The time when the flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder name(String name) {
            this.name = name;
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

        /**
         * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::${accountID}:${role}</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The type of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>FDL</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeFlowResponseBody build() {
            return new DescribeFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.description = builder.description;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The description of the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>test flow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>flow</p>
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
     * {@link DescribeFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowResponseBody</p>
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
}
