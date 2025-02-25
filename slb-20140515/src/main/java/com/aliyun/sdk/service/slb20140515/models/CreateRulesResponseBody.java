// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRulesResponseBody</p>
 */
public class CreateRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    private CreateRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String requestId; 
        private Rules rules; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The forwarding rules.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        public CreateRulesResponseBody build() {
            return new CreateRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRulesResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Rule(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String ruleId; 
            private String ruleName; 

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-bp12jzy0*****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Rule2</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
