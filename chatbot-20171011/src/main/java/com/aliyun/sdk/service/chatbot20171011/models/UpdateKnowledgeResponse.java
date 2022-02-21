// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKnowledgeResponse} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeResponse</p>
 */
public class UpdateKnowledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateKnowledgeResponseBody body;

    private UpdateKnowledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateKnowledgeResponse create() {
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
    public UpdateKnowledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateKnowledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateKnowledgeResponseBody body);

        @Override
        UpdateKnowledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateKnowledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateKnowledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateKnowledgeResponse response) {
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
        public Builder body(UpdateKnowledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateKnowledgeResponse build() {
            return new UpdateKnowledgeResponse(this);
        } 

    } 

}
