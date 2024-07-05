// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshUploadVideoResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshUploadVideoResponseBody</p>
 */
public class RefreshUploadVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.NameInMap("UploadAuth")
    private String uploadAuth;

    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private RefreshUploadVideoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshUploadVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadAddress
     */
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    /**
     * @return uploadAuth
     */
    public String getUploadAuth() {
        return this.uploadAuth;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder {
        private String requestId; 
        private String uploadAddress; 
        private String uploadAuth; 
        private String videoId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The upload URL.
         * <p>
         * 
         * >  The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload media files.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * The upload credential.
         * <p>
         * 
         * >  The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload media files.
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        /**
         * The ID of the audio or video file.
         */
        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public RefreshUploadVideoResponseBody build() {
            return new RefreshUploadVideoResponseBody(this);
        } 

    } 

}
