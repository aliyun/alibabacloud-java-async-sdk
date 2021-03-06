// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeHubClustersResponse</p>
 */
public class DescribeHubClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHubClustersResponseBody body;

    private DescribeHubClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHubClustersResponse create() {
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
    public DescribeHubClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHubClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHubClustersResponseBody body);

        @Override
        DescribeHubClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHubClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHubClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHubClustersResponse response) {
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
        public Builder body(DescribeHubClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHubClustersResponse build() {
            return new DescribeHubClustersResponse(this);
        } 

    } 

}
