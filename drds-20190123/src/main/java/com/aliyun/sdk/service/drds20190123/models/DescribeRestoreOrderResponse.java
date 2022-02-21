// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreOrderResponse} extends {@link TeaModel}
 *
 * <p>DescribeRestoreOrderResponse</p>
 */
public class DescribeRestoreOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRestoreOrderResponseBody body;

    private DescribeRestoreOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRestoreOrderResponse create() {
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
    public DescribeRestoreOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRestoreOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRestoreOrderResponseBody body);

        @Override
        DescribeRestoreOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRestoreOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRestoreOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRestoreOrderResponse response) {
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
        public Builder body(DescribeRestoreOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRestoreOrderResponse build() {
            return new DescribeRestoreOrderResponse(this);
        } 

    } 

}
