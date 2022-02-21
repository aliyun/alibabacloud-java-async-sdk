// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAiOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>StartAiOutboundTaskResponse</p>
 */
public class StartAiOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartAiOutboundTaskResponseBody body;

    private StartAiOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartAiOutboundTaskResponse create() {
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
    public StartAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartAiOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartAiOutboundTaskResponseBody body);

        @Override
        StartAiOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartAiOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartAiOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartAiOutboundTaskResponse response) {
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
        public Builder body(StartAiOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartAiOutboundTaskResponse build() {
            return new StartAiOutboundTaskResponse(this);
        } 

    } 

}
