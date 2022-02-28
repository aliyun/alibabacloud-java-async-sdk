// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportInfoResponseBody</p>
 */
public class DescribeExportInfoResponseBody extends TeaModel {
    @NameInMap("CurrentCount")
    private Integer currentCount;

    @NameInMap("ExportStatus")
    private String exportStatus;

    @NameInMap("FileName")
    private String fileName;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Link")
    private String link;

    @NameInMap("Message")
    private String message;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeExportInfoResponseBody(Builder builder) {
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

    public static DescribeExportInfoResponseBody create() {
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
         * CurrentCount.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * ExportStatus.
         */
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Link.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExportInfoResponseBody build() {
            return new DescribeExportInfoResponseBody(this);
        } 

    } 

}
