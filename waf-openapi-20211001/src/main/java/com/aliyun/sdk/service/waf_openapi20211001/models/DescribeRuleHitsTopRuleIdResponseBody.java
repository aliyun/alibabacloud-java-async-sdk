// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopRuleIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopRuleIdResponseBody</p>
 */
public class DescribeRuleHitsTopRuleIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleHitsTopRuleId")
    private java.util.List < RuleHitsTopRuleId> ruleHitsTopRuleId;

    private DescribeRuleHitsTopRuleIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopRuleId = builder.ruleHitsTopRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopRuleIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopRuleId
     */
    public java.util.List < RuleHitsTopRuleId> getRuleHitsTopRuleId() {
        return this.ruleHitsTopRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopRuleId> ruleHitsTopRuleId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleHitsTopRuleId.
         */
        public Builder ruleHitsTopRuleId(java.util.List < RuleHitsTopRuleId> ruleHitsTopRuleId) {
            this.ruleHitsTopRuleId = ruleHitsTopRuleId;
            return this;
        }

        public DescribeRuleHitsTopRuleIdResponseBody build() {
            return new DescribeRuleHitsTopRuleIdResponseBody(this);
        } 

    } 

    public static class RuleHitsTopRuleId extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RuleId")
        private String ruleId;

        private RuleHitsTopRuleId(Builder builder) {
            this.count = builder.count;
            this.resource = builder.resource;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopRuleId create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Long count; 
            private String resource; 
            private String ruleId; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleHitsTopRuleId build() {
                return new RuleHitsTopRuleId(this);
            } 

        } 

    }
}
