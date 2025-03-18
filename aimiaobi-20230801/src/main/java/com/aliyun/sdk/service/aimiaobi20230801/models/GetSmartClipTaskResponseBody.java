// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetSmartClipTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartClipTaskResponseBody</p>
 */
public class GetSmartClipTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSmartClipTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmartClipTaskResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSmartClipTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSmartClipTaskResponseBody build() {
            return new GetSmartClipTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmartClipTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartClipTaskResponseBody</p>
     */
    public static class FileAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("FileLength")
        private String fileLength;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("TmpUrl")
        private String tmpUrl;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private FileAttr(Builder builder) {
            this.duration = builder.duration;
            this.fileLength = builder.fileLength;
            this.fileName = builder.fileName;
            this.height = builder.height;
            this.tmpUrl = builder.tmpUrl;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileAttr create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return fileLength
         */
        public String getFileLength() {
            return this.fileLength;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return tmpUrl
         */
        public String getTmpUrl() {
            return this.tmpUrl;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Double duration; 
            private String fileLength; 
            private String fileName; 
            private Integer height; 
            private String tmpUrl; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(FileAttr model) {
                this.duration = model.duration;
                this.fileLength = model.fileLength;
                this.fileName = model.fileName;
                this.height = model.height;
                this.tmpUrl = model.tmpUrl;
                this.width = model.width;
            } 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileLength.
             */
            public Builder fileLength(String fileLength) {
                this.fileLength = fileLength;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * TmpUrl.
             */
            public Builder tmpUrl(String tmpUrl) {
                this.tmpUrl = tmpUrl;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public FileAttr build() {
                return new FileAttr(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartClipTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartClipTaskResponseBody</p>
     */
    public static class SubJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileAttr")
        private FileAttr fileAttr;

        @com.aliyun.core.annotation.NameInMap("FileKey")
        private String fileKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJobId")
        private String subJobId;

        private SubJobs(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.fileAttr = builder.fileAttr;
            this.fileKey = builder.fileKey;
            this.status = builder.status;
            this.subJobId = builder.subJobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobs create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileAttr
         */
        public FileAttr getFileAttr() {
            return this.fileAttr;
        }

        /**
         * @return fileKey
         */
        public String getFileKey() {
            return this.fileKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subJobId
         */
        public String getSubJobId() {
            return this.subJobId;
        }

        public static final class Builder {
            private String errorMessage; 
            private FileAttr fileAttr; 
            private String fileKey; 
            private String status; 
            private String subJobId; 

            private Builder() {
            } 

            private Builder(SubJobs model) {
                this.errorMessage = model.errorMessage;
                this.fileAttr = model.fileAttr;
                this.fileKey = model.fileKey;
                this.status = model.status;
                this.subJobId = model.subJobId;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FileAttr.
             */
            public Builder fileAttr(FileAttr fileAttr) {
                this.fileAttr = fileAttr;
                return this;
            }

            /**
             * FileKey.
             */
            public Builder fileKey(String fileKey) {
                this.fileKey = fileKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubJobId.
             */
            public Builder subJobId(String subJobId) {
                this.subJobId = subJobId;
                return this;
            }

            public SubJobs build() {
                return new SubJobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmartClipTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartClipTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJobs")
        private java.util.List<SubJobs> subJobs;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.status = builder.status;
            this.subJobs = builder.subJobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subJobs
         */
        public java.util.List<SubJobs> getSubJobs() {
            return this.subJobs;
        }

        public static final class Builder {
            private String errorMessage; 
            private String status; 
            private java.util.List<SubJobs> subJobs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.status = model.status;
                this.subJobs = model.subJobs;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubJobs.
             */
            public Builder subJobs(java.util.List<SubJobs> subJobs) {
                this.subJobs = subJobs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
