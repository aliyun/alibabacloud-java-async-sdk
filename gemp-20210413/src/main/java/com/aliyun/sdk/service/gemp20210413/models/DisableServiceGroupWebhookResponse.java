// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableServiceGroupWebhookResponse} extends {@link TeaModel}
 *
 * <p>DisableServiceGroupWebhookResponse</p>
 */
public class DisableServiceGroupWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableServiceGroupWebhookResponseBody body;

    private DisableServiceGroupWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableServiceGroupWebhookResponse create() {
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
    public DisableServiceGroupWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableServiceGroupWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableServiceGroupWebhookResponseBody body);

        @Override
        DisableServiceGroupWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableServiceGroupWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableServiceGroupWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableServiceGroupWebhookResponse response) {
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
        public Builder body(DisableServiceGroupWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableServiceGroupWebhookResponse build() {
            return new DisableServiceGroupWebhookResponse(this);
        } 

    } 

}
