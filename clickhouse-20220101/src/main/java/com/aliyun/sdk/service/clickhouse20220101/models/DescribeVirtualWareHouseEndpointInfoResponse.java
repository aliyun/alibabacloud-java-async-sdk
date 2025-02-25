// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualWareHouseEndpointInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeVirtualWareHouseEndpointInfoResponse</p>
 */
public class DescribeVirtualWareHouseEndpointInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeVirtualWareHouseEndpointInfoResponseBody body;

    private DescribeVirtualWareHouseEndpointInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVirtualWareHouseEndpointInfoResponse create() {
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
    public DescribeVirtualWareHouseEndpointInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVirtualWareHouseEndpointInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVirtualWareHouseEndpointInfoResponseBody body);

        @Override
        DescribeVirtualWareHouseEndpointInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVirtualWareHouseEndpointInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVirtualWareHouseEndpointInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVirtualWareHouseEndpointInfoResponse response) {
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
        public Builder body(DescribeVirtualWareHouseEndpointInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVirtualWareHouseEndpointInfoResponse build() {
            return new DescribeVirtualWareHouseEndpointInfoResponse(this);
        } 

    } 

}
