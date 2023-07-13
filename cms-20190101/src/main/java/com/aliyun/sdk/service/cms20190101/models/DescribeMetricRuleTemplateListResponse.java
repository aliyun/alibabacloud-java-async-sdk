// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTemplateListResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleTemplateListResponse</p>
 */
public class DescribeMetricRuleTemplateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetricRuleTemplateListResponseBody body;

    private DescribeMetricRuleTemplateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetricRuleTemplateListResponse create() {
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
    public DescribeMetricRuleTemplateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetricRuleTemplateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetricRuleTemplateListResponseBody body);

        @Override
        DescribeMetricRuleTemplateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetricRuleTemplateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetricRuleTemplateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetricRuleTemplateListResponse response) {
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
        public Builder body(DescribeMetricRuleTemplateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetricRuleTemplateListResponse build() {
            return new DescribeMetricRuleTemplateListResponse(this);
        } 

    } 

}
