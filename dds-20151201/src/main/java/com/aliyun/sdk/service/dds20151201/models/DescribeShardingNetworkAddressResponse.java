// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardingNetworkAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribeShardingNetworkAddressResponse</p>
 */
public class DescribeShardingNetworkAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeShardingNetworkAddressResponseBody body;

    private DescribeShardingNetworkAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeShardingNetworkAddressResponse create() {
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
    public DescribeShardingNetworkAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeShardingNetworkAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeShardingNetworkAddressResponseBody body);

        @Override
        DescribeShardingNetworkAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeShardingNetworkAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeShardingNetworkAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeShardingNetworkAddressResponse response) {
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
        public Builder body(DescribeShardingNetworkAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeShardingNetworkAddressResponse build() {
            return new DescribeShardingNetworkAddressResponse(this);
        } 

    } 

}
