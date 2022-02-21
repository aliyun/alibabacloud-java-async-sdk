// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceAllocationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceAllocationsResponse</p>
 */
public class DescribeReservedInstanceAllocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservedInstanceAllocationsResponseBody body;

    private DescribeReservedInstanceAllocationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservedInstanceAllocationsResponse create() {
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
    public DescribeReservedInstanceAllocationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservedInstanceAllocationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservedInstanceAllocationsResponseBody body);

        @Override
        DescribeReservedInstanceAllocationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservedInstanceAllocationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservedInstanceAllocationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservedInstanceAllocationsResponse response) {
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
        public Builder body(DescribeReservedInstanceAllocationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservedInstanceAllocationsResponse build() {
            return new DescribeReservedInstanceAllocationsResponse(this);
        } 

    } 

}
