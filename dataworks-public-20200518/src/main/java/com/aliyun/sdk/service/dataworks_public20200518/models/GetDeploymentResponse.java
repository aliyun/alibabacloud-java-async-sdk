// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentResponse} extends {@link TeaModel}
 *
 * <p>GetDeploymentResponse</p>
 */
public class GetDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeploymentResponseBody body;

    private GetDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeploymentResponse create() {
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
    public GetDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeploymentResponseBody body);

        @Override
        GetDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeploymentResponse response) {
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
        public Builder body(GetDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeploymentResponse build() {
            return new GetDeploymentResponse(this);
        } 

    } 

}
