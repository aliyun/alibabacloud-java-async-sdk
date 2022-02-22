// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteDirectoryResponse</p>
 */
public class DeleteDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDirectoryResponseBody body;

    private DeleteDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDirectoryResponse create() {
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
    public DeleteDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDirectoryResponseBody body);

        @Override
        DeleteDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDirectoryResponse response) {
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
        public Builder body(DeleteDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDirectoryResponse build() {
            return new DeleteDirectoryResponse(this);
        } 

    } 

}
