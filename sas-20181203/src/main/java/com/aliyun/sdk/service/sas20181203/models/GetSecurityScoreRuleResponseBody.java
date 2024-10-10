// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSecurityScoreRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityScoreRuleResponseBody</p>
 */
public class GetSecurityScoreRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private Boolean enableStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityScoreRuleList")
    private java.util.List < SecurityScoreRuleList> securityScoreRuleList;

    private GetSecurityScoreRuleResponseBody(Builder builder) {
        this.enableStatus = builder.enableStatus;
        this.requestId = builder.requestId;
        this.securityScoreRuleList = builder.securityScoreRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityScoreRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableStatus
     */
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityScoreRuleList
     */
    public java.util.List < SecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static final class Builder {
        private Boolean enableStatus; 
        private String requestId; 
        private java.util.List < SecurityScoreRuleList> securityScoreRuleList; 

        /**
         * <p>The status of the custom settings of the security score feature.</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of deduction modules that are supported by the security score feature.</p>
         */
        public Builder securityScoreRuleList(java.util.List < SecurityScoreRuleList> securityScoreRuleList) {
            this.securityScoreRuleList = securityScoreRuleList;
            return this;
        }

        public GetSecurityScoreRuleResponseBody build() {
            return new GetSecurityScoreRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityScoreRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityScoreRuleResponseBody</p>
     */
    public static class SecurityScoreItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        private Integer scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("SubRuleType")
        private String subRuleType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SecurityScoreItemList(Builder builder) {
            this.score = builder.score;
            this.scoreThreshold = builder.scoreThreshold;
            this.subRuleType = builder.subRuleType;
            this.title = builder.title;
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer score; 
            private Integer scoreThreshold; 
            private String subRuleType; 
            private String title; 

            /**
             * <p>The penalty point of the deduction item.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The threshold for the deduction item.</p>
             * <blockquote>
             * <p> Valid values: 0 to the deduction threshold of the deduction module.</p>
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
             * <p>The deduction item of the deduction module. The following list describes the deduction modules and their deduction items:</p>
             * <ul>
             * <li><p>SS_REINFORCE: issue in key feature configuration</p>
             * <ul>
             * <li>XPRESS_INSTALL: Security Center is not authorized.</li>
             * <li>REINFORCE_SUSPICIOUS: The antivirus feature is disabled.</li>
             * <li>RANSOMWARE: The anti-ransomware policy is disabled.</li>
             * <li>WEB_LOCK: The web tamper proofing feature is disabled.</li>
             * <li>VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.</li>
             * <li>IMAGE_REPO_SCAN: The range of container image scan is not configured.</li>
             * <li>IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.</li>
             * </ul>
             * </li>
             * <li><p>SS_ALARM: unhandled alert.</p>
             * <ul>
             * <li>ALARM_SERIOUS: An unhandled high-risk alert event is detected.</li>
             * <li>ALARM_SUSPICIOUS: An unhandled medium-risk alarm event is detected.</li>
             * <li>ALARM_REMIND: An unhandled low-risk alarm event is detected.</li>
             * </ul>
             * </li>
             * <li><p>SS_VUL: unfixed vulnerability</p>
             * <ul>
             * <li>CMS_UNFIX: An unfixed Web-CMS vulnerability is detected.</li>
             * <li>WIN_UNFIX: An unfixed Windows host vulnerability is detected.</li>
             * <li>CVE_UNFIX: An unfixed Linux host vulnerability is detected.</li>
             * <li>ERM_UNFIX: An unfixed urgent vulnerability is detected.</li>
             * <li>ERM_UNCHECK: An undetected urgent vulnerability exists.</li>
             * </ul>
             * </li>
             * <li><p>SS_HC: baseline risks</p>
             * <ul>
             * <li>WEAK_EXPLOIT: Weak passwords are exposed to the Internet.</li>
             * <li>WEAK_PASSWORD: Weak passwords exist.</li>
             * <li>HC_EXPLOIT: The data source may be hacked.</li>
             * <li>HC_OTHER_WARNING: Security configuration risks exist.</li>
             * </ul>
             * </li>
             * <li><p>SS_CLOUD_HC: Cloud platform configuration check item problem.</p>
             * <ul>
             * <li>CSPM_CIEM_NOT_PASS: A CIEM check item failed the check.</li>
             * <li>CSPM_RISK_NOT_PASS: A security risk check item failed the check.</li>
             * <li>CSPM_COMPLIANCE_NOT_PASS: A compliance check item failed the check.</li>
             * </ul>
             * </li>
             * <li><p>SS_AK: risk of AccessKey pair leaks</p>
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

            /**
             * <p>The description of the deduction item in a deduction module.</p>
             * 
             * <strong>example:</strong>
             * <p>Unhandled Urgent Alert Event Exists</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SecurityScoreItemList build() {
                return new SecurityScoreItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecurityScoreRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityScoreRuleResponseBody</p>
     */
    public static class SecurityScoreRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("SecurityScoreItemList")
        private java.util.List < SecurityScoreItemList> securityScoreItemList;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SecurityScoreRuleList(Builder builder) {
            this.ruleType = builder.ruleType;
            this.score = builder.score;
            this.securityScoreItemList = builder.securityScoreItemList;
            this.title = builder.title;
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String ruleType; 
            private Integer score; 
            private java.util.List < SecurityScoreItemList> securityScoreItemList; 
            private String title; 

            /**
             * <p>The deduction module that is supported by the security score feature. Valid values:</p>
             * <ul>
             * <li>SS_REINFORCE: issue in key feature configuration</li>
             * <li>SS_ALARM: unhandled alert</li>
             * <li>SS_VUL: unfixed vulnerability</li>
             * <li>SS_HC: baseline risk</li>
             * <li>SS_CLOUD_HC: risk item of configuration assessment</li>
             * <li>SS_AK: risk of AccessKey pair leaks</li>
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
             * <p>The deduction threshold of the deduction module.</p>
             * <blockquote>
             * <p> Valid values: 0 to 100. The sum of the deduction thresholds for all deduction modules must be equal to 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The deduction items of the deduction module.</p>
             */
            public Builder securityScoreItemList(java.util.List < SecurityScoreItemList> securityScoreItemList) {
                this.securityScoreItemList = securityScoreItemList;
                return this;
            }

            /**
             * <p>The description of the deduction module.</p>
             * 
             * <strong>example:</strong>
             * <p>Unhandled Alerts</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SecurityScoreRuleList build() {
                return new SecurityScoreRuleList(this);
            } 

        } 

    }
}
