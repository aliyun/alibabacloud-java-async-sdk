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
         * <p>The URL that is used to download the file.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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
             * <p>The ID of the download record.</p>
             * 
             * <strong>example:</strong>
             * <p>1150</p>
             */
            public Builder downloadId(Long downloadId) {
                this.downloadId = downloadId;
                return this;
            }

            /**
             * <p>The URL that can be used to download the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://perth-download-task.oss-cn-beijing.aliyuncs.com/">https://perth-download-task.oss-cn-beijing.aliyuncs.com/</a>*****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Error message</p>
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>20220509113448-20220509173448.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The state of the upload task. After you call the DownloadDiagnosisRecords operation, query diagnostic information is first uploaded to Object Storage Service (OSS). After the upload task is complete, the query diagnostic information can be downloaded. Valid values:</p>
             * <ul>
             * <li><strong>running</strong>: uploading</li>
             * <li><strong>finished</strong>: uploaded</li>
             * <li><strong>failed</strong>: failed</li>
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
