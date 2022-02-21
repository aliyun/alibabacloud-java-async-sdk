// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterRouteTableResponse} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterRouteTableResponse</p>
 */
public class UpdateTransitRouterRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTransitRouterRouteTableResponseBody body;

    private UpdateTransitRouterRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTransitRouterRouteTableResponse create() {
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
    public UpdateTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTransitRouterRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTransitRouterRouteTableResponseBody body);

        @Override
        UpdateTransitRouterRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTransitRouterRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTransitRouterRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTransitRouterRouteTableResponse response) {
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
        public Builder body(UpdateTransitRouterRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTransitRouterRouteTableResponse build() {
            return new UpdateTransitRouterRouteTableResponse(this);
        } 

    } 

}
