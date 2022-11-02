// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponse</p>
 */
public class DescribeRuleGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleGroupsResponseBody body;

    private DescribeRuleGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleGroupsResponse create() {
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
    public DescribeRuleGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleGroupsResponseBody body);

        @Override
        DescribeRuleGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleGroupsResponse response) {
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
        public Builder body(DescribeRuleGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleGroupsResponse build() {
            return new DescribeRuleGroupsResponse(this);
        } 

    } 

}
