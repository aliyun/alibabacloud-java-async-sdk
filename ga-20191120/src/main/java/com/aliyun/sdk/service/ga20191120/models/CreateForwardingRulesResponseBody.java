// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateForwardingRulesResponseBody</p>
 */
public class CreateForwardingRulesResponseBody extends TeaModel {
    @NameInMap("ForwardingRules")
    private java.util.List < ForwardingRules> forwardingRules;

    @NameInMap("RequestId")
    private String requestId;

    private CreateForwardingRulesResponseBody(Builder builder) {
        this.forwardingRules = builder.forwardingRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardingRules
     */
    public java.util.List < ForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ForwardingRules> forwardingRules; 
        private String requestId; 

        /**
         * ForwardingRules.
         */
        public Builder forwardingRules(java.util.List < ForwardingRules> forwardingRules) {
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateForwardingRulesResponseBody build() {
            return new CreateForwardingRulesResponseBody(this);
        } 

    } 

    public static class ForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleId")
        private String forwardingRuleId;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleId = builder.forwardingRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardingRules create() {
            return builder().build();
        }

        /**
         * @return forwardingRuleId
         */
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public static final class Builder {
            private String forwardingRuleId; 

            /**
             * ForwardingRuleId.
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
