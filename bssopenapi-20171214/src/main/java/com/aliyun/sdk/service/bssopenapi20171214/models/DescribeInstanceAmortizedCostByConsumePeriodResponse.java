// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByConsumePeriodResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAmortizedCostByConsumePeriodResponse</p>
 */
public class DescribeInstanceAmortizedCostByConsumePeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceAmortizedCostByConsumePeriodResponseBody body;

    private DescribeInstanceAmortizedCostByConsumePeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceAmortizedCostByConsumePeriodResponse create() {
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
    public DescribeInstanceAmortizedCostByConsumePeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceAmortizedCostByConsumePeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceAmortizedCostByConsumePeriodResponseBody body);

        @Override
        DescribeInstanceAmortizedCostByConsumePeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceAmortizedCostByConsumePeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceAmortizedCostByConsumePeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceAmortizedCostByConsumePeriodResponse response) {
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
        public Builder body(DescribeInstanceAmortizedCostByConsumePeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceAmortizedCostByConsumePeriodResponse build() {
            return new DescribeInstanceAmortizedCostByConsumePeriodResponse(this);
        } 

    } 

}
