// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rmc20211104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchResourcesResponse} extends {@link TeaModel}
 *
 * <p>SearchResourcesResponse</p>
 */
public class SearchResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchResourcesResponseBody body;

    private SearchResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchResourcesResponse create() {
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
    public SearchResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchResourcesResponseBody body);

        @Override
        SearchResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchResourcesResponse response) {
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
        public Builder body(SearchResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchResourcesResponse build() {
            return new SearchResourcesResponse(this);
        } 

    } 

}
