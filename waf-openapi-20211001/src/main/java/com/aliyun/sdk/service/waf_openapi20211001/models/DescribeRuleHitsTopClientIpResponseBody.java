// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopClientIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopClientIpResponseBody</p>
 */
public class DescribeRuleHitsTopClientIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHitsTopClientIp")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleHitsTopClientIp.
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
        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("Count")
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
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * Count.
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
