// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodesResponse} extends {@link TeaModel}
 *
 * <p>DeleteClusterNodesResponse</p>
 */
public class DeleteClusterNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClusterNodesResponseBody body;

    private DeleteClusterNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClusterNodesResponse create() {
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
    public DeleteClusterNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClusterNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClusterNodesResponseBody body);

        @Override
        DeleteClusterNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClusterNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClusterNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClusterNodesResponse response) {
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
        public Builder body(DeleteClusterNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClusterNodesResponse build() {
            return new DeleteClusterNodesResponse(this);
        } 

    } 

}
