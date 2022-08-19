// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublicIpAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribePublicIpAddressResponse</p>
 */
public class DescribePublicIpAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePublicIpAddressResponseBody body;

    private DescribePublicIpAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePublicIpAddressResponse create() {
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
    public DescribePublicIpAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePublicIpAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePublicIpAddressResponseBody body);

        @Override
        DescribePublicIpAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePublicIpAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePublicIpAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePublicIpAddressResponse response) {
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
        public Builder body(DescribePublicIpAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePublicIpAddressResponse build() {
            return new DescribePublicIpAddressResponse(this);
        } 

    } 

}
