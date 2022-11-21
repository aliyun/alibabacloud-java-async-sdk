// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryWebhookResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepositoryWebhookResponse</p>
 */
public class DeleteRepositoryWebhookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepositoryWebhookResponseBody body;

    private DeleteRepositoryWebhookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepositoryWebhookResponse create() {
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
    public DeleteRepositoryWebhookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepositoryWebhookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepositoryWebhookResponseBody body);

        @Override
        DeleteRepositoryWebhookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepositoryWebhookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepositoryWebhookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepositoryWebhookResponse response) {
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
        public Builder body(DeleteRepositoryWebhookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepositoryWebhookResponse build() {
            return new DeleteRepositoryWebhookResponse(this);
        } 

    } 

}
