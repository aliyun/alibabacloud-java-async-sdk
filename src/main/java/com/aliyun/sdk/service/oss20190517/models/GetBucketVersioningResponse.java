// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketVersioningResponse} extends {@link TeaModel}
 *
 * <p>GetBucketVersioningResponse</p>
 */
public class GetBucketVersioningResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketVersioningResponseBody body;

    private GetBucketVersioningResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketVersioningResponse create() {
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
    public GetBucketVersioningResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketVersioningResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketVersioningResponseBody body);

        @Override
        GetBucketVersioningResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketVersioningResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketVersioningResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketVersioningResponse response) {
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
        public Builder body(GetBucketVersioningResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketVersioningResponse build() {
            return new GetBucketVersioningResponse(this);
        } 

    } 

}
