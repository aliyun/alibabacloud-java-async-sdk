// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmSendSmsResponse} extends {@link TeaModel}
 *
 * <p>ConfirmSendSmsResponse</p>
 */
public class ConfirmSendSmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmSendSmsResponseBody body;

    private ConfirmSendSmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmSendSmsResponse create() {
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
    public ConfirmSendSmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmSendSmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmSendSmsResponseBody body);

        @Override
        ConfirmSendSmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmSendSmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmSendSmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmSendSmsResponse response) {
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
        public Builder body(ConfirmSendSmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmSendSmsResponse build() {
            return new ConfirmSendSmsResponse(this);
        } 

    } 

}
