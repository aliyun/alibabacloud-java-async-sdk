// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNodeResponse</p>
 */
public class DescribeDBClusterNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClusterNodeResponseBody body;

    private DescribeDBClusterNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClusterNodeResponse create() {
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
    public DescribeDBClusterNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClusterNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClusterNodeResponseBody body);

        @Override
        DescribeDBClusterNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClusterNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClusterNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClusterNodeResponse response) {
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
        public Builder body(DescribeDBClusterNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClusterNodeResponse build() {
            return new DescribeDBClusterNodeResponse(this);
        } 

    } 

}
