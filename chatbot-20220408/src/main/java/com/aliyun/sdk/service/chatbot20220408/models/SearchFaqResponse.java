// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFaqResponse} extends {@link TeaModel}
 *
 * <p>SearchFaqResponse</p>
 */
public class SearchFaqResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchFaqResponseBody body;

    private SearchFaqResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchFaqResponse create() {
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
    public SearchFaqResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchFaqResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchFaqResponseBody body);

        @Override
        SearchFaqResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchFaqResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchFaqResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchFaqResponse response) {
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
        public Builder body(SearchFaqResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchFaqResponse build() {
            return new SearchFaqResponse(this);
        } 

    } 

}
