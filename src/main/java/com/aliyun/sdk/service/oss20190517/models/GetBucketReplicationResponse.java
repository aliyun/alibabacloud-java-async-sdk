// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketReplicationResponse} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationResponse</p>
 */
public class GetBucketReplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketReplicationResponseBody body;

    private GetBucketReplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketReplicationResponse create() {
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
    public GetBucketReplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketReplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketReplicationResponseBody body);

        @Override
        GetBucketReplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketReplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketReplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketReplicationResponse response) {
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
        public Builder body(GetBucketReplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketReplicationResponse build() {
            return new GetBucketReplicationResponse(this);
        } 

    } 

}
