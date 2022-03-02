// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketLocationResponse} extends {@link TeaModel}
 *
 * <p>GetBucketLocationResponse</p>
 */
public class GetBucketLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketLocationResponseBody body;

    private GetBucketLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketLocationResponse create() {
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
    public GetBucketLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketLocationResponseBody body);

        @Override
        GetBucketLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketLocationResponse response) {
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
        public Builder body(GetBucketLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketLocationResponse build() {
            return new GetBucketLocationResponse(this);
        } 

    } 

}
