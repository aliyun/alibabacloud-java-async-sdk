// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadImageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadImageResponseBody</p>
 */
public class CreateUploadImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("ImageURL")
    private String imageURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.NameInMap("UploadAuth")
    private String uploadAuth;

    private CreateUploadImageResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.imageId = builder.imageId;
        this.imageURL = builder.imageURL;
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageURL
     */
    public String getImageURL() {
        return this.imageURL;
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
        private String imageId; 
        private String imageURL; 
        private String requestId; 
        private String uploadAddress; 
        private String uploadAuth; 

        /**
         * The OSS URL of the file. The URL does not contain the information used for URL signing. You can specify FileUrl when you call the [AddWatermark](~~98617~~) operation.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * The ID of the image file.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The URL of the image.
         * <p>
         * 
         * > If the returned URL is inaccessible from a browser and the HTTP 403 status code is returned, the URL signing feature in ApsaraVideo VOD is enabled. To resolve this issue, you can disable the [URL signing](~~86090~~) feature or [generate a signed URL](~~57007~~).
         */
        public Builder imageURL(String imageURL) {
            this.imageURL = imageURL;
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
         * The upload URL.
         * <p>
         * 
         * > The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded URL before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * The upload credential.
         * <p>
         * 
         * > The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        public CreateUploadImageResponseBody build() {
            return new CreateUploadImageResponseBody(this);
        } 

    } 

}
