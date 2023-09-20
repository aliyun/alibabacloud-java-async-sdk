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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The top 10 protection modules that are matched.
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
             * The number of requests that match protection rules.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The type of rule that is matched. By default, this parameter is not returned. This indicates that all types of rules that are matched are returned.
             * <p>
             * 
             * *   **waf:** basic protection rules.
             * *   **blacklist:** IP address blacklist rules.
             * *   **custom:** custom rules.
             * *   **antiscan:** scan protection rules.
             * *   **cc_system:** HTTP flood protection rules.
             * *   **region_block:** region blacklist rules.
             * *   **scene:** bot management rules.
             * *   **dlp:** data leakage prevention rules.
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
