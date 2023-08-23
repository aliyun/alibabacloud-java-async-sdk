// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecureSuggestionResponseBody</p>
 */
public class DescribeSecureSuggestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Suggestions")
    private java.util.List < Suggestions> suggestions;

    @NameInMap("TotalCount")
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
    public java.util.List < Suggestions> getSuggestions() {
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
        private java.util.List < Suggestions> suggestions; 
        private Integer totalCount; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The suggestions on how to handle the risks.
         */
        public Builder suggestions(java.util.List < Suggestions> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * The total number of unhandled security risks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecureSuggestionResponseBody build() {
            return new DescribeSecureSuggestionResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("Title")
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
             * The description of the suggestion.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The sub-type of the unhandled risk. Valid values:
             * <p>
             * 
             * *   **ALARM_HIGH**: Unhandled Urgency Alerts
             * *   **ALARM_MEDIUM**: Unhandled Warning Alerts
             * *   **ALARM_LOW**: Unhandled Reminder Alerts
             * *   **VUL_EMR_UNCHECK**: Unchecked Urgent Vulnerabilities
             * *   **VUL_EMR_UNFIX**: Unfixed Urgent Vulnerabilities
             * *   **VUL_WIN**: Unfixed Windows Server Vulnerabilities
             * *   **VUL_LINUX**: Unfixed Linux Server Vulnerabilities
             * *   **VUL_CMS**: Unfixed CMS Vulnerabilities
             * *   **ACCESSKEY_LEAK**: AccessKey Leakage Risks
             * *   **HC_WARN**: Baseline Risks
             * *   **HC_WEAK_EXPLOIT_WARN**: There is a risk of weak passwords exposed by the public network.
             * *   **HC_WEAK_PASSWORD_WARN**: Risk of weak password
             * *   **HC_HIGH_EXPLOIT_WARN**: There is a high risk of invasion
             * *   **HC_OTHER_WARN**: Security Configuration risk
             * *   **HC_DATABASE_WARN**: Database has security risks
             * *   **CLOUD_HC_SAS_OPEN**: Security protection has not been installed on the server
             * *   **CLOUD_HC_AEGIS_OFFLINE**: Server protection status is offline
             * *   **CLOUD_HC_ACCOUNT_DOUBLE_CHECK**: Two-Factor Authentication not Enabled for Primary Account
             * *   **CLOUD_HC_RDS**: RDS-database security policy failed, security risks
             * *   **CLOUD_HC_DDOS**: Risks in Anti-DDoS Pro Back-to-Origin Settings
             * *   **CLOUD_HC_HIGH_LEVEL**: Cloud product configuration has high risk
             * *   **CLOUD_HC_OTHER_LEVEL**: Cloud product configuration has medium and low risk risks
             * *   **OTHER_ATTACH**: Attacks
             * *   **OTHER_DATABASE_ATTACH**: Database has security risks
             * *   **REINFORCE_BASELINE**: Config Assessment
             * *   **REINFORCE_SUSPICIOUS**: Antivirus
             * *   **REINFORCE_ANALYSIS**: Log Analysis
             * *   **REINFORCE_AK_LEAK**: AccessKey Leaked Intelligence Detection
             * *   **REINFORCE_WEB_LOCK**: Website tamper-proofing capability not configured
             * *   **REINFORCE_BRUTE_FORCE**: Anti brute force cracking
             * *   **REINFORCE_XPRESS_INSTALL**: One-click client installation
             * *   **REINFORCE_RANSOMWARE**: Enable anti-extortion strategy
             * *   **REINFORCE_UNI_RANSOMWARE**: Anti-ransomware for Databases
             * *   **REINFORCE_VIRUS_SCHEDULE_SCAN**: Periodic virus scan policies not configured
             * *   **REINFORCE_IMAGE_REPO_SCAN**: No container image scan range configured
             * *   **REINFORCE_IMAGE_SCAN_TASK**: Image security scan
             * *   **REINFORCE_K8S_LOG_ANALYSIS**: Container K8s threat detection is disabled
             * *   **REINFORCE_CONTAINER_NETWORK**: Container Visualization
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * The name of the unhandled risk.
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
    public static class Suggestions extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("Points")
        private Integer points;

        @NameInMap("SuggestType")
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
        public java.util.List < Detail> getDetail() {
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
            private java.util.List < Detail> detail; 
            private Integer points; 
            private String suggestType; 

            /**
             * The details of the suggestion.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The penalty point of a deduction item.
             */
            public Builder points(Integer points) {
                this.points = points;
                return this;
            }

            /**
             * The type of the unhandled risk. Valid values:
             * <p>
             * 
             * *   **SS_REINFORCE**: missing configuration of key features, such as malicious behavior defense
             * *   **SS_ALARM**: unhandled alerts
             * *   **SS_VUL**: unfixed vulnerabilities
             * *   **SS_HC**: baseline risks
             * *   **SS_AK**: AccessKey pair leaks
             * *   **SS_CLOUD_HC**: configuration risks of cloud services
             * *   **OTHER**: others
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
