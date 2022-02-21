// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterMetaCollectResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterMetaCollectResponse</p>
 */
public class DescribeClusterMetaCollectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterMetaCollectResponseBody body;

    private DescribeClusterMetaCollectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterMetaCollectResponse create() {
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
    public DescribeClusterMetaCollectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterMetaCollectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterMetaCollectResponseBody body);

        @Override
        DescribeClusterMetaCollectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterMetaCollectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterMetaCollectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterMetaCollectResponse response) {
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
        public Builder body(DescribeClusterMetaCollectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterMetaCollectResponse build() {
            return new DescribeClusterMetaCollectResponse(this);
        } 

    } 

}
