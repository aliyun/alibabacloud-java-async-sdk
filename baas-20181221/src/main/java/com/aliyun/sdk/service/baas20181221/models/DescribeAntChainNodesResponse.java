// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainNodesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAntChainNodesResponse</p>
 */
public class DescribeAntChainNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAntChainNodesResponseBody body;

    private DescribeAntChainNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAntChainNodesResponse create() {
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
    public DescribeAntChainNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAntChainNodesResponseBody body);

        @Override
        DescribeAntChainNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAntChainNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainNodesResponse response) {
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
        public Builder body(DescribeAntChainNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainNodesResponse build() {
            return new DescribeAntChainNodesResponse(this);
        } 

    } 

}
