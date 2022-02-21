// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepositoryResponse</p>
 */
public class DeleteRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepositoryResponseBody body;

    private DeleteRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepositoryResponse create() {
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
    public DeleteRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepositoryResponseBody body);

        @Override
        DeleteRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepositoryResponse response) {
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
        public Builder body(DeleteRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepositoryResponse build() {
            return new DeleteRepositoryResponse(this);
        } 

    } 

}
