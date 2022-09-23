package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.encryption.ContentCryptoMaterial;
import com.aliyun.sdk.service.oss20190517.models.UploadPartRequest;

public class UploadPartEncryptionRequest {
    private final UploadPartRequest uploadPartRequest;
    private final ContentCryptoMaterial contentCryptoMaterial;
    private final Long partSize;
    private final Long dataSize;

    private UploadPartEncryptionRequest(Builder builder) {
        this.uploadPartRequest = Validate.notNull(builder.uploadPartRequest, "uploadPartRequest");
        this.contentCryptoMaterial = Validate.notNull(builder.contentCryptoMaterial, "contentCryptoMaterial");
        this.partSize = Validate.notNull(builder.partSize, "partSize");
        this.dataSize = builder.dataSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartEncryptionRequest create() {
        return builder().build();
    }

    public UploadPartRequest getUploadPartRequest() {
        return this.uploadPartRequest;
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
        private UploadPartRequest uploadPartRequest;
        private ContentCryptoMaterial contentCryptoMaterial;
        private Long partSize;
        private Long dataSize;

        private Builder() {
        }

        private Builder(UploadPartEncryptionRequest request) {
            this.uploadPartRequest = request.uploadPartRequest;
            this.contentCryptoMaterial = request.contentCryptoMaterial;
            this.partSize = request.partSize;
            this.dataSize = request.dataSize;
        }

        public Builder uploadPartRequest(UploadPartRequest uploadPartRequest) {
            this.uploadPartRequest = uploadPartRequest;
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

        public UploadPartEncryptionRequest build() {
            return new UploadPartEncryptionRequest(this);
        }
    }
}
