// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductAmortizedCostByAmortizationPeriodResponse} extends {@link TeaModel}
 *
 * <p>DescribeProductAmortizedCostByAmortizationPeriodResponse</p>
 */
public class DescribeProductAmortizedCostByAmortizationPeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProductAmortizedCostByAmortizationPeriodResponseBody body;

    private DescribeProductAmortizedCostByAmortizationPeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProductAmortizedCostByAmortizationPeriodResponse create() {
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
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProductAmortizedCostByAmortizationPeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProductAmortizedCostByAmortizationPeriodResponseBody body);

        @Override
        DescribeProductAmortizedCostByAmortizationPeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProductAmortizedCostByAmortizationPeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProductAmortizedCostByAmortizationPeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProductAmortizedCostByAmortizationPeriodResponse response) {
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
        public Builder body(DescribeProductAmortizedCostByAmortizationPeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProductAmortizedCostByAmortizationPeriodResponse build() {
            return new DescribeProductAmortizedCostByAmortizationPeriodResponse(this);
        } 

    } 

}
