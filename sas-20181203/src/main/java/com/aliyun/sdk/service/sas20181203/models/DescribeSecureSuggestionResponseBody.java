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
 * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecureSuggestionResponseBody</p>
 */
public class DescribeSecureSuggestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Suggestions")
    private java.util.List<Suggestions> suggestions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecureSuggestionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suggestions = builder.suggestions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecureSuggestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suggestions
     */
    public java.util.List<Suggestions> getSuggestions() {
        return this.suggestions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Suggestions> suggestions; 
        private Integer totalCount; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676F80E3-4B3F-43DA-9CBB-5FF79F202AA2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The suggestions on how to handle the risks.</p>
         */
        public Builder suggestions(java.util.List<Suggestions> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * <p>The total number of unhandled security risks.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecureSuggestionResponseBody build() {
            return new DescribeSecureSuggestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecureSuggestionResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Detail(Builder builder) {
            this.description = builder.description;
            this.subType = builder.subType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String subType; 
            private String title; 

            /**
             * <p>The description of the suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious tampering of Web pages will affect your normal access to web page content, and may also lead to serious economic losses, brand losses, and even political risks. The webpage tamper-proof service can monitor the website directory in real time and restore the tampered files or directories through backup, so as to ensure that the website information of important systems is not tampered with maliciously and prevent the occurrence of horse hanging, black chain, illegal implantation of terrorist threats, pornography and other content.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The sub-type of the unhandled risk. Valid values:</p>
             * <ul>
             * <li><strong>ALARM_HIGH</strong>: Unhandled Urgency Alerts</li>
             * <li><strong>ALARM_MEDIUM</strong>: Unhandled Warning Alerts</li>
             * <li><strong>ALARM_LOW</strong>: Unhandled Reminder Alerts</li>
             * <li><strong>VUL_EMR_UNCHECK</strong>: Unchecked Urgent Vulnerabilities</li>
             * <li><strong>VUL_EMR_UNFIX</strong>: Unfixed Urgent Vulnerabilities</li>
             * <li><strong>VUL_WIN</strong>: Unfixed Windows Server Vulnerabilities</li>
             * <li><strong>VUL_LINUX</strong>: Unfixed Linux Server Vulnerabilities</li>
             * <li><strong>VUL_CMS</strong>: Unfixed CMS Vulnerabilities</li>
             * <li><strong>ACCESSKEY_LEAK</strong>: AccessKey Leakage Risks</li>
             * <li><strong>HC_WARN</strong>: Baseline Risks</li>
             * <li><strong>HC_WEAK_EXPLOIT_WARN</strong>: There is a risk of weak passwords exposed by the public network.</li>
             * <li><strong>HC_WEAK_PASSWORD_WARN</strong>: Risk of weak password</li>
             * <li><strong>HC_HIGH_EXPLOIT_WARN</strong>: There is a high risk of invasion</li>
             * <li><strong>HC_OTHER_WARN</strong>: Security Configuration risk</li>
             * <li><strong>HC_DATABASE_WARN</strong>: Database has security risks</li>
             * <li><strong>CLOUD_HC_SAS_OPEN</strong>: Security protection has not been installed on the server</li>
             * <li><strong>CLOUD_HC_AEGIS_OFFLINE</strong>: Server protection status is offline</li>
             * <li><strong>CLOUD_HC_ACCOUNT_DOUBLE_CHECK</strong>: Two-Factor Authentication not Enabled for Primary Account</li>
             * <li><strong>CLOUD_HC_RDS</strong>: RDS-database security policy failed, security risks</li>
             * <li><strong>CLOUD_HC_DDOS</strong>: Risks in Anti-DDoS Pro Back-to-Origin Settings</li>
             * <li><strong>CLOUD_HC_HIGH_LEVEL</strong>: Cloud product configuration has high risk</li>
             * <li><strong>CLOUD_HC_OTHER_LEVEL</strong>: Cloud product configuration has medium and low risk risks</li>
             * <li><strong>OTHER_ATTACH</strong>: Attacks</li>
             * <li><strong>OTHER_DATABASE_ATTACH</strong>: Database has security risks</li>
             * <li><strong>REINFORCE_BASELINE</strong>: Config Assessment</li>
             * <li><strong>REINFORCE_SUSPICIOUS</strong>: Antivirus</li>
             * <li><strong>REINFORCE_ANALYSIS</strong>: Log Analysis</li>
             * <li><strong>REINFORCE_AK_LEAK</strong>: AccessKey Leaked Intelligence Detection</li>
             * <li><strong>REINFORCE_WEB_LOCK</strong>: Website tamper-proofing capability not configured</li>
             * <li><strong>REINFORCE_BRUTE_FORCE</strong>: Anti brute force cracking</li>
             * <li><strong>REINFORCE_XPRESS_INSTALL</strong>: One-click client installation</li>
             * <li><strong>REINFORCE_RANSOMWARE</strong>: Enable anti-extortion strategy</li>
             * <li><strong>REINFORCE_UNI_RANSOMWARE</strong>: Anti-ransomware for Databases</li>
             * <li><strong>REINFORCE_VIRUS_SCHEDULE_SCAN</strong>: Periodic virus scan policies not configured</li>
             * <li><strong>REINFORCE_IMAGE_REPO_SCAN</strong>: No container image scan range configured</li>
             * <li><strong>REINFORCE_IMAGE_SCAN_TASK</strong>: Image security scan</li>
             * <li><strong>REINFORCE_K8S_LOG_ANALYSIS</strong>: Container K8s threat detection is disabled</li>
             * <li><strong>REINFORCE_CONTAINER_NETWORK</strong>: Container Visualization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REINFORCE_WEB_LOCK</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The name of the unhandled risk.</p>
             * 
             * <strong>example:</strong>
             * <p>Website tamper-proofing capability not configured</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecureSuggestionResponseBody</p>
     */
    public static class Suggestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Integer points;

        @com.aliyun.core.annotation.NameInMap("SuggestType")
        private String suggestType;

        private Suggestions(Builder builder) {
            this.detail = builder.detail;
            this.points = builder.points;
            this.suggestType = builder.suggestType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Suggestions create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return points
         */
        public Integer getPoints() {
            return this.points;
        }

        /**
         * @return suggestType
         */
        public String getSuggestType() {
            return this.suggestType;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 
            private Integer points; 
            private String suggestType; 

            /**
             * <p>The details of the suggestion.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The penalty point of a deduction item.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder points(Integer points) {
                this.points = points;
                return this;
            }

            /**
             * <p>The type of the unhandled risk. Valid values:</p>
             * <ul>
             * <li><strong>SS_REINFORCE</strong>: missing configuration of key features, such as malicious behavior defense</li>
             * <li><strong>SS_ALARM</strong>: unhandled alerts</li>
             * <li><strong>SS_VUL</strong>: unfixed vulnerabilities</li>
             * <li><strong>SS_HC</strong>: baseline risks</li>
             * <li><strong>SS_AK</strong>: AccessKey pair leaks</li>
             * <li><strong>SS_CLOUD_HC</strong>: configuration risks of cloud services</li>
             * <li><strong>OTHER</strong>: others</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SS_ALARM</p>
             */
            public Builder suggestType(String suggestType) {
                this.suggestType = suggestType;
                return this;
            }

            public Suggestions build() {
                return new Suggestions(this);
            } 

        } 

    }
}
