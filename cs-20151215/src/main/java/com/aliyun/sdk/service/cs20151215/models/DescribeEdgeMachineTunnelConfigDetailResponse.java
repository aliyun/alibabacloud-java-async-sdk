// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineTunnelConfigDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineTunnelConfigDetailResponse</p>
 */
public class DescribeEdgeMachineTunnelConfigDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEdgeMachineTunnelConfigDetailResponseBody body;

    private DescribeEdgeMachineTunnelConfigDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEdgeMachineTunnelConfigDetailResponse create() {
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
    public DescribeEdgeMachineTunnelConfigDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEdgeMachineTunnelConfigDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEdgeMachineTunnelConfigDetailResponseBody body);

        @Override
        DescribeEdgeMachineTunnelConfigDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEdgeMachineTunnelConfigDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEdgeMachineTunnelConfigDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEdgeMachineTunnelConfigDetailResponse response) {
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
        public Builder body(DescribeEdgeMachineTunnelConfigDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEdgeMachineTunnelConfigDetailResponse build() {
            return new DescribeEdgeMachineTunnelConfigDetailResponse(this);
        } 

    } 

}
