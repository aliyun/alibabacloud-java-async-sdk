// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindOutputBucketResponse} extends {@link TeaModel}
 *
 * <p>UnbindOutputBucketResponse</p>
 */
public class UnbindOutputBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindOutputBucketResponseBody body;

    private UnbindOutputBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindOutputBucketResponse create() {
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
    public UnbindOutputBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindOutputBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindOutputBucketResponseBody body);

        @Override
        UnbindOutputBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindOutputBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindOutputBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindOutputBucketResponse response) {
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
        public Builder body(UnbindOutputBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindOutputBucketResponse build() {
            return new UnbindOutputBucketResponse(this);
        } 

    } 

}
