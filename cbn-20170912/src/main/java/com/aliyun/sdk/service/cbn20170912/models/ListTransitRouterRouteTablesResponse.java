// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTablesResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablesResponse</p>
 */
public class ListTransitRouterRouteTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterRouteTablesResponseBody body;

    private ListTransitRouterRouteTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRouterRouteTablesResponse create() {
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
    public ListTransitRouterRouteTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRouterRouteTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRouterRouteTablesResponseBody body);

        @Override
        ListTransitRouterRouteTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRouterRouteTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterRouteTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRouterRouteTablesResponse response) {
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
        public Builder body(ListTransitRouterRouteTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRouterRouteTablesResponse build() {
            return new ListTransitRouterRouteTablesResponse(this);
        } 

    } 

}
