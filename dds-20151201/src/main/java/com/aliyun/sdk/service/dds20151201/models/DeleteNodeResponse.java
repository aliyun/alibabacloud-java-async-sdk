// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteNodeResponse</p>
 */
public class DeleteNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNodeResponseBody body;

    private DeleteNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNodeResponse create() {
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
    public DeleteNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNodeResponseBody body);

        @Override
        DeleteNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNodeResponse response) {
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
        public Builder body(DeleteNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNodeResponse build() {
            return new DeleteNodeResponse(this);
        } 

    } 

}
