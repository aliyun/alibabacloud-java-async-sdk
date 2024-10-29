// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * FileUrlExp.
             */
            public Builder fileUrlExp(String fileUrlExp) {
                this.fileUrlExp = fileUrlExp;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * OutFileHashMd5.
             */
            public Builder outFileHashMd5(String outFileHashMd5) {
                this.outFileHashMd5 = outFileHashMd5;
                return this;
            }

            /**
             * OutFileSize.
             */
            public Builder outFileSize(Long outFileSize) {
                this.outFileSize = outFileSize;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
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
