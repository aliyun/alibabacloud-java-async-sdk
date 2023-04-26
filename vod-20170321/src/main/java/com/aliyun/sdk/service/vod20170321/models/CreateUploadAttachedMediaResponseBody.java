// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadAttachedMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadAttachedMediaResponseBody</p>
 */
public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    @NameInMap("FileURL")
    private String fileURL;

    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("MediaURL")
    private String mediaURL;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadAddress")
    private String uploadAddress;

    @NameInMap("UploadAuth")
    private String uploadAuth;

    private CreateUploadAttachedMediaResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.mediaId = builder.mediaId;
        this.mediaURL = builder.mediaURL;
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadAttachedMediaResponseBody create() {
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
     * @return mediaURL
     */
    public String getMediaURL() {
        return this.mediaURL;
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
        private String mediaURL; 
        private String requestId; 
        private String uploadAddress; 
        private String uploadAuth; 

        /**
         * The returned data.
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
         * The ID of the request.
         */
        public Builder mediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
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
         * The OSS URL of the file. The URL does not contain the information used for URL signing. You can set the FileUrl parameter to this URL when you call the [AddWatermark](~~98617~~) operation.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * The upload URL.
         * <p>
         * > The upload URL returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload URL, you must decode the upload URL by using the Base64 algorithm. You must parse the upload URL only if you use native OSS SDKs or OSS API for uploads.
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        public CreateUploadAttachedMediaResponseBody build() {
            return new CreateUploadAttachedMediaResponseBody(this);
        } 

    } 

}
