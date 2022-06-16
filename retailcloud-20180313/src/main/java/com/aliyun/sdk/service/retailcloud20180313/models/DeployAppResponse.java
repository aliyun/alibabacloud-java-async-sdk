// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployAppResponse} extends {@link TeaModel}
 *
 * <p>DeployAppResponse</p>
 */
public class DeployAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployAppResponseBody body;

    private DeployAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployAppResponse create() {
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
    public DeployAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployAppResponseBody body);

        @Override
        DeployAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployAppResponse response) {
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
        public Builder body(DeployAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployAppResponse build() {
            return new DeployAppResponse(this);
        } 

    } 

}
