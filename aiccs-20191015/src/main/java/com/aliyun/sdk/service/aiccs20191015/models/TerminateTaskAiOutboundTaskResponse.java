// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateTaskAiOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>TerminateTaskAiOutboundTaskResponse</p>
 */
public class TerminateTaskAiOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateTaskAiOutboundTaskResponseBody body;

    private TerminateTaskAiOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateTaskAiOutboundTaskResponse create() {
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
    public TerminateTaskAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateTaskAiOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateTaskAiOutboundTaskResponseBody body);

        @Override
        TerminateTaskAiOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateTaskAiOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateTaskAiOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateTaskAiOutboundTaskResponse response) {
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
        public Builder body(TerminateTaskAiOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateTaskAiOutboundTaskResponse build() {
            return new TerminateTaskAiOutboundTaskResponse(this);
        } 

    } 

}
