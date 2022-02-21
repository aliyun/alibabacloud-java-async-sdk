// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResultResponse} extends {@link TeaModel}
 *
 * <p>GetResultResponse</p>
 */
public class GetResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResultResponseBody body;

    private GetResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResultResponse create() {
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
    public GetResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResultResponseBody body);

        @Override
        GetResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResultResponse response) {
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
        public Builder body(GetResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResultResponse build() {
            return new GetResultResponse(this);
        } 

    } 

}
