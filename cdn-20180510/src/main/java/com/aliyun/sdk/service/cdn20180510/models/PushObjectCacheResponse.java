// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushObjectCacheResponse} extends {@link TeaModel}
 *
 * <p>PushObjectCacheResponse</p>
 */
public class PushObjectCacheResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushObjectCacheResponseBody body;

    private PushObjectCacheResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushObjectCacheResponse create() {
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
    public PushObjectCacheResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushObjectCacheResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushObjectCacheResponseBody body);

        @Override
        PushObjectCacheResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushObjectCacheResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushObjectCacheResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushObjectCacheResponse response) {
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
        public Builder body(PushObjectCacheResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushObjectCacheResponse build() {
            return new PushObjectCacheResponse(this);
        } 

    } 

}
