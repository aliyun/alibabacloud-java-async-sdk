// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCommentResponse} extends {@link TeaModel}
 *
 * <p>SendCommentResponse</p>
 */
public class SendCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCommentResponseBody body;

    private SendCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCommentResponse create() {
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
    public SendCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCommentResponseBody body);

        @Override
        SendCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCommentResponse response) {
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
        public Builder body(SendCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCommentResponse build() {
            return new SendCommentResponse(this);
        } 

    } 

}
