// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse</p>
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body;

    private DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse create() {
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
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body);

        @Override
        DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse response) {
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
        public Builder body(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse build() {
            return new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse(this);
        } 

    } 

}
