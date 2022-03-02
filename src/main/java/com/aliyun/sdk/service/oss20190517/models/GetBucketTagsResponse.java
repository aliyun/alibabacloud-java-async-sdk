// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketTagsResponse} extends {@link TeaModel}
 *
 * <p>GetBucketTagsResponse</p>
 */
public class GetBucketTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketTagsResponseBody body;

    private GetBucketTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketTagsResponse create() {
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
    public GetBucketTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketTagsResponseBody body);

        @Override
        GetBucketTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketTagsResponse response) {
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
        public Builder body(GetBucketTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketTagsResponse build() {
            return new GetBucketTagsResponse(this);
        } 

    } 

}
