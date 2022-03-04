// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdgeClusterAddEdgeMachineResponse} extends {@link TeaModel}
 *
 * <p>EdgeClusterAddEdgeMachineResponse</p>
 */
public class EdgeClusterAddEdgeMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EdgeClusterAddEdgeMachineResponseBody body;

    private EdgeClusterAddEdgeMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EdgeClusterAddEdgeMachineResponse create() {
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
    public EdgeClusterAddEdgeMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EdgeClusterAddEdgeMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EdgeClusterAddEdgeMachineResponseBody body);

        @Override
        EdgeClusterAddEdgeMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EdgeClusterAddEdgeMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EdgeClusterAddEdgeMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EdgeClusterAddEdgeMachineResponse response) {
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
        public Builder body(EdgeClusterAddEdgeMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EdgeClusterAddEdgeMachineResponse build() {
            return new EdgeClusterAddEdgeMachineResponse(this);
        } 

    } 

}
