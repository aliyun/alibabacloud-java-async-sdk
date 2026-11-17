// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateKnowledgeObjectUploadRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeObjectUploadRequest</p>
 */
public class CreateKnowledgeObjectUploadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentMd5")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 24)
    private String contentMd5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentSha256")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String contentSha256;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SizeBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sizeBytes;

    private CreateKnowledgeObjectUploadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.contentMd5 = builder.contentMd5;
        this.contentSha256 = builder.contentSha256;
        this.contentType = builder.contentType;
        this.fileName = builder.fileName;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.sizeBytes = builder.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeObjectUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contentMd5
     */
    public String getContentMd5() {
        return this.contentMd5;
    }

    /**
     * @return contentSha256
     */
    public String getContentSha256() {
        return this.contentSha256;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return sizeBytes
     */
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeObjectUploadRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String contentMd5; 
        private String contentSha256; 
        private String contentType; 
        private String fileName; 
        private String knowledgeBaseId; 
        private Long sizeBytes; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeObjectUploadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.contentMd5 = request.contentMd5;
            this.contentSha256 = request.contentSha256;
            this.contentType = request.contentType;
            this.fileName = request.fileName;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.sizeBytes = request.sizeBytes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The idempotency key for the upload request.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The Base64-encoded MD5 hash value of the original file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yaNM/IXZgmmMasifdgcavQ==</p>
         */
        public Builder contentMd5(String contentMd5) {
            this.putBodyParameter("ContentMd5", contentMd5);
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * <p>The SHA-256 checksum of the original file.</p>
         * 
         * <strong>example:</strong>
         * <p>ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad</p>
         */
        public Builder contentSha256(String contentSha256) {
            this.putBodyParameter("ContentSha256", contentSha256);
            this.contentSha256 = contentSha256;
            return this;
        }

        /**
         * <p>The HTTP media type for the upload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text/markdown</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The original file name, which is not used as the object ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The target knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The size of the original file in bytes. This parameter reuses the existing maximum size limit for single-file uploads, which defaults to 100 MiB. If the size exceeds the limit, the InputTooLarge error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder sizeBytes(Long sizeBytes) {
            this.putBodyParameter("SizeBytes", sizeBytes);
            this.sizeBytes = sizeBytes;
            return this;
        }

        @Override
        public CreateKnowledgeObjectUploadRequest build() {
            return new CreateKnowledgeObjectUploadRequest(this);
        } 

    } 

}
