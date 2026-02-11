// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link ListDispatchRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListDispatchRuleResponseBody</p>
 */
public class ListDispatchRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DispatchRules")
    private java.util.List<DispatchRules> dispatchRules;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchRules
     */
    public java.util.List<DispatchRules> getDispatchRules() {
        return this.dispatchRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DispatchRules> dispatchRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDispatchRuleResponseBody model) {
            this.dispatchRules = model.dispatchRules;
            this.requestId = model.requestId;
        } 

        /**
         * DispatchRules.
         */
        public Builder dispatchRules(java.util.List<DispatchRules> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }

        /**
         * RequestId.
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

            private Builder() {
            } 

            private Builder(DispatchRules model) {
                this.name = model.name;
                this.ruleId = model.ruleId;
                this.state = model.state;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * State.
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
