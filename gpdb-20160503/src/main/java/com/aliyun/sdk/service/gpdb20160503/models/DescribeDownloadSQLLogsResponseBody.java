// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDownloadSQLLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadSQLLogsResponseBody</p>
 */
public class DescribeDownloadSQLLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDownloadSQLLogsResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadSQLLogsResponseBody create() {
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

        private Builder(DescribeDownloadSQLLogsResponseBody model) {
            this.records = model.records;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of download records.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FDE9942A-D919-527B-B559-5D0F6F20CCEC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDownloadSQLLogsResponseBody build() {
            return new DescribeDownloadSQLLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDownloadSQLLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadSQLLogsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadId")
        private Long downloadId;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExceptionMsg")
        private String exceptionMsg;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.downloadId = model.downloadId;
                this.downloadUrl = model.downloadUrl;
                this.exceptionMsg = model.exceptionMsg;
                this.fileName = model.fileName;
                this.status = model.status;
            } 

            /**
             * <p>Download record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1150</p>
             */
            public Builder downloadId(Long downloadId) {
                this.downloadId = downloadId;
                return this;
            }

            /**
             * <p>Download link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://perth-download-task.oss-cn-beijing.aliyuncs.com/">https://perth-download-task.oss-cn-beijing.aliyuncs.com/</a>*****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Error message</p>
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * <p>File name.</p>
             * 
             * <strong>example:</strong>
             * <p>20220509113448-20220509173448.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Task status, with possible values being:</p>
             * <ul>
             * <li><strong>running</strong>: Downloading.</li>
             * <li><strong>finished</strong>: Completed.</li>
             * <li><strong>failed</strong>: Download failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
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
