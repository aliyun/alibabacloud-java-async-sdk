// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDispatchRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListDispatchRuleResponseBody</p>
 */
public class ListDispatchRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DispatchRules")
    private java.util.List < DispatchRules> dispatchRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDispatchRuleResponseBody(Builder builder) {
        this.dispatchRules = builder.dispatchRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDispatchRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return dispatchRules
     */
    public java.util.List < DispatchRules> getDispatchRules() {
        return this.dispatchRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DispatchRules> dispatchRules; 
        private String requestId; 

        /**
         * <p>The returned struct.</p>
         */
        public Builder dispatchRules(java.util.List < DispatchRules> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDispatchRuleResponseBody build() {
            return new ListDispatchRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDispatchRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListDispatchRuleResponseBody</p>
     */
    public static class DispatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private DispatchRules(Builder builder) {
            this.name = builder.name;
            this.ruleId = builder.ruleId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DispatchRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String name; 
            private Long ruleId; 
            private String state; 

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10282</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Indicates whether the notification policy is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public DispatchRules build() {
                return new DispatchRules(this);
            } 

        } 

    }
}
