// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionDeploymentResponse} extends {@link TeaModel}
 *
 * <p>CreateFunctionDeploymentResponse</p>
 */
public class CreateFunctionDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFunctionDeploymentResponseBody body;

    private CreateFunctionDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFunctionDeploymentResponse create() {
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
    public CreateFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFunctionDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFunctionDeploymentResponseBody body);

        @Override
        CreateFunctionDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFunctionDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFunctionDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFunctionDeploymentResponse response) {
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
        public Builder body(CreateFunctionDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFunctionDeploymentResponse build() {
            return new CreateFunctionDeploymentResponse(this);
        } 

    } 

}
