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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListWaitingRoomRulesResponseBody model) {
            this.requestId = model.requestId;
            this.waitingRoomRules = model.waitingRoomRules;
        } 

        /**
         * <p>Request ID, used for tracking the call status.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of waiting room bypass rules.</p>
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

            private Builder() {
            } 

            private Builder(WaitingRoomRules model) {
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.waitingRoomRuleId = model.waitingRoomRuleId;
            } 

            /**
             * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding global configuration. There are two usage scenarios:</p>
             * <ul>
             * <li>Match all incoming requests: set the value to true</li>
             * <li>Match specific requests: set the value to a custom expression, e.g., (http.host eq &quot;video.example.com&quot;)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(http.request.uri.path.file_name eq &quot;jpg&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Rule switch. This parameter does not need to be set when adding global configuration. Value range:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
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
             * <p>Rule name. This parameter does not need to be set when adding global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Rule ID.</p>
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
