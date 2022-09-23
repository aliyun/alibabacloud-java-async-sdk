package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.InitiateMultipartUploadRequest;

public class InitiateMultipartUploadEncryptionRequest {
    private final InitiateMultipartUploadRequest initiateMultipartUploadRequest;
    private final Long partSize;
    private final Long dataSize;

    private InitiateMultipartUploadEncryptionRequest(Builder builder) {
        this.initiateMultipartUploadRequest = Validate.notNull(builder.initiateMultipartUploadRequest, "initiateMultipartUploadRequest");
        this.partSize = Validate.notNull(builder.partSize, "partSize");
        this.dataSize = builder.dataSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadEncryptionRequest create() {
        return builder().build();
    }

    public InitiateMultipartUploadRequest getInitiateMultipartUploadRequest() {
        return this.initiateMultipartUploadRequest;
    }

    public Long getPartSize() {
        return this.partSize;
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public static final class Builder {
        private InitiateMultipartUploadRequest initiateMultipartUploadRequest;
        private Long partSize;
        private Long dataSize;

        private Builder() {
        }

        private Builder(InitiateMultipartUploadEncryptionRequest request) {
            this.initiateMultipartUploadRequest = request.initiateMultipartUploadRequest;
            this.partSize = request.partSize;
            this.dataSize = request.dataSize;
        }

        public Builder initiateMultipartUploadRequest(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
            this.initiateMultipartUploadRequest = initiateMultipartUploadRequest;
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

        public InitiateMultipartUploadEncryptionRequest build() {
            return new InitiateMultipartUploadEncryptionRequest(this);
        }
    }
}
