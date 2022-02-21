// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopRecordStreamResponse} extends {@link TeaModel}
 *
 * <p>StopRecordStreamResponse</p>
 */
public class StopRecordStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopRecordStreamResponseBody body;

    private StopRecordStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopRecordStreamResponse create() {
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
    public StopRecordStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopRecordStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopRecordStreamResponseBody body);

        @Override
        StopRecordStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopRecordStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopRecordStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopRecordStreamResponse response) {
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
        public Builder body(StopRecordStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopRecordStreamResponse build() {
            return new StopRecordStreamResponse(this);
        } 

    } 

}
