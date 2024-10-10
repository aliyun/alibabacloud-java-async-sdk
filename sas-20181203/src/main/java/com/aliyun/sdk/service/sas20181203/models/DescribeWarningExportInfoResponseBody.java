// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWarningExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWarningExportInfoResponseBody</p>
 */
public class DescribeWarningExportInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentCount")
    private Integer currentCount;

    @com.aliyun.core.annotation.NameInMap("ExportStatus")
    private String exportStatus;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWarningExportInfoResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.exportStatus = builder.exportStatus;
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.link = builder.link;
        this.message = builder.message;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarningExportInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return this.currentCount;
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentCount; 
        private String exportStatus; 
        private String fileName; 
        private Long id; 
        private String link; 
        private String message; 
        private Integer progress; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The number of baseline entries that are exported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * <p>The status of the export task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The task is being initialized.</li>
         * <li><strong>exporting</strong>: The task is in progress.</li>
         * <li><strong>success</strong>: The task is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * <p>The name of the exported Excel file.</p>
         * 
         * <strong>example:</strong>
         * <p>app_20210917</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the export task for the baseline check result.</p>
         * 
         * <strong>example:</strong>
         * <p>131231</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The URL at which you can download the exported Excel file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eds.aliyun.com/notification/entitle/64b5c3e2-e52b-4d29-9617-e7e6d74XXXX">https://eds.aliyun.com/notification/entitle/64b5c3e2-e52b-4d29-9617-e7e6d74XXXX</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The message that shows the task result. The value is fixed as <strong>successful</strong>, which indicates that the export task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The progress percentage of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of baseline entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWarningExportInfoResponseBody build() {
            return new DescribeWarningExportInfoResponseBody(this);
        } 

    } 

}
