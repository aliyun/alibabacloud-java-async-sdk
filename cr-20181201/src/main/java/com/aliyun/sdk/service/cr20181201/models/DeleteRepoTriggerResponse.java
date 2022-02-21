// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoTriggerResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepoTriggerResponse</p>
 */
public class DeleteRepoTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepoTriggerResponseBody body;

    private DeleteRepoTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepoTriggerResponse create() {
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
    public DeleteRepoTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepoTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepoTriggerResponseBody body);

        @Override
        DeleteRepoTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepoTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepoTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepoTriggerResponse response) {
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
        public Builder body(DeleteRepoTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepoTriggerResponse build() {
            return new DeleteRepoTriggerResponse(this);
        } 

    } 

}
