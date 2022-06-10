// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentResponse} extends {@link TeaModel}
 *
 * <p>ListAgentResponse</p>
 */
public class ListAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentResponseBody body;

    private ListAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentResponse create() {
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
    public ListAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentResponseBody body);

        @Override
        ListAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentResponse response) {
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
        public Builder body(ListAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentResponse build() {
            return new ListAgentResponse(this);
        } 

    } 

}
