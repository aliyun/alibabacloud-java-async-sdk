// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFunctionResponse} extends {@link TeaModel}
 *
 * <p>DeployFunctionResponse</p>
 */
public class DeployFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployFunctionResponseBody body;

    private DeployFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployFunctionResponse create() {
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
    public DeployFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployFunctionResponseBody body);

        @Override
        DeployFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployFunctionResponse response) {
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
        public Builder body(DeployFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployFunctionResponse build() {
            return new DeployFunctionResponse(this);
        } 

    } 

}
