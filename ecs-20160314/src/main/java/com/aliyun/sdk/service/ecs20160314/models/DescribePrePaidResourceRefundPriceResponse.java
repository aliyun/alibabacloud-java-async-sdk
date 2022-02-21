// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrePaidResourceRefundPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribePrePaidResourceRefundPriceResponse</p>
 */
public class DescribePrePaidResourceRefundPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePrePaidResourceRefundPriceResponseBody body;

    private DescribePrePaidResourceRefundPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePrePaidResourceRefundPriceResponse create() {
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
    public DescribePrePaidResourceRefundPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrePaidResourceRefundPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePrePaidResourceRefundPriceResponseBody body);

        @Override
        DescribePrePaidResourceRefundPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrePaidResourceRefundPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePrePaidResourceRefundPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrePaidResourceRefundPriceResponse response) {
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
        public Builder body(DescribePrePaidResourceRefundPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrePaidResourceRefundPriceResponse build() {
            return new DescribePrePaidResourceRefundPriceResponse(this);
        } 

    } 

}
