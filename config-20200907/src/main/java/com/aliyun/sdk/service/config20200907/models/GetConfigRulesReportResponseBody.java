// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRulesReportResponseBody</p>
 */
public class GetConfigRulesReportResponseBody extends TeaModel {
    @NameInMap("ConfigRulesReport")
    private ConfigRulesReport configRulesReport;

    @NameInMap("RequestId")
    private String requestId;

    private GetConfigRulesReportResponseBody(Builder builder) {
        this.configRulesReport = builder.configRulesReport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRulesReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRulesReport
     */
    public ConfigRulesReport getConfigRulesReport() {
        return this.configRulesReport;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigRulesReport configRulesReport; 
        private String requestId; 

        /**
         * The information about the compliance evaluation report.
         */
        public Builder configRulesReport(ConfigRulesReport configRulesReport) {
            this.configRulesReport = configRulesReport;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRulesReportResponseBody build() {
            return new GetConfigRulesReportResponseBody(this);
        } 

    } 

    public static class ConfigRulesReport extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("ReportCreateTimestamp")
        private Long reportCreateTimestamp;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ReportStatus")
        private String reportStatus;

        @NameInMap("ReportUrl")
        private String reportUrl;

        private ConfigRulesReport(Builder builder) {
            this.accountId = builder.accountId;
            this.reportCreateTimestamp = builder.reportCreateTimestamp;
            this.reportId = builder.reportId;
            this.reportStatus = builder.reportStatus;
            this.reportUrl = builder.reportUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRulesReport create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return reportCreateTimestamp
         */
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return reportUrl
         */
        public String getReportUrl() {
            return this.reportUrl;
        }

        public static final class Builder {
            private Long accountId; 
            private Long reportCreateTimestamp; 
            private String reportId; 
            private String reportStatus; 
            private String reportUrl; 

            /**
             * The ID of the Alibaba Cloud account to which the rules belong.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The timestamp when the compliance evaluation report was generated. Unit: milliseconds.
             */
            public Builder reportCreateTimestamp(Long reportCreateTimestamp) {
                this.reportCreateTimestamp = reportCreateTimestamp;
                return this;
            }

            /**
             * The ID of the compliance evaluation report.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * The status of the compliance evaluation report. Valid values:
             * <p>
             * 
             * *   NONE: The compliance evaluation report is not generated.
             * *   CREATING: The compliance evaluation report is being generated.
             * *   COMPLETE: The compliance evaluation report is generated.
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * The URL that is used to download the compliance evaluation report.
             */
            public Builder reportUrl(String reportUrl) {
                this.reportUrl = reportUrl;
                return this;
            }

            public ConfigRulesReport build() {
                return new ConfigRulesReport(this);
            } 

        } 

    }
}
