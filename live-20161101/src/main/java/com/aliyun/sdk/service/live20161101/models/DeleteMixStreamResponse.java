// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMixStreamResponse} extends {@link TeaModel}
 *
 * <p>DeleteMixStreamResponse</p>
 */
public class DeleteMixStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMixStreamResponseBody body;

    private DeleteMixStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMixStreamResponse create() {
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
    public DeleteMixStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMixStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMixStreamResponseBody body);

        @Override
        DeleteMixStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMixStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMixStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMixStreamResponse response) {
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
        public Builder body(DeleteMixStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMixStreamResponse build() {
            return new DeleteMixStreamResponse(this);
        } 

    } 

}
