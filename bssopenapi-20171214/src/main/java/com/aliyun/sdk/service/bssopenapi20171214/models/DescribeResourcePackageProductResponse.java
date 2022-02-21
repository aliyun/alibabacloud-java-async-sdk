// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackageProductResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackageProductResponse</p>
 */
public class DescribeResourcePackageProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourcePackageProductResponseBody body;

    private DescribeResourcePackageProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourcePackageProductResponse create() {
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
    public DescribeResourcePackageProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourcePackageProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourcePackageProductResponseBody body);

        @Override
        DescribeResourcePackageProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourcePackageProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourcePackageProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourcePackageProductResponse response) {
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
        public Builder body(DescribeResourcePackageProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourcePackageProductResponse build() {
            return new DescribeResourcePackageProductResponse(this);
        } 

    } 

}
