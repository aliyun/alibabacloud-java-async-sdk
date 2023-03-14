// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecsResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecsResponse</p>
 */
public class DescribeInstanceSpecsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceSpecsResponseBody body;

    private DescribeInstanceSpecsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceSpecsResponse create() {
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
    public DescribeInstanceSpecsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceSpecsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceSpecsResponseBody body);

        @Override
        DescribeInstanceSpecsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceSpecsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceSpecsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceSpecsResponse response) {
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
        public Builder body(DescribeInstanceSpecsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceSpecsResponse build() {
            return new DescribeInstanceSpecsResponse(this);
        } 

    } 

}
