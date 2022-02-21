// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckWebhookResponse} extends {@link TeaModel}
 *
 * <p>CheckWebhookResponse</p>
 */
public class CheckWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckWebhookResponseBody body;

    private CheckWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckWebhookResponse create() {
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
    public CheckWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckWebhookResponseBody body);

        @Override
        CheckWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckWebhookResponse response) {
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
        public Builder body(CheckWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckWebhookResponse build() {
            return new CheckWebhookResponse(this);
        } 

    } 

}
