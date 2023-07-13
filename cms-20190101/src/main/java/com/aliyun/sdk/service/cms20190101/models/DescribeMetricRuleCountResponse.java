// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleCountResponse</p>
 */
public class DescribeMetricRuleCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetricRuleCountResponseBody body;

    private DescribeMetricRuleCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetricRuleCountResponse create() {
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
    public DescribeMetricRuleCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetricRuleCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetricRuleCountResponseBody body);

        @Override
        DescribeMetricRuleCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetricRuleCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetricRuleCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetricRuleCountResponse response) {
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
        public Builder body(DescribeMetricRuleCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetricRuleCountResponse build() {
            return new DescribeMetricRuleCountResponse(this);
        } 

    } 

}
