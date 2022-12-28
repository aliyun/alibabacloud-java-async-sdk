// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataStreamResponse} extends {@link TeaModel}
 *
 * <p>GetDataStreamResponse</p>
 */
public class GetDataStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataStreamResponseBody body;

    private GetDataStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataStreamResponse create() {
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
    public GetDataStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataStreamResponseBody body);

        @Override
        GetDataStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataStreamResponse response) {
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
        public Builder body(GetDataStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataStreamResponse build() {
            return new GetDataStreamResponse(this);
        } 

    } 

}
