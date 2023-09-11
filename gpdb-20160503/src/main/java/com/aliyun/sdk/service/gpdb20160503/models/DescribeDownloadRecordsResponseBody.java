// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadRecordsResponseBody</p>
 */
public class DescribeDownloadRecordsResponseBody extends TeaModel {
    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDownloadRecordsResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * The URL that is used to download the file.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDownloadRecordsResponseBody build() {
            return new DescribeDownloadRecordsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("DownloadId")
        private Long downloadId;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ExceptionMsg")
        private String exceptionMsg;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Status")
        private String status;

        private Records(Builder builder) {
            this.downloadId = builder.downloadId;
            this.downloadUrl = builder.downloadUrl;
            this.exceptionMsg = builder.exceptionMsg;
            this.fileName = builder.fileName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return downloadId
         */
        public Long getDownloadId() {
            return this.downloadId;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return exceptionMsg
         */
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long downloadId; 
            private String downloadUrl; 
            private String exceptionMsg; 
            private String fileName; 
            private String status; 

            /**
             * The ID of the download record.
             */
            public Builder downloadId(Long downloadId) {
                this.downloadId = downloadId;
                return this;
            }

            /**
             * The URL that can be used to download the file.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The state of the upload task. After you call the DownloadDiagnosisRecords operation, query diagnostic information is first uploaded to Object Storage Service (OSS). After the upload task is complete, the query diagnostic information can be downloaded. Valid values:
             * <p>
             * 
             * *   **running**: uploading
             * *   **finished**: uploaded
             * *   **failed**: failed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
