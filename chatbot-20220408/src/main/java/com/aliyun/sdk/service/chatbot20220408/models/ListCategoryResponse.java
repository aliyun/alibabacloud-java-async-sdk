// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCategoryResponse} extends {@link TeaModel}
 *
 * <p>ListCategoryResponse</p>
 */
public class ListCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCategoryResponseBody body;

    private ListCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCategoryResponse create() {
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
    public ListCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCategoryResponseBody body);

        @Override
        ListCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCategoryResponse response) {
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
        public Builder body(ListCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCategoryResponse build() {
            return new ListCategoryResponse(this);
        } 

    } 

}
