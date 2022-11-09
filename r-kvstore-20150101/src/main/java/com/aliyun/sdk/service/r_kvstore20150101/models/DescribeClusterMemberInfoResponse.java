// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterMemberInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterMemberInfoResponse</p>
 */
public class DescribeClusterMemberInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterMemberInfoResponseBody body;

    private DescribeClusterMemberInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterMemberInfoResponse create() {
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
    public DescribeClusterMemberInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterMemberInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterMemberInfoResponseBody body);

        @Override
        DescribeClusterMemberInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterMemberInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterMemberInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterMemberInfoResponse response) {
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
        public Builder body(DescribeClusterMemberInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterMemberInfoResponse build() {
            return new DescribeClusterMemberInfoResponse(this);
        } 

    } 

}
