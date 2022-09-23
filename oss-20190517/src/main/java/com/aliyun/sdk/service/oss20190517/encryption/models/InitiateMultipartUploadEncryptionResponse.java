package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.encryption.ContentCryptoMaterial;
import com.aliyun.sdk.service.oss20190517.models.InitiateMultipartUploadResponse;

public class InitiateMultipartUploadEncryptionResponse {
    private final InitiateMultipartUploadResponse initiateMultipartUploadResponse;
    private final ContentCryptoMaterial contentCryptoMaterial;
    private final Long partSize;
    private final Long dataSize;

    private InitiateMultipartUploadEncryptionResponse(Builder builder) {
        this.initiateMultipartUploadResponse = Validate.notNull(builder.initiateMultipartUploadResponse, "initiateMultipartUploadResponse");
        this.contentCryptoMaterial = Validate.notNull(builder.contentCryptoMaterial, "contentCryptoMaterial");
        this.partSize = Validate.notNull(builder.partSize, "partSize");
        this.dataSize = builder.dataSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadEncryptionResponse create() {
        return new Builder().build();
    }

    public InitiateMultipartUploadResponse getInitiateMultipartUploadResponse() {
        return this.initiateMultipartUploadResponse;
    }

    public ContentCryptoMaterial getContentCryptoMaterial() {
        return this.contentCryptoMaterial;
    }

    public Long getPartSize() {
        return this.partSize;
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public static final class Builder {
        private InitiateMultipartUploadResponse initiateMultipartUploadResponse;
        private ContentCryptoMaterial contentCryptoMaterial;
        private Long partSize;
        private Long dataSize;

        private Builder() {
        }

        private Builder(InitiateMultipartUploadEncryptionResponse response) {
            this.initiateMultipartUploadResponse = response.initiateMultipartUploadResponse;
            this.contentCryptoMaterial = response.contentCryptoMaterial;
            this.partSize = response.partSize;
            this.dataSize = response.dataSize;
        }

        public Builder initiateMultipartUploadResponse(InitiateMultipartUploadResponse initiateMultipartUploadResponse) {
            this.initiateMultipartUploadResponse = initiateMultipartUploadResponse;
            return this;
        }

        public Builder contentCryptoMaterial(ContentCryptoMaterial contentCryptoMaterial) {
            this.contentCryptoMaterial = contentCryptoMaterial;
            return this;
        }

        public Builder partSize(Long partSize) {
            this.partSize = partSize;
            return this;
        }

        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        public InitiateMultipartUploadEncryptionResponse build() {
            return new InitiateMultipartUploadEncryptionResponse(this);
        }
    }
}
