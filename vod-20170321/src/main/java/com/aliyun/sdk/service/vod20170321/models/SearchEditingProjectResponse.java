// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEditingProjectResponse} extends {@link TeaModel}
 *
 * <p>SearchEditingProjectResponse</p>
 */
public class SearchEditingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchEditingProjectResponseBody body;

    private SearchEditingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchEditingProjectResponse create() {
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
    public SearchEditingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchEditingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchEditingProjectResponseBody body);

        @Override
        SearchEditingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchEditingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchEditingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchEditingProjectResponse response) {
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
        public Builder body(SearchEditingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchEditingProjectResponse build() {
            return new SearchEditingProjectResponse(this);
        } 

    } 

}
