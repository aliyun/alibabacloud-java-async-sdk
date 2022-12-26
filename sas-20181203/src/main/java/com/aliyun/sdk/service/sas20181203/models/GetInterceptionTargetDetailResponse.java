// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionTargetDetailResponse} extends {@link TeaModel}
 *
 * <p>GetInterceptionTargetDetailResponse</p>
 */
public class GetInterceptionTargetDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInterceptionTargetDetailResponseBody body;

    private GetInterceptionTargetDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInterceptionTargetDetailResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetInterceptionTargetDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInterceptionTargetDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInterceptionTargetDetailResponseBody body);

        @Override
        GetInterceptionTargetDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInterceptionTargetDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInterceptionTargetDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInterceptionTargetDetailResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetInterceptionTargetDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInterceptionTargetDetailResponse build() {
            return new GetInterceptionTargetDetailResponse(this);
        } 

    } 

}
