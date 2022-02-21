// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterRouteTableResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteTableResponse</p>
 */
public class CreateTransitRouterRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterRouteTableResponseBody body;

    private CreateTransitRouterRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTransitRouterRouteTableResponse create() {
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
    public CreateTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTransitRouterRouteTableResponseBody body);

        @Override
        CreateTransitRouterRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterRouteTableResponse response) {
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
        public Builder body(CreateTransitRouterRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterRouteTableResponse build() {
            return new CreateTransitRouterRouteTableResponse(this);
        } 

    } 

}
