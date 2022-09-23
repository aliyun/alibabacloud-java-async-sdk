package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.CompleteMultipartUploadRequest;

public class CompleteMultipartUploadEncryptionRequest {
    private final CompleteMultipartUploadRequest completeMultipartUploadRequest;

    private CompleteMultipartUploadEncryptionRequest(Builder builder) {
        this.completeMultipartUploadRequest = Validate.notNull(builder.completeMultipartUploadRequest, "completeMultipartUploadRequest");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadEncryptionRequest create() {
        return builder().build();
    }

    public CompleteMultipartUploadRequest getCompleteMultipartUploadRequest() {
        return this.completeMultipartUploadRequest;
    }

    public static final class Builder {
        private CompleteMultipartUploadRequest completeMultipartUploadRequest;

        private Builder() {
        }

        private Builder(CompleteMultipartUploadEncryptionRequest request) {
            this.completeMultipartUploadRequest = request.completeMultipartUploadRequest;
        }

        public Builder completeMultipartUploadRequest(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
            this.completeMultipartUploadRequest = completeMultipartUploadRequest;
            return this;
        }

        public CompleteMultipartUploadEncryptionRequest build() {
            return new CompleteMultipartUploadEncryptionRequest(this);
        }
    }
}
