// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentResponse} extends {@link TeaModel}
 *
 * <p>ListIntentResponse</p>
 */
public class ListIntentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntentResponseBody body;

    private ListIntentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntentResponse create() {
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
    public ListIntentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntentResponseBody body);

        @Override
        ListIntentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntentResponse response) {
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
        public Builder body(ListIntentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntentResponse build() {
            return new ListIntentResponse(this);
        } 

    } 

}
