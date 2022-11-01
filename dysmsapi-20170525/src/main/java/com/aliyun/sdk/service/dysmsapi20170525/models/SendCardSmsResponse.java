// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCardSmsResponse} extends {@link TeaModel}
 *
 * <p>SendCardSmsResponse</p>
 */
public class SendCardSmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCardSmsResponseBody body;

    private SendCardSmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCardSmsResponse create() {
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
    public SendCardSmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCardSmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCardSmsResponseBody body);

        @Override
        SendCardSmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCardSmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCardSmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCardSmsResponse response) {
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
        public Builder body(SendCardSmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCardSmsResponse build() {
            return new SendCardSmsResponse(this);
        } 

    } 

}
