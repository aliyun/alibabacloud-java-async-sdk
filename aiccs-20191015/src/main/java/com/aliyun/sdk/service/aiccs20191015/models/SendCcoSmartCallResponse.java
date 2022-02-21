// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCcoSmartCallResponse} extends {@link TeaModel}
 *
 * <p>SendCcoSmartCallResponse</p>
 */
public class SendCcoSmartCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCcoSmartCallResponseBody body;

    private SendCcoSmartCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCcoSmartCallResponse create() {
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
    public SendCcoSmartCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCcoSmartCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCcoSmartCallResponseBody body);

        @Override
        SendCcoSmartCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCcoSmartCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCcoSmartCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCcoSmartCallResponse response) {
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
        public Builder body(SendCcoSmartCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCcoSmartCallResponse build() {
            return new SendCcoSmartCallResponse(this);
        } 

    } 

}
