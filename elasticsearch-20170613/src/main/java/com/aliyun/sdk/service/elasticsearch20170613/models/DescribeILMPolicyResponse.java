// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeILMPolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeILMPolicyResponse</p>
 */
public class DescribeILMPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeILMPolicyResponseBody body;

    private DescribeILMPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeILMPolicyResponse create() {
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
    public DescribeILMPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeILMPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeILMPolicyResponseBody body);

        @Override
        DescribeILMPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeILMPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeILMPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeILMPolicyResponse response) {
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
        public Builder body(DescribeILMPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeILMPolicyResponse build() {
            return new DescribeILMPolicyResponse(this);
        } 

    } 

}
