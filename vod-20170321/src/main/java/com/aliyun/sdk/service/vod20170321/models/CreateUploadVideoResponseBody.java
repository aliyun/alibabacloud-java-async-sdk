// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUploadVideoResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadVideoResponseBody</p>
 */
public class CreateUploadVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.NameInMap("UploadAuth")
    private String uploadAuth;

    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private CreateUploadVideoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadVideoResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-04D5-D7393642****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload URL.</p>
         * <blockquote>
         * <p>The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use the Object Storage Service (OSS) SDK or call an OSS API operation to upload media files.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJTZWN1cml0a2VuIjoiQ0FJU3p3TjF****</p>
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * <p>The upload credential.</p>
         * <blockquote>
         * <p>The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload media files.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJFbmRwb2ludCI6Imm****</p>
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        /**
         * <p>The ID of the audio or video file. VideoId can be used as a request parameter when you call an operation for media asset management, media processing, or media review.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f54b6e91d24d81d44****</p>
         */
        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public CreateUploadVideoResponseBody build() {
            return new CreateUploadVideoResponseBody(this);
        } 

    } 

}
