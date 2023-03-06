// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshTransitRouteTableAggregationResponse} extends {@link TeaModel}
 *
 * <p>RefreshTransitRouteTableAggregationResponse</p>
 */
public class RefreshTransitRouteTableAggregationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshTransitRouteTableAggregationResponseBody body;

    private RefreshTransitRouteTableAggregationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshTransitRouteTableAggregationResponse create() {
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
    public RefreshTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshTransitRouteTableAggregationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshTransitRouteTableAggregationResponseBody body);

        @Override
        RefreshTransitRouteTableAggregationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshTransitRouteTableAggregationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshTransitRouteTableAggregationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshTransitRouteTableAggregationResponse response) {
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
        public Builder body(RefreshTransitRouteTableAggregationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshTransitRouteTableAggregationResponse build() {
            return new RefreshTransitRouteTableAggregationResponse(this);
        } 

    } 

}
