// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponse} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponse</p>
 */
public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body;

    private DescribeVirtualBorderRoutersForPhysicalConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse create() {
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
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVirtualBorderRoutersForPhysicalConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body);

        @Override
        DescribeVirtualBorderRoutersForPhysicalConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVirtualBorderRoutersForPhysicalConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVirtualBorderRoutersForPhysicalConnectionResponse response) {
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
        public Builder body(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVirtualBorderRoutersForPhysicalConnectionResponse build() {
            return new DescribeVirtualBorderRoutersForPhysicalConnectionResponse(this);
        } 

    } 

}
