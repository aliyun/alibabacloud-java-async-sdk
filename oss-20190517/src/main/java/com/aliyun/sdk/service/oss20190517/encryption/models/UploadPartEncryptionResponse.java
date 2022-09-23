package com.aliyun.sdk.service.oss20190517.encryption.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.UploadPartResponse;

public class UploadPartEncryptionResponse {
    private final UploadPartResponse uploadPartResponse;

    private UploadPartEncryptionResponse(Builder builder) {
        this.uploadPartResponse = Validate.notNull(builder.uploadPartResponse, "uploadPartResponse");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartEncryptionResponse create() {
        return new Builder().build();
    }

    public UploadPartResponse getUploadPartResponse() {
        return this.uploadPartResponse;
    }

    public static final class Builder {
        private UploadPartResponse uploadPartResponse;

        private Builder() {
        }

        private Builder(UploadPartEncryptionResponse response) {
            this.uploadPartResponse = response.uploadPartResponse;
        }

        public Builder uploadPartResponse(UploadPartResponse uploadPartResponse) {
            this.uploadPartResponse = uploadPartResponse;
            return this;
        }

        public UploadPartEncryptionResponse build() {
            return new UploadPartEncryptionResponse(this);
        }
    }
}
