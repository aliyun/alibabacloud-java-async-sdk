// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafPoliciesResponseBody</p>
 */
public class DescribeDcdnWafPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List < Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnWafPoliciesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafPoliciesResponseBody create() {
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
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < Policies> policies; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page. Valid values: **1** to **100000**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of protection policies returned per page. Valid values: an integer from **1** to **500**. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information about protection policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of protection policies.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafPoliciesResponseBody build() {
            return new DescribeDcdnWafPoliciesResponseBody(this);
        } 

    } 

    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Integer domainCount;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Long ruleCount;

        private Policies(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.domainCount = builder.domainCount;
            this.gmtModified = builder.gmtModified;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.policyType = builder.policyType;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return domainCount
         */
        public Integer getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String defenseScene; 
            private Integer domainCount; 
            private String gmtModified; 
            private Long policyId; 
            private String policyName; 
            private String policyStatus; 
            private String policyType; 
            private Long ruleCount; 

            /**
             * The type of the protection policy, which is the same as the DefenseScenes field in the QueryArgs parameter.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * The number of domain names that use the protection policy.
             */
            public Builder domainCount(Integer domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * The time when the protection policy was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the protection policy.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the protection policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The status of the protection policy, which is the same as the PolicyStatus field in the QueryArgs parameter.
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * Indicates whether this protection policy is the default policy, which is the same as the PolicyType field in the QueryArgs parameter.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The number of protection rules in the protection policy.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
