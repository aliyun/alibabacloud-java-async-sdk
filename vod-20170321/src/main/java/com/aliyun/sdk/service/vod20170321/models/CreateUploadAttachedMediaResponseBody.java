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
 * {@link CreateUploadAttachedMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadAttachedMediaResponseBody</p>
 */
public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("MediaURL")
    private String mediaURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.NameInMap("UploadAuth")
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

        private Builder() {
        } 

        private Builder(CreateUploadAttachedMediaResponseBody model) {
            this.fileURL = model.fileURL;
            this.mediaId = model.mediaId;
            this.mediaURL = model.mediaURL;
            this.requestId = model.requestId;
            this.uploadAddress = model.uploadAddress;
            this.uploadAuth = model.uploadAuth;
        } 

        /**
         * <p>The OSS URL of the auxiliary media asset file (without authentication).</p>
         * <p>When you add an image watermark template, this URL can be used as the FileUrl request parameter of the <a href="~~AddWatermark~~">AddWatermark</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/watermark/</strong></strong>.mov</p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>97dc17a5abc3668489b84ce9****</p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The access URL of the media asset.</p>
         * <p>If a CDN domain name is configured, the CDN URL is returned. Otherwise, the OSS URL is returned.</p>
         * <blockquote>
         * <p>If the returned MediaURL cannot be accessed in a browser (403 error), it is because you have enabled the authentication feature for the VOD domain name. You can disable <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a> or <a href="https://help.aliyun.com/document_detail/57007.html">generate an authentication signature</a> by yourself.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/watermark/****.mov?auth_key=">http://example.aliyundoc.com/watermark/****.mov?auth_key=</a>****</p>
         */
        public Builder mediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73254DE5-F260-4720-D06856B63C01****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload URL.</p>
         * <blockquote>
         * <p>The upload URL returned by the operation is Base64-encoded. When you call the SDK or API to upload the media asset, you must Base64-decode the URL before use. You only need to parse UploadAddress when you use the native OSS SDK or OSS API to upload the media asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LWNuLXNoYW5naGFpLmFsaXl1b****</p>
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * <p>The upload credential.</p>
         * <blockquote>
         * <p>The upload credential returned by the operation is Base64-encoded. When you call the SDK or API to upload the media asset, you must Base64-decode the credential before use. You only need to parse UploadAuth when you use the native OSS SDK or OSS API to upload the media asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UzFnUjFxNkZ0NUIZTaklyNWJoQ00zdHF****</p>
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
