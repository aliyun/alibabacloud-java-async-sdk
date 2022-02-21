// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutBucketResponse} extends {@link TeaModel}
 *
 * <p>PutBucketResponse</p>
 */
public class PutBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutBucketResponseBody body;

    private PutBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutBucketResponse create() {
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
    public PutBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutBucketResponseBody body);

        @Override
        PutBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutBucketResponse response) {
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
        public Builder body(PutBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutBucketResponse build() {
            return new PutBucketResponse(this);
        } 

    } 

}
