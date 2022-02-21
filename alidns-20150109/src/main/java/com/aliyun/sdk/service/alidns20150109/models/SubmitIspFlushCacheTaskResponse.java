// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIspFlushCacheTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitIspFlushCacheTaskResponse</p>
 */
public class SubmitIspFlushCacheTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitIspFlushCacheTaskResponseBody body;

    private SubmitIspFlushCacheTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitIspFlushCacheTaskResponse create() {
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
    public SubmitIspFlushCacheTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitIspFlushCacheTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitIspFlushCacheTaskResponseBody body);

        @Override
        SubmitIspFlushCacheTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitIspFlushCacheTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitIspFlushCacheTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitIspFlushCacheTaskResponse response) {
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
        public Builder body(SubmitIspFlushCacheTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitIspFlushCacheTaskResponse build() {
            return new SubmitIspFlushCacheTaskResponse(this);
        } 

    } 

}
