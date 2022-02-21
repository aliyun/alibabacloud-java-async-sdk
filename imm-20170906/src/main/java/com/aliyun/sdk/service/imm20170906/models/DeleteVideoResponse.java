// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoResponse} extends {@link TeaModel}
 *
 * <p>DeleteVideoResponse</p>
 */
public class DeleteVideoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVideoResponseBody body;

    private DeleteVideoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVideoResponse create() {
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
    public DeleteVideoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVideoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVideoResponseBody body);

        @Override
        DeleteVideoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVideoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVideoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVideoResponse response) {
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
        public Builder body(DeleteVideoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVideoResponse build() {
            return new DeleteVideoResponse(this);
        } 

    } 

}
