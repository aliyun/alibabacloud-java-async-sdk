// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationLogsResponse} extends {@link TeaModel}
 *
 * <p>ListConversationLogsResponse</p>
 */
public class ListConversationLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConversationLogsResponseBody body;

    private ListConversationLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConversationLogsResponse create() {
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
    public ListConversationLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConversationLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConversationLogsResponseBody body);

        @Override
        ListConversationLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConversationLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConversationLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConversationLogsResponse response) {
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
        public Builder body(ListConversationLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConversationLogsResponse build() {
            return new ListConversationLogsResponse(this);
        } 

    } 

}
