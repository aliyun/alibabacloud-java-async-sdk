// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingRulesResponse</p>
 */
public class DescribeScalingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingRulesResponseBody body;

    private DescribeScalingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingRulesResponse create() {
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
    public DescribeScalingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingRulesResponseBody body);

        @Override
        DescribeScalingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingRulesResponse response) {
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
        public Builder body(DescribeScalingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingRulesResponse build() {
            return new DescribeScalingRulesResponse(this);
        } 

    } 

}
