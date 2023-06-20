// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductsResponse} extends {@link TeaModel}
 *
 * <p>DescribeProductsResponse</p>
 */
public class DescribeProductsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProductsResponseBody body;

    private DescribeProductsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProductsResponse create() {
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
    public DescribeProductsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProductsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProductsResponseBody body);

        @Override
        DescribeProductsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProductsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProductsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProductsResponse response) {
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
        public Builder body(DescribeProductsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProductsResponse build() {
            return new DescribeProductsResponse(this);
        } 

    } 

}
