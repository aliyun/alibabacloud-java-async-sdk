// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateTemplatePolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplatePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        /**
         * <p>The information about the policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
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
        private java.util.List < String > action;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private java.util.Map < String, ? > condition;

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
        public java.util.List < String > getAction() {
            return this.action;
        }

        /**
         * @return condition
         */
        public java.util.Map < String, ? > getCondition() {
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
            private java.util.List < String > action; 
            private java.util.Map < String, ? > condition; 
            private String effect; 
            private String resource; 

            /**
             * <p>The operations that are performed on the specified resource.</p>
             */
            public Builder action(java.util.List < String > action) {
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
            public Builder condition(java.util.Map < String, ? > condition) {
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
        private java.util.List < Statement> statement;

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
        public java.util.List < Statement> getStatement() {
            return this.statement;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List < Statement> statement; 
            private String version; 

            /**
             * <p>The statements that are contained in the policy.</p>
             */
            public Builder statement(java.util.List < Statement> statement) {
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
}
