// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCustomizeReportResponseBody} extends {@link TeaModel}
 *
 * <p>ExportCustomizeReportResponseBody</p>
 */
public class ExportCustomizeReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ExportDate")
    private String exportDate;

    @com.aliyun.core.annotation.NameInMap("ExportId")
    private Long exportId;

    @com.aliyun.core.annotation.NameInMap("ExportStatus")
    private String exportStatus;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlExpiredTime")
    private Long urlExpiredTime;

    private ExportCustomizeReportResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.exportDate = builder.exportDate;
        this.exportId = builder.exportId;
        this.exportStatus = builder.exportStatus;
        this.fileName = builder.fileName;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.urlExpiredTime = builder.urlExpiredTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCustomizeReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return exportDate
     */
    public String getExportDate() {
        return this.exportDate;
    }

    /**
     * @return exportId
     */
    public Long getExportId() {
        return this.exportId;
    }

    /**
     * @return exportStatus
     */
    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return urlExpiredTime
     */
    public Long getUrlExpiredTime() {
        return this.urlExpiredTime;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String exportDate; 
        private Long exportId; 
        private String exportStatus; 
        private String fileName; 
        private Long reportId; 
        private String requestId; 
        private Long urlExpiredTime; 

        /**
         * The download URL of the security report.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * The time when the security report was exported.
         */
        public Builder exportDate(String exportDate) {
            this.exportDate = exportDate;
            return this;
        }

        /**
         * The ID of the export task.
         */
        public Builder exportId(Long exportId) {
            this.exportId = exportId;
            return this;
        }

        /**
         * The status of the export task. Valid values:
         * <p>
         * 
         * *   **fail**: The export task fails.
         * *   **exporting**: The export task is being executed.
         * *   **success**: The export task is successful.
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * The name of the report file that is exported.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The ID of the security report.
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timestamp when the download URL expires. Unit: seconds.
         */
        public Builder urlExpiredTime(Long urlExpiredTime) {
            this.urlExpiredTime = urlExpiredTime;
            return this;
        }

        public ExportCustomizeReportResponseBody build() {
            return new ExportCustomizeReportResponseBody(this);
        } 

    } 

}
