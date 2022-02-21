// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotHotKnowledgesResponse} extends {@link TeaModel}
 *
 * <p>ListBotHotKnowledgesResponse</p>
 */
public class ListBotHotKnowledgesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotHotKnowledgesResponseBody body;

    private ListBotHotKnowledgesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotHotKnowledgesResponse create() {
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
    public ListBotHotKnowledgesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotHotKnowledgesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotHotKnowledgesResponseBody body);

        @Override
        ListBotHotKnowledgesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotHotKnowledgesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotHotKnowledgesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotHotKnowledgesResponse response) {
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
        public Builder body(ListBotHotKnowledgesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotHotKnowledgesResponse build() {
            return new ListBotHotKnowledgesResponse(this);
        } 

    } 

}
