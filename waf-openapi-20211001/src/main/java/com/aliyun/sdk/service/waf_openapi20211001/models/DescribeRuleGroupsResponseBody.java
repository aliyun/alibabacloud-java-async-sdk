// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponseBody</p>
 */
public class DescribeRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleGroups")
    private java.util.List < RuleGroups> ruleGroups;

    @NameInMap("TotalCount")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleGroups.
         */
        public Builder ruleGroups(java.util.List < RuleGroups> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("RuleGroupId")
        private Long ruleGroupId;

        @NameInMap("RuleGroupName")
        private String ruleGroupName;

        @NameInMap("RuleTotalCount")
        private Integer ruleTotalCount;

        private RuleGroups(Builder builder) {
            this.gmtModified = builder.gmtModified;
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
            private Long ruleGroupId; 
            private String ruleGroupName; 
            private Integer ruleTotalCount; 

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * RuleGroupId.
             */
            public Builder ruleGroupId(Long ruleGroupId) {
                this.ruleGroupId = ruleGroupId;
                return this;
            }

            /**
             * RuleGroupName.
             */
            public Builder ruleGroupName(String ruleGroupName) {
                this.ruleGroupName = ruleGroupName;
                return this;
            }

            /**
             * RuleTotalCount.
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
