// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSolutionResponse} extends {@link TeaModel}
 *
 * <p>ListSolutionResponse</p>
 */
public class ListSolutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSolutionResponseBody body;

    private ListSolutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSolutionResponse create() {
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
    public ListSolutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSolutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSolutionResponseBody body);

        @Override
        ListSolutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSolutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSolutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSolutionResponse response) {
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
        public Builder body(ListSolutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSolutionResponse build() {
            return new ListSolutionResponse(this);
        } 

    } 

}
