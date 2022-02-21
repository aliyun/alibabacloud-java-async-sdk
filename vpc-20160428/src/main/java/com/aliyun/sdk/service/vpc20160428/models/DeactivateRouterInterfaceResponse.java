// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeactivateRouterInterfaceResponse} extends {@link TeaModel}
 *
 * <p>DeactivateRouterInterfaceResponse</p>
 */
public class DeactivateRouterInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeactivateRouterInterfaceResponseBody body;

    private DeactivateRouterInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeactivateRouterInterfaceResponse create() {
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
    public DeactivateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeactivateRouterInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeactivateRouterInterfaceResponseBody body);

        @Override
        DeactivateRouterInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeactivateRouterInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeactivateRouterInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeactivateRouterInterfaceResponse response) {
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
        public Builder body(DeactivateRouterInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeactivateRouterInterfaceResponse build() {
            return new DeactivateRouterInterfaceResponse(this);
        } 

    } 

}
