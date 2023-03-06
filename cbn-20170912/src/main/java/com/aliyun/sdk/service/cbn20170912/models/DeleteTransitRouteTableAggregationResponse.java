// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTransitRouteTableAggregationResponse} extends {@link TeaModel}
 *
 * <p>DeleteTransitRouteTableAggregationResponse</p>
 */
public class DeleteTransitRouteTableAggregationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTransitRouteTableAggregationResponseBody body;

    private DeleteTransitRouteTableAggregationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTransitRouteTableAggregationResponse create() {
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
    public DeleteTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTransitRouteTableAggregationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTransitRouteTableAggregationResponseBody body);

        @Override
        DeleteTransitRouteTableAggregationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTransitRouteTableAggregationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTransitRouteTableAggregationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTransitRouteTableAggregationResponse response) {
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
        public Builder body(DeleteTransitRouteTableAggregationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTransitRouteTableAggregationResponse build() {
            return new DeleteTransitRouteTableAggregationResponse(this);
        } 

    } 

}
