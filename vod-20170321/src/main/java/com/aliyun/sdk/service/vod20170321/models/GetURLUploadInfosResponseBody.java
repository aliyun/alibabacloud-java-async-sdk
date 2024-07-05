// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetURLUploadInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetURLUploadInfosResponseBody</p>
 */
public class GetURLUploadInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExists")
    private java.util.List < String > nonExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("URLUploadInfoList")
    private java.util.List < URLUploadInfoList> URLUploadInfoList;

    private GetURLUploadInfosResponseBody(Builder builder) {
        this.nonExists = builder.nonExists;
        this.requestId = builder.requestId;
        this.URLUploadInfoList = builder.URLUploadInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetURLUploadInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExists
     */
    public java.util.List < String > getNonExists() {
        return this.nonExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return URLUploadInfoList
     */
    public java.util.List < URLUploadInfoList> getURLUploadInfoList() {
        return this.URLUploadInfoList;
    }

    public static final class Builder {
        private java.util.List < String > nonExists; 
        private String requestId; 
        private java.util.List < URLUploadInfoList> URLUploadInfoList; 

        /**
         * The job IDs or upload URLs that do not exist.
         */
        public Builder nonExists(java.util.List < String > nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about URL-based upload jobs. For more information, see the "URLUploadInfo: the information about a URL-based upload job" section of the [Basic structures](~~52839~~) topic.
         */
        public Builder URLUploadInfoList(java.util.List < URLUploadInfoList> URLUploadInfoList) {
            this.URLUploadInfoList = URLUploadInfoList;
            return this;
        }

        public GetURLUploadInfosResponseBody build() {
            return new GetURLUploadInfosResponseBody(this);
        } 

    } 

    public static class URLUploadInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UploadURL")
        private String uploadURL;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private URLUploadInfoList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.fileSize = builder.fileSize;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.status = builder.status;
            this.uploadURL = builder.uploadURL;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static URLUploadInfoList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uploadURL
         */
        public String getUploadURL() {
            return this.uploadURL;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String errorCode; 
            private String errorMessage; 
            private String fileSize; 
            private String jobId; 
            private String mediaId; 
            private String status; 
            private String uploadURL; 
            private String userData; 

            /**
             * The time when the upload job was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The time when the upload job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The size of the uploaded media file. Unit: byte.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The ID of the upload job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The ID of the uploaded media file.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The status of the URL-based upload job. For more information about the valid values and value description of the parameter, see the "Status: the status of a video" section of the [Basic structures](~~52839~~) topic.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The upload URL of the source file.
             * <p>
             * 
             * > A maximum of 100 URLs can be returned.
             */
            public Builder uploadURL(String uploadURL) {
                this.uploadURL = uploadURL;
                return this;
            }

            /**
             * The custom configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public URLUploadInfoList build() {
                return new URLUploadInfoList(this);
            } 

        } 

    }
}
