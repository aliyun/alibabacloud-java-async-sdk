// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigRuleResponse</p>
 */
public class DescribeConfigRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigRuleResponseBody body;

    private DescribeConfigRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigRuleResponse create() {
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
    public DescribeConfigRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigRuleResponseBody body);

        @Override
        DescribeConfigRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigRuleResponse response) {
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
        public Builder body(DescribeConfigRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigRuleResponse build() {
            return new DescribeConfigRuleResponse(this);
        } 

    } 

}
