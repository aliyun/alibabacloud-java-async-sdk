package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.CompleteMultipartUploadResponse;

public class CompleteMultipartUploadEncryptionResponse {
    private final CompleteMultipartUploadResponse completeMultipartUploadResponse;

    private CompleteMultipartUploadEncryptionResponse(Builder builder) {
        this.completeMultipartUploadResponse = Validate.notNull(builder.completeMultipartUploadResponse, "completeMultipartUploadResponse");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadEncryptionResponse create() {
        return new Builder().build();
    }

    public CompleteMultipartUploadResponse getCompleteMultipartUploadResponse() {
        return this.completeMultipartUploadResponse;
    }

    public static final class Builder {
        private CompleteMultipartUploadResponse completeMultipartUploadResponse;

        private Builder() {
        }

        private Builder(CompleteMultipartUploadEncryptionResponse response) {
            this.completeMultipartUploadResponse = response.completeMultipartUploadResponse;
        }

        public Builder completeMultipartUploadResponse(CompleteMultipartUploadResponse completeMultipartUploadResponse) {
            this.completeMultipartUploadResponse = completeMultipartUploadResponse;
            return this;
        }

        public CompleteMultipartUploadEncryptionResponse build() {
            return new CompleteMultipartUploadEncryptionResponse(this);
        }
    }
}
