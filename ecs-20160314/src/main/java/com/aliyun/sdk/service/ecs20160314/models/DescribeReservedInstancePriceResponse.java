// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstancePriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstancePriceResponse</p>
 */
public class DescribeReservedInstancePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservedInstancePriceResponseBody body;

    private DescribeReservedInstancePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservedInstancePriceResponse create() {
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
    public DescribeReservedInstancePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservedInstancePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservedInstancePriceResponseBody body);

        @Override
        DescribeReservedInstancePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservedInstancePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservedInstancePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservedInstancePriceResponse response) {
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
        public Builder body(DescribeReservedInstancePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservedInstancePriceResponse build() {
            return new DescribeReservedInstancePriceResponse(this);
        } 

    } 

}
