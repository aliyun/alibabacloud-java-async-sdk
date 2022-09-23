package com.aliyun.sdk.service.oss20190517.presigner.models;

import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.service.oss20190517.models.GetObjectRequest;

public class GetObjectPresignRequest extends PresignRequest {
    private final GetObjectRequest getObjectRequest;

    private GetObjectPresignRequest(Builder builder) {
        super(builder);
        this.getObjectRequest = Validate.notNull(builder.getObjectRequest, "getObjectRequest");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectPresignRequest create() {
        return builder().build();
    }

    public GetObjectRequest getGetObjectRequest() {
        return this.getObjectRequest;
    }

    public static final class Builder extends BuilderImpl<GetObjectPresignRequest, Builder> {
        private GetObjectRequest getObjectRequest;

        private Builder() {
            super();
        }

        public Builder getObjectRequest(GetObjectRequest getObjectRequest) {
            this.getObjectRequest = getObjectRequest;
            return this;
        }

        @Override
        public GetObjectPresignRequest build() {
            return new GetObjectPresignRequest(this);
        }
    }

}
