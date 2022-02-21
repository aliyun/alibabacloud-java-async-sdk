// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseEdgeInstanceDeploymentResponse} extends {@link TeaModel}
 *
 * <p>CloseEdgeInstanceDeploymentResponse</p>
 */
public class CloseEdgeInstanceDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseEdgeInstanceDeploymentResponseBody body;

    private CloseEdgeInstanceDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseEdgeInstanceDeploymentResponse create() {
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
    public CloseEdgeInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseEdgeInstanceDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseEdgeInstanceDeploymentResponseBody body);

        @Override
        CloseEdgeInstanceDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseEdgeInstanceDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseEdgeInstanceDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseEdgeInstanceDeploymentResponse response) {
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
        public Builder body(CloseEdgeInstanceDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseEdgeInstanceDeploymentResponse build() {
            return new CloseEdgeInstanceDeploymentResponse(this);
        } 

    } 

}
