// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipAddressesResponse} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponse</p>
 */
public class DescribeEipAddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEipAddressesResponseBody body;

    private DescribeEipAddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEipAddressesResponse create() {
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
    public DescribeEipAddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEipAddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEipAddressesResponseBody body);

        @Override
        DescribeEipAddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEipAddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEipAddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEipAddressesResponse response) {
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
        public Builder body(DescribeEipAddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEipAddressesResponse build() {
            return new DescribeEipAddressesResponse(this);
        } 

    } 

}
