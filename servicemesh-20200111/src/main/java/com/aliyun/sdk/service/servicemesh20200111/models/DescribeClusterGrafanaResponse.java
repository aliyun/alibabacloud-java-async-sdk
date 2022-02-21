// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterGrafanaResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterGrafanaResponse</p>
 */
public class DescribeClusterGrafanaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterGrafanaResponseBody body;

    private DescribeClusterGrafanaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterGrafanaResponse create() {
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
    public DescribeClusterGrafanaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterGrafanaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterGrafanaResponseBody body);

        @Override
        DescribeClusterGrafanaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterGrafanaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterGrafanaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterGrafanaResponse response) {
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
        public Builder body(DescribeClusterGrafanaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterGrafanaResponse build() {
            return new DescribeClusterGrafanaResponse(this);
        } 

    } 

}
