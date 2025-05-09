// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateCompliancePackReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateCompliancePackReportResponseBody</p>
 */
public class GetAggregateCompliancePackReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackReport")
    private CompliancePackReport compliancePackReport;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateCompliancePackReportResponseBody(Builder builder) {
        this.compliancePackReport = builder.compliancePackReport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateCompliancePackReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregateCompliancePackReportResponseBody model) {
            this.compliancePackReport = model.compliancePackReport;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance evaluation report that is generated based on a compliance package.</p>
         */
        public Builder compliancePackReport(CompliancePackReport compliancePackReport) {
            this.compliancePackReport = compliancePackReport;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D234DAC-1ABD-42E8-9475-BE317857E29B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateCompliancePackReportResponseBody build() {
            return new GetAggregateCompliancePackReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateCompliancePackReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateCompliancePackReportResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CompliancePackReport model) {
                this.accountId = model.accountId;
                this.compliancePackId = model.compliancePackId;
                this.reportCreateTimestamp = model.reportCreateTimestamp;
                this.reportStatus = model.reportStatus;
                this.reportUrl = model.reportUrl;
            } 

            /**
             * <p>The ID of the management account to which the compliance package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-fdc8626622af00f9****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624330246640</p>
             */
            public Builder reportCreateTimestamp(Long reportCreateTimestamp) {
                this.reportCreateTimestamp = reportCreateTimestamp;
                return this;
            }

            /**
             * <p>The status of the compliance evaluation report. Valid values:</p>
             * <ul>
             * <li>NONE: The compliance evaluation report is not generated.</li>
             * <li>CREATING: The compliance evaluation report is being generated.</li>
             * <li>COMPLETE: The compliance evaluation report is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The URL that is used to download the compliance evaluation report.</p>
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
