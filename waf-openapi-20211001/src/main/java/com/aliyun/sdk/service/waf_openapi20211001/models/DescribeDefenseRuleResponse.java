// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRuleResponse</p>
 */
public class DescribeDefenseRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDefenseRuleResponseBody body;

    private DescribeDefenseRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDefenseRuleResponse create() {
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
    public DescribeDefenseRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDefenseRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDefenseRuleResponseBody body);

        @Override
        DescribeDefenseRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDefenseRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDefenseRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDefenseRuleResponse response) {
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
        public Builder body(DescribeDefenseRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDefenseRuleResponse build() {
            return new DescribeDefenseRuleResponse(this);
        } 

    } 

}
