// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrivatePoolsResponse} extends {@link TeaModel}
 *
 * <p>DescribePrivatePoolsResponse</p>
 */
public class DescribePrivatePoolsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePrivatePoolsResponseBody body;

    private DescribePrivatePoolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePrivatePoolsResponse create() {
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
    public DescribePrivatePoolsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrivatePoolsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePrivatePoolsResponseBody body);

        @Override
        DescribePrivatePoolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrivatePoolsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePrivatePoolsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrivatePoolsResponse response) {
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
        public Builder body(DescribePrivatePoolsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrivatePoolsResponse build() {
            return new DescribePrivatePoolsResponse(this);
        } 

    } 

}
