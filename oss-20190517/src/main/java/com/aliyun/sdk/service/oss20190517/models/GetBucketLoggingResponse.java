// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketLoggingResponse} extends {@link TeaModel}
 *
 * <p>GetBucketLoggingResponse</p>
 */
public class GetBucketLoggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketLoggingResponseBody body;

    private GetBucketLoggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketLoggingResponse create() {
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
    public GetBucketLoggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketLoggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketLoggingResponseBody body);

        @Override
        GetBucketLoggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketLoggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketLoggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketLoggingResponse response) {
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
        public Builder body(GetBucketLoggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketLoggingResponse build() {
            return new GetBucketLoggingResponse(this);
        } 

    } 

}
