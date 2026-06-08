// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTemplatePolicyResponseBody</p>
 */
public class GenerateTemplatePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("PolicyFunctions")
    private java.util.List<PolicyFunctions> policyFunctions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateTemplatePolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.policyFunctions = builder.policyFunctions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplatePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return policyFunctions
     */
    public java.util.List<PolicyFunctions> getPolicyFunctions() {
        return this.policyFunctions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private java.util.List<PolicyFunctions> policyFunctions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateTemplatePolicyResponseBody model) {
            this.policy = model.policy;
            this.policyFunctions = model.policyFunctions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * PolicyFunctions.
         */
        public Builder policyFunctions(java.util.List<PolicyFunctions> policyFunctions) {
            this.policyFunctions = policyFunctions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateTemplatePolicyResponseBody build() {
            return new GenerateTemplatePolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplatePolicyResponseBody</p>
     */
    public static class Statement extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private java.util.List<String> action;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private java.util.Map<String, ?> condition;

        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        private Statement(Builder builder) {
            this.action = builder.action;
            this.condition = builder.condition;
            this.effect = builder.effect;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statement create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.List<String> getAction() {
            return this.action;
        }

        /**
         * @return condition
         */
        public java.util.Map<String, ?> getCondition() {
            return this.condition;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<String> action; 
            private java.util.Map<String, ?> condition; 
            private String effect; 
            private String resource; 

            private Builder() {
            } 

            private Builder(Statement model) {
                this.action = model.action;
                this.condition = model.condition;
                this.effect = model.effect;
                this.resource = model.resource;
            } 

            /**
             * <p>The operations that are performed on the specified resource.</p>
             */
            public Builder action(java.util.List<String> action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The condition that is required for the policy to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;StringEquals&quot;: {
             *         &quot;acs:Service&quot;: &quot;fc.aliyuncs.com&quot;
             *     }
             * }</p>
             */
            public Builder condition(java.util.Map<String, ?> condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The effect of the statement. Valid values:</p>
             * <ul>
             * <li>Allow</li>
             * <li>Deny</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The objects that the statement covers. An asterisk (*) indicates all resources.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Statement build() {
                return new Statement(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplatePolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statement")
        private java.util.List<Statement> statement;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Policy(Builder builder) {
            this.statement = builder.statement;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return statement
         */
        public java.util.List<Statement> getStatement() {
            return this.statement;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<Statement> statement; 
            private String version; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.statement = model.statement;
                this.version = model.version;
            } 

            /**
             * <p>The statements that are contained in the policy.</p>
             */
            public Builder statement(java.util.List<Statement> statement) {
                this.statement = statement;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplatePolicyResponseBody</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("RelatedProperties")
        private java.util.List<String> relatedProperties;

        @com.aliyun.core.annotation.NameInMap("RequirementLevel")
        private String requirementLevel;

        private Functions(Builder builder) {
            this.function = builder.function;
            this.operationType = builder.operationType;
            this.relatedProperties = builder.relatedProperties;
            this.requirementLevel = builder.requirementLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return relatedProperties
         */
        public java.util.List<String> getRelatedProperties() {
            return this.relatedProperties;
        }

        /**
         * @return requirementLevel
         */
        public String getRequirementLevel() {
            return this.requirementLevel;
        }

        public static final class Builder {
            private String function; 
            private String operationType; 
            private java.util.List<String> relatedProperties; 
            private String requirementLevel; 

            private Builder() {
            } 

            private Builder(Functions model) {
                this.function = model.function;
                this.operationType = model.operationType;
                this.relatedProperties = model.relatedProperties;
                this.requirementLevel = model.requirementLevel;
            } 

            /**
             * Function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * RelatedProperties.
             */
            public Builder relatedProperties(java.util.List<String> relatedProperties) {
                this.relatedProperties = relatedProperties;
                return this;
            }

            /**
             * RequirementLevel.
             */
            public Builder requirementLevel(String requirementLevel) {
                this.requirementLevel = requirementLevel;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplatePolicyResponseBody</p>
     */
    public static class ActionPolicyFunctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Functions")
        private java.util.List<Functions> functions;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ActionPolicyFunctions(Builder builder) {
            this.functions = builder.functions;
            this.logicalResourceId = builder.logicalResourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionPolicyFunctions create() {
            return builder().build();
        }

        /**
         * @return functions
         */
        public java.util.List<Functions> getFunctions() {
            return this.functions;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<Functions> functions; 
            private String logicalResourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ActionPolicyFunctions model) {
                this.functions = model.functions;
                this.logicalResourceId = model.logicalResourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * Functions.
             */
            public Builder functions(java.util.List<Functions> functions) {
                this.functions = functions;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ActionPolicyFunctions build() {
                return new ActionPolicyFunctions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplatePolicyResponseBody</p>
     */
    public static class PolicyFunctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionPolicyFunctions")
        private java.util.List<ActionPolicyFunctions> actionPolicyFunctions;

        @com.aliyun.core.annotation.NameInMap("RequirementLevel")
        private String requirementLevel;

        private PolicyFunctions(Builder builder) {
            this.action = builder.action;
            this.actionPolicyFunctions = builder.actionPolicyFunctions;
            this.requirementLevel = builder.requirementLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyFunctions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionPolicyFunctions
         */
        public java.util.List<ActionPolicyFunctions> getActionPolicyFunctions() {
            return this.actionPolicyFunctions;
        }

        /**
         * @return requirementLevel
         */
        public String getRequirementLevel() {
            return this.requirementLevel;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<ActionPolicyFunctions> actionPolicyFunctions; 
            private String requirementLevel; 

            private Builder() {
            } 

            private Builder(PolicyFunctions model) {
                this.action = model.action;
                this.actionPolicyFunctions = model.actionPolicyFunctions;
                this.requirementLevel = model.requirementLevel;
            } 

            /**
             * <p>The operations that are performed on the specified resource.</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionPolicyFunctions.
             */
            public Builder actionPolicyFunctions(java.util.List<ActionPolicyFunctions> actionPolicyFunctions) {
                this.actionPolicyFunctions = actionPolicyFunctions;
                return this;
            }

            /**
             * RequirementLevel.
             */
            public Builder requirementLevel(String requirementLevel) {
                this.requirementLevel = requirementLevel;
                return this;
            }

            public PolicyFunctions build() {
                return new PolicyFunctions(this);
            } 

        } 

    }
}
