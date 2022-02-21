// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortFlowListResponse} extends {@link TeaModel}
 *
 * <p>DescribePortFlowListResponse</p>
 */
public class DescribePortFlowListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortFlowListResponseBody body;

    private DescribePortFlowListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortFlowListResponse create() {
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
    public DescribePortFlowListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortFlowListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortFlowListResponseBody body);

        @Override
        DescribePortFlowListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortFlowListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortFlowListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortFlowListResponse response) {
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
        public Builder body(DescribePortFlowListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortFlowListResponse build() {
            return new DescribePortFlowListResponse(this);
        } 

    } 

}
