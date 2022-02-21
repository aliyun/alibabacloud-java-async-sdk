// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTablePropagationsResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablePropagationsResponse</p>
 */
public class ListTransitRouterRouteTablePropagationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterRouteTablePropagationsResponseBody body;

    private ListTransitRouterRouteTablePropagationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRouterRouteTablePropagationsResponse create() {
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
    public ListTransitRouterRouteTablePropagationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRouterRouteTablePropagationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRouterRouteTablePropagationsResponseBody body);

        @Override
        ListTransitRouterRouteTablePropagationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRouterRouteTablePropagationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterRouteTablePropagationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRouterRouteTablePropagationsResponse response) {
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
        public Builder body(ListTransitRouterRouteTablePropagationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRouterRouteTablePropagationsResponse build() {
            return new ListTransitRouterRouteTablePropagationsResponse(this);
        } 

    } 

}
