// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTestByTemplateResponse} extends {@link TeaModel}
 *
 * <p>SendTestByTemplateResponse</p>
 */
public class SendTestByTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendTestByTemplateResponseBody body;

    private SendTestByTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendTestByTemplateResponse create() {
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
    public SendTestByTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendTestByTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendTestByTemplateResponseBody body);

        @Override
        SendTestByTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendTestByTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendTestByTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendTestByTemplateResponse response) {
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
        public Builder body(SendTestByTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendTestByTemplateResponse build() {
            return new SendTestByTemplateResponse(this);
        } 

    } 

}
