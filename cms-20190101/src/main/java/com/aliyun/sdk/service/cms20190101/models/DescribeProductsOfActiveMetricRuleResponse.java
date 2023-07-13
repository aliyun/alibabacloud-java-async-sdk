// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductsOfActiveMetricRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeProductsOfActiveMetricRuleResponse</p>
 */
public class DescribeProductsOfActiveMetricRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProductsOfActiveMetricRuleResponseBody body;

    private DescribeProductsOfActiveMetricRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProductsOfActiveMetricRuleResponse create() {
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
    public DescribeProductsOfActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProductsOfActiveMetricRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProductsOfActiveMetricRuleResponseBody body);

        @Override
        DescribeProductsOfActiveMetricRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProductsOfActiveMetricRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProductsOfActiveMetricRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProductsOfActiveMetricRuleResponse response) {
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
        public Builder body(DescribeProductsOfActiveMetricRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProductsOfActiveMetricRuleResponse build() {
            return new DescribeProductsOfActiveMetricRuleResponse(this);
        } 

    } 

}
