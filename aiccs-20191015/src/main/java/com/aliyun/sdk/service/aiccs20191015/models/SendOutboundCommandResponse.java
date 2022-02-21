// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendOutboundCommandResponse} extends {@link TeaModel}
 *
 * <p>SendOutboundCommandResponse</p>
 */
public class SendOutboundCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendOutboundCommandResponseBody body;

    private SendOutboundCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendOutboundCommandResponse create() {
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
    public SendOutboundCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendOutboundCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendOutboundCommandResponseBody body);

        @Override
        SendOutboundCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendOutboundCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendOutboundCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendOutboundCommandResponse response) {
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
        public Builder body(SendOutboundCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendOutboundCommandResponse build() {
            return new SendOutboundCommandResponse(this);
        } 

    } 

}
