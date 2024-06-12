// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompliancePackReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompliancePackReportResponseBody</p>
 */
public class GetCompliancePackReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackReport")
    private CompliancePackReport compliancePackReport;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCompliancePackReportResponseBody(Builder builder) {
        this.compliancePackReport = builder.compliancePackReport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompliancePackReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return compliancePackReport
     */
    public CompliancePackReport getCompliancePackReport() {
        return this.compliancePackReport;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompliancePackReport compliancePackReport; 
        private String requestId; 

        /**
         * The information about the compliance evaluation report.
         */
        public Builder compliancePackReport(CompliancePackReport compliancePackReport) {
            this.compliancePackReport = compliancePackReport;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCompliancePackReportResponseBody build() {
            return new GetCompliancePackReportResponseBody(this);
        } 

    } 

    public static class CompliancePackReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("ReportCreateTimestamp")
        private Long reportCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("ReportUrl")
        private String reportUrl;

        private CompliancePackReport(Builder builder) {
            this.accountId = builder.accountId;
            this.compliancePackId = builder.compliancePackId;
            this.reportCreateTimestamp = builder.reportCreateTimestamp;
            this.reportStatus = builder.reportStatus;
            this.reportUrl = builder.reportUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePackReport create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return reportCreateTimestamp
         */
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
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
            private String compliancePackId; 
            private Long reportCreateTimestamp; 
            private String reportStatus; 
            private String reportUrl; 

            /**
             * The ID of the Alibaba Cloud account to which the compliance package belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
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

            public CompliancePackReport build() {
                return new CompliancePackReport(this);
            } 

        } 

    }
}
