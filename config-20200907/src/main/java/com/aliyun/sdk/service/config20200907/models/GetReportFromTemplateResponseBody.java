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
 * {@link GetReportFromTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportFromTemplateResponseBody</p>
 */
public class GetReportFromTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateReport")
    private TemplateReport templateReport;

    private GetReportFromTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateReport = builder.templateReport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportFromTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateReport
     */
    public TemplateReport getTemplateReport() {
        return this.templateReport;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateReport templateReport; 

        private Builder() {
        } 

        private Builder(GetReportFromTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateReport = model.templateReport;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateReport.
         */
        public Builder templateReport(TemplateReport templateReport) {
            this.templateReport = templateReport;
            return this;
        }

        public GetReportFromTemplateResponseBody build() {
            return new GetReportFromTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReportFromTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportFromTemplateResponseBody</p>
     */
    public static class TemplateReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("ReportCreateEndTimestamp")
        private Long reportCreateEndTimestamp;

        @com.aliyun.core.annotation.NameInMap("ReportCreateStartTimestamp")
        private Long reportCreateStartTimestamp;

        @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
        private String reportTemplateId;

        @com.aliyun.core.annotation.NameInMap("ReportUrl")
        private String reportUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateReportId")
        private String templateReportId;

        private TemplateReport(Builder builder) {
            this.accountId = builder.accountId;
            this.reportCreateEndTimestamp = builder.reportCreateEndTimestamp;
            this.reportCreateStartTimestamp = builder.reportCreateStartTimestamp;
            this.reportTemplateId = builder.reportTemplateId;
            this.reportUrl = builder.reportUrl;
            this.status = builder.status;
            this.templateReportId = builder.templateReportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateReport create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return reportCreateEndTimestamp
         */
        public Long getReportCreateEndTimestamp() {
            return this.reportCreateEndTimestamp;
        }

        /**
         * @return reportCreateStartTimestamp
         */
        public Long getReportCreateStartTimestamp() {
            return this.reportCreateStartTimestamp;
        }

        /**
         * @return reportTemplateId
         */
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        /**
         * @return reportUrl
         */
        public String getReportUrl() {
            return this.reportUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateReportId
         */
        public String getTemplateReportId() {
            return this.templateReportId;
        }

        public static final class Builder {
            private Long accountId; 
            private Long reportCreateEndTimestamp; 
            private Long reportCreateStartTimestamp; 
            private String reportTemplateId; 
            private String reportUrl; 
            private String status; 
            private String templateReportId; 

            private Builder() {
            } 

            private Builder(TemplateReport model) {
                this.accountId = model.accountId;
                this.reportCreateEndTimestamp = model.reportCreateEndTimestamp;
                this.reportCreateStartTimestamp = model.reportCreateStartTimestamp;
                this.reportTemplateId = model.reportTemplateId;
                this.reportUrl = model.reportUrl;
                this.status = model.status;
                this.templateReportId = model.templateReportId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * ReportCreateEndTimestamp.
             */
            public Builder reportCreateEndTimestamp(Long reportCreateEndTimestamp) {
                this.reportCreateEndTimestamp = reportCreateEndTimestamp;
                return this;
            }

            /**
             * ReportCreateStartTimestamp.
             */
            public Builder reportCreateStartTimestamp(Long reportCreateStartTimestamp) {
                this.reportCreateStartTimestamp = reportCreateStartTimestamp;
                return this;
            }

            /**
             * ReportTemplateId.
             */
            public Builder reportTemplateId(String reportTemplateId) {
                this.reportTemplateId = reportTemplateId;
                return this;
            }

            /**
             * ReportUrl.
             */
            public Builder reportUrl(String reportUrl) {
                this.reportUrl = reportUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateReportId.
             */
            public Builder templateReportId(String templateReportId) {
                this.templateReportId = templateReportId;
                return this;
            }

            public TemplateReport build() {
                return new TemplateReport(this);
            } 

        } 

    }
}
