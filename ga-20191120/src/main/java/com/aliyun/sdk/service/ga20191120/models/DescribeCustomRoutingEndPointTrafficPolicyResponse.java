// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndPointTrafficPolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndPointTrafficPolicyResponse</p>
 */
public class DescribeCustomRoutingEndPointTrafficPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomRoutingEndPointTrafficPolicyResponseBody body;

    private DescribeCustomRoutingEndPointTrafficPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomRoutingEndPointTrafficPolicyResponse create() {
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
    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomRoutingEndPointTrafficPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomRoutingEndPointTrafficPolicyResponseBody body);

        @Override
        DescribeCustomRoutingEndPointTrafficPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomRoutingEndPointTrafficPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomRoutingEndPointTrafficPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomRoutingEndPointTrafficPolicyResponse response) {
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
        public Builder body(DescribeCustomRoutingEndPointTrafficPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomRoutingEndPointTrafficPolicyResponse build() {
            return new DescribeCustomRoutingEndPointTrafficPolicyResponse(this);
        } 

    } 

}
