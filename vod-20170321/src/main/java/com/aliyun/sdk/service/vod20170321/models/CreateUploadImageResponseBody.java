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
         * <p>The OSS URL of the image file. The URL does not contain authentication information.</p>
         * <p>When you add an image watermark template, you can use this URL as the value of the <code>FileUrl</code> request parameter for the <a href="~~AddWatermark~~">AddWatermark</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The image ID. You can use it as a request parameter for operations such as <a href="~~GetImageInfo~~">GetImageInfo</a>, <a href="~~GetImageInfos~~">GetImageInfos</a>, <a href="~~UpdateImageInfos~~">UpdateImageInfos</a>, and <a href="~~DeleteImage~~">DeleteImage</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f46e91d24d81d4****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The access URL of the image.</p>
         * <blockquote>
         * <p>If the returned ImageURL cannot be accessed in a browser and a 403 error is returned, it is because you have enabled URL authentication for the ApsaraVideo VOD domain name. You can disable <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a> or <a href="https://help.aliyun.com/document_detail/57007.html">generate an authentication signature</a> by yourself.</p>
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
         * <p>The request ID.</p>
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
         * <p>The upload URL returned by the operation is Base64-encoded. When you call an SDK or API operation to upload media assets, you must Base64-decode the URL before use. You need to parse UploadAddress only when you use the native OSS SDK or OSS API to upload media assets.</p>
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
         * <p>The upload credential returned by the operation is Base64-encoded. When you call an SDK or API operation to upload media assets, you must Base64-decode the credential before use. You need to parse UploadAuth only when you use the native OSS SDK or OSS API to upload media assets.</p>
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
