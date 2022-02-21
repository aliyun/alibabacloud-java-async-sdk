// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebPreciseAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebPreciseAccessRuleResponse</p>
 */
public class DescribeWebPreciseAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebPreciseAccessRuleResponseBody body;

    private DescribeWebPreciseAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebPreciseAccessRuleResponse create() {
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
    public DescribeWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebPreciseAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebPreciseAccessRuleResponseBody body);

        @Override
        DescribeWebPreciseAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebPreciseAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebPreciseAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebPreciseAccessRuleResponse response) {
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
        public Builder body(DescribeWebPreciseAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebPreciseAccessRuleResponse build() {
            return new DescribeWebPreciseAccessRuleResponse(this);
        } 

    } 

}
