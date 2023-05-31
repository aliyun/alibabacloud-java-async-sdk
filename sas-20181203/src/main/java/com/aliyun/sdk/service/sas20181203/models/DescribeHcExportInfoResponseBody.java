// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHcExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHcExportInfoResponseBody</p>
 */
public class DescribeHcExportInfoResponseBody extends TeaModel {
    @NameInMap("CurrentCount")
    private Integer currentCount;

    @NameInMap("FileName")
    private String fileName;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Link")
    private String link;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultStatus")
    private String resultStatus;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHcExportInfoResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.fileName = builder.fileName;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.link = builder.link;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.resultStatus = builder.resultStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHcExportInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
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
     * @return resultStatus
     */
    public String getResultStatus() {
        return this.resultStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentCount; 
        private String fileName; 
        private Long gmtCreate; 
        private Long id; 
        private String link; 
        private Integer progress; 
        private String requestId; 
        private String resultStatus; 
        private Integer totalCount; 

        /**
         * The number of exported entries.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * The name of the exported file.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The time when the export task was created.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * The ID of the export task.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The download URL for the exported file.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * The progress percentage of the export task.
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
         * The status of the export task. Valid values:
         * <p>
         * 
         * *   **exporting**: The task is in progress.
         * *   **success**: The task is complete.
         */
        public Builder resultStatus(String resultStatus) {
            this.resultStatus = resultStatus;
            return this;
        }

        /**
         * The total number of exported entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHcExportInfoResponseBody build() {
            return new DescribeHcExportInfoResponseBody(this);
        } 

    } 

}
