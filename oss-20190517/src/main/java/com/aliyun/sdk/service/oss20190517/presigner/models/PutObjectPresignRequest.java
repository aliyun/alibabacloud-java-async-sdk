package com.aliyun.sdk.service.oss20190517.presigner.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.PutObjectRequest;

public class PutObjectPresignRequest extends PresignRequest {
    private final PutObjectRequest putObjectRequest;

    private PutObjectPresignRequest(Builder builder) {
        super(builder);
        this.putObjectRequest = Validate.notNull(builder.putObjectRequest, "putObjectRequest");

    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectPresignRequest create() {
        return builder().build();
    }

    public PutObjectRequest getPutObjectRequest() {
        return this.putObjectRequest;
    }

    public static final class Builder extends PresignRequest.BuilderImpl<PutObjectPresignRequest, Builder> {
        private PutObjectRequest putObjectRequest;

        private Builder() {
            super();
        }

        public Builder putObjectRequest(PutObjectRequest putObjectRequest) {
            this.putObjectRequest = putObjectRequest;
            return this;
        }

        @Override
        public PutObjectPresignRequest build() {
            return new PutObjectPresignRequest(this);
        }
    }

}
