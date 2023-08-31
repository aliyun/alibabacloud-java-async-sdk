// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployServiceInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeployServiceInstanceResponse</p>
 */
public class DeployServiceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployServiceInstanceResponseBody body;

    private DeployServiceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployServiceInstanceResponse create() {
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
    public DeployServiceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployServiceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployServiceInstanceResponseBody body);

        @Override
        DeployServiceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployServiceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployServiceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployServiceInstanceResponse response) {
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
        public Builder body(DeployServiceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployServiceInstanceResponse build() {
            return new DeployServiceInstanceResponse(this);
        } 

    } 

}
