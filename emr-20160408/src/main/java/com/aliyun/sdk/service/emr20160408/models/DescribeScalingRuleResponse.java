// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingRuleResponse</p>
 */
public class DescribeScalingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingRuleResponseBody body;

    private DescribeScalingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingRuleResponse create() {
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
    public DescribeScalingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingRuleResponseBody body);

        @Override
        DescribeScalingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingRuleResponse response) {
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
        public Builder body(DescribeScalingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingRuleResponse build() {
            return new DescribeScalingRuleResponse(this);
        } 

    } 

}
