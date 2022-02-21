// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableKnowledgeResponse} extends {@link TeaModel}
 *
 * <p>DisableKnowledgeResponse</p>
 */
public class DisableKnowledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableKnowledgeResponseBody body;

    private DisableKnowledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableKnowledgeResponse create() {
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
    public DisableKnowledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableKnowledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableKnowledgeResponseBody body);

        @Override
        DisableKnowledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableKnowledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableKnowledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableKnowledgeResponse response) {
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
        public Builder body(DisableKnowledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableKnowledgeResponse build() {
            return new DisableKnowledgeResponse(this);
        } 

    } 

}
