// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancePolicyResponse</p>
 */
public class DescribeInstancePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstancePolicyResponseBody body;

    private DescribeInstancePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstancePolicyResponse create() {
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
    public DescribeInstancePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstancePolicyResponseBody body);

        @Override
        DescribeInstancePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstancePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancePolicyResponse response) {
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
        public Builder body(DescribeInstancePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancePolicyResponse build() {
            return new DescribeInstancePolicyResponse(this);
        } 

    } 

}
