// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationListResponse} extends {@link TeaModel}
 *
 * <p>GetConversationListResponse</p>
 */
public class GetConversationListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConversationListResponseBody body;

    private GetConversationListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConversationListResponse create() {
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
    public GetConversationListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConversationListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConversationListResponseBody body);

        @Override
        GetConversationListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConversationListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConversationListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConversationListResponse response) {
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
        public Builder body(GetConversationListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConversationListResponse build() {
            return new GetConversationListResponse(this);
        } 

    } 

}
