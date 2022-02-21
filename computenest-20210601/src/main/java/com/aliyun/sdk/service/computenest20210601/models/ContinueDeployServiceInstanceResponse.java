// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueDeployServiceInstanceResponse} extends {@link TeaModel}
 *
 * <p>ContinueDeployServiceInstanceResponse</p>
 */
public class ContinueDeployServiceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinueDeployServiceInstanceResponseBody body;

    private ContinueDeployServiceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinueDeployServiceInstanceResponse create() {
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
    public ContinueDeployServiceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinueDeployServiceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinueDeployServiceInstanceResponseBody body);

        @Override
        ContinueDeployServiceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinueDeployServiceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinueDeployServiceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinueDeployServiceInstanceResponse response) {
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
        public Builder body(ContinueDeployServiceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinueDeployServiceInstanceResponse build() {
            return new ContinueDeployServiceInstanceResponse(this);
        } 

    } 

}
