// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopClientIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopClientIpResponseBody</p>
 */
public class DescribeRuleHitsTopClientIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopClientIp")
    private java.util.List < RuleHitsTopClientIp> ruleHitsTopClientIp;

    private DescribeRuleHitsTopClientIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopClientIp = builder.ruleHitsTopClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopClientIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopClientIp
     */
    public java.util.List < RuleHitsTopClientIp> getRuleHitsTopClientIp() {
        return this.ruleHitsTopClientIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopClientIp> ruleHitsTopClientIp; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of the top 10 IP addresses from which attacks are initiated.
         */
        public Builder ruleHitsTopClientIp(java.util.List < RuleHitsTopClientIp> ruleHitsTopClientIp) {
            this.ruleHitsTopClientIp = ruleHitsTopClientIp;
            return this;
        }

        public DescribeRuleHitsTopClientIpResponseBody build() {
            return new DescribeRuleHitsTopClientIpResponseBody(this);
        } 

    } 

    public static class RuleHitsTopClientIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private RuleHitsTopClientIp(Builder builder) {
            this.clientIp = builder.clientIp;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopClientIp create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String clientIp; 
            private Long count; 

            /**
             * The IP address of the service client.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The number of attacks that are initiated from the IP address.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public RuleHitsTopClientIp build() {
                return new RuleHitsTopClientIp(this);
            } 

        } 

    }
}
