// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceResponse</p>
 */
public class DescribeClusterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterServiceResponseBody body;

    private DescribeClusterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterServiceResponse create() {
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
    public DescribeClusterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterServiceResponseBody body);

        @Override
        DescribeClusterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterServiceResponse response) {
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
        public Builder body(DescribeClusterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterServiceResponse build() {
            return new DescribeClusterServiceResponse(this);
        } 

    } 

}
