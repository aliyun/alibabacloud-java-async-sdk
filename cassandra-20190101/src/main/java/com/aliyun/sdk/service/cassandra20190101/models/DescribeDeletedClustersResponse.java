// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeletedClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeletedClustersResponse</p>
 */
public class DescribeDeletedClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeletedClustersResponseBody body;

    private DescribeDeletedClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeletedClustersResponse create() {
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
    public DescribeDeletedClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeletedClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeletedClustersResponseBody body);

        @Override
        DescribeDeletedClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeletedClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeletedClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeletedClustersResponse response) {
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
        public Builder body(DescribeDeletedClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeletedClustersResponse build() {
            return new DescribeDeletedClustersResponse(this);
        } 

    } 

}
