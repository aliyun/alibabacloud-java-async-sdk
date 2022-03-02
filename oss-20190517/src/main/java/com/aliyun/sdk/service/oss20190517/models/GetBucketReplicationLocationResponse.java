// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketReplicationLocationResponse} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationLocationResponse</p>
 */
public class GetBucketReplicationLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketReplicationLocationResponseBody body;

    private GetBucketReplicationLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketReplicationLocationResponse create() {
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
    public GetBucketReplicationLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketReplicationLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketReplicationLocationResponseBody body);

        @Override
        GetBucketReplicationLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketReplicationLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketReplicationLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketReplicationLocationResponse response) {
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
        public Builder body(GetBucketReplicationLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketReplicationLocationResponse build() {
            return new GetBucketReplicationLocationResponse(this);
        } 

    } 

}
