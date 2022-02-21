// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainLatestBlocksResponse} extends {@link TeaModel}
 *
 * <p>DescribeAntChainLatestBlocksResponse</p>
 */
public class DescribeAntChainLatestBlocksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainLatestBlocksResponseBody body;

    private DescribeAntChainLatestBlocksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainLatestBlocksResponse create() {
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
    public DescribeAntChainLatestBlocksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainLatestBlocksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainLatestBlocksResponseBody body);

        @Override
        DescribeAntChainLatestBlocksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainLatestBlocksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainLatestBlocksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainLatestBlocksResponse response) {
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
        public Builder body(DescribeAntChainLatestBlocksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainLatestBlocksResponse build() {
            return new DescribeAntChainLatestBlocksResponse(this);
        } 

    } 

}
