// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C43CA30F-EF67-51BB-8C95-F31B8303****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the system defense rules.</p>
         */
        public Builder ruleList(java.util.List < RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public ListSystemClientRulesResponseBody build() {
            return new ListSystemClientRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemClientRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemClientRulesResponseBody</p>
     */
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
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
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
    /**
     * 
     * {@link ListSystemClientRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemClientRulesResponseBody</p>
     */
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
             * <p>The policy key.</p>
             * 
             * <strong>example:</strong>
             * <p>system_auto_****</p>
             */
            public Builder policyKey(String policyKey) {
                this.policyKey = policyKey;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>System self-starting task****</p>
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
    /**
     * 
     * {@link ListSystemClientRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemClientRulesResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("SwitchEnable")
        private Boolean switchEnable;

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
            this.switchEnable = builder.switchEnable;
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
         * @return switchEnable
         */
        public Boolean getSwitchEnable() {
            return this.switchEnable;
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
            private Boolean switchEnable; 
            private String switchId; 

            /**
             * <p>The name of the aggregation type for the system defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial entry</p>
             */
            public Builder aggregationName(String aggregationName) {
                this.aggregationName = aggregationName;
                return this;
            }

            /**
             * <p>The description of the system defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Supports alerting or blocking of images that have high-risk vulnerabilities****</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the OS. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows</li>
             * <li><strong>linux</strong>: Linux</li>
             * <li><strong>all</strong>: all types</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>An array that consists of policies.</p>
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The ID of the system defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>30****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the system defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Rule****</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the system defense rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: alihips, process-specific defense</li>
             * <li><strong>2</strong>: alinet, network-specific defense</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alihips</p>
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The status of the system defense rule. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: enabled</li>
             * <li><strong>offline</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Whether the current rule switch takes effect. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder switchEnable(Boolean switchEnable) {
                this.switchEnable = switchEnable;
                return this;
            }

            /**
             * <p>The switch ID of the system defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>USER-ENABLE-SWITCH-TYPE_****</p>
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
