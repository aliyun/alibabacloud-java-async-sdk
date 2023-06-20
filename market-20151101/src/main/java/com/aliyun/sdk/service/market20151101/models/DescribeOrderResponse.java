// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderResponse} extends {@link TeaModel}
 *
 * <p>DescribeOrderResponse</p>
 */
public class DescribeOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOrderResponseBody body;

    private DescribeOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOrderResponse create() {
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
    public DescribeOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOrderResponseBody body);

        @Override
        DescribeOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOrderResponse response) {
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
        public Builder body(DescribeOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOrderResponse build() {
            return new DescribeOrderResponse(this);
        } 

    } 

}
