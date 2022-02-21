// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployAppEnvResponse} extends {@link TeaModel}
 *
 * <p>DeployAppEnvResponse</p>
 */
public class DeployAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployAppEnvResponseBody body;

    private DeployAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployAppEnvResponse create() {
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
    public DeployAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployAppEnvResponseBody body);

        @Override
        DeployAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployAppEnvResponse response) {
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
        public Builder body(DeployAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployAppEnvResponse build() {
            return new DeployAppEnvResponse(this);
        } 

    } 

}
