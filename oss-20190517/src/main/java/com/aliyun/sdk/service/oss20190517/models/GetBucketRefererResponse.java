// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketRefererResponse} extends {@link TeaModel}
 *
 * <p>GetBucketRefererResponse</p>
 */
public class GetBucketRefererResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketRefererResponseBody body;

    private GetBucketRefererResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketRefererResponse create() {
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
    public GetBucketRefererResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketRefererResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketRefererResponseBody body);

        @Override
        GetBucketRefererResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketRefererResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketRefererResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketRefererResponse response) {
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
        public Builder body(GetBucketRefererResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketRefererResponse build() {
            return new GetBucketRefererResponse(this);
        } 

    } 

}
