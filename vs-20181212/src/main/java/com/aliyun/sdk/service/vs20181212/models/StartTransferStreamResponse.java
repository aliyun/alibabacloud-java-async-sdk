// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTransferStreamResponse} extends {@link TeaModel}
 *
 * <p>StartTransferStreamResponse</p>
 */
public class StartTransferStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTransferStreamResponseBody body;

    private StartTransferStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTransferStreamResponse create() {
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
    public StartTransferStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTransferStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTransferStreamResponseBody body);

        @Override
        StartTransferStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTransferStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTransferStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTransferStreamResponse response) {
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
        public Builder body(StartTransferStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTransferStreamResponse build() {
            return new StartTransferStreamResponse(this);
        } 

    } 

}
