// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingRulesResponseBody</p>
 */
public class DescribeScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingRules")
    private ScalingRules scalingRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingRules = builder.scalingRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingRules
     */
    public ScalingRules getScalingRules() {
        return this.scalingRules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private ScalingRules scalingRules; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingRules.
         */
        public Builder scalingRules(ScalingRules scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingRulesResponseBody build() {
            return new DescribeScalingRulesResponseBody(this);
        } 

    } 

    public static class ScalingRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjustmentType")
        private String adjustmentType;

        @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @com.aliyun.core.annotation.NameInMap("Cooldown")
        private Integer cooldown;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleAri")
        private String scalingRuleAri;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
        private String scalingRuleId;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
        private String scalingRuleName;

        private ScalingRule(Builder builder) {
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.cooldown = builder.cooldown;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingRuleAri = builder.scalingRuleAri;
            this.scalingRuleId = builder.scalingRuleId;
            this.scalingRuleName = builder.scalingRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRule create() {
            return builder().build();
        }

        /**
         * @return adjustmentType
         */
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        /**
         * @return adjustmentValue
         */
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        /**
         * @return cooldown
         */
        public Integer getCooldown() {
            return this.cooldown;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingRuleAri
         */
        public String getScalingRuleAri() {
            return this.scalingRuleAri;
        }

        /**
         * @return scalingRuleId
         */
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        /**
         * @return scalingRuleName
         */
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public static final class Builder {
            private String adjustmentType; 
            private Integer adjustmentValue; 
            private Integer cooldown; 
            private Integer maxSize; 
            private Integer minSize; 
            private String scalingGroupId; 
            private String scalingRuleAri; 
            private String scalingRuleId; 
            private String scalingRuleName; 

            /**
             * AdjustmentType.
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * AdjustmentValue.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * Cooldown.
             */
            public Builder cooldown(Integer cooldown) {
                this.cooldown = cooldown;
                return this;
            }

            /**
             * MaxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MinSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * ScalingRuleAri.
             */
            public Builder scalingRuleAri(String scalingRuleAri) {
                this.scalingRuleAri = scalingRuleAri;
                return this;
            }

            /**
             * ScalingRuleId.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * ScalingRuleName.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            public ScalingRule build() {
                return new ScalingRule(this);
            } 

        } 

    }
    public static class ScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScalingRule")
        private java.util.List < ScalingRule> scalingRule;

        private ScalingRules(Builder builder) {
            this.scalingRule = builder.scalingRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRules create() {
            return builder().build();
        }

        /**
         * @return scalingRule
         */
        public java.util.List < ScalingRule> getScalingRule() {
            return this.scalingRule;
        }

        public static final class Builder {
            private java.util.List < ScalingRule> scalingRule; 

            /**
             * ScalingRule.
             */
            public Builder scalingRule(java.util.List < ScalingRule> scalingRule) {
                this.scalingRule = scalingRule;
                return this;
            }

            public ScalingRules build() {
                return new ScalingRules(this);
            } 

        } 

    }
}
