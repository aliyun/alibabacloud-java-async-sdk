// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccountWebhookResponse} extends {@link TeaModel}
 *
 * <p>UpdateAccountWebhookResponse</p>
 */
public class UpdateAccountWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAccountWebhookResponseBody body;

    private UpdateAccountWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAccountWebhookResponse create() {
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
    public UpdateAccountWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAccountWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAccountWebhookResponseBody body);

        @Override
        UpdateAccountWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAccountWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAccountWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAccountWebhookResponse response) {
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
        public Builder body(UpdateAccountWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAccountWebhookResponse build() {
            return new UpdateAccountWebhookResponse(this);
        } 

    } 

}
