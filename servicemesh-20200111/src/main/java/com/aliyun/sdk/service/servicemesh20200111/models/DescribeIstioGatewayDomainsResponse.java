// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayDomainsResponse} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayDomainsResponse</p>
 */
public class DescribeIstioGatewayDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIstioGatewayDomainsResponseBody body;

    private DescribeIstioGatewayDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIstioGatewayDomainsResponse create() {
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
    public DescribeIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIstioGatewayDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIstioGatewayDomainsResponseBody body);

        @Override
        DescribeIstioGatewayDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIstioGatewayDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIstioGatewayDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIstioGatewayDomainsResponse response) {
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
        public Builder body(DescribeIstioGatewayDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIstioGatewayDomainsResponse build() {
            return new DescribeIstioGatewayDomainsResponse(this);
        } 

    } 

}
