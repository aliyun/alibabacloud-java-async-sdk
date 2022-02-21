// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBotKnowledgeStatDataResponse} extends {@link TeaModel}
 *
 * <p>GetBotKnowledgeStatDataResponse</p>
 */
public class GetBotKnowledgeStatDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBotKnowledgeStatDataResponseBody body;

    private GetBotKnowledgeStatDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBotKnowledgeStatDataResponse create() {
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
    public GetBotKnowledgeStatDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBotKnowledgeStatDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBotKnowledgeStatDataResponseBody body);

        @Override
        GetBotKnowledgeStatDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBotKnowledgeStatDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBotKnowledgeStatDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBotKnowledgeStatDataResponse response) {
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
        public Builder body(GetBotKnowledgeStatDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBotKnowledgeStatDataResponse build() {
            return new GetBotKnowledgeStatDataResponse(this);
        } 

    } 

}
