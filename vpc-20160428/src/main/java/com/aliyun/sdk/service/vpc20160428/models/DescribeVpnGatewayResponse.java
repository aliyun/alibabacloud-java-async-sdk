// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnGatewayResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewayResponse</p>
 */
public class DescribeVpnGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnGatewayResponseBody body;

    private DescribeVpnGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnGatewayResponse create() {
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
    public DescribeVpnGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnGatewayResponseBody body);

        @Override
        DescribeVpnGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnGatewayResponse response) {
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
        public Builder body(DescribeVpnGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnGatewayResponse build() {
            return new DescribeVpnGatewayResponse(this);
        } 

    } 

}
