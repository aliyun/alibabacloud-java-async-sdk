// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitionVpcsResponse} extends {@link TeaModel}
 *
 * <p>DescribeTransitionVpcsResponse</p>
 */
public class DescribeTransitionVpcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTransitionVpcsResponseBody body;

    private DescribeTransitionVpcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTransitionVpcsResponse create() {
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
    public DescribeTransitionVpcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTransitionVpcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTransitionVpcsResponseBody body);

        @Override
        DescribeTransitionVpcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTransitionVpcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTransitionVpcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTransitionVpcsResponse response) {
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
        public Builder body(DescribeTransitionVpcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTransitionVpcsResponse build() {
            return new DescribeTransitionVpcsResponse(this);
        } 

    } 

}
