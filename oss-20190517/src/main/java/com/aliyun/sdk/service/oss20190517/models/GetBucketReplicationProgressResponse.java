// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketReplicationProgressResponse} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationProgressResponse</p>
 */
public class GetBucketReplicationProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketReplicationProgressResponseBody body;

    private GetBucketReplicationProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketReplicationProgressResponse create() {
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
    public GetBucketReplicationProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketReplicationProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketReplicationProgressResponseBody body);

        @Override
        GetBucketReplicationProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketReplicationProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketReplicationProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketReplicationProgressResponse response) {
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
        public Builder body(GetBucketReplicationProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketReplicationProgressResponse build() {
            return new GetBucketReplicationProgressResponse(this);
        } 

    } 

}
