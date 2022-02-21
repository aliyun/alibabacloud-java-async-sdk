// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6GatewaysResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewaysResponse</p>
 */
public class DescribeIpv6GatewaysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpv6GatewaysResponseBody body;

    private DescribeIpv6GatewaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpv6GatewaysResponse create() {
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
    public DescribeIpv6GatewaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpv6GatewaysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpv6GatewaysResponseBody body);

        @Override
        DescribeIpv6GatewaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpv6GatewaysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpv6GatewaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpv6GatewaysResponse response) {
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
        public Builder body(DescribeIpv6GatewaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpv6GatewaysResponse build() {
            return new DescribeIpv6GatewaysResponse(this);
        } 

    } 

}
