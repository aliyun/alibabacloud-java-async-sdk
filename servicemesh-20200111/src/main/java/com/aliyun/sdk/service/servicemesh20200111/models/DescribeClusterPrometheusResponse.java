// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterPrometheusResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterPrometheusResponse</p>
 */
public class DescribeClusterPrometheusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterPrometheusResponseBody body;

    private DescribeClusterPrometheusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterPrometheusResponse create() {
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
    public DescribeClusterPrometheusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterPrometheusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterPrometheusResponseBody body);

        @Override
        DescribeClusterPrometheusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterPrometheusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterPrometheusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterPrometheusResponse response) {
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
        public Builder body(DescribeClusterPrometheusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterPrometheusResponse build() {
            return new DescribeClusterPrometheusResponse(this);
        } 

    } 

}
