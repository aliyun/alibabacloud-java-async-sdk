// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartStreamsResponse} extends {@link TeaModel}
 *
 * <p>BatchStartStreamsResponse</p>
 */
public class BatchStartStreamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStartStreamsResponseBody body;

    private BatchStartStreamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStartStreamsResponse create() {
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
    public BatchStartStreamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStartStreamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStartStreamsResponseBody body);

        @Override
        BatchStartStreamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStartStreamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStartStreamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStartStreamsResponse response) {
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
        public Builder body(BatchStartStreamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStartStreamsResponse build() {
            return new BatchStartStreamsResponse(this);
        } 

    } 

}
