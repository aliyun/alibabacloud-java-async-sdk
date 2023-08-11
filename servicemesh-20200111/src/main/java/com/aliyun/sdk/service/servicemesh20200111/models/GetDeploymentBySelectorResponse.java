// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentBySelectorResponse} extends {@link TeaModel}
 *
 * <p>GetDeploymentBySelectorResponse</p>
 */
public class GetDeploymentBySelectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeploymentBySelectorResponseBody body;

    private GetDeploymentBySelectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeploymentBySelectorResponse create() {
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
    public GetDeploymentBySelectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeploymentBySelectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeploymentBySelectorResponseBody body);

        @Override
        GetDeploymentBySelectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeploymentBySelectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeploymentBySelectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeploymentBySelectorResponse response) {
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
        public Builder body(GetDeploymentBySelectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeploymentBySelectorResponse build() {
            return new GetDeploymentBySelectorResponse(this);
        } 

    } 

}
