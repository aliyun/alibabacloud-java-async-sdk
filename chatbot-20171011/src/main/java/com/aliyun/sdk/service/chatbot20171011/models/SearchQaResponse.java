// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchQaResponse} extends {@link TeaModel}
 *
 * <p>SearchQaResponse</p>
 */
public class SearchQaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchQaResponseBody body;

    private SearchQaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchQaResponse create() {
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
    public SearchQaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchQaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchQaResponseBody body);

        @Override
        SearchQaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchQaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchQaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchQaResponse response) {
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
        public Builder body(SearchQaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchQaResponse build() {
            return new SearchQaResponse(this);
        } 

    } 

}
