// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindInputBucketResponse} extends {@link TeaModel}
 *
 * <p>UnbindInputBucketResponse</p>
 */
public class UnbindInputBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindInputBucketResponseBody body;

    private UnbindInputBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindInputBucketResponse create() {
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
    public UnbindInputBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindInputBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindInputBucketResponseBody body);

        @Override
        UnbindInputBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindInputBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindInputBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindInputBucketResponse response) {
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
        public Builder body(UnbindInputBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindInputBucketResponse build() {
            return new UnbindInputBucketResponse(this);
        } 

    } 

}
