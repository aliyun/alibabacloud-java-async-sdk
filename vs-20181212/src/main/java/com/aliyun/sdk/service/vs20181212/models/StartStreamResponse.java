// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartStreamResponse} extends {@link TeaModel}
 *
 * <p>StartStreamResponse</p>
 */
public class StartStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartStreamResponseBody body;

    private StartStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartStreamResponse create() {
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
    public StartStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartStreamResponseBody body);

        @Override
        StartStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartStreamResponse response) {
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
        public Builder body(StartStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartStreamResponse build() {
            return new StartStreamResponse(this);
        } 

    } 

}
