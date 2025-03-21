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
         * <p>The download URL of the security report.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The time when the security report was exported.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-10</p>
         */
        public Builder exportDate(String exportDate) {
            this.exportDate = exportDate;
            return this;
        }

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder exportId(Long exportId) {
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>The status of the export task. Valid values:</p>
         * <ul>
         * <li><strong>fail</strong>: The export task fails.</li>
         * <li><strong>exporting</strong>: The export task is being executed.</li>
         * <li><strong>success</strong>: The export task is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exporting</p>
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * <p>The name of the report file that is exported.</p>
         * 
         * <strong>example:</strong>
         * <p>test_xxxx.html</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the security report.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FFDFCEB3-A5EE-590A-8E70-283EBC5D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp when the download URL expires. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673335497000</p>
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
