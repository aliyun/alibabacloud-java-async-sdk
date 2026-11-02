// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateUploadMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadMediaResponseBody</p>
 */
public class CreateUploadMediaResponseBody extends TeaModel {
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

    private CreateUploadMediaResponseBody(Builder builder) {
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

    public static CreateUploadMediaResponseBody create() {
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

        private Builder(CreateUploadMediaResponseBody model) {
            this.fileURL = model.fileURL;
            this.mediaId = model.mediaId;
            this.mediaURL = model.mediaURL;
            this.requestId = model.requestId;
            this.uploadAddress = model.uploadAddress;
            this.uploadAuth = model.uploadAuth;
        } 

        /**
         * <p>The OSS URL of the file (without authentication).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4">http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The media asset URL.</p>
         * <blockquote>
         * <p>If a CDN domain name is configured, a CDN URL is returned. Otherwise, an OSS URL is returned. If the returned MediaURL is inaccessible (403) in a browser, URL signing is enabled for the VOD domain name. Disable URL signing or generate a signing signature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxq-live-playback.oss-cn-shanghai.aliyuncs.com/capture/5d96d2b4-111b-4e5d-a0e5-20f44405bb55.mp4">https://xxq-live-playback.oss-cn-shanghai.aliyuncs.com/capture/5d96d2b4-111b-4e5d-a0e5-20f44405bb55.mp4</a></p>
         */
        public Builder mediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload address.</p>
         * <blockquote>
         * <p>The upload address returned by the operation is a Base64-encoded value. When you call an SDK or API to upload media assets, decode the value by using Base64 before use. Only uploads through the native OSS SDK or OSS API require you to parse UploadAddress.</p>
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
         * <p>The upload credential returned by the operation is a Base64-encoded value. When you call an SDK or API to upload media assets, decode the value by using Base64 before use. Only uploads through the native OSS SDK or OSS API require you to parse UploadAuth.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJFbmRwb2ludCI6Imm****</p>
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        public CreateUploadMediaResponseBody build() {
            return new CreateUploadMediaResponseBody(this);
        } 

    } 

}
