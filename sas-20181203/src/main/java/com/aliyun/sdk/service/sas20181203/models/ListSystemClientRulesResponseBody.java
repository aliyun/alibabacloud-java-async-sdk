// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemClientRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemClientRulesResponseBody</p>
 */
public class ListSystemClientRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleList")
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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * RuleList.
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
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
        @NameInMap("PolicyKey")
        private String policyKey;

        @NameInMap("PolicyName")
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
             * PolicyKey.
             */
            public Builder policyKey(String policyKey) {
                this.policyKey = policyKey;
                return this;
            }

            /**
             * PolicyName.
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
        @NameInMap("AggregationName")
        private String aggregationName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Policies")
        private java.util.List < Policies> policies;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private Integer ruleType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SwitchId")
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
             * AggregationName.
             */
            public Builder aggregationName(String aggregationName) {
                this.aggregationName = aggregationName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Policies.
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchId.
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
