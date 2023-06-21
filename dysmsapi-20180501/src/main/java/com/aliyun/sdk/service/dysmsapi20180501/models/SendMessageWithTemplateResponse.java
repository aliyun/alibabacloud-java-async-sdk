// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageWithTemplateResponse} extends {@link TeaModel}
 *
 * <p>SendMessageWithTemplateResponse</p>
 */
public class SendMessageWithTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMessageWithTemplateResponseBody body;

    private SendMessageWithTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMessageWithTemplateResponse create() {
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
    public SendMessageWithTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMessageWithTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMessageWithTemplateResponseBody body);

        @Override
        SendMessageWithTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMessageWithTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMessageWithTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMessageWithTemplateResponse response) {
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
        public Builder body(SendMessageWithTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMessageWithTemplateResponse build() {
            return new SendMessageWithTemplateResponse(this);
        } 

    } 

}
