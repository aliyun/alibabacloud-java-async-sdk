// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebhookContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebhookContactResponse</p>
 */
public class DeleteWebhookContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebhookContactResponseBody body;

    private DeleteWebhookContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebhookContactResponse create() {
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
    public DeleteWebhookContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebhookContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebhookContactResponseBody body);

        @Override
        DeleteWebhookContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebhookContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebhookContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebhookContactResponse response) {
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
        public Builder body(DeleteWebhookContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebhookContactResponse build() {
            return new DeleteWebhookContactResponse(this);
        } 

    } 

}
