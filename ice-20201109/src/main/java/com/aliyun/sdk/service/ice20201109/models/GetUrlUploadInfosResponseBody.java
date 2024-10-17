// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUrlUploadInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetUrlUploadInfosResponseBody</p>
 */
public class GetUrlUploadInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExists")
    private java.util.List < String > nonExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("URLUploadInfoList")
    private java.util.List < URLUploadInfoList> URLUploadInfoList;

    private GetUrlUploadInfosResponseBody(Builder builder) {
        this.nonExists = builder.nonExists;
        this.requestId = builder.requestId;
        this.URLUploadInfoList = builder.URLUploadInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrlUploadInfosResponseBody create() {
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
         * <p>The job IDs or upload URLs that do not exist.</p>
         */
        public Builder nonExists(java.util.List < String > nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about URL-based upload jobs.</p>
         */
        public Builder URLUploadInfoList(java.util.List < URLUploadInfoList> URLUploadInfoList) {
            this.URLUploadInfoList = URLUploadInfoList;
            return this;
        }

        public GetUrlUploadInfosResponseBody build() {
            return new GetUrlUploadInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUrlUploadInfosResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrlUploadInfosResponseBody</p>
     */
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
             * <p>The time when the upload job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-26 21:47:37</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the upload job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-07T10:03:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error code returned if the upload job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the upload job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>64610</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The ID of the upload job.</p>
             * 
             * <strong>example:</strong>
             * <p>3829500c0fef429fa4ec1680b122d***</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the uploaded media file.</p>
             * 
             * <strong>example:</strong>
             * <p>5014ca70f08171ecbf940764a0fd6***</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The status of the upload job. For more information about the valid values of the parameter, see the &quot;Status: the status of a URL-based upload job&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic data types</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The upload URL of the source file.</p>
             * <blockquote>
             * <p> A maximum of 100 URLs can be returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>http://****.mp4</p>
             */
            public Builder uploadURL(String uploadURL) {
                this.uploadURL = uploadURL;
                return this;
            }

            /**
             * <p>The user data. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MessageCallback&quot;:&quot;{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>&quot;, &quot;Extend&quot;:&quot;{&quot;localId&quot;:&quot;***&quot;, &quot;test&quot;:&quot;www&quot;}&quot;}</p>
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
