// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulePolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulePolicyResponse</p>
 */
public class DescribeLayer4RulePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLayer4RulePolicyResponseBody body;

    private DescribeLayer4RulePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLayer4RulePolicyResponse create() {
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
    public DescribeLayer4RulePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLayer4RulePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLayer4RulePolicyResponseBody body);

        @Override
        DescribeLayer4RulePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLayer4RulePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLayer4RulePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLayer4RulePolicyResponse response) {
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
        public Builder body(DescribeLayer4RulePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLayer4RulePolicyResponse build() {
            return new DescribeLayer4RulePolicyResponse(this);
        } 

    } 

}
