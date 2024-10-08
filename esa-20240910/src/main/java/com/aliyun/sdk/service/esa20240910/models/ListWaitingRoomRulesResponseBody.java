// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWaitingRoomRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingRoomRulesResponseBody</p>
 */
public class ListWaitingRoomRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomRules")
    private java.util.List < WaitingRoomRules> waitingRoomRules;

    private ListWaitingRoomRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRoomRules = builder.waitingRoomRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitingRoomRules
     */
    public java.util.List < WaitingRoomRules> getWaitingRoomRules() {
        return this.waitingRoomRules;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WaitingRoomRules> waitingRoomRules; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaitingRoomRules.
         */
        public Builder waitingRoomRules(java.util.List < WaitingRoomRules> waitingRoomRules) {
            this.waitingRoomRules = waitingRoomRules;
            return this;
        }

        public ListWaitingRoomRulesResponseBody build() {
            return new ListWaitingRoomRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWaitingRoomRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingRoomRulesResponseBody</p>
     */
    public static class WaitingRoomRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("WaitingRoomRuleId")
        private Long waitingRoomRuleId;

        private WaitingRoomRules(Builder builder) {
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.waitingRoomRuleId = builder.waitingRoomRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaitingRoomRules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return ruleEnable
         */
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return waitingRoomRuleId
         */
        public Long getWaitingRoomRuleId() {
            return this.waitingRoomRuleId;
        }

        public static final class Builder {
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Long waitingRoomRuleId; 

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * RuleEnable.
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * WaitingRoomRuleId.
             */
            public Builder waitingRoomRuleId(Long waitingRoomRuleId) {
                this.waitingRoomRuleId = waitingRoomRuleId;
                return this;
            }

            public WaitingRoomRules build() {
                return new WaitingRoomRules(this);
            } 

        } 

    }
}
