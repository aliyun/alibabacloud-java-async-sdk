// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopTuleTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopTuleTypeResponseBody</p>
 */
public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHitsTopTuleType")
    private java.util.List < RuleHitsTopTuleType> ruleHitsTopTuleType;

    private DescribeRuleHitsTopTuleTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopTuleType = builder.ruleHitsTopTuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopTuleTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopTuleType
     */
    public java.util.List < RuleHitsTopTuleType> getRuleHitsTopTuleType() {
        return this.ruleHitsTopTuleType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopTuleType> ruleHitsTopTuleType; 

        /**
         * The number of requests that match the rules of the protection module.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of rules. For details, see the description of **RuleType** in [DescribeRuleHitsTopRuleId](~~DescribeRuleHitsTopRuleId~~).
         */
        public Builder ruleHitsTopTuleType(java.util.List < RuleHitsTopTuleType> ruleHitsTopTuleType) {
            this.ruleHitsTopTuleType = ruleHitsTopTuleType;
            return this;
        }

        public DescribeRuleHitsTopTuleTypeResponseBody build() {
            return new DescribeRuleHitsTopTuleTypeResponseBody(this);
        } 

    } 

    public static class RuleHitsTopTuleType extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("RuleType")
        private String ruleType;

        private RuleHitsTopTuleType(Builder builder) {
            this.count = builder.count;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopTuleType create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private Long count; 
            private String ruleType; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public RuleHitsTopTuleType build() {
                return new RuleHitsTopTuleType(this);
            } 

        } 

    }
}
