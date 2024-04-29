// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulExportInfoResponseBody</p>
 */
public class DescribeVulExportInfoResponseBody extends TeaModel {
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

    private DescribeVulExportInfoResponseBody(Builder builder) {
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

    public static DescribeVulExportInfoResponseBody create() {
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
         * The number of exported entries.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * The status of the export task. Valid values:
         * <p>
         * 
         * *   **init**: The task is being initialized.
         * *   **exporting**: The task is in progress.
         * *   **success**: The task is complete.
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * The name of the exported Excel file.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The URL at which you can download the exported Excel file.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * The message that shows the results of the task. The value is fixed as **success**, which indicates that the task is complete.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The progress percentage of the task.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries in the exported Excel file.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulExportInfoResponseBody build() {
            return new DescribeVulExportInfoResponseBody(this);
        } 

    } 

}
