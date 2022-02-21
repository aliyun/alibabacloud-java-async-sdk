// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindOutputBucketResponse} extends {@link TeaModel}
 *
 * <p>BindOutputBucketResponse</p>
 */
public class BindOutputBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindOutputBucketResponseBody body;

    private BindOutputBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindOutputBucketResponse create() {
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
    public BindOutputBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindOutputBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindOutputBucketResponseBody body);

        @Override
        BindOutputBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindOutputBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindOutputBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindOutputBucketResponse response) {
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
        public Builder body(BindOutputBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindOutputBucketResponse build() {
            return new BindOutputBucketResponse(this);
        } 

    } 

}
