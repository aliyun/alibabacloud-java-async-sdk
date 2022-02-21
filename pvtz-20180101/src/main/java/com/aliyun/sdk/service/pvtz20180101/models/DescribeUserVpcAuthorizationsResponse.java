// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVpcAuthorizationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserVpcAuthorizationsResponse</p>
 */
public class DescribeUserVpcAuthorizationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserVpcAuthorizationsResponseBody body;

    private DescribeUserVpcAuthorizationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserVpcAuthorizationsResponse create() {
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
    public DescribeUserVpcAuthorizationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserVpcAuthorizationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserVpcAuthorizationsResponseBody body);

        @Override
        DescribeUserVpcAuthorizationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserVpcAuthorizationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserVpcAuthorizationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserVpcAuthorizationsResponse response) {
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
        public Builder body(DescribeUserVpcAuthorizationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserVpcAuthorizationsResponse build() {
            return new DescribeUserVpcAuthorizationsResponse(this);
        } 

    } 

}
