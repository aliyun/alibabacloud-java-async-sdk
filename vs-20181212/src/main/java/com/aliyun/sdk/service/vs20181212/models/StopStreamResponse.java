// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStreamResponse} extends {@link TeaModel}
 *
 * <p>StopStreamResponse</p>
 */
public class StopStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopStreamResponseBody body;

    private StopStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopStreamResponse create() {
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
    public StopStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopStreamResponseBody body);

        @Override
        StopStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopStreamResponse response) {
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
        public Builder body(StopStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopStreamResponse build() {
            return new StopStreamResponse(this);
        } 

    } 

}
