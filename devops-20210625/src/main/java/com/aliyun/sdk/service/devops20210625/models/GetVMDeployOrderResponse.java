// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVMDeployOrderResponse} extends {@link TeaModel}
 *
 * <p>GetVMDeployOrderResponse</p>
 */
public class GetVMDeployOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVMDeployOrderResponseBody body;

    private GetVMDeployOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVMDeployOrderResponse create() {
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
    public GetVMDeployOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVMDeployOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVMDeployOrderResponseBody body);

        @Override
        GetVMDeployOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVMDeployOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVMDeployOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVMDeployOrderResponse response) {
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
        public Builder body(GetVMDeployOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVMDeployOrderResponse build() {
            return new GetVMDeployOrderResponse(this);
        } 

    } 

}
