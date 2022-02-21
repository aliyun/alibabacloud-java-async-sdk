// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableServiceGroupWebhookResponse} extends {@link TeaModel}
 *
 * <p>EnableServiceGroupWebhookResponse</p>
 */
public class EnableServiceGroupWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableServiceGroupWebhookResponseBody body;

    private EnableServiceGroupWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableServiceGroupWebhookResponse create() {
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
    public EnableServiceGroupWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableServiceGroupWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableServiceGroupWebhookResponseBody body);

        @Override
        EnableServiceGroupWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableServiceGroupWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableServiceGroupWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableServiceGroupWebhookResponse response) {
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
        public Builder body(EnableServiceGroupWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableServiceGroupWebhookResponse build() {
            return new EnableServiceGroupWebhookResponse(this);
        } 

    } 

}
