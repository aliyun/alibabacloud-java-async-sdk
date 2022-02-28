// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateTemplatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTemplatePolicyResponseBody</p>
 */
public class GenerateTemplatePolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    private Policy policy;

    @NameInMap("RequestId")
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
         * Policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateTemplatePolicyResponseBody build() {
            return new GenerateTemplatePolicyResponseBody(this);
        } 

    } 

    public static class Statement extends TeaModel {
        @NameInMap("Action")
        private java.util.List < String > action;

        @NameInMap("Effect")
        private String effect;

        @NameInMap("Resource")
        private String resource;

        private Statement(Builder builder) {
            this.action = builder.action;
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
            private String effect; 
            private String resource; 

            /**
             * Action.
             */
            public Builder action(java.util.List < String > action) {
                this.action = action;
                return this;
            }

            /**
             * Effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * Resource.
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
    public static class Policy extends TeaModel {
        @NameInMap("Statement")
        private java.util.List < Statement> statement;

        @NameInMap("Version")
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
             * Statement.
             */
            public Builder statement(java.util.List < Statement> statement) {
                this.statement = statement;
                return this;
            }

            /**
             * Version.
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
