// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemClientRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemClientRulesResponseBody</p>
 */
public class ListSystemClientRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List < RuleList> ruleList;

    private ListSystemClientRulesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemClientRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List < RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < RuleList> ruleList; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the system defense rules.
         */
        public Builder ruleList(java.util.List < RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public ListSystemClientRulesResponseBody build() {
            return new ListSystemClientRulesResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyKey")
        private String policyKey;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private Policies(Builder builder) {
            this.policyKey = builder.policyKey;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return policyKey
         */
        public String getPolicyKey() {
            return this.policyKey;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String policyKey; 
            private String policyName; 

            /**
             * The policy key.
             */
            public Builder policyKey(String policyKey) {
                this.policyKey = policyKey;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregationName")
        private String aggregationName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List < Policies> policies;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private RuleList(Builder builder) {
            this.aggregationName = builder.aggregationName;
            this.description = builder.description;
            this.platform = builder.platform;
            this.policies = builder.policies;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.status = builder.status;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return aggregationName
         */
        public String getAggregationName() {
            return this.aggregationName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return policies
         */
        public java.util.List < Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private String aggregationName; 
            private String description; 
            private String platform; 
            private java.util.List < Policies> policies; 
            private Long ruleId; 
            private String ruleName; 
            private Integer ruleType; 
            private Integer status; 
            private String switchId; 

            /**
             * The name of the aggregation type for the system defense rule.
             */
            public Builder aggregationName(String aggregationName) {
                this.aggregationName = aggregationName;
                return this;
            }

            /**
             * The description of the system defense rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The type of the OS. Valid values:
             * <p>
             * 
             * *   **windows**: Windows
             * *   **linux**: Linux
             * *   **all**: all types
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * An array that consists of policies.
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * The ID of the system defense rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the system defense rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the system defense rule. Valid values:
             * <p>
             * 
             * *   **1**: alihips
             * *   **2**: alinet
             * *   **3**: alidetect
             * *   **4**: alisecguard
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The status of the system defense rule. Valid values:
             * <p>
             * 
             * *   **online**: enabled
             * *   **offline**: disabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The switch ID of the system defense rule.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}
