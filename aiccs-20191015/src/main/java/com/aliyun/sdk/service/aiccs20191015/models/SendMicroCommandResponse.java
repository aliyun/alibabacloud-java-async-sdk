// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMicroCommandResponse} extends {@link TeaModel}
 *
 * <p>SendMicroCommandResponse</p>
 */
public class SendMicroCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMicroCommandResponseBody body;

    private SendMicroCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMicroCommandResponse create() {
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
    public SendMicroCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMicroCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMicroCommandResponseBody body);

        @Override
        SendMicroCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMicroCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMicroCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMicroCommandResponse response) {
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
        public Builder body(SendMicroCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMicroCommandResponse build() {
            return new SendMicroCommandResponse(this);
        } 

    } 

}
