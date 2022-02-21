// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWaitingOrdersResponse} extends {@link TeaModel}
 *
 * <p>DescribeWaitingOrdersResponse</p>
 */
public class DescribeWaitingOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWaitingOrdersResponseBody body;

    private DescribeWaitingOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWaitingOrdersResponse create() {
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
    public DescribeWaitingOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWaitingOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWaitingOrdersResponseBody body);

        @Override
        DescribeWaitingOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWaitingOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWaitingOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWaitingOrdersResponse response) {
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
        public Builder body(DescribeWaitingOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWaitingOrdersResponse build() {
            return new DescribeWaitingOrdersResponse(this);
        } 

    } 

}
