// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetURLUploadInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetURLUploadInfosResponseBody</p>
 */
public class GetURLUploadInfosResponseBody extends TeaModel {
    @NameInMap("NonExists")
    private java.util.List < String > nonExists;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("URLUploadInfoList")
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
         * The error message returned.
         */
        public Builder nonExists(java.util.List < String > nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * The ID of the uploaded media file.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the upload job was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UploadURL")
        private String uploadURL;

        @NameInMap("UserData")
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
             * The error code returned.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The custom configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The upload URL of the source file.
             * <p>
             * 
             * > A maximum of 100 URLs can be returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Queries the information about URL-based upload jobs.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The time when the upload job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UploadURL.
             */
            public Builder uploadURL(String uploadURL) {
                this.uploadURL = uploadURL;
                return this;
            }

            /**
             * UserData.
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
