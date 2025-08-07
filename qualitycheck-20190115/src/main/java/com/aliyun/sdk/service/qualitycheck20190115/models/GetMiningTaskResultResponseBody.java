// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetMiningTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMiningTaskResultResponseBody</p>
 */
public class GetMiningTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetMiningTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiningTaskResultResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetMiningTaskResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetMiningTaskResultResponseBody build() {
            return new GetMiningTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMiningTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMiningTaskResultResponseBody</p>
     */
    public static class FilePathList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        private FilePathList(Builder builder) {
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePathList create() {
            return builder().build();
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private String fileType; 
            private String fileUrl; 

            private Builder() {
            } 

            private Builder(FilePathList model) {
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
            } 

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FilePathList build() {
                return new FilePathList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMiningTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMiningTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FilePathList")
        private java.util.List<FilePathList> filePathList;

        @com.aliyun.core.annotation.NameInMap("FilePathMd")
        private String filePathMd;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.filePath = builder.filePath;
            this.filePathList = builder.filePathList;
            this.filePathMd = builder.filePathMd;
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
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return filePathList
         */
        public java.util.List<FilePathList> getFilePathList() {
            return this.filePathList;
        }

        /**
         * @return filePathMd
         */
        public String getFilePathMd() {
            return this.filePathMd;
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
            private String filePath; 
            private java.util.List<FilePathList> filePathList; 
            private String filePathMd; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.filePath = model.filePath;
                this.filePathList = model.filePathList;
                this.filePathMd = model.filePathMd;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * FilePathList.
             */
            public Builder filePathList(java.util.List<FilePathList> filePathList) {
                this.filePathList = filePathList;
                return this;
            }

            /**
             * FilePathMd.
             */
            public Builder filePathMd(String filePathMd) {
                this.filePathMd = filePathMd;
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
