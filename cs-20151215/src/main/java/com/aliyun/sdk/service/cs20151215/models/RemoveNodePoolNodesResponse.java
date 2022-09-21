// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveNodePoolNodesResponse} extends {@link TeaModel}
 *
 * <p>RemoveNodePoolNodesResponse</p>
 */
public class RemoveNodePoolNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveNodePoolNodesResponseBody body;

    private RemoveNodePoolNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveNodePoolNodesResponse create() {
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
    public RemoveNodePoolNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveNodePoolNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveNodePoolNodesResponseBody body);

        @Override
        RemoveNodePoolNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveNodePoolNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveNodePoolNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveNodePoolNodesResponse response) {
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
        public Builder body(RemoveNodePoolNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveNodePoolNodesResponse build() {
            return new RemoveNodePoolNodesResponse(this);
        } 

    } 

}
