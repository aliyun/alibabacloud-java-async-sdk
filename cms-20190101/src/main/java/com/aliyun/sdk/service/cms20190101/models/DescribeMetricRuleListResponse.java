// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleListResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleListResponse</p>
 */
public class DescribeMetricRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetricRuleListResponseBody body;

    private DescribeMetricRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetricRuleListResponse create() {
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
    public DescribeMetricRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetricRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetricRuleListResponseBody body);

        @Override
        DescribeMetricRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetricRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetricRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetricRuleListResponse response) {
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
        public Builder body(DescribeMetricRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetricRuleListResponse build() {
            return new DescribeMetricRuleListResponse(this);
        } 

    } 

}
