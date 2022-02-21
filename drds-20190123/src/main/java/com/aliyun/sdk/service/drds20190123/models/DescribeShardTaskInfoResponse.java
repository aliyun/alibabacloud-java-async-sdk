// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeShardTaskInfoResponse</p>
 */
public class DescribeShardTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeShardTaskInfoResponseBody body;

    private DescribeShardTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeShardTaskInfoResponse create() {
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
    public DescribeShardTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeShardTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeShardTaskInfoResponseBody body);

        @Override
        DescribeShardTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeShardTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeShardTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeShardTaskInfoResponse response) {
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
        public Builder body(DescribeShardTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeShardTaskInfoResponse build() {
            return new DescribeShardTaskInfoResponse(this);
        } 

    } 

}
