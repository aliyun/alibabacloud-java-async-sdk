// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebhookResponse} extends {@link TeaModel}
 *
 * <p>UpdateWebhookResponse</p>
 */
public class UpdateWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWebhookResponseBody body;

    private UpdateWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWebhookResponse create() {
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
    public UpdateWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWebhookResponseBody body);

        @Override
        UpdateWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWebhookResponse response) {
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
        public Builder body(UpdateWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWebhookResponse build() {
            return new UpdateWebhookResponse(this);
        } 

    } 

}
