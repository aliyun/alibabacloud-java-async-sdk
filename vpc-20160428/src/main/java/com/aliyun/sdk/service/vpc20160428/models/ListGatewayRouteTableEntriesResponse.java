// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteTableEntriesResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteTableEntriesResponse</p>
 */
public class ListGatewayRouteTableEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayRouteTableEntriesResponseBody body;

    private ListGatewayRouteTableEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayRouteTableEntriesResponse create() {
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
    public ListGatewayRouteTableEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayRouteTableEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayRouteTableEntriesResponseBody body);

        @Override
        ListGatewayRouteTableEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayRouteTableEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayRouteTableEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayRouteTableEntriesResponse response) {
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
        public Builder body(ListGatewayRouteTableEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayRouteTableEntriesResponse build() {
            return new ListGatewayRouteTableEntriesResponse(this);
        } 

    } 

}
