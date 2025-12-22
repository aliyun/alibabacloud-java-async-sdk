// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link CreateImageDetectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageDetectionTaskResponseBody</p>
 */
public class CreateImageDetectionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateImageDetectionTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageDetectionTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateImageDetectionTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateImageDetectionTaskResponseBody build() {
            return new CreateImageDetectionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageDetectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateImageDetectionTaskResponseBody</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileTraceId")
        private String fileTraceId;

        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        private FileInfo(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileTraceId = builder.fileTraceId;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileTraceId
         */
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String fileTraceId; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileTraceId = model.fileTraceId;
                this.ossKey = model.ossKey;
            } 

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileTraceId.
             */
            public Builder fileTraceId(String fileTraceId) {
                this.fileTraceId = fileTraceId;
                return this;
            }

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImageDetectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateImageDetectionTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileInfo")
        private FileInfo fileInfo;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.fileInfo = builder.fileInfo;
            this.requestId = builder.requestId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileInfo
         */
        public FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private FileInfo fileInfo; 
            private String requestId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileInfo = model.fileInfo;
                this.requestId = model.requestId;
                this.taskId = model.taskId;
            } 

            /**
             * fileInfo.
             */
            public Builder fileInfo(FileInfo fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
