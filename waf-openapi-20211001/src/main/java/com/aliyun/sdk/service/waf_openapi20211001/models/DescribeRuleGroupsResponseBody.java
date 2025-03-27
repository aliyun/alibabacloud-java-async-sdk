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
 * {@link DescribeRuleGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponseBody</p>
 */
public class DescribeRuleGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleGroups")
    private java.util.List<RuleGroups> ruleGroups;

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
     * @return ruleGroups
     */
    public java.util.List<RuleGroups> getRuleGroups() {
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
        private java.util.List<RuleGroups> ruleGroups; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRuleGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.ruleGroups = model.ruleGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>02E9A4B8-90FB-5F41-A049-C82277EB82FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of regular expression rule groups.</p>
         */
        public Builder ruleGroups(java.util.List<RuleGroups> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRuleGroupsResponseBody build() {
            return new DescribeRuleGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleGroupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RuleGroups model) {
                this.gmtModified = model.gmtModified;
                this.isSubscribe = model.isSubscribe;
                this.parentRuleGroupId = model.parentRuleGroupId;
                this.ruleGroupId = model.ruleGroupId;
                this.ruleGroupName = model.ruleGroupName;
                this.ruleTotalCount = model.ruleTotalCount;
            } 

            /**
             * <p>The most recent time when the rule group was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1664336364000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the automatic update feature is enabled for the rule group.</p>
             * <ul>
             * <li>1: The automatic update feature is enabled for the rule group.</li>
             * <li>2: The automatic update feature is disabled for the rule group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isSubscribe(Integer isSubscribe) {
                this.isSubscribe = isSubscribe;
                return this;
            }

            /**
             * <p>The ID of the rule group.</p>
             * <ul>
             * <li>0: The rule group is created from scratch.</li>
             * <li>1011: The rule group is a strict rule group.</li>
             * <li>1012: The rule group is a medium rule group.</li>
             * <li>1013: The rue group is a loose rule group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1012</p>
             */
            public Builder parentRuleGroupId(Long parentRuleGroupId) {
                this.parentRuleGroupId = parentRuleGroupId;
                return this;
            }

            /**
             * <p>The ID of the regular expression rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>115361</p>
             */
            public Builder ruleGroupId(Long ruleGroupId) {
                this.ruleGroupId = ruleGroupId;
                return this;
            }

            /**
             * <p>The name of the rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>ssssss</p>
             */
            public Builder ruleGroupName(String ruleGroupName) {
                this.ruleGroupName = ruleGroupName;
                return this;
            }

            /**
             * <p>The number of built-in rules in the rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>4444</p>
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
