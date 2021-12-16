// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RoutingRule} extends {@link TeaModel}
 *
 * <p>RoutingRule</p>
 */
public class RoutingRule extends TeaModel {
    @NameInMap("Condition")
    private RoutingRuleCondition condition;

    @NameInMap("Redirect")
    private RoutingRuleRedirect redirect;

    @NameInMap("RuleNumber")
    private Long ruleNumber;


    private RoutingRule(Builder builder) {
        this.condition = builder.condition;
        this.redirect = builder.redirect;
        this.ruleNumber = builder.ruleNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutingRule create() {
        return builder().build();
    }

    /**
     * @return condition
     */
    public RoutingRuleCondition getCondition() {
        return this.condition;
    }

    /**
     * @return redirect
     */
    public RoutingRuleRedirect getRedirect() {
        return this.redirect;
    }

    /**
     * @return ruleNumber
     */
    public Long getRuleNumber() {
        return this.ruleNumber;
    }

    public static final class Builder {
        private RoutingRuleCondition condition; 
        private RoutingRuleRedirect redirect; 
        private Long ruleNumber; 

        /**
         * <p>description</p>
         */
        public Builder condition(RoutingRuleCondition condition) {
            this.condition = condition;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder redirect(RoutingRuleRedirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder ruleNumber(Long ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }

        public RoutingRule build() {
            return new RoutingRule(this);
        } 

    } 

}
