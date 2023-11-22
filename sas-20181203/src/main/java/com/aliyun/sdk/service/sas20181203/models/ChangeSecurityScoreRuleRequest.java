// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeSecurityScoreRuleRequest} extends {@link RequestModel}
 *
 * <p>ChangeSecurityScoreRuleRequest</p>
 */
public class ChangeSecurityScoreRuleRequest extends Request {
    @Query
    @NameInMap("ResetSecurityScoreRule")
    private Boolean resetSecurityScoreRule;

    @Query
    @NameInMap("SecurityScoreRuleList")
    private java.util.List < SecurityScoreRuleList> securityScoreRuleList;

    private ChangeSecurityScoreRuleRequest(Builder builder) {
        super(builder);
        this.resetSecurityScoreRule = builder.resetSecurityScoreRule;
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
     * @return resetSecurityScoreRule
     */
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    /**
     * @return securityScoreRuleList
     */
    public java.util.List < SecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static final class Builder extends Request.Builder<ChangeSecurityScoreRuleRequest, Builder> {
        private Boolean resetSecurityScoreRule; 
        private java.util.List < SecurityScoreRuleList> securityScoreRuleList; 

        private Builder() {
            super();
        } 

        private Builder(ChangeSecurityScoreRuleRequest request) {
            super(request);
            this.resetSecurityScoreRule = request.resetSecurityScoreRule;
            this.securityScoreRuleList = request.securityScoreRuleList;
        } 

        /**
         * Specifies whether to reset to the system default rule. Valid values:
         * <p>
         * 
         * *   true: yes
         * *   false: no
         */
        public Builder resetSecurityScoreRule(Boolean resetSecurityScoreRule) {
            this.putQueryParameter("ResetSecurityScoreRule", resetSecurityScoreRule);
            this.resetSecurityScoreRule = resetSecurityScoreRule;
            return this;
        }

        /**
         * The list of deduction modules that are supported by the security score feature.
         */
        public Builder securityScoreRuleList(java.util.List < SecurityScoreRuleList> securityScoreRuleList) {
            this.putQueryParameter("SecurityScoreRuleList", securityScoreRuleList);
            this.securityScoreRuleList = securityScoreRuleList;
            return this;
        }

        @Override
        public ChangeSecurityScoreRuleRequest build() {
            return new ChangeSecurityScoreRuleRequest(this);
        } 

    } 

    public static class SecurityScoreItemList extends TeaModel {
        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreThreshold")
        @Validation(maximum = 100)
        private Integer scoreThreshold;

        @NameInMap("SubRuleType")
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

            /**
             * The penalty point of the deduction item.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The threshold for the deduction item.
             * <p>
             * 
             * >  Valid values: 0 to the deduction threshold of the deduction module.
             */
            public Builder scoreThreshold(Integer scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * The deduction item of the deduction module. The following list describes the deduction modules and their deduction items:
             * <p>
             * 
             * *   SS_REINFORCE: issue in key feature configuration
             * 
             *     *   XPRESS_INSTALL: Security Center is not authorized.
             *     *   REINFORCE_SUSPICIOUS: The anti-virus feature is disabled.
             *     *   RANSOMWARE: The anti-ransomware policy is disabled.
             *     *   WEB_LOCK: The web tamper proofing feature is disabled.
             *     *   VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.
             *     *   IMAGE_REPO_SCAN: The container image scan range is not configured.
             *     *   IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.
             * 
             * *   SS_ALARM: unhandled alert
             * 
             *     *   ALARM_SERIOUS: An unhandled high-risk alert event is detected.
             *     *   ALARM_SUSPICIOUS: An unhandled medium-risk alarm event is detected.
             *     *   ALARM_REMIND: An unhandled low-risk alarm event is detected.
             * 
             * *   SS_VUL: unfixed vulnerability
             * 
             *     *   CMS_UNFIX: An unfixed Web-CMS vulnerability is detected.
             *     *   WIN_UNFIX: An unfixed Windows host vulnerability is detected.
             *     *   CVE_UNFIX: An unfixed Linux host vulnerability is detected.
             *     *   ERM_UNFIX: An unfixed emergency vulnerability is detected.
             *     *   ERM_UNCHECK: An undetected emergency vulnerability exists.
             * 
             * *   SS_HC: baseline risks
             * 
             *     *   WEAK_EXPLOIT: Weak passwords are exposed to the Internet.
             *     *   WEAK_PASSWORD: Weak passwords exist.
             *     *   HC_EXPLOIT: The data source may be hacked.
             *     *   HC_OTHER_WARNING: Security configuration risks exist.
             * 
             * *   SS_CLOUD_HC: Cloud platform configuration check item problem.
             * 
             *     *   CSPM_CIEM_NOT_PASS: A CIEM check item failed the check.
             *     *   CSPM_RISK_NOT_PASS: A security risk check item failed the check.
             *     *   CSPM_COMPLIANCE_NOT_PASS: A compliance check item failed the check.
             * 
             * *   SS_AK: risk of AccessKey pair leaks
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
    public static class SecurityScoreRuleList extends TeaModel {
        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Score")
        @Validation(maximum = 100)
        private Integer score;

        @NameInMap("SecurityScoreItemList")
        private java.util.List < SecurityScoreItemList> securityScoreItemList;

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
        public java.util.List < SecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List < SecurityScoreItemList> securityScoreItemList; 

            /**
             * The deduction module that is supported by the security score feature. Valid values:
             * <p>
             * 
             * *   SS_REINFORCE: issue in key feature configuration
             * *   SS_ALARM: unhandled alert
             * *   SS_VUL: unfixed vulnerability
             * *   SS_HC: baseline risk
             * *   SS_CLOUD_HC: Cloud platform configuration check item problem.
             * *   SS_AK: risk of AccessKey pair leaks
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The deduction threshold of the deduction module.
             * <p>
             * 
             * >  Valid values: 0 to 100. The sum of the deduction thresholds for all deduction modules must be equal to 100.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The deduction items of the deduction module.
             */
            public Builder securityScoreItemList(java.util.List < SecurityScoreItemList> securityScoreItemList) {
                this.securityScoreItemList = securityScoreItemList;
                return this;
            }

            public SecurityScoreRuleList build() {
                return new SecurityScoreRuleList(this);
            } 

        } 

    }
}
