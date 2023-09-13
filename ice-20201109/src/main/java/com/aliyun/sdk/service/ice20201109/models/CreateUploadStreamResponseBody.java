// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadStreamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadStreamResponseBody</p>
 */
public class CreateUploadStreamResponseBody extends TeaModel {
    @NameInMap("FileURL")
    private String fileURL;

    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadAddress")
    private String uploadAddress;

    @NameInMap("UploadAuth")
    private String uploadAuth;

    private CreateUploadStreamResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
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

    public static final class Builder {
        private String fileURL; 
        private String mediaId; 
        private String requestId; 
        private String uploadAddress; 
        private String uploadAuth; 

        /**
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
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

        public CreateUploadStreamResponseBody build() {
            return new CreateUploadStreamResponseBody(this);
        } 

    } 

}
