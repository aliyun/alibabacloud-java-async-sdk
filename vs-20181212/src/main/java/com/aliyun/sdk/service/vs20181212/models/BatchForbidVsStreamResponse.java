// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchForbidVsStreamResponse} extends {@link TeaModel}
 *
 * <p>BatchForbidVsStreamResponse</p>
 */
public class BatchForbidVsStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchForbidVsStreamResponseBody body;

    private BatchForbidVsStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchForbidVsStreamResponse create() {
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
    public BatchForbidVsStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchForbidVsStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchForbidVsStreamResponseBody body);

        @Override
        BatchForbidVsStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchForbidVsStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchForbidVsStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchForbidVsStreamResponse response) {
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
        public Builder body(BatchForbidVsStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchForbidVsStreamResponse build() {
            return new BatchForbidVsStreamResponse(this);
        } 

    } 

}
