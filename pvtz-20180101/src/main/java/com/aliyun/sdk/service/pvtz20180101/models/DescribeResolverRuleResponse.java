// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverRuleResponse</p>
 */
public class DescribeResolverRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResolverRuleResponseBody body;

    private DescribeResolverRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResolverRuleResponse create() {
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
    public DescribeResolverRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResolverRuleResponseBody body);

        @Override
        DescribeResolverRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResolverRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverRuleResponse response) {
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
        public Builder body(DescribeResolverRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverRuleResponse build() {
            return new DescribeResolverRuleResponse(this);
        } 

    } 

}
