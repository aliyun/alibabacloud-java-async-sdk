// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDownloadRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadRecordsResponseBody</p>
 */
public class DescribeDownloadRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Records> records; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDownloadRecordsResponseBody model) {
            this.records = model.records;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried download tasks.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>987F51BE-C4CB-332A-B159-63CE87******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDownloadRecordsResponseBody build() {
            return new DescribeDownloadRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDownloadRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadRecordsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.downloadId = model.downloadId;
                this.exceptionMsg = model.exceptionMsg;
                this.fileName = model.fileName;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * <p>The download task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder downloadId(Long downloadId) {
                this.downloadId = downloadId;
                return this;
            }

            /**
             * <p>The error message returned if the download task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The query result is empty.</p>
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * <p>The name of the downloaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>20210806094635-20210806095135</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The status of the download task. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>finished</strong></li>
             * <li><strong>failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The download URL of the file.</p>
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
