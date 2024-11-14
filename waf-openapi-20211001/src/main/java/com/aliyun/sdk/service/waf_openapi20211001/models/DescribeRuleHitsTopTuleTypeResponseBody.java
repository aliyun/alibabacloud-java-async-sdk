// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRuleHitsTopTuleTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopTuleTypeResponseBody</p>
 */
public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopTuleType")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>45E377CE-0B04-578E-B653-EEA63CFE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The top 10 protection modules that are matched.</p>
         */
        public Builder ruleHitsTopTuleType(java.util.List < RuleHitsTopTuleType> ruleHitsTopTuleType) {
            this.ruleHitsTopTuleType = ruleHitsTopTuleType;
            return this;
        }

        public DescribeRuleHitsTopTuleTypeResponseBody build() {
            return new DescribeRuleHitsTopTuleTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleHitsTopTuleTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleHitsTopTuleTypeResponseBody</p>
     */
    public static class RuleHitsTopTuleType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RuleType")
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
             * <p>The number of requests that match protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>698455</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of rule that is matched. By default, this parameter is not returned. This indicates that all types of rules that are matched are returned.</p>
             * <ul>
             * <li><strong>waf:</strong> basic protection rules.</li>
             * <li><strong>blacklist:</strong> IP address blacklist rules.</li>
             * <li><strong>custom:</strong> custom rules.</li>
             * <li><strong>antiscan:</strong> scan protection rules.</li>
             * <li><strong>cc_system:</strong> HTTP flood protection rules.</li>
             * <li><strong>region_block:</strong> region blacklist rules.</li>
             * <li><strong>scene:</strong> bot management rules.</li>
             * <li><strong>dlp:</strong> data leakage prevention rules.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cc_system</p>
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
