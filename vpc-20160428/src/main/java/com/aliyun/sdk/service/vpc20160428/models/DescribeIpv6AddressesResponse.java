// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6AddressesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpv6AddressesResponse</p>
 */
public class DescribeIpv6AddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpv6AddressesResponseBody body;

    private DescribeIpv6AddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpv6AddressesResponse create() {
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
    public DescribeIpv6AddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpv6AddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpv6AddressesResponseBody body);

        @Override
        DescribeIpv6AddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpv6AddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpv6AddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpv6AddressesResponse response) {
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
        public Builder body(DescribeIpv6AddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpv6AddressesResponse build() {
            return new DescribeIpv6AddressesResponse(this);
        } 

    } 

}
