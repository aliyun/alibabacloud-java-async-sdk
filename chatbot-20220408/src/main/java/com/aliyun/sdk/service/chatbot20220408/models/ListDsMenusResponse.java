// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDsMenusResponse} extends {@link TeaModel}
 *
 * <p>ListDsMenusResponse</p>
 */
public class ListDsMenusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDsMenusResponseBody body;

    private ListDsMenusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDsMenusResponse create() {
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
    public ListDsMenusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDsMenusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDsMenusResponseBody body);

        @Override
        ListDsMenusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDsMenusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDsMenusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDsMenusResponse response) {
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
        public Builder body(ListDsMenusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDsMenusResponse build() {
            return new ListDsMenusResponse(this);
        } 

    } 

}
