// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteVideoTaskResponse</p>
 */
public class DeleteVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVideoTaskResponseBody body;

    private DeleteVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVideoTaskResponse create() {
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
    public DeleteVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVideoTaskResponseBody body);

        @Override
        DeleteVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVideoTaskResponse response) {
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
        public Builder body(DeleteVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVideoTaskResponse build() {
            return new DeleteVideoTaskResponse(this);
        } 

    } 

}
