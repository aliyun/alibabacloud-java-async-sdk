// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBProxyResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyResponse</p>
 */
public class DescribeDBProxyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBProxyResponseBody body;

    private DescribeDBProxyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBProxyResponse create() {
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
    public DescribeDBProxyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBProxyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBProxyResponseBody body);

        @Override
        DescribeDBProxyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBProxyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBProxyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBProxyResponse response) {
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
        public Builder body(DescribeDBProxyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBProxyResponse build() {
            return new DescribeDBProxyResponse(this);
        } 

    } 

}
