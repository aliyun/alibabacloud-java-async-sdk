// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiversifyResponse} extends {@link TeaModel}
 *
 * <p>DeleteDiversifyResponse</p>
 */
public class DeleteDiversifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDiversifyResponseBody body;

    private DeleteDiversifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDiversifyResponse create() {
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
    public DeleteDiversifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDiversifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDiversifyResponseBody body);

        @Override
        DeleteDiversifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDiversifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDiversifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDiversifyResponse response) {
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
        public Builder body(DeleteDiversifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDiversifyResponse build() {
            return new DeleteDiversifyResponse(this);
        } 

    } 

}
