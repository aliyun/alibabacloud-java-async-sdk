// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWaitingRoomRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingRoomRulesResponseBody</p>
 */
public class ListWaitingRoomRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomRules")
    private java.util.List<WaitingRoomRules> waitingRoomRules;

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
    public java.util.List<WaitingRoomRules> getWaitingRoomRules() {
        return this.waitingRoomRules;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WaitingRoomRules> waitingRoomRules; 

        /**
         * <p>The request ID, which is used to trace a call.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The waiting room bypass rules.</p>
         */
        public Builder waitingRoomRules(java.util.List<WaitingRoomRules> waitingRoomRules) {
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
             * <p>The rule content, which is a policy or conditional expression.</p>
             * 
             * <strong>example:</strong>
             * <p>(http.request.uri.path.file_name eq &quot;jpg&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Indicates whether the rule is enabled. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>37286782688****</p>
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
