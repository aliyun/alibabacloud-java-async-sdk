// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayStockResponse} extends {@link TeaModel}
 *
 * <p>DescribeGatewayStockResponse</p>
 */
public class DescribeGatewayStockResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeGatewayStockResponseBody body;

    private DescribeGatewayStockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeGatewayStockResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeGatewayStockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGatewayStockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeGatewayStockResponseBody body);

        @Override
        DescribeGatewayStockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGatewayStockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeGatewayStockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGatewayStockResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeGatewayStockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGatewayStockResponse build() {
            return new DescribeGatewayStockResponse(this);
        } 

    } 

}
