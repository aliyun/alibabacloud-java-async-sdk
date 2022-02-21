// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessKeyResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccessKeyResponse</p>
 */
public class DeleteAccessKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccessKeyResponseBody body;

    private DeleteAccessKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAccessKeyResponse create() {
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
    public DeleteAccessKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccessKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAccessKeyResponseBody body);

        @Override
        DeleteAccessKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccessKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAccessKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccessKeyResponse response) {
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
        public Builder body(DeleteAccessKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccessKeyResponse build() {
            return new DeleteAccessKeyResponse(this);
        } 

    } 

}
