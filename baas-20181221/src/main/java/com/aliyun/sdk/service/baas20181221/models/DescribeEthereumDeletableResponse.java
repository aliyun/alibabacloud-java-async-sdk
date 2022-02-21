// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumDeletableResponse} extends {@link TeaModel}
 *
 * <p>DescribeEthereumDeletableResponse</p>
 */
public class DescribeEthereumDeletableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEthereumDeletableResponseBody body;

    private DescribeEthereumDeletableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEthereumDeletableResponse create() {
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
    public DescribeEthereumDeletableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEthereumDeletableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEthereumDeletableResponseBody body);

        @Override
        DescribeEthereumDeletableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEthereumDeletableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEthereumDeletableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEthereumDeletableResponse response) {
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
        public Builder body(DescribeEthereumDeletableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEthereumDeletableResponse build() {
            return new DescribeEthereumDeletableResponse(this);
        } 

    } 

}
