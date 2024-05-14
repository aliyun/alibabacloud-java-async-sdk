// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsSubscribe")
    private Long isSubscribe;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleGroupName")
    private String ruleGroupName;

    @com.aliyun.core.annotation.NameInMap("RuleGroupTemplateId")
    private String ruleGroupTemplateId;

    @com.aliyun.core.annotation.NameInMap("RuleGroupTemplateName")
    private String ruleGroupTemplateName;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRulesResponseBody(Builder builder) {
        this.isSubscribe = builder.isSubscribe;
        this.requestId = builder.requestId;
        this.ruleGroupName = builder.ruleGroupName;
        this.ruleGroupTemplateId = builder.ruleGroupTemplateId;
        this.ruleGroupTemplateName = builder.ruleGroupTemplateName;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return isSubscribe
     */
    public Long getIsSubscribe() {
        return this.isSubscribe;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleGroupName
     */
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * @return ruleGroupTemplateId
     */
    public String getRuleGroupTemplateId() {
        return this.ruleGroupTemplateId;
    }

    /**
     * @return ruleGroupTemplateName
     */
    public String getRuleGroupTemplateName() {
        return this.ruleGroupTemplateName;
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
        private Long isSubscribe; 
        private String requestId; 
        private String ruleGroupName; 
        private String ruleGroupTemplateId; 
        private String ruleGroupTemplateName; 
        private java.util.List < Rules> rules; 
        private Integer totalCount; 

        /**
         * IsSubscribe.
         */
        public Builder isSubscribe(Long isSubscribe) {
            this.isSubscribe = isSubscribe;
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
         * RuleGroupName.
         */
        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }

        /**
         * RuleGroupTemplateId.
         */
        public Builder ruleGroupTemplateId(String ruleGroupTemplateId) {
            this.ruleGroupTemplateId = ruleGroupTemplateId;
            return this;
        }

        /**
         * RuleGroupTemplateName.
         */
        public Builder ruleGroupTemplateName(String ruleGroupTemplateName) {
            this.ruleGroupTemplateName = ruleGroupTemplateName;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private Integer applicationType;

        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("CveUrl")
        private String cveUrl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProtectionType")
        private Integer protectionType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Rules(Builder builder) {
            this.applicationType = builder.applicationType;
            this.cveId = builder.cveId;
            this.cveUrl = builder.cveUrl;
            this.description = builder.description;
            this.protectionType = builder.protectionType;
            this.riskLevel = builder.riskLevel;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return applicationType
         */
        public Integer getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cveUrl
         */
        public String getCveUrl() {
            return this.cveUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return protectionType
         */
        public Integer getProtectionType() {
            return this.protectionType;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
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
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Integer applicationType; 
            private String cveId; 
            private String cveUrl; 
            private String description; 
            private Integer protectionType; 
            private Integer riskLevel; 
            private Long ruleId; 
            private String ruleName; 
            private Long updateTime; 

            /**
             * ApplicationType.
             */
            public Builder applicationType(Integer applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * CVE ID。
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * CveUrl.
             */
            public Builder cveUrl(String cveUrl) {
                this.cveUrl = cveUrl;
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
             * ProtectionType.
             */
            public Builder protectionType(Integer protectionType) {
                this.protectionType = protectionType;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
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
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
