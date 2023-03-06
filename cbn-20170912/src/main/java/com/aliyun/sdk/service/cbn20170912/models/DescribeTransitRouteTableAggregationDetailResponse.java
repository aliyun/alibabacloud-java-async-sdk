// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouteTableAggregationDetailResponse</p>
 */
public class DescribeTransitRouteTableAggregationDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTransitRouteTableAggregationDetailResponseBody body;

    private DescribeTransitRouteTableAggregationDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTransitRouteTableAggregationDetailResponse create() {
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
    public DescribeTransitRouteTableAggregationDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTransitRouteTableAggregationDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTransitRouteTableAggregationDetailResponseBody body);

        @Override
        DescribeTransitRouteTableAggregationDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTransitRouteTableAggregationDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTransitRouteTableAggregationDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTransitRouteTableAggregationDetailResponse response) {
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
        public Builder body(DescribeTransitRouteTableAggregationDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTransitRouteTableAggregationDetailResponse build() {
            return new DescribeTransitRouteTableAggregationDetailResponse(this);
        } 

    } 

}
