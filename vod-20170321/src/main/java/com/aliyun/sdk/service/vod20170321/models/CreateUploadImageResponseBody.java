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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateUploadImageResponseBody model) {
            this.fileURL = model.fileURL;
            this.imageId = model.imageId;
            this.imageURL = model.imageURL;
            this.requestId = model.requestId;
            this.uploadAddress = model.uploadAddress;
            this.uploadAuth = model.uploadAuth;
        } 

        /**
         * <p>The OSS URL of the file. The URL does not contain the information used for URL signing. You can specify FileUrl when you call the <a href="https://help.aliyun.com/document_detail/98617.html">AddWatermark</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The ID of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f46e91d24d81d4****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The URL of the image.</p>
         * <blockquote>
         * <p>If the returned URL is inaccessible from a browser and the HTTP 403 status code is returned, the URL signing feature in ApsaraVideo VOD is enabled. To resolve this issue, you can disable the <a href="https://help.aliyun.com/document_detail/86090.html">URL signing</a> feature or <a href="https://help.aliyun.com/document_detail/57007.html">generate a signed URL</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
         */
        public Builder imageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-AEF6-D7393642****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload URL.</p>
         * <blockquote>
         * <p>The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded URL before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJTZWN1cmuIjoiQ0FJU3p3TjF****</p>
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * <p>The upload credential.</p>
         * <blockquote>
         * <p>The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJFbmmRCI6Im****</p>
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
