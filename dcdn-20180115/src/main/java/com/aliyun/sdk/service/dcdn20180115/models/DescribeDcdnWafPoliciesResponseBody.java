// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number of the returned page. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of protection policies returned per page. Valid values: an integer from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about protection policies.</p>
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>153ca2cd-3c01-44be-2e83-64dbc6c88630</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of protection policies.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafPoliciesResponseBody build() {
            return new DescribeDcdnWafPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafPoliciesResponseBody</p>
     */
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
             * <p>The type of the protection policy, which is the same as the DefenseScenes field in the QueryArgs parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_acl</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The number of domain names that use the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder domainCount(Integer domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * <p>The time when the protection policy was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-29T17:08:45Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>policy_test</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The status of the protection policy, which is the same as the PolicyStatus field in the QueryArgs parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>Indicates whether this protection policy is the default policy, which is the same as the PolicyType field in the QueryArgs parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The number of protection rules in the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
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
