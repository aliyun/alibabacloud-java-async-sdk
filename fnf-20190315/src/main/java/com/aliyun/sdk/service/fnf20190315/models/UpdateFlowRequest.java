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
 * {@link UpdateFlowRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowRequest</p>
 */
public class UpdateFlowRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private Environment environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.description = builder.description;
        this.environment = builder.environment;
        this.name = builder.name;
        this.roleArn = builder.roleArn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<UpdateFlowRequest, Builder> {
        private String definition; 
        private String description; 
        private Environment environment; 
        private String name; 
        private String roleArn; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.description = request.description;
            this.environment = request.environment;
            this.name = request.name;
            this.roleArn = request.roleArn;
            this.type = request.type;
        } 

        /**
         * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports the two workflow definition specifications.</p>
         * <blockquote>
         * <p> In the preceding workflow definition example, Name:my_flow_name is the workflow name, which must be consistent with the input parameter Name</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n  - type: pass\n    name: mypass</p>
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The description of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test definition</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(Environment environment) {
            String environmentShrink = shrink(environment, "Environment", "json");
            this.putBodyParameter("Environment", environmentShrink);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The name of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, the flow execution engine assumes the role to call API operations of relevant services.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::${accountID}:${role}</p>
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The type of the flow. Valid value: <strong>FDL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>FDL</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateFlowRequest build() {
            return new UpdateFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFlowRequest} extends {@link TeaModel}
     *
     * <p>UpdateFlowRequest</p>
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
             * <p>test definition</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the workflow.</p>
             * <p>This parameter is required.</p>
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
     * {@link UpdateFlowRequest} extends {@link TeaModel}
     *
     * <p>UpdateFlowRequest</p>
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
