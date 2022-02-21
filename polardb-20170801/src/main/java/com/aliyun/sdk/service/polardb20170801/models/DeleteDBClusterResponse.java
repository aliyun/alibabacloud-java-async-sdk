// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBClusterResponse</p>
 */
public class DeleteDBClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBClusterResponseBody body;

    private DeleteDBClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBClusterResponse create() {
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
    public DeleteDBClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBClusterResponseBody body);

        @Override
        DeleteDBClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBClusterResponse response) {
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
        public Builder body(DeleteDBClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBClusterResponse build() {
            return new DeleteDBClusterResponse(this);
        } 

    } 

}
