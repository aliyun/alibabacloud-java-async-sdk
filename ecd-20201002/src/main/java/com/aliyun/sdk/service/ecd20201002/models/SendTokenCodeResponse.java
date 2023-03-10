// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTokenCodeResponse} extends {@link TeaModel}
 *
 * <p>SendTokenCodeResponse</p>
 */
public class SendTokenCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendTokenCodeResponseBody body;

    private SendTokenCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendTokenCodeResponse create() {
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
    public SendTokenCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendTokenCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendTokenCodeResponseBody body);

        @Override
        SendTokenCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendTokenCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendTokenCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendTokenCodeResponse response) {
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
        public Builder body(SendTokenCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendTokenCodeResponse build() {
            return new SendTokenCodeResponse(this);
        } 

    } 

}
