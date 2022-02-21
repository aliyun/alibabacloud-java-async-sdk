// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigTagResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceConfigTagResponse</p>
 */
public class DescribeClusterServiceConfigTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterServiceConfigTagResponseBody body;

    private DescribeClusterServiceConfigTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterServiceConfigTagResponse create() {
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
    public DescribeClusterServiceConfigTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterServiceConfigTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterServiceConfigTagResponseBody body);

        @Override
        DescribeClusterServiceConfigTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterServiceConfigTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterServiceConfigTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterServiceConfigTagResponse response) {
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
        public Builder body(DescribeClusterServiceConfigTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterServiceConfigTagResponse build() {
            return new DescribeClusterServiceConfigTagResponse(this);
        } 

    } 

}
