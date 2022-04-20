// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshClustersResponse</p>
 */
public class DescribeServiceMeshClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceMeshClustersResponseBody body;

    private DescribeServiceMeshClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceMeshClustersResponse create() {
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
    public DescribeServiceMeshClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceMeshClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceMeshClustersResponseBody body);

        @Override
        DescribeServiceMeshClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceMeshClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceMeshClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceMeshClustersResponse response) {
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
        public Builder body(DescribeServiceMeshClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceMeshClustersResponse build() {
            return new DescribeServiceMeshClustersResponse(this);
        } 

    } 

}
