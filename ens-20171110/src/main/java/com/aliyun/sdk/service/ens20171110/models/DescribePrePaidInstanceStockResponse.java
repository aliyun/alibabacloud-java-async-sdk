// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrePaidInstanceStockResponse} extends {@link TeaModel}
 *
 * <p>DescribePrePaidInstanceStockResponse</p>
 */
public class DescribePrePaidInstanceStockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePrePaidInstanceStockResponseBody body;

    private DescribePrePaidInstanceStockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePrePaidInstanceStockResponse create() {
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
    public DescribePrePaidInstanceStockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrePaidInstanceStockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePrePaidInstanceStockResponseBody body);

        @Override
        DescribePrePaidInstanceStockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrePaidInstanceStockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePrePaidInstanceStockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrePaidInstanceStockResponse response) {
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
        public Builder body(DescribePrePaidInstanceStockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrePaidInstanceStockResponse build() {
            return new DescribePrePaidInstanceStockResponse(this);
        } 

    } 

}
