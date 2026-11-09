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
 * {@link DescribeRuleHitsTopTuleTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopTuleTypeResponseBody</p>
 */
public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopTuleType")
    private java.util.List<RuleHitsTopTuleType> ruleHitsTopTuleType;

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
     * @return ruleHitsTopTuleType
     */
    public java.util.List<RuleHitsTopTuleType> getRuleHitsTopTuleType() {
        return this.ruleHitsTopTuleType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleHitsTopTuleType> ruleHitsTopTuleType; 

        private Builder() {
        } 

        private Builder(DescribeRuleHitsTopTuleTypeResponseBody model) {
            this.requestId = model.requestId;
            this.ruleHitsTopTuleType = model.ruleHitsTopTuleType;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>45E377CE-0B04-578E-B653-EEA63CFE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The top 10 protection types with the most rule hits.</p>
         */
        public Builder ruleHitsTopTuleType(java.util.List<RuleHitsTopTuleType> ruleHitsTopTuleType) {
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

            private Builder() {
            } 

            private Builder(RuleHitsTopTuleType model) {
                this.count = model.count;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The number of requests that hit the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>698455</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the rule hit by the protected object. By default, this parameter is not returned, which indicates that all rules are displayed. Valid values:</p>
             * <ul>
             * <li><p><strong>waf</strong>: basic protection rule.</p>
             * </li>
             * <li><p><strong>blacklist</strong>: IP blacklist.</p>
             * </li>
             * <li><p><strong>custom</strong>: custom rule.</p>
             * </li>
             * <li><p><strong>antiscan</strong>: scan protection rule.</p>
             * </li>
             * <li><p><strong>cc_system</strong>: HTTP flood protection rule.</p>
             * </li>
             * <li><p><strong>region_block</strong>: area blocking.</p>
             * </li>
             * <li><p><strong>scene</strong>: bot management.</p>
             * </li>
             * <li><p><strong>dlp</strong>: data leak prevention.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blacklist</p>
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
