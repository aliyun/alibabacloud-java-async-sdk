// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponse</p>
 */
public class DescribeRuleGroupsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeRuleGroupsResponseBody body;

    private DescribeRuleGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeRuleGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeRuleGroupsResponseBody body);

        @Override
        DescribeRuleGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeRuleGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleGroupsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
