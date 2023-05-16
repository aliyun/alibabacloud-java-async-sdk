// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsSaleControlStockResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsSaleControlStockResponse</p>
 */
public class DescribeEnsSaleControlStockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsSaleControlStockResponseBody body;

    private DescribeEnsSaleControlStockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsSaleControlStockResponse create() {
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
    public DescribeEnsSaleControlStockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsSaleControlStockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsSaleControlStockResponseBody body);

        @Override
        DescribeEnsSaleControlStockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsSaleControlStockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsSaleControlStockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsSaleControlStockResponse response) {
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
        public Builder body(DescribeEnsSaleControlStockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsSaleControlStockResponse build() {
            return new DescribeEnsSaleControlStockResponse(this);
        } 

    } 

}
