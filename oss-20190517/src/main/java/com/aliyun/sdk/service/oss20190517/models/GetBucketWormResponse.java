// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketWormResponse} extends {@link TeaModel}
 *
 * <p>GetBucketWormResponse</p>
 */
public class GetBucketWormResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketWormResponseBody body;

    private GetBucketWormResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketWormResponse create() {
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
    public GetBucketWormResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketWormResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketWormResponseBody body);

        @Override
        GetBucketWormResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketWormResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketWormResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketWormResponse response) {
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
        public Builder body(GetBucketWormResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketWormResponse build() {
            return new GetBucketWormResponse(this);
        } 

    } 

}
