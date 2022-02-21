// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsResponse} extends {@link TeaModel}
 *
 * <p>SendSmsResponse</p>
 */
public class SendSmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendSmsResponseBody body;

    private SendSmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendSmsResponse create() {
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
    public SendSmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendSmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendSmsResponseBody body);

        @Override
        SendSmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendSmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendSmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendSmsResponse response) {
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
        public Builder body(SendSmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendSmsResponse build() {
            return new SendSmsResponse(this);
        } 

    } 

}
