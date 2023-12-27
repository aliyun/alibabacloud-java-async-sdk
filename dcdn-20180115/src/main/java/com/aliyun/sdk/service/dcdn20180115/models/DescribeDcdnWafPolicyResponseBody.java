// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafPolicyResponseBody</p>
 */
public class DescribeDcdnWafPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    private Policy policy;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        /**
         * The information about the protection policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafPolicyResponseBody build() {
            return new DescribeDcdnWafPolicyResponseBody(this);
        } 

    } 

    public static class Policy extends TeaModel {
        @NameInMap("DefenseScene")
        private String defenseScene;

        @NameInMap("DomainCount")
        private Integer domainCount;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyStatus")
        private String policyStatus;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("RuleConfigs")
        private String ruleConfigs;

        @NameInMap("RuleCount")
        private Long ruleCount;

        private Policy(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.domainCount = builder.domainCount;
            this.gmtModified = builder.gmtModified;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.policyType = builder.policyType;
            this.ruleConfigs = builder.ruleConfigs;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
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
         * @return ruleConfigs
         */
        public String getRuleConfigs() {
            return this.ruleConfigs;
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
            private String ruleConfigs; 
            private Long ruleCount; 

            /**
             * The type of the protection policy. Valid values:
             * <p>
             * 
             * *   waf_group: basic web protection
             * *   custom_acl: custom protection
             * *   whitelist: whitelist
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
             * The status of the protection policy. Valid values:
             * <p>
             * 
             * *   on
             * *   off
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * Indicates whether the current policy is the default policy. Valid values:
             * <p>
             * 
             * *   default
             * *   custom
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The protection rule configurations corresponding to the protection policy. The configurations only support Bot management. For more information, see [BatchCreateDcdnWafRules](~~BatchCreateDcdnWafRules~~).
             */
            public Builder ruleConfigs(String ruleConfigs) {
                this.ruleConfigs = ruleConfigs;
                return this;
            }

            /**
             * The number of protection rules in the protection policy.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
