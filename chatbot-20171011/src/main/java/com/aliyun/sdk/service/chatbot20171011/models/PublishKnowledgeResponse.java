// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishKnowledgeResponse} extends {@link TeaModel}
 *
 * <p>PublishKnowledgeResponse</p>
 */
public class PublishKnowledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishKnowledgeResponseBody body;

    private PublishKnowledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishKnowledgeResponse create() {
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
    public PublishKnowledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishKnowledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishKnowledgeResponseBody body);

        @Override
        PublishKnowledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishKnowledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishKnowledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishKnowledgeResponse response) {
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
        public Builder body(PublishKnowledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishKnowledgeResponse build() {
            return new PublishKnowledgeResponse(this);
        } 

    } 

}
