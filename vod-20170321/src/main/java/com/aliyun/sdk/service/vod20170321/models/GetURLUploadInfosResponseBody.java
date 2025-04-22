// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetURLUploadInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetURLUploadInfosResponseBody</p>
 */
public class GetURLUploadInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExists")
    private java.util.List<String> nonExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("URLUploadInfoList")
    private java.util.List<URLUploadInfoList> URLUploadInfoList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nonExists
     */
    public java.util.List<String> getNonExists() {
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
    public java.util.List<URLUploadInfoList> getURLUploadInfoList() {
        return this.URLUploadInfoList;
    }

    public static final class Builder {
        private java.util.List<String> nonExists; 
        private String requestId; 
        private java.util.List<URLUploadInfoList> URLUploadInfoList; 

        private Builder() {
        } 

        private Builder(GetURLUploadInfosResponseBody model) {
            this.nonExists = model.nonExists;
            this.requestId = model.requestId;
            this.URLUploadInfoList = model.URLUploadInfoList;
        } 

        /**
         * <p>The job IDs or upload URLs that do not exist.</p>
         */
        public Builder nonExists(java.util.List<String> nonExists) {
            this.nonExists = nonExists;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about URL-based upload jobs. For more information, see the &quot;URLUploadInfo: the information about a URL-based upload job&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
         */
        public Builder URLUploadInfoList(java.util.List<URLUploadInfoList> URLUploadInfoList) {
            this.URLUploadInfoList = URLUploadInfoList;
            return this;
        }

        public GetURLUploadInfosResponseBody build() {
            return new GetURLUploadInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetURLUploadInfosResponseBody} extends {@link TeaModel}
     *
     * <p>GetURLUploadInfosResponseBody</p>
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

            private Builder() {
            } 

            private Builder(URLUploadInfoList model) {
                this.completeTime = model.completeTime;
                this.creationTime = model.creationTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.fileSize = model.fileSize;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.status = model.status;
                this.uploadURL = model.uploadURL;
                this.userData = model.userData;
            } 

            /**
             * <p>The time when the upload job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:11:01Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the upload job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:01:01Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>error_message</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The size of the uploaded media file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The ID of the upload job.</p>
             * 
             * <strong>example:</strong>
             * <p>86c1925fba0****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the uploaded media file.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f6f54b6e91d24d81d4****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The status of the URL-based upload job. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a video&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The upload URL of the source file.</p>
             * <blockquote>
             * <p>A maximum of 100 URLs can be returned.</p>
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
             * <p>The custom configurations. The value is a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
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
