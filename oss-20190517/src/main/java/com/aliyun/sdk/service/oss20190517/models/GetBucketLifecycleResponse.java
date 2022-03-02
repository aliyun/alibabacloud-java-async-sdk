// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketLifecycleResponse} extends {@link TeaModel}
 *
 * <p>GetBucketLifecycleResponse</p>
 */
public class GetBucketLifecycleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketLifecycleResponseBody body;

    private GetBucketLifecycleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketLifecycleResponse create() {
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
    public GetBucketLifecycleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketLifecycleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketLifecycleResponseBody body);

        @Override
        GetBucketLifecycleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketLifecycleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketLifecycleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketLifecycleResponse response) {
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
        public Builder body(GetBucketLifecycleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketLifecycleResponse build() {
            return new GetBucketLifecycleResponse(this);
        } 

    } 

}
