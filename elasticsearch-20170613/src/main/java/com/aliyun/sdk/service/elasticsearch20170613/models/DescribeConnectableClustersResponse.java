// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectableClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeConnectableClustersResponse</p>
 */
public class DescribeConnectableClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConnectableClustersResponseBody body;

    private DescribeConnectableClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConnectableClustersResponse create() {
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
    public DescribeConnectableClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConnectableClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConnectableClustersResponseBody body);

        @Override
        DescribeConnectableClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConnectableClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConnectableClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConnectableClustersResponse response) {
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
        public Builder body(DescribeConnectableClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConnectableClustersResponse build() {
            return new DescribeConnectableClustersResponse(this);
        } 

    } 

}
