// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopStreamsResponse} extends {@link TeaModel}
 *
 * <p>BatchStopStreamsResponse</p>
 */
public class BatchStopStreamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStopStreamsResponseBody body;

    private BatchStopStreamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStopStreamsResponse create() {
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
    public BatchStopStreamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStopStreamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStopStreamsResponseBody body);

        @Override
        BatchStopStreamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStopStreamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStopStreamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStopStreamsResponse response) {
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
        public Builder body(BatchStopStreamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStopStreamsResponse build() {
            return new BatchStopStreamsResponse(this);
        } 

    } 

}
