// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsEipAddressesResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsEipAddressesResponse</p>
 */
public class DescribeEnsEipAddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsEipAddressesResponseBody body;

    private DescribeEnsEipAddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsEipAddressesResponse create() {
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
    public DescribeEnsEipAddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsEipAddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsEipAddressesResponseBody body);

        @Override
        DescribeEnsEipAddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsEipAddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsEipAddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsEipAddressesResponse response) {
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
        public Builder body(DescribeEnsEipAddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsEipAddressesResponse build() {
            return new DescribeEnsEipAddressesResponse(this);
        } 

    } 

}
