// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotColdKnowledgesResponse} extends {@link TeaModel}
 *
 * <p>ListBotColdKnowledgesResponse</p>
 */
public class ListBotColdKnowledgesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotColdKnowledgesResponseBody body;

    private ListBotColdKnowledgesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotColdKnowledgesResponse create() {
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
    public ListBotColdKnowledgesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotColdKnowledgesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotColdKnowledgesResponseBody body);

        @Override
        ListBotColdKnowledgesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotColdKnowledgesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotColdKnowledgesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotColdKnowledgesResponse response) {
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
        public Builder body(ListBotColdKnowledgesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotColdKnowledgesResponse build() {
            return new ListBotColdKnowledgesResponse(this);
        } 

    } 

}
