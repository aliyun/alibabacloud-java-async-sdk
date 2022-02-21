// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeInstanceDeploymentResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeInstanceDeploymentResponse</p>
 */
public class CreateEdgeInstanceDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeInstanceDeploymentResponseBody body;

    private CreateEdgeInstanceDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeInstanceDeploymentResponse create() {
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
    public CreateEdgeInstanceDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeInstanceDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeInstanceDeploymentResponseBody body);

        @Override
        CreateEdgeInstanceDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeInstanceDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeInstanceDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeInstanceDeploymentResponse response) {
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
        public Builder body(CreateEdgeInstanceDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeInstanceDeploymentResponse build() {
            return new CreateEdgeInstanceDeploymentResponse(this);
        } 

    } 

}
