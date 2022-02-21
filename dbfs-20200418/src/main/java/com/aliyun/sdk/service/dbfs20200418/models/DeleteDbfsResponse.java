// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDbfsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDbfsResponse</p>
 */
public class DeleteDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDbfsResponseBody body;

    private DeleteDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDbfsResponse create() {
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
    public DeleteDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDbfsResponseBody body);

        @Override
        DeleteDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDbfsResponse response) {
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
        public Builder body(DeleteDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDbfsResponse build() {
            return new DeleteDbfsResponse(this);
        } 

    } 

}
