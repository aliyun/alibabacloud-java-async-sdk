// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKnowledgeResponse} extends {@link TeaModel}
 *
 * <p>DeleteKnowledgeResponse</p>
 */
public class DeleteKnowledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteKnowledgeResponseBody body;

    private DeleteKnowledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteKnowledgeResponse create() {
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
    public DeleteKnowledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteKnowledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteKnowledgeResponseBody body);

        @Override
        DeleteKnowledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteKnowledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteKnowledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteKnowledgeResponse response) {
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
        public Builder body(DeleteKnowledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteKnowledgeResponse build() {
            return new DeleteKnowledgeResponse(this);
        } 

    } 

}
