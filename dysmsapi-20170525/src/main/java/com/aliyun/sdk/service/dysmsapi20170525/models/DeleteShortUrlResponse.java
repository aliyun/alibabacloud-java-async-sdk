// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteShortUrlResponse} extends {@link TeaModel}
 *
 * <p>DeleteShortUrlResponse</p>
 */
public class DeleteShortUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteShortUrlResponseBody body;

    private DeleteShortUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteShortUrlResponse create() {
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
    public DeleteShortUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteShortUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteShortUrlResponseBody body);

        @Override
        DeleteShortUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteShortUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteShortUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteShortUrlResponse response) {
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
        public Builder body(DeleteShortUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteShortUrlResponse build() {
            return new DeleteShortUrlResponse(this);
        } 

    } 

}
