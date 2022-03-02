// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketCorsResponse} extends {@link TeaModel}
 *
 * <p>GetBucketCorsResponse</p>
 */
public class GetBucketCorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketCorsResponseBody body;

    private GetBucketCorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketCorsResponse create() {
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
    public GetBucketCorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketCorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketCorsResponseBody body);

        @Override
        GetBucketCorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketCorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketCorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketCorsResponse response) {
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
        public Builder body(GetBucketCorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketCorsResponse build() {
            return new GetBucketCorsResponse(this);
        } 

    } 

}
