// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInputBucketResponse} extends {@link TeaModel}
 *
 * <p>BindInputBucketResponse</p>
 */
public class BindInputBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindInputBucketResponseBody body;

    private BindInputBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindInputBucketResponse create() {
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
    public BindInputBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindInputBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindInputBucketResponseBody body);

        @Override
        BindInputBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindInputBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindInputBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindInputBucketResponse response) {
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
        public Builder body(BindInputBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindInputBucketResponse build() {
            return new BindInputBucketResponse(this);
        } 

    } 

}
