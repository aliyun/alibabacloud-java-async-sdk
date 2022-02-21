// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteZnodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteZnodeResponse</p>
 */
public class DeleteZnodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteZnodeResponseBody body;

    private DeleteZnodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteZnodeResponse create() {
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
    public DeleteZnodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteZnodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteZnodeResponseBody body);

        @Override
        DeleteZnodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteZnodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteZnodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteZnodeResponse response) {
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
        public Builder body(DeleteZnodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteZnodeResponse build() {
            return new DeleteZnodeResponse(this);
        } 

    } 

}
