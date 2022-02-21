// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMicroOutboundNewResponse} extends {@link TeaModel}
 *
 * <p>StartMicroOutboundNewResponse</p>
 */
public class StartMicroOutboundNewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartMicroOutboundNewResponseBody body;

    private StartMicroOutboundNewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartMicroOutboundNewResponse create() {
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
    public StartMicroOutboundNewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartMicroOutboundNewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartMicroOutboundNewResponseBody body);

        @Override
        StartMicroOutboundNewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartMicroOutboundNewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartMicroOutboundNewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartMicroOutboundNewResponse response) {
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
        public Builder body(StartMicroOutboundNewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartMicroOutboundNewResponse build() {
            return new StartMicroOutboundNewResponse(this);
        } 

    } 

}
