// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKnowledgeResponse} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeResponse</p>
 */
public class CreateKnowledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateKnowledgeResponseBody body;

    private CreateKnowledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateKnowledgeResponse create() {
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
    public CreateKnowledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKnowledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateKnowledgeResponseBody body);

        @Override
        CreateKnowledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKnowledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateKnowledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKnowledgeResponse response) {
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
        public Builder body(CreateKnowledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKnowledgeResponse build() {
            return new CreateKnowledgeResponse(this);
        } 

    } 

}
