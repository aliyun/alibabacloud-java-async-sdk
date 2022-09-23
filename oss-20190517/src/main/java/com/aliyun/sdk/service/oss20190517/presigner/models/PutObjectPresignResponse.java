package com.aliyun.sdk.service.oss20190517.presigner.models;

public class PutObjectPresignResponse extends PresignResponse {
    private PutObjectPresignResponse(BuilderImpl builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectPresignResponse create() {
        return new Builder().build();
    }

    public static final class Builder extends PresignResponse.BuilderImpl<PutObjectPresignResponse, Builder> {
        private Builder() {
            super();
        }

        private Builder(PutObjectPresignResponse response) {
            super(response);
        }

        @Override
        public PutObjectPresignResponse build() {
            return new PutObjectPresignResponse(this);
        }

    }


}
