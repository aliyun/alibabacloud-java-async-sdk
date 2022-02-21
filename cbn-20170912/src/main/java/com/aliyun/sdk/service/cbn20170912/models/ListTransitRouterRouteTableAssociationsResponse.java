// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTableAssociationsResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTableAssociationsResponse</p>
 */
public class ListTransitRouterRouteTableAssociationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterRouteTableAssociationsResponseBody body;

    private ListTransitRouterRouteTableAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRouterRouteTableAssociationsResponse create() {
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
    public ListTransitRouterRouteTableAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRouterRouteTableAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRouterRouteTableAssociationsResponseBody body);

        @Override
        ListTransitRouterRouteTableAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRouterRouteTableAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterRouteTableAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRouterRouteTableAssociationsResponse response) {
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
        public Builder body(ListTransitRouterRouteTableAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRouterRouteTableAssociationsResponse build() {
            return new ListTransitRouterRouteTableAssociationsResponse(this);
        } 

    } 

}
