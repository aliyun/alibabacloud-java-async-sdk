// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLoggingResponse} extends {@link TeaModel}
 *
 * <p>StartLoggingResponse</p>
 */
public class StartLoggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartLoggingResponseBody body;

    private StartLoggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartLoggingResponse create() {
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
    public StartLoggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartLoggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartLoggingResponseBody body);

        @Override
        StartLoggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartLoggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartLoggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartLoggingResponse response) {
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
        public Builder body(StartLoggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartLoggingResponse build() {
            return new StartLoggingResponse(this);
        } 

    } 

}
