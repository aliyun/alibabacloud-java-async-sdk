// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceAutoRenewAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceAutoRenewAttributeResponse</p>
 */
public class DescribeReservedInstanceAutoRenewAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservedInstanceAutoRenewAttributeResponseBody body;

    private DescribeReservedInstanceAutoRenewAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservedInstanceAutoRenewAttributeResponse create() {
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
    public DescribeReservedInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservedInstanceAutoRenewAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservedInstanceAutoRenewAttributeResponseBody body);

        @Override
        DescribeReservedInstanceAutoRenewAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservedInstanceAutoRenewAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservedInstanceAutoRenewAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservedInstanceAutoRenewAttributeResponse response) {
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
        public Builder body(DescribeReservedInstanceAutoRenewAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservedInstanceAutoRenewAttributeResponse build() {
            return new DescribeReservedInstanceAutoRenewAttributeResponse(this);
        } 

    } 

}
