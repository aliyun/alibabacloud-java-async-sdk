// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataStreamResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataStreamResponse</p>
 */
public class DeleteDataStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataStreamResponseBody body;

    private DeleteDataStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataStreamResponse create() {
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
    public DeleteDataStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataStreamResponseBody body);

        @Override
        DeleteDataStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataStreamResponse response) {
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
        public Builder body(DeleteDataStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataStreamResponse build() {
            return new DeleteDataStreamResponse(this);
        } 

    } 

}
