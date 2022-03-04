// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHpcClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeHpcClustersResponse</p>
 */
public class DescribeHpcClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHpcClustersResponseBody body;

    private DescribeHpcClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHpcClustersResponse create() {
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
    public DescribeHpcClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHpcClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHpcClustersResponseBody body);

        @Override
        DescribeHpcClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHpcClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHpcClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHpcClustersResponse response) {
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
        public Builder body(DescribeHpcClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHpcClustersResponse build() {
            return new DescribeHpcClustersResponse(this);
        } 

    } 

}
