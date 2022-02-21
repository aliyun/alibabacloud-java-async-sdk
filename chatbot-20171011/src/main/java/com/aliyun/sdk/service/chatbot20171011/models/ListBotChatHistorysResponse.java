// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotChatHistorysResponse} extends {@link TeaModel}
 *
 * <p>ListBotChatHistorysResponse</p>
 */
public class ListBotChatHistorysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotChatHistorysResponseBody body;

    private ListBotChatHistorysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotChatHistorysResponse create() {
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
    public ListBotChatHistorysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotChatHistorysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotChatHistorysResponseBody body);

        @Override
        ListBotChatHistorysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotChatHistorysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotChatHistorysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotChatHistorysResponse response) {
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
        public Builder body(ListBotChatHistorysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotChatHistorysResponse build() {
            return new ListBotChatHistorysResponse(this);
        } 

    } 

}
