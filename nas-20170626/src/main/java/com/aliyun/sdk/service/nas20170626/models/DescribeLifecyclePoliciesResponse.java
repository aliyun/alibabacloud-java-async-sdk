// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecyclePoliciesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLifecyclePoliciesResponse</p>
 */
public class DescribeLifecyclePoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLifecyclePoliciesResponseBody body;

    private DescribeLifecyclePoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLifecyclePoliciesResponse create() {
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
    public DescribeLifecyclePoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLifecyclePoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLifecyclePoliciesResponseBody body);

        @Override
        DescribeLifecyclePoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLifecyclePoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLifecyclePoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLifecyclePoliciesResponse response) {
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
        public Builder body(DescribeLifecyclePoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLifecyclePoliciesResponse build() {
            return new DescribeLifecyclePoliciesResponse(this);
        } 

    } 

}
