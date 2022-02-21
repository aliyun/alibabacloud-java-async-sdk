// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectRouterInterfaceResponse} extends {@link TeaModel}
 *
 * <p>ConnectRouterInterfaceResponse</p>
 */
public class ConnectRouterInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConnectRouterInterfaceResponseBody body;

    private ConnectRouterInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConnectRouterInterfaceResponse create() {
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
    public ConnectRouterInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConnectRouterInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConnectRouterInterfaceResponseBody body);

        @Override
        ConnectRouterInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConnectRouterInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConnectRouterInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConnectRouterInterfaceResponse response) {
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
        public Builder body(ConnectRouterInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConnectRouterInterfaceResponse build() {
            return new ConnectRouterInterfaceResponse(this);
        } 

    } 

}
