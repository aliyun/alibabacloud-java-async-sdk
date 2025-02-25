// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafRulesResponseBody</p>
 */
public class DescribeDcdnWafRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnWafRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafRulesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
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
        private String requestId; 
        private java.util.List < Rules> rules; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of protection rules returned per page. The value of this parameter is the same as that of the PageSize parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>The information about the protection rule.</p>
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of protection rules.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafRulesResponseBody build() {
            return new DescribeDcdnWafRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
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

        private Rules(Builder builder) {
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

        public static Rules create() {
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
             * <p>The type of the protection policy. The value of this parameter is the same as that of the DefenseScene field in QueryArgst.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_acl</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The time when the protection policy was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
             * <p>The configuration information about the protection rule.</p>
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
             * <p>The status of the protection rule. The value of this parameter is the same as that of the RuleStatus field in QueryArgst.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
