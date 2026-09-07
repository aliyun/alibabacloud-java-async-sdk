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
         * <p>Result code. <strong>200</strong> indicates success. Any other value indicates failure. Use this field to determine the cause of failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Quality inspection task ID.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Details of the error if an error occurs. Otherwise, <strong>successful</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. true means success. false or null means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>Generated file type</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>Generated file URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://vxxxcustomer-pop.oss-cn-shanghai.aliyuncs.com/100.csv">http://vxxxcustomer-pop.oss-cn-shanghai.aliyuncs.com/100.csv</a></p>
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
             * <p>File path</p>
             * 
             * <strong>example:</strong>
             * <p>123.22.com/manager/static/login-back.jpg</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>List of returned file paths</p>
             */
            public Builder filePathList(java.util.List<FilePathList> filePathList) {
                this.filePathList = filePathList;
                return this;
            }

            /**
             * <p>Markdown file path</p>
             * 
             * <strong>example:</strong>
             * <p>123.22.com/manager/static/login-back.md</p>
             */
            public Builder filePathMd(String filePathMd) {
                this.filePathMd = filePathMd;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task status</p>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
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
