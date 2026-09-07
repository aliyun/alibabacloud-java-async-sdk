// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetWmEmbedTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetWmEmbedTaskResponseBody</p>
 */
public class GetWmEmbedTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWmEmbedTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWmEmbedTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWmEmbedTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result of the watermark embedding job.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWmEmbedTaskResponseBody build() {
            return new GetWmEmbedTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWmEmbedTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetWmEmbedTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("FileUrlExp")
        private String fileUrlExp;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("OutFileHashMd5")
        private String outFileHashMd5;

        @com.aliyun.core.annotation.NameInMap("OutFileSize")
        private Long outFileSize;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.fileUrlExp = builder.fileUrlExp;
            this.filename = builder.filename;
            this.outFileHashMd5 = builder.outFileHashMd5;
            this.outFileSize = builder.outFileSize;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return fileUrlExp
         */
        public String getFileUrlExp() {
            return this.fileUrlExp;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return outFileHashMd5
         */
        public String getOutFileHashMd5() {
            return this.outFileHashMd5;
        }

        /**
         * @return outFileSize
         */
        public Long getOutFileSize() {
            return this.outFileSize;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String fileUrl; 
            private String fileUrlExp; 
            private String filename; 
            private String outFileHashMd5; 
            private Long outFileSize; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileUrl = model.fileUrl;
                this.fileUrlExp = model.fileUrlExp;
                this.filename = model.filename;
                this.outFileHashMd5 = model.outFileHashMd5;
                this.outFileSize = model.outFileSize;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The temporary URL of the file embedded with watermark information.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/embed-****.pdf">https://example.com/embed-****.pdf</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>Expiration time of FileUrl, formatted as a Unix timestamp with second-level precision.</p>
             * 
             * <strong>example:</strong>
             * <p>171859****</p>
             */
            public Builder fileUrlExp(String fileUrlExp) {
                this.fileUrlExp = fileUrlExp;
                return this;
            }

            /**
             * <p>The filename of the file embedded with watermark information.</p>
             * 
             * <strong>example:</strong>
             * <p>embed-****.pdf</p>
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * <p>The MD5 hash of the file with embedded watermark information, used for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d8cd98f00b204e9800998ecf8****</p>
             */
            public Builder outFileHashMd5(String outFileHashMd5) {
                this.outFileHashMd5 = outFileHashMd5;
                return this;
            }

            /**
             * <p>The size in bytes of the file embedded with watermark information. This is used for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>123**</p>
             */
            public Builder outFileSize(Long outFileSize) {
                this.outFileSize = outFileSize;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job:5GfrJYsoaffmCE7Z5bZtjUxxxxxxxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task Status. Valid values:  </p>
             * <ul>
             * <li><strong>Running</strong>: The job is running.  </li>
             * <li><strong>Success</strong>: The job succeeded.  </li>
             * <li><strong>Failed</strong>: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
