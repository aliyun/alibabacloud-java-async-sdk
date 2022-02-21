// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActionEventPolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeActionEventPolicyResponse</p>
 */
public class DescribeActionEventPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeActionEventPolicyResponseBody body;

    private DescribeActionEventPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeActionEventPolicyResponse create() {
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
    public DescribeActionEventPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeActionEventPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeActionEventPolicyResponseBody body);

        @Override
        DescribeActionEventPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeActionEventPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeActionEventPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeActionEventPolicyResponse response) {
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
        public Builder body(DescribeActionEventPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeActionEventPolicyResponse build() {
            return new DescribeActionEventPolicyResponse(this);
        } 

    } 

}
