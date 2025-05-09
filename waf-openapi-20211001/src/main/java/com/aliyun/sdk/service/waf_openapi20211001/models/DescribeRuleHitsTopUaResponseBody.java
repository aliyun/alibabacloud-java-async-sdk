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
 * {@link DescribeRuleHitsTopUaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopUaResponseBody</p>
 */
public class DescribeRuleHitsTopUaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopUa")
    private java.util.List<RuleHitsTopUa> ruleHitsTopUa;

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
     * @return ruleHitsTopUa
     */
    public java.util.List<RuleHitsTopUa> getRuleHitsTopUa() {
        return this.ruleHitsTopUa;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleHitsTopUa> ruleHitsTopUa; 

        private Builder() {
        } 

        private Builder(DescribeRuleHitsTopUaResponseBody model) {
            this.requestId = model.requestId;
            this.ruleHitsTopUa = model.ruleHitsTopUa;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8E5C7ED7-503A-5986-A005-36F2511EB89F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 user agents that are used to initiate attacks.</p>
         */
        public Builder ruleHitsTopUa(java.util.List<RuleHitsTopUa> ruleHitsTopUa) {
            this.ruleHitsTopUa = ruleHitsTopUa;
            return this;
        }

        public DescribeRuleHitsTopUaResponseBody build() {
            return new DescribeRuleHitsTopUaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleHitsTopUaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleHitsTopUaResponseBody</p>
     */
    public static class RuleHitsTopUa extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Ua")
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

            private Builder() {
            } 

            private Builder(RuleHitsTopUa model) {
                this.count = model.count;
                this.ua = model.ua;
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

            /**
             * <p>The user agent.</p>
             * 
             * <strong>example:</strong>
             * <p>android</p>
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
