// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeployOrderResponse} extends {@link TeaModel}
 *
 * <p>CloseDeployOrderResponse</p>
 */
public class CloseDeployOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseDeployOrderResponseBody body;

    private CloseDeployOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseDeployOrderResponse create() {
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
    public CloseDeployOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseDeployOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseDeployOrderResponseBody body);

        @Override
        CloseDeployOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseDeployOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseDeployOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseDeployOrderResponse response) {
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
        public Builder body(CloseDeployOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseDeployOrderResponse build() {
            return new CloseDeployOrderResponse(this);
        } 

    } 

}
