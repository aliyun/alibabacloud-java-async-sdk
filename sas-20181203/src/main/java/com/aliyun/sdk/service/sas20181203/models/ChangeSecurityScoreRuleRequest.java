// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeSecurityScoreRuleRequest} extends {@link RequestModel}
 *
 * <p>ChangeSecurityScoreRuleRequest</p>
 */
public class ChangeSecurityScoreRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalType")
    private String calType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetSecurityScoreRule")
    private Boolean resetSecurityScoreRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityScoreCategoryList")
    private java.util.List<SecurityScoreCategoryList> securityScoreCategoryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityScoreRuleList")
    private java.util.List<SecurityScoreRuleList> securityScoreRuleList;

    private ChangeSecurityScoreRuleRequest(Builder builder) {
        super(builder);
        this.calType = builder.calType;
        this.resetSecurityScoreRule = builder.resetSecurityScoreRule;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.securityScoreCategoryList = builder.securityScoreCategoryList;
        this.securityScoreRuleList = builder.securityScoreRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeSecurityScoreRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calType
     */
    public String getCalType() {
        return this.calType;
    }

    /**
     * @return resetSecurityScoreRule
     */
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return securityScoreCategoryList
     */
    public java.util.List<SecurityScoreCategoryList> getSecurityScoreCategoryList() {
        return this.securityScoreCategoryList;
    }

    /**
     * @return securityScoreRuleList
     */
    public java.util.List<SecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static final class Builder extends Request.Builder<ChangeSecurityScoreRuleRequest, Builder> {
        private String calType; 
        private Boolean resetSecurityScoreRule; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<SecurityScoreCategoryList> securityScoreCategoryList; 
        private java.util.List<SecurityScoreRuleList> securityScoreRuleList; 

        private Builder() {
            super();
        } 

        private Builder(ChangeSecurityScoreRuleRequest request) {
            super(request);
            this.calType = request.calType;
            this.resetSecurityScoreRule = request.resetSecurityScoreRule;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.securityScoreCategoryList = request.securityScoreCategoryList;
            this.securityScoreRuleList = request.securityScoreRuleList;
        } 

        /**
         * <p>Specifies whether to modify the new version or legacy security score rules. If the value is <strong>home_security_score</strong>, the new version security score rules are modified. Otherwise, the legacy security score rules are modified by default.</p>
         * 
         * <strong>example:</strong>
         * <p>home_security_score</p>
         */
        public Builder calType(String calType) {
            this.putQueryParameter("CalType", calType);
            this.calType = calType;
            return this;
        }

        /**
         * <p>Specifies whether to reset to the system default rules. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder resetSecurityScoreRule(Boolean resetSecurityScoreRule) {
            this.putQueryParameter("ResetSecurityScoreRule", resetSecurityScoreRule);
            this.resetSecurityScoreRule = resetSecurityScoreRule;
            return this;
        }

        /**
         * <p>The ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The list of new version security score rule deductions.</p>
         */
        public Builder securityScoreCategoryList(java.util.List<SecurityScoreCategoryList> securityScoreCategoryList) {
            this.putQueryParameter("SecurityScoreCategoryList", securityScoreCategoryList);
            this.securityScoreCategoryList = securityScoreCategoryList;
            return this;
        }

        /**
         * <p>The list of legacy security score rules.</p>
         */
        public Builder securityScoreRuleList(java.util.List<SecurityScoreRuleList> securityScoreRuleList) {
            this.putQueryParameter("SecurityScoreRuleList", securityScoreRuleList);
            this.securityScoreRuleList = securityScoreRuleList;
            return this;
        }

        @Override
        public ChangeSecurityScoreRuleRequest build() {
            return new ChangeSecurityScoreRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChangeSecurityScoreRuleRequest} extends {@link TeaModel}
     *
     * <p>ChangeSecurityScoreRuleRequest</p>
     */
    public static class SecurityScoreItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        private Integer scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("SubRuleType")
        private String subRuleType;

        private SecurityScoreItemList(Builder builder) {
            this.score = builder.score;
            this.scoreThreshold = builder.scoreThreshold;
            this.subRuleType = builder.subRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreItemList create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreThreshold
         */
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return subRuleType
         */
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public static final class Builder {
            private Integer score; 
            private Integer scoreThreshold; 
            private String subRuleType; 

            private Builder() {
            } 

            private Builder(SecurityScoreItemList model) {
                this.score = model.score;
                this.scoreThreshold = model.scoreThreshold;
                this.subRuleType = model.subRuleType;
            } 

            /**
             * <p>The deduction value for the individual item.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The deduction threshold for the individual item.</p>
             * <blockquote>
             * <p>The valid range is 0 to the deduction threshold of the security score rule type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scoreThreshold(Integer scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * <p>The security score rule sub-item.</p>
             * 
             * <strong>example:</strong>
             * <p>SSI_KEY_CONFIG</p>
             */
            public Builder subRuleType(String subRuleType) {
                this.subRuleType = subRuleType;
                return this;
            }

            public SecurityScoreItemList build() {
                return new SecurityScoreItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeSecurityScoreRuleRequest} extends {@link TeaModel}
     *
     * <p>ChangeSecurityScoreRuleRequest</p>
     */
    public static class SecurityRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("SecurityScoreItemList")
        private java.util.List<SecurityScoreItemList> securityScoreItemList;

        private SecurityRuleList(Builder builder) {
            this.ruleType = builder.ruleType;
            this.score = builder.score;
            this.securityScoreItemList = builder.securityScoreItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityRuleList create() {
            return builder().build();
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return securityScoreItemList
         */
        public java.util.List<SecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List<SecurityScoreItemList> securityScoreItemList; 

            private Builder() {
            } 

            private Builder(SecurityRuleList model) {
                this.ruleType = model.ruleType;
                this.score = model.score;
                this.securityScoreItemList = model.securityScoreItemList;
            } 

            /**
             * <p>The type of the security score rule sub-item. Valid values:</p>
             * <ul>
             * <li><strong>SS_SAS_WEAK_PW</strong>: Pending weak passwords to fix.</li>
             * <li><strong>SS_SAS_ALARM</strong>: Pending Security Center alerts.</li>
             * <li><strong>SS_SAS_EMG_VUL</strong>: Pending emergency vulnerabilities to fix.</li>
             * <li><strong>SS_SAS_APP_VUL</strong>: Pending application vulnerabilities to fix.</li>
             * <li><strong>SS_SAS_SYS_VUL</strong>: Pending system vulnerabilities to fix.</li>
             * <li><strong>SS_SAS_CLOUD_HC</strong>: Pending Cloud Security Posture Management (CSPM) risks.</li>
             * <li><strong>SS_SDDP_DATA_RISK</strong>: Pending data security risks to address.</li>
             * <li><strong>SS_WAF_API_RISK</strong>: Pending API security risks.</li>
             * <li><strong>SS_DDOS_BH_ASSET</strong>: Assets in DDoS blackhole filtering status.</li>
             * <li><strong>SS_SAS_AK_LEAK</strong>: Unhandled AccessKey/SecretKey leak events.</li>
             * <li><strong>SS_PRODUCT_CONNECT</strong>: Security products not properly connected.</li>
             * <li><strong>SS_KEY_CONFIG</strong>: Key feature configuration.</li>
             * <li><strong>SS_PRODUCT_EXPIRE</strong>: Products about to expire.</li>
             * <li><strong>SS_AI_RISK</strong>: AI application risks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SS_REINFORCE</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The deduction threshold for the security score rule type.</p>
             * <blockquote>
             * <p>The valid range is 0 to the deduction threshold of the security score rule category.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The list of deductions for security score rule sub-items.</p>
             */
            public Builder securityScoreItemList(java.util.List<SecurityScoreItemList> securityScoreItemList) {
                this.securityScoreItemList = securityScoreItemList;
                return this;
            }

            public SecurityRuleList build() {
                return new SecurityRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeSecurityScoreRuleRequest} extends {@link TeaModel}
     *
     * <p>ChangeSecurityScoreRuleRequest</p>
     */
    public static class SecurityScoreCategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        private Integer scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("SecurityRuleList")
        private java.util.List<SecurityRuleList> securityRuleList;

        private SecurityScoreCategoryList(Builder builder) {
            this.category = builder.category;
            this.scoreThreshold = builder.scoreThreshold;
            this.securityRuleList = builder.securityRuleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreCategoryList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return scoreThreshold
         */
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return securityRuleList
         */
        public java.util.List<SecurityRuleList> getSecurityRuleList() {
            return this.securityRuleList;
        }

        public static final class Builder {
            private String category; 
            private Integer scoreThreshold; 
            private java.util.List<SecurityRuleList> securityRuleList; 

            private Builder() {
            } 

            private Builder(SecurityScoreCategoryList model) {
                this.category = model.category;
                this.scoreThreshold = model.scoreThreshold;
                this.securityRuleList = model.securityRuleList;
            } 

            /**
             * <p>The category of the security score rule. Valid values:</p>
             * <ul>
             * <li><strong>SS_SAS_HANDLE</strong>: Security governance.</li>
             * <li><strong>SS_SAS_RESPOND</strong>: Security response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SS_SAS_HANDLE</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The deduction threshold for the security score rule category.</p>
             * <blockquote>
             * <p>The valid range is 0 to 100. The sum of all security score rule category deduction thresholds must equal 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder scoreThreshold(Integer scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * <p>The list of deductions by security score rule type.</p>
             */
            public Builder securityRuleList(java.util.List<SecurityRuleList> securityRuleList) {
                this.securityRuleList = securityRuleList;
                return this;
            }

            public SecurityScoreCategoryList build() {
                return new SecurityScoreCategoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeSecurityScoreRuleRequest} extends {@link TeaModel}
     *
     * <p>ChangeSecurityScoreRuleRequest</p>
     */
    public static class SecurityScoreRuleListSecurityScoreItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("SubRuleType")
        private String subRuleType;

        private SecurityScoreRuleListSecurityScoreItemList(Builder builder) {
            this.score = builder.score;
            this.scoreThreshold = builder.scoreThreshold;
            this.subRuleType = builder.subRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreRuleListSecurityScoreItemList create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreThreshold
         */
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return subRuleType
         */
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public static final class Builder {
            private Integer score; 
            private Integer scoreThreshold; 
            private String subRuleType; 

            private Builder() {
            } 

            private Builder(SecurityScoreRuleListSecurityScoreItemList model) {
                this.score = model.score;
                this.scoreThreshold = model.scoreThreshold;
                this.subRuleType = model.subRuleType;
            } 

            /**
             * <p>The deduction value for the individual item.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The deduction threshold for the individual item.</p>
             * <blockquote>
             * <p>The valid range is 0 to the deduction threshold of the security score rule.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scoreThreshold(Integer scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * <p>The sub-rule type of the individual deduction item. The mapping between security score types and sub-rule types is as follows:</p>
             * <ul>
             * <li><p>SS_REINFORCE: Key feature configuration.</p>
             * <ul>
             * <li>XPRESS_INSTALL: Security Center service authorization is not enabled.</li>
             * <li>REINFORCE_SUSPICIOUS: The anti-virus feature is not enabled.</li>
             * <li>RANSOMWARE: The anti-ransomware policy is not enabled.</li>
             * <li>WEB_LOCK: The web tamper-proofing feature is not enabled.</li>
             * <li>VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is not enabled.</li>
             * <li>IMAGE_REPO_SCAN: The container image scan scope is not configured.</li>
             * <li>IMAGE_SCAN_TASK: The one-click container image security risk scan has not been executed.</li>
             * </ul>
             * </li>
             * <li><p>SS_ALARM: Pending alerts.</p>
             * <ul>
             * <li>ALARM_SERIOUS: One unhandled high-risk alert event exists.</li>
             * <li>ALARM_SUSPICIOUS: One unhandled medium-risk alert event exists.</li>
             * <li>ALARM_REMIND: One unhandled low-risk alert event exists.</li>
             * </ul>
             * </li>
             * <li><p>SS_VUL: Pending vulnerabilities.</p>
             * <ul>
             * <li>CMS_UNFIX: One unfixed CMS vulnerability exists.</li>
             * <li>WIN_UNFIX: One unfixed Windows host vulnerability exists.</li>
             * <li>CVE_UNFIX: One unfixed Linux host vulnerability exists.</li>
             * <li>ERM_UNFIX: One unfixed emergency vulnerability exists.</li>
             * <li>ERM_UNCHECK: One unscanned emergency vulnerability exists.</li>
             * </ul>
             * </li>
             * <li><p>SS_HC: Baseline issues.</p>
             * <ul>
             * <li>WEAK_EXPLOIT: A weak password risk exposed to the Internet exists.</li>
             * <li>WEAK_PASSWORD: A weak password risk exists.</li>
             * <li>HC_EXPLOIT: A high-risk intrusion vulnerability exists.</li>
             * <li>HC_OTHER_WARNING: A security configuration risk exists.</li>
             * </ul>
             * </li>
             * <li><p>SS_CLOUD_HC: Cloud platform configuration check item issues.</p>
             * <ul>
             * <li>CSPM_CIEM_NOT_PASS: One failed CIEM check item exists.</li>
             * <li>CSPM_RISK_NOT_PASS: One failed security risk check item exists.</li>
             * <li>CSPM_COMPLIANCE_NOT_PASS: One failed compliance check item exists.</li>
             * </ul>
             * </li>
             * <li><p>SS_AK: AccessKey pair leak risk. Categorization not applicable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALARM_SERIOUS</p>
             */
            public Builder subRuleType(String subRuleType) {
                this.subRuleType = subRuleType;
                return this;
            }

            public SecurityScoreRuleListSecurityScoreItemList build() {
                return new SecurityScoreRuleListSecurityScoreItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeSecurityScoreRuleRequest} extends {@link TeaModel}
     *
     * <p>ChangeSecurityScoreRuleRequest</p>
     */
    public static class SecurityScoreRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Score")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("SecurityScoreItemList")
        private java.util.List<SecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        private SecurityScoreRuleList(Builder builder) {
            this.ruleType = builder.ruleType;
            this.score = builder.score;
            this.securityScoreItemList = builder.securityScoreItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityScoreRuleList create() {
            return builder().build();
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return securityScoreItemList
         */
        public java.util.List<SecurityScoreRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List<SecurityScoreRuleListSecurityScoreItemList> securityScoreItemList; 

            private Builder() {
            } 

            private Builder(SecurityScoreRuleList model) {
                this.ruleType = model.ruleType;
                this.score = model.score;
                this.securityScoreItemList = model.securityScoreItemList;
            } 

            /**
             * <p>The type of the security score rule. Valid values:</p>
             * <ul>
             * <li>SS_REINFORCE: Key feature configuration.</li>
             * <li>SS_ALARM: Pending alerts.</li>
             * <li>SS_VUL: Pending vulnerabilities.</li>
             * <li>SS_HC: Baseline issues.</li>
             * <li>SS_CLOUD_HC: Cloud platform configuration check item issues.</li>
             * <li>SS_AK: AccessKey pair leak risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SS_ALARM</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The deduction value of the security score rule.</p>
             * <blockquote>
             * <p>The valid range is 0 to 100. The sum of all security score rule deduction thresholds must equal 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The list of individual deduction items for the security score rule.</p>
             */
            public Builder securityScoreItemList(java.util.List<SecurityScoreRuleListSecurityScoreItemList> securityScoreItemList) {
                this.securityScoreItemList = securityScoreItemList;
                return this;
            }

            public SecurityScoreRuleList build() {
                return new SecurityScoreRuleList(this);
            } 

        } 

    }
}
