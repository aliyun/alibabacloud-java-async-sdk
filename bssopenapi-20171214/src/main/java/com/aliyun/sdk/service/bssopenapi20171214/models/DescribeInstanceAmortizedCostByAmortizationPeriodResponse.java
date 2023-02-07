// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByAmortizationPeriodResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAmortizedCostByAmortizationPeriodResponse</p>
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body;

    private DescribeInstanceAmortizedCostByAmortizationPeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceAmortizedCostByAmortizationPeriodResponse create() {
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
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceAmortizedCostByAmortizationPeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body);

        @Override
        DescribeInstanceAmortizedCostByAmortizationPeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceAmortizedCostByAmortizationPeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceAmortizedCostByAmortizationPeriodResponse response) {
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
        public Builder body(DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceAmortizedCostByAmortizationPeriodResponse build() {
            return new DescribeInstanceAmortizedCostByAmortizationPeriodResponse(this);
        } 

    } 

}
