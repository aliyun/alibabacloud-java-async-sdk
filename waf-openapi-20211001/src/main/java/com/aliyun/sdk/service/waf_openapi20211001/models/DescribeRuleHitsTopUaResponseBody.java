// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopUaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopUaResponseBody</p>
 */
public class DescribeRuleHitsTopUaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHitsTopUa")
    private java.util.List < RuleHitsTopUa> ruleHitsTopUa;

    private DescribeRuleHitsTopUaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopUa = builder.ruleHitsTopUa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopUaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopUa
     */
    public java.util.List < RuleHitsTopUa> getRuleHitsTopUa() {
        return this.ruleHitsTopUa;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopUa> ruleHitsTopUa; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of the top 10 user agents that are used to initiate attacks.
         */
        public Builder ruleHitsTopUa(java.util.List < RuleHitsTopUa> ruleHitsTopUa) {
            this.ruleHitsTopUa = ruleHitsTopUa;
            return this;
        }

        public DescribeRuleHitsTopUaResponseBody build() {
            return new DescribeRuleHitsTopUaResponseBody(this);
        } 

    } 

    public static class RuleHitsTopUa extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Ua")
        private String ua;

        private RuleHitsTopUa(Builder builder) {
            this.count = builder.count;
            this.ua = builder.ua;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopUa create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ua
         */
        public String getUa() {
            return this.ua;
        }

        public static final class Builder {
            private Long count; 
            private String ua; 

            /**
             * The number of attacks that are initiated from the IP address.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The user agent.
             */
            public Builder ua(String ua) {
                this.ua = ua;
                return this;
            }

            public RuleHitsTopUa build() {
                return new RuleHitsTopUa(this);
            } 

        } 

    }
}
