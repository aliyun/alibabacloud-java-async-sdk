// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponseBody</p>
 */
public class DescribeRuleGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleGroups")
    private java.util.List < RuleGroups> ruleGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRuleGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleGroups = builder.ruleGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleGroups
     */
    public java.util.List < RuleGroups> getRuleGroups() {
        return this.ruleGroups;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleGroups> ruleGroups; 
        private Long totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of regular expression rule groups.
         */
        public Builder ruleGroups(java.util.List < RuleGroups> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRuleGroupsResponseBody build() {
            return new DescribeRuleGroupsResponseBody(this);
        } 

    } 

    public static class RuleGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsSubscribe")
        private Integer isSubscribe;

        @com.aliyun.core.annotation.NameInMap("ParentRuleGroupId")
        private Long parentRuleGroupId;

        @com.aliyun.core.annotation.NameInMap("RuleGroupId")
        private Long ruleGroupId;

        @com.aliyun.core.annotation.NameInMap("RuleGroupName")
        private String ruleGroupName;

        @com.aliyun.core.annotation.NameInMap("RuleTotalCount")
        private Integer ruleTotalCount;

        private RuleGroups(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.isSubscribe = builder.isSubscribe;
            this.parentRuleGroupId = builder.parentRuleGroupId;
            this.ruleGroupId = builder.ruleGroupId;
            this.ruleGroupName = builder.ruleGroupName;
            this.ruleTotalCount = builder.ruleTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleGroups create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isSubscribe
         */
        public Integer getIsSubscribe() {
            return this.isSubscribe;
        }

        /**
         * @return parentRuleGroupId
         */
        public Long getParentRuleGroupId() {
            return this.parentRuleGroupId;
        }

        /**
         * @return ruleGroupId
         */
        public Long getRuleGroupId() {
            return this.ruleGroupId;
        }

        /**
         * @return ruleGroupName
         */
        public String getRuleGroupName() {
            return this.ruleGroupName;
        }

        /**
         * @return ruleTotalCount
         */
        public Integer getRuleTotalCount() {
            return this.ruleTotalCount;
        }

        public static final class Builder {
            private Long gmtModified; 
            private Integer isSubscribe; 
            private Long parentRuleGroupId; 
            private Long ruleGroupId; 
            private String ruleGroupName; 
            private Integer ruleTotalCount; 

            /**
             * The most recent time when the rule group was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the automatic update feature is enabled for the rule group.
             * <p>
             * 
             * *   1: The automatic update feature is enabled for the rule group.
             * *   2: The automatic update feature is disabled for the rule group.
             */
            public Builder isSubscribe(Integer isSubscribe) {
                this.isSubscribe = isSubscribe;
                return this;
            }

            /**
             * The ID of the rule group.
             * <p>
             * 
             * *   0: The rule group is created from scratch.
             * *   1011: The rule group is a strict rule group.
             * *   1012: The rule group is a medium rule group.
             * *   1013: The rue group is a loose rule group.
             */
            public Builder parentRuleGroupId(Long parentRuleGroupId) {
                this.parentRuleGroupId = parentRuleGroupId;
                return this;
            }

            /**
             * The ID of the regular expression rule group.
             */
            public Builder ruleGroupId(Long ruleGroupId) {
                this.ruleGroupId = ruleGroupId;
                return this;
            }

            /**
             * The name of the rule group.
             */
            public Builder ruleGroupName(String ruleGroupName) {
                this.ruleGroupName = ruleGroupName;
                return this;
            }

            /**
             * The number of built-in rules in the rule group.
             */
            public Builder ruleTotalCount(Integer ruleTotalCount) {
                this.ruleTotalCount = ruleTotalCount;
                return this;
            }

            public RuleGroups build() {
                return new RuleGroups(this);
            } 

        } 

    }
}
