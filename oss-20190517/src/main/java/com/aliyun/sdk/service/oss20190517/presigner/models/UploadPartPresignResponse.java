package com.aliyun.sdk.service.oss20190517.presigner.models;

public class UploadPartPresignResponse extends PresignResponse {
    private UploadPartPresignResponse(BuilderImpl builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartPresignResponse create() {
        return new Builder().build();
    }

    public static final class Builder extends BuilderImpl<UploadPartPresignResponse, Builder> {
        private Builder() {
            super();
        }

        private Builder(UploadPartPresignResponse response) {
            super(response);
        }

        @Override
        public UploadPartPresignResponse build() {
            return new UploadPartPresignResponse(this);
        }

    }


}
