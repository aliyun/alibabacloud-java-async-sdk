package com.aliyun.sdk.service.oss20190517.presigner.models;

public class GetObjectPresignResponse extends PresignResponse {
    private GetObjectPresignResponse(BuilderImpl builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectPresignResponse create() {
        return new Builder().build();
    }

    public static final class Builder extends BuilderImpl<GetObjectPresignResponse, Builder> {
        private Builder() {
            super();
        }

        private Builder(GetObjectPresignResponse response) {
            super(response);
        }

        @Override
        public GetObjectPresignResponse build() {
            return new GetObjectPresignResponse(this);
        }

    }


}
