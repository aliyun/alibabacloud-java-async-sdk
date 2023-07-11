// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTextResponse} extends {@link TeaModel}
 *
 * <p>SendTextResponse</p>
 */
public class SendTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendTextResponseBody body;

    private SendTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendTextResponse create() {
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
    public SendTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendTextResponseBody body);

        @Override
        SendTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendTextResponse response) {
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
        public Builder body(SendTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendTextResponse build() {
            return new SendTextResponse(this);
        } 

    } 

}
