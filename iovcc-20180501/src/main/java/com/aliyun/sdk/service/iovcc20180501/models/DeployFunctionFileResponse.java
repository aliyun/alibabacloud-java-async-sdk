// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFunctionFileResponse} extends {@link TeaModel}
 *
 * <p>DeployFunctionFileResponse</p>
 */
public class DeployFunctionFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployFunctionFileResponseBody body;

    private DeployFunctionFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployFunctionFileResponse create() {
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
    public DeployFunctionFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployFunctionFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployFunctionFileResponseBody body);

        @Override
        DeployFunctionFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployFunctionFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployFunctionFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployFunctionFileResponse response) {
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
        public Builder body(DeployFunctionFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployFunctionFileResponse build() {
            return new DeployFunctionFileResponse(this);
        } 

    } 

}
