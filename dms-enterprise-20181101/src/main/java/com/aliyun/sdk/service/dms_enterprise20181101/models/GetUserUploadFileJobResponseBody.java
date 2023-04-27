// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserUploadFileJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserUploadFileJobResponseBody</p>
 */
public class GetUserUploadFileJobResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("UploadFileJobDetail")
    private UploadFileJobDetail uploadFileJobDetail;

    private GetUserUploadFileJobResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uploadFileJobDetail = builder.uploadFileJobDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserUploadFileJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return uploadFileJobDetail
     */
    public UploadFileJobDetail getUploadFileJobDetail() {
        return this.uploadFileJobDetail;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private UploadFileJobDetail uploadFileJobDetail; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The key of the file that is returned after the file is uploaded. You can use this key when you upload the file as an attachment in a ticket.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The endpoint of the OSS bucket.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The size of the file. Unit: byte.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The name of the OSS bucket.
         */
        public Builder uploadFileJobDetail(UploadFileJobDetail uploadFileJobDetail) {
            this.uploadFileJobDetail = uploadFileJobDetail;
            return this;
        }

        public GetUserUploadFileJobResponseBody build() {
            return new GetUserUploadFileJobResponseBody(this);
        } 

    } 

    public static class UploadOSSParam extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("ObjectName")
        private String objectName;

        private UploadOSSParam(Builder builder) {
            this.bucketName = builder.bucketName;
            this.endpoint = builder.endpoint;
            this.objectName = builder.objectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadOSSParam create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        public static final class Builder {
            private String bucketName; 
            private String endpoint; 
            private String objectName; 

            /**
             * The information about the Object Storage Service (OSS) bucket from which the file is uploaded.
             * <p>
             * 
             * >  This parameter is returned if the **UploadType** parameter is set to **OSS**.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The URL of the file.
             * <p>
             * 
             * >  This parameter is returned if the **UploadType** parameter is set to **URL**.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            public UploadOSSParam build() {
                return new UploadOSSParam(this);
            } 

        } 

    }
    public static class UploadFileJobDetail extends TeaModel {
        @NameInMap("AttachmentKey")
        private String attachmentKey;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("FileSource")
        private String fileSource;

        @NameInMap("JobKey")
        private String jobKey;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("JobStatusDesc")
        private String jobStatusDesc;

        @NameInMap("UploadOSSParam")
        private UploadOSSParam uploadOSSParam;

        @NameInMap("UploadType")
        private String uploadType;

        @NameInMap("UploadURL")
        private String uploadURL;

        @NameInMap("UploadedSize")
        private Long uploadedSize;

        private UploadFileJobDetail(Builder builder) {
            this.attachmentKey = builder.attachmentKey;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileSource = builder.fileSource;
            this.jobKey = builder.jobKey;
            this.jobStatus = builder.jobStatus;
            this.jobStatusDesc = builder.jobStatusDesc;
            this.uploadOSSParam = builder.uploadOSSParam;
            this.uploadType = builder.uploadType;
            this.uploadURL = builder.uploadURL;
            this.uploadedSize = builder.uploadedSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadFileJobDetail create() {
            return builder().build();
        }

        /**
         * @return attachmentKey
         */
        public String getAttachmentKey() {
            return this.attachmentKey;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileSource
         */
        public String getFileSource() {
            return this.fileSource;
        }

        /**
         * @return jobKey
         */
        public String getJobKey() {
            return this.jobKey;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobStatusDesc
         */
        public String getJobStatusDesc() {
            return this.jobStatusDesc;
        }

        /**
         * @return uploadOSSParam
         */
        public UploadOSSParam getUploadOSSParam() {
            return this.uploadOSSParam;
        }

        /**
         * @return uploadType
         */
        public String getUploadType() {
            return this.uploadType;
        }

        /**
         * @return uploadURL
         */
        public String getUploadURL() {
            return this.uploadURL;
        }

        /**
         * @return uploadedSize
         */
        public Long getUploadedSize() {
            return this.uploadedSize;
        }

        public static final class Builder {
            private String attachmentKey; 
            private String fileName; 
            private Long fileSize; 
            private String fileSource; 
            private String jobKey; 
            private String jobStatus; 
            private String jobStatusDesc; 
            private UploadOSSParam uploadOSSParam; 
            private String uploadType; 
            private String uploadURL; 
            private Long uploadedSize; 

            /**
             * AttachmentKey.
             */
            public Builder attachmentKey(String attachmentKey) {
                this.attachmentKey = attachmentKey;
                return this;
            }

            /**
             * The key of the file upload task. You can call the [CreateUploadFileJob](~~206059~~) or [CreateUploadOSSFileJob](~~206060~~) operation to query the key.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * -1
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The information about the status of the file upload task.
             */
            public Builder fileSource(String fileSource) {
                this.fileSource = fileSource;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder jobKey(String jobKey) {
                this.jobKey = jobKey;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * JobStatusDesc.
             */
            public Builder jobStatusDesc(String jobStatusDesc) {
                this.jobStatusDesc = jobStatusDesc;
                return this;
            }

            /**
             * The size of the uploaded file. Unit: byte.
             */
            public Builder uploadOSSParam(UploadOSSParam uploadOSSParam) {
                this.uploadOSSParam = uploadOSSParam;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder uploadType(String uploadType) {
                this.uploadType = uploadType;
                return this;
            }

            /**
             * The purpose of the uploaded file. Valid values:
             * <p>
             * 
             * *   **datacorrect**: The file is uploaded to change data.
             * *   **order_info_attachment**: The file is uploaded as an attachment in a ticket.
             * *   **big-file**: The file is uploaded to import multiple data records at a time.
             * *   **sqlreview**: The file is uploaded for SQL review.
             */
            public Builder uploadURL(String uploadURL) {
                this.uploadURL = uploadURL;
                return this;
            }

            /**
             * The key of the file upload task.
             */
            public Builder uploadedSize(Long uploadedSize) {
                this.uploadedSize = uploadedSize;
                return this;
            }

            public UploadFileJobDetail build() {
                return new UploadFileJobDetail(this);
            } 

        } 

    }
}
