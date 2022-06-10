// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnQuestionResponse} extends {@link TeaModel}
 *
 * <p>ListConnQuestionResponse</p>
 */
public class ListConnQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnQuestionResponseBody body;

    private ListConnQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnQuestionResponse create() {
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
    public ListConnQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnQuestionResponseBody body);

        @Override
        ListConnQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnQuestionResponse response) {
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
        public Builder body(ListConnQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnQuestionResponse build() {
            return new ListConnQuestionResponse(this);
        } 

    } 

}
