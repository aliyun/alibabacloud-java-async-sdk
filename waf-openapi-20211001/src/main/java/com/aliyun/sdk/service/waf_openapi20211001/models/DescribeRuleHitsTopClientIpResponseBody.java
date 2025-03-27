// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeRuleHitsTopClientIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopClientIpResponseBody</p>
 */
public class DescribeRuleHitsTopClientIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopClientIp")
    private java.util.List<RuleHitsTopClientIp> ruleHitsTopClientIp;

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
     * @return ruleHitsTopClientIp
     */
    public java.util.List<RuleHitsTopClientIp> getRuleHitsTopClientIp() {
        return this.ruleHitsTopClientIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleHitsTopClientIp> ruleHitsTopClientIp; 

        private Builder() {
        } 

        private Builder(DescribeRuleHitsTopClientIpResponseBody model) {
            this.requestId = model.requestId;
            this.ruleHitsTopClientIp = model.ruleHitsTopClientIp;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9F0F9AD6-62E2-50BB-A3E5-30FFB9410262</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 IP addresses from which attacks are initiated.</p>
         */
        public Builder ruleHitsTopClientIp(java.util.List<RuleHitsTopClientIp> ruleHitsTopClientIp) {
            this.ruleHitsTopClientIp = ruleHitsTopClientIp;
            return this;
        }

        public DescribeRuleHitsTopClientIpResponseBody build() {
            return new DescribeRuleHitsTopClientIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleHitsTopClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleHitsTopClientIpResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RuleHitsTopClientIp model) {
                this.clientIp = model.clientIp;
                this.count = model.count;
            } 

            /**
             * <p>The IP address of the service client.</p>
             * 
             * <strong>example:</strong>
             * <p>3.3.XX.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The number of attacks that are initiated from the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>531</p>
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
