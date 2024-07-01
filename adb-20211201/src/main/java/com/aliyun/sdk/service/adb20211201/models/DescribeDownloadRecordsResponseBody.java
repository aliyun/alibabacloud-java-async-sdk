// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadRecordsResponseBody</p>
 */
public class DescribeDownloadRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDownloadRecordsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The queried download tasks.
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
        @com.aliyun.core.annotation.NameInMap("DownloadId")
        private Long downloadId;

        @com.aliyun.core.annotation.NameInMap("ExceptionMsg")
        private String exceptionMsg;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Records(Builder builder) {
            this.downloadId = builder.downloadId;
            this.exceptionMsg = builder.exceptionMsg;
            this.fileName = builder.fileName;
            this.status = builder.status;
            this.url = builder.url;
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long downloadId; 
            private String exceptionMsg; 
            private String fileName; 
            private String status; 
            private String url; 

            /**
             * The download job ID.
             */
            public Builder downloadId(Long downloadId) {
                this.downloadId = downloadId;
                return this;
            }

            /**
             * The error message returned if the download job failed.
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * The name of the downloaded file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The status of the download job. Valid values:
             * <p>
             * 
             * *   **running**
             * *   **finished**
             * *   **failed**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The download URL of the file.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
