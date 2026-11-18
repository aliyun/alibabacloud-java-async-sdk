// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.internetbankopen20240612.models;

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
 * {@link GetAiReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiReportResponseBody</p>
 */
public class GetAiReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAiReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAiReportResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The report query result, which contains ReportStatus. The Report object is included only when the report is available.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identity of the request, which is used for Tracing Analysis and troubleshooting. Provide this ID when you troubleshoot exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>9634F2B3-B59C-5475-BA9F-96D95271882C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAiReportResponseBody build() {
            return new GetAiReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiReportResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentExpiresAt")
        private String contentExpiresAt;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("UrlExpiresAt")
        private String urlExpiresAt;

        private Report(Builder builder) {
            this.contentExpiresAt = builder.contentExpiresAt;
            this.downloadUrl = builder.downloadUrl;
            this.reportId = builder.reportId;
            this.urlExpiresAt = builder.urlExpiresAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return contentExpiresAt
         */
        public String getContentExpiresAt() {
            return this.contentExpiresAt;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return urlExpiresAt
         */
        public String getUrlExpiresAt() {
            return this.urlExpiresAt;
        }

        public static final class Builder {
            private String contentExpiresAt; 
            private String downloadUrl; 
            private String reportId; 
            private String urlExpiresAt; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.contentExpiresAt = model.contentExpiresAt;
                this.downloadUrl = model.downloadUrl;
                this.reportId = model.reportId;
                this.urlExpiresAt = model.urlExpiresAt;
            } 

            /**
             * <p>The expiration time of the report content retention period. The time is in UTC RFC 3339 format, ends with Z, and may contain fractional seconds. No download URL is issued after this time. If the delivery is not suspended, EXPIRED is returned. If the delivery is also suspended, UNAVAILABLE is returned preferentially. This is the content expiration time, not the expiration time of a single URL.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-12T06:20:00Z</p>
             */
            public Builder contentExpiresAt(String contentExpiresAt) {
                this.contentExpiresAt = contentExpiresAt;
                return this;
            }

            /**
             * <p>The temporary signed download URL. Use the URL before UrlExpiresAt. The validity period of the signed URL does not exceed 300 seconds and is no later than ContentExpiresAt. If the URL expires but the content has not expired, you can query again to obtain a new URL. The example only shows the URL format and is not a real downloadable link. Use the complete URL in the actual response. Do not concatenate the URL yourself or share it publicly.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://reports.example.com/report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a.pdf">https://reports.example.com/report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a.pdf</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The unique ID of the report. You can use this ID as the reportId parameter to query the report again. This is the report asset ID, not an internal task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The expiration time of the current DownloadUrl. The time is in UTC RFC 3339 format, ends with Z, and may contain fractional seconds. You cannot use the URL after it expires, and this time is no later than ContentExpiresAt.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-12T06:25:00Z</p>
             */
            public Builder urlExpiresAt(String urlExpiresAt) {
                this.urlExpiresAt = urlExpiresAt;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Report")
        private Report report;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        private Data(Builder builder) {
            this.report = builder.report;
            this.reportStatus = builder.reportStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return report
         */
        public Report getReport() {
            return this.report;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        public static final class Builder {
            private Report report; 
            private String reportStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.report = model.report;
                this.reportStatus = model.reportStatus;
            } 

            /**
             * <p>The download information of the available report, which is returned only when ReportStatus is AVAILABLE. The report ownership and the corresponding object version are verified before the download.</p>
             */
            public Builder report(Report report) {
                this.report = report;
                return this;
            }

            /**
             * <p>The report status. Valid values:</p>
             * <ul>
             * <li>NOT_APPLICABLE: The product does not include a report.</li>
             * <li>WAITING_DATA: The data call result is not determined.</li>
             * <li>NO_DATA: No data is found, and no per-use report is generated.</li>
             * <li>WAITING_PERIOD: The query result for the callId of a periodic product. You must obtain the ReportId by calling ListProductReports and then query the report.</li>
             * <li>QUEUED: The report task is queued.</li>
             * <li>RUNNING: The report task is being processed.</li>
             * <li>AVAILABLE: The report is available, and the Report object is returned in this response.</li>
             * <li>FAILED: The data call or report generation failed.</li>
             * <li>EXPIRED: The report content has expired.</li>
             * <li>UNAVAILABLE: The delivery of the report is suspended.</li>
             * </ul>
             * <p>You can query again later by using the same ID when the status is WAITING_DATA, QUEUED, or RUNNING. Repeated queries do not regenerate the report when the status is FAILED. The Report object is not returned unless the status is AVAILABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
