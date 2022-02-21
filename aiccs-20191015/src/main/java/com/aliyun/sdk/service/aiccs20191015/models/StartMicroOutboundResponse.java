// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMicroOutboundResponse} extends {@link TeaModel}
 *
 * <p>StartMicroOutboundResponse</p>
 */
public class StartMicroOutboundResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartMicroOutboundResponseBody body;

    private StartMicroOutboundResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartMicroOutboundResponse create() {
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
    public StartMicroOutboundResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartMicroOutboundResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartMicroOutboundResponseBody body);

        @Override
        StartMicroOutboundResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartMicroOutboundResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartMicroOutboundResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartMicroOutboundResponse response) {
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
        public Builder body(StartMicroOutboundResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartMicroOutboundResponse build() {
            return new StartMicroOutboundResponse(this);
        } 

    } 

}
