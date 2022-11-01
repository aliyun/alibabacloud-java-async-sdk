// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchCardSmsResponse} extends {@link TeaModel}
 *
 * <p>SendBatchCardSmsResponse</p>
 */
public class SendBatchCardSmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendBatchCardSmsResponseBody body;

    private SendBatchCardSmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendBatchCardSmsResponse create() {
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
    public SendBatchCardSmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendBatchCardSmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendBatchCardSmsResponseBody body);

        @Override
        SendBatchCardSmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendBatchCardSmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendBatchCardSmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendBatchCardSmsResponse response) {
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
        public Builder body(SendBatchCardSmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendBatchCardSmsResponse build() {
            return new SendBatchCardSmsResponse(this);
        } 

    } 

}
