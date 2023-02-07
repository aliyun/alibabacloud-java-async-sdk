// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductAmortizedCostByConsumePeriodResponse} extends {@link TeaModel}
 *
 * <p>DescribeProductAmortizedCostByConsumePeriodResponse</p>
 */
public class DescribeProductAmortizedCostByConsumePeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProductAmortizedCostByConsumePeriodResponseBody body;

    private DescribeProductAmortizedCostByConsumePeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProductAmortizedCostByConsumePeriodResponse create() {
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
    public DescribeProductAmortizedCostByConsumePeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProductAmortizedCostByConsumePeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProductAmortizedCostByConsumePeriodResponseBody body);

        @Override
        DescribeProductAmortizedCostByConsumePeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProductAmortizedCostByConsumePeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProductAmortizedCostByConsumePeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProductAmortizedCostByConsumePeriodResponse response) {
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
        public Builder body(DescribeProductAmortizedCostByConsumePeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProductAmortizedCostByConsumePeriodResponse build() {
            return new DescribeProductAmortizedCostByConsumePeriodResponse(this);
        } 

    } 

}
