// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafPolicyResponseBody</p>
 */
public class DescribeDcdnWafPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the protection policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafPolicyResponseBody build() {
            return new DescribeDcdnWafPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RuleConfigs")
        private String ruleConfigs;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
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
             * <p>The type of the protection policy. Valid values:</p>
             * <ul>
             * <li>waf_group: basic web protection</li>
             * <li>custom_acl: custom protection</li>
             * <li>whitelist: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
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
             * <p>The status of the protection policy. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>Indicates whether the current policy is the default policy. Valid values:</p>
             * <ul>
             * <li>default</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The protection rule configurations corresponding to the protection policy. The configurations only support Bot management. For more information, see <a href="~~BatchCreateDcdnWafRules~~">BatchCreateDcdnWafRules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;type&quot;:&quot;target_type&quot;,     &quot;status&quot;:&quot;on&quot;,     &quot;config&quot;:{&quot;target&quot;:&quot;app&quot;},     &quot;action&quot;:&quot;&quot;   }</p>
             */
            public Builder ruleConfigs(String ruleConfigs) {
                this.ruleConfigs = ruleConfigs;
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

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
