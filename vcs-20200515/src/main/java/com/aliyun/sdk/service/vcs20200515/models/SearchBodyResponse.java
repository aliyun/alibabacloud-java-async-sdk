// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchBodyResponse} extends {@link TeaModel}
 *
 * <p>SearchBodyResponse</p>
 */
public class SearchBodyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchBodyResponseBody body;

    private SearchBodyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchBodyResponse create() {
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
    public SearchBodyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchBodyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchBodyResponseBody body);

        @Override
        SearchBodyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchBodyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchBodyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchBodyResponse response) {
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
        public Builder body(SearchBodyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchBodyResponse build() {
            return new SearchBodyResponse(this);
        } 

    } 

}
