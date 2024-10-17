// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserUploadFileJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserUploadFileJobResponseBody</p>
 */
public class GetUserUploadFileJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UploadFileJobDetail")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BDEFE9F2-B3B4-42D0-83AE-ECF9FC067DCD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the file upload task.</p>
         */
        public Builder uploadFileJobDetail(UploadFileJobDetail uploadFileJobDetail) {
            this.uploadFileJobDetail = uploadFileJobDetail;
            return this;
        }

        public GetUserUploadFileJobResponseBody build() {
            return new GetUserUploadFileJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserUploadFileJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserUploadFileJobResponseBody</p>
     */
    public static class UploadOSSParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
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
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test_bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The endpoint of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss-cn-hangzhou.aliyuncs.com">http://oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The name of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>test.sql</p>
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
    /**
     * 
     * {@link GetUserUploadFileJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserUploadFileJobResponseBody</p>
     */
    public static class UploadFileJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentKey")
        private String attachmentKey;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("FileSource")
        private String fileSource;

        @com.aliyun.core.annotation.NameInMap("JobKey")
        private String jobKey;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("JobStatusDesc")
        private String jobStatusDesc;

        @com.aliyun.core.annotation.NameInMap("UploadOSSParam")
        private UploadOSSParam uploadOSSParam;

        @com.aliyun.core.annotation.NameInMap("UploadType")
        private String uploadType;

        @com.aliyun.core.annotation.NameInMap("UploadURL")
        private String uploadURL;

        @com.aliyun.core.annotation.NameInMap("UploadedSize")
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
             * <p>The key of the file that is returned after the file is uploaded. You can use this key when you upload the file as an attachment in a ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>upload_3c7edea3-e4c3-4403-857d-737043036f69_test.sql</p>
             */
            public Builder attachmentKey(String attachmentKey) {
                this.attachmentKey = attachmentKey;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.sql</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>2968269</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The purpose of the uploaded file. Valid values:</p>
             * <ul>
             * <li><strong>datacorrect</strong>: The file is uploaded to change data.</li>
             * <li><strong>order_info_attachment</strong>: The file is uploaded as an attachment in a ticket.</li>
             * <li><strong>big-file</strong>: The file is uploaded to import multiple data records at a time.</li>
             * <li><strong>sqlreview</strong>: The file is uploaded for SQL review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>datacorrect</p>
             */
            public Builder fileSource(String fileSource) {
                this.fileSource = fileSource;
                return this;
            }

            /**
             * <p>The key of the file upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>65254a4c1614235217749100e</p>
             */
            public Builder jobKey(String jobKey) {
                this.jobKey = jobKey;
                return this;
            }

            /**
             * <p>The status of the file upload task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The file upload task was initialized.</li>
             * <li><strong>PENDING</strong>: The file upload task waited to be run.</li>
             * <li><strong>BE_SCHEDULED</strong>: The file upload task waited to be scheduled.</li>
             * <li><strong>FAIL</strong>: The file upload task failed.</li>
             * <li><strong>SUCCESS</strong>: The file upload task was successful.</li>
             * <li><strong>RUNNING</strong>: The file upload task was being run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The information about the status of the file upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder jobStatusDesc(String jobStatusDesc) {
                this.jobStatusDesc = jobStatusDesc;
                return this;
            }

            /**
             * <p>The information about the Object Storage Service (OSS) bucket from which the file is uploaded.</p>
             * <blockquote>
             * <p>This parameter is returned if the value of <strong>UploadType</strong> is <strong>OSS</strong>.</p>
             * </blockquote>
             */
            public Builder uploadOSSParam(UploadOSSParam uploadOSSParam) {
                this.uploadOSSParam = uploadOSSParam;
                return this;
            }

            /**
             * <p>The method used to upload the file. Valid values:</p>
             * <ul>
             * <li><strong>URL</strong></li>
             * <li><strong>OSS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder uploadType(String uploadType) {
                this.uploadType = uploadType;
                return this;
            }

            /**
             * <p>The URL of the file.</p>
             * <blockquote>
             * <p>This parameter is returned if the value of <strong>UploadType</strong> is <strong>URL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx/test.sql">http://xxxx/test.sql</a></p>
             */
            public Builder uploadURL(String uploadURL) {
                this.uploadURL = uploadURL;
                return this;
            }

            /**
             * <p>The size of the uploaded file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>2968269</p>
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
