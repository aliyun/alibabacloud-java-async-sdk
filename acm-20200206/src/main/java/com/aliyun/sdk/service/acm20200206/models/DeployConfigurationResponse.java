// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployConfigurationResponse} extends {@link TeaModel}
 *
 * <p>DeployConfigurationResponse</p>
 */
public class DeployConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployConfigurationResponseBody body;

    private DeployConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployConfigurationResponse create() {
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
    public DeployConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployConfigurationResponseBody body);

        @Override
        DeployConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployConfigurationResponse response) {
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
        public Builder body(DeployConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployConfigurationResponse build() {
            return new DeployConfigurationResponse(this);
        } 

    } 

}
