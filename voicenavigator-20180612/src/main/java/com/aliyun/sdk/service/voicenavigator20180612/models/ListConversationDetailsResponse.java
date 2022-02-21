// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListConversationDetailsResponse</p>
 */
public class ListConversationDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConversationDetailsResponseBody body;

    private ListConversationDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConversationDetailsResponse create() {
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
    public ListConversationDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConversationDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConversationDetailsResponseBody body);

        @Override
        ListConversationDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConversationDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConversationDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConversationDetailsResponse response) {
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
        public Builder body(ListConversationDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConversationDetailsResponse build() {
            return new ListConversationDetailsResponse(this);
        } 

    } 

}
