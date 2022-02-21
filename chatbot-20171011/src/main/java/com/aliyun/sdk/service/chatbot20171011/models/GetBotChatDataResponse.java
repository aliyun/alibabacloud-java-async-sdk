// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBotChatDataResponse} extends {@link TeaModel}
 *
 * <p>GetBotChatDataResponse</p>
 */
public class GetBotChatDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBotChatDataResponseBody body;

    private GetBotChatDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBotChatDataResponse create() {
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
    public GetBotChatDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBotChatDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBotChatDataResponseBody body);

        @Override
        GetBotChatDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBotChatDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBotChatDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBotChatDataResponse response) {
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
        public Builder body(GetBotChatDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBotChatDataResponse build() {
            return new GetBotChatDataResponse(this);
        } 

    } 

}
