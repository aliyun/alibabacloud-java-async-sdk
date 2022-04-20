// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRoutesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayRoutesResponse</p>
 */
public class DescribeIstioGatewayRoutesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIstioGatewayRoutesResponseBody body;

    private DescribeIstioGatewayRoutesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIstioGatewayRoutesResponse create() {
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
    public DescribeIstioGatewayRoutesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIstioGatewayRoutesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIstioGatewayRoutesResponseBody body);

        @Override
        DescribeIstioGatewayRoutesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIstioGatewayRoutesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIstioGatewayRoutesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIstioGatewayRoutesResponse response) {
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
        public Builder body(DescribeIstioGatewayRoutesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIstioGatewayRoutesResponse build() {
            return new DescribeIstioGatewayRoutesResponse(this);
        } 

    } 

}
