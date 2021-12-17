// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private ListTransitRouterRouteTablePropagationsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTablePropagationsResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterRouteTablePropagationsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteTablePropagationsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ListTransitRouterRouteTablePropagationsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListTransitRouterRouteTablePropagationsResponse build() {
            return new ListTransitRouterRouteTablePropagationsResponse(this);
        } 

    } 

}
