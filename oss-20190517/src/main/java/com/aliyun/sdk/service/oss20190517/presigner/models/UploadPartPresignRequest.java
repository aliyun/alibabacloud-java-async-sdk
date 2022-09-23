package com.aliyun.sdk.service.oss20190517.presigner.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.UploadPartRequest;

public class UploadPartPresignRequest extends PresignRequest {
    private final UploadPartRequest uploadPartRequest;

    private UploadPartPresignRequest(Builder builder) {
        super(builder);
        this.uploadPartRequest = Validate.notNull(builder.uploadPartRequest, "uploadPartRequest");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartPresignRequest create() {
        return builder().build();
    }

    public UploadPartRequest getUploadPartRequest() {
        return this.uploadPartRequest;
    }

    public static final class Builder extends BuilderImpl<UploadPartPresignRequest, Builder> {
        private UploadPartRequest uploadPartRequest;

        private Builder() {
            super();
        }

        public Builder uploadPartRequest(UploadPartRequest uploadPartRequest) {
            this.uploadPartRequest = uploadPartRequest;
            return this;
        }

        @Override
        public UploadPartPresignRequest build() {
            return new UploadPartPresignRequest(this);
        }
    }

}
