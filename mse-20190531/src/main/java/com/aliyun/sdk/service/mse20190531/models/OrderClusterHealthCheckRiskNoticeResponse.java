// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderClusterHealthCheckRiskNoticeResponse} extends {@link TeaModel}
 *
 * <p>OrderClusterHealthCheckRiskNoticeResponse</p>
 */
public class OrderClusterHealthCheckRiskNoticeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OrderClusterHealthCheckRiskNoticeResponseBody body;

    private OrderClusterHealthCheckRiskNoticeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OrderClusterHealthCheckRiskNoticeResponse create() {
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
    public OrderClusterHealthCheckRiskNoticeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OrderClusterHealthCheckRiskNoticeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OrderClusterHealthCheckRiskNoticeResponseBody body);

        @Override
        OrderClusterHealthCheckRiskNoticeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OrderClusterHealthCheckRiskNoticeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OrderClusterHealthCheckRiskNoticeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OrderClusterHealthCheckRiskNoticeResponse response) {
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
        public Builder body(OrderClusterHealthCheckRiskNoticeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OrderClusterHealthCheckRiskNoticeResponse build() {
            return new OrderClusterHealthCheckRiskNoticeResponse(this);
        } 

    } 

}
