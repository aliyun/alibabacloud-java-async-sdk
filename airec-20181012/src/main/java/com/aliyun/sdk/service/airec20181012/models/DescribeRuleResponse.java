// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleResponse</p>
 */
public class DescribeRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleResponseBody body;

    private DescribeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleResponse create() {
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
    public DescribeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleResponseBody body);

        @Override
        DescribeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleResponse response) {
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
        public Builder body(DescribeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleResponse build() {
            return new DescribeRuleResponse(this);
        } 

    } 

}
