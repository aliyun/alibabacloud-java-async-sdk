// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafRuleResponseBody</p>
 */
public class DescribeDcdnWafRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private Rule rule;

    private DescribeDcdnWafRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rule
     */
    public Rule getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private Rule rule; 

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

        /**
         * <p>The information about the protection rule.</p>
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        public DescribeDcdnWafRuleResponseBody build() {
            return new DescribeDcdnWafRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafRuleResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        private Rule(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.gmtModified = builder.gmtModified;
            this.policyId = builder.policyId;
            this.ruleConfig = builder.ruleConfig;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
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
         * @return ruleConfig
         */
        public String getRuleConfig() {
            return this.ruleConfig;
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
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public static final class Builder {
            private String defenseScene; 
            private String gmtModified; 
            private Long policyId; 
            private String ruleConfig; 
            private Long ruleId; 
            private String ruleName; 
            private String ruleStatus; 

            /**
             * <p>The type of the protection policy. Valid values:</p>
             * <ul>
             * <li>waf_group: basic web protection</li>
             * <li>custom_acl: custom protection</li>
             * <li>whitelist: IP address whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom_acl</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The time when the scaling group was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
             * <p>200001</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The configurations of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;action&quot;:&quot;monitor&quot;,&quot;actionExternal&quot;:&quot;{}&quot;,&quot;ccStatus&quot;:1,&quot;conditions&quot;:[{&quot;key&quot;:&quot;URL&quot;,&quot;opValue&quot;:&quot;eq&quot;,&quot;targetKey&quot;:&quot;request_uri&quot;,&quot;values&quot;:&quot;/example&quot;},{&quot;key&quot;:&quot;Header&quot;,&quot;opValue&quot;:&quot;eq&quot;,&quot;subKey&quot;:&quot;trt&quot;,&quot;targetKey&quot;:&quot;header.trt&quot;,&quot;values&quot;:&quot;3333&quot;}],&quot;effect&quot;:&quot;service&quot;,&quot;name&quot;:&quot;aaa333&quot;,&quot;origin&quot;:&quot;custom&quot;,&quot;ratelimit&quot;:{&quot;interval&quot;:5,&quot;status&quot;:{&quot;code&quot;:404,&quot;count&quot;:2,&quot;stat&quot;:{&quot;mode&quot;:&quot;count&quot;,&quot;value&quot;:2.0}},&quot;target&quot;:&quot;remote_addr&quot;,&quot;threshold&quot;:2,&quot;ttl&quot;:1800}}</p>
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * <p>The ID of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the protection rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
}
