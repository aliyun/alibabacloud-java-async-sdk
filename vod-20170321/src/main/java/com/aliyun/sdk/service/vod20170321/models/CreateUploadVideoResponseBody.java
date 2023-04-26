// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadVideoResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadVideoResponseBody</p>
 */
public class CreateUploadVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadAddress")
    private String uploadAddress;

    @NameInMap("UploadAuth")
    private String uploadAuth;

    @NameInMap("VideoId")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadAddress.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * UploadAuth.
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        /**
         * VideoId.
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
