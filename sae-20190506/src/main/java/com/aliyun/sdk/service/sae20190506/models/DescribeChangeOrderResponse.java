// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeOrderResponse} extends {@link TeaModel}
 *
 * <p>DescribeChangeOrderResponse</p>
 */
public class DescribeChangeOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChangeOrderResponseBody body;

    private DescribeChangeOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChangeOrderResponse create() {
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
    public DescribeChangeOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChangeOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChangeOrderResponseBody body);

        @Override
        DescribeChangeOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChangeOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChangeOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChangeOrderResponse response) {
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
        public Builder body(DescribeChangeOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChangeOrderResponse build() {
            return new DescribeChangeOrderResponse(this);
        } 

    } 

}
