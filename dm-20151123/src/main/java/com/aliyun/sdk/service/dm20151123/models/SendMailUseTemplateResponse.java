// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMailUseTemplateResponse} extends {@link TeaModel}
 *
 * <p>SendMailUseTemplateResponse</p>
 */
public class SendMailUseTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMailUseTemplateResponseBody body;

    private SendMailUseTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMailUseTemplateResponse create() {
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
    public SendMailUseTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMailUseTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMailUseTemplateResponseBody body);

        @Override
        SendMailUseTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMailUseTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMailUseTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMailUseTemplateResponse response) {
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
        public Builder body(SendMailUseTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMailUseTemplateResponse build() {
            return new SendMailUseTemplateResponse(this);
        } 

    } 

}
