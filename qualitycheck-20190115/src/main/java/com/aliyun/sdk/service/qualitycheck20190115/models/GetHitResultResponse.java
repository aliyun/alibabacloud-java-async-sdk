// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHitResultResponse} extends {@link TeaModel}
 *
 * <p>GetHitResultResponse</p>
 */
public class GetHitResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHitResultResponseBody body;

    private GetHitResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHitResultResponse create() {
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
    public GetHitResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHitResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHitResultResponseBody body);

        @Override
        GetHitResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHitResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHitResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHitResultResponse response) {
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
        public Builder body(GetHitResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHitResultResponse build() {
            return new GetHitResultResponse(this);
        } 

    } 

}
