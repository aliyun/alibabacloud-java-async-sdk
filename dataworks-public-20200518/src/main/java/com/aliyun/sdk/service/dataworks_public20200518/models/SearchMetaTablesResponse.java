// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMetaTablesResponse} extends {@link TeaModel}
 *
 * <p>SearchMetaTablesResponse</p>
 */
public class SearchMetaTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchMetaTablesResponseBody body;

    private SearchMetaTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchMetaTablesResponse create() {
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
    public SearchMetaTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchMetaTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchMetaTablesResponseBody body);

        @Override
        SearchMetaTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchMetaTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchMetaTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchMetaTablesResponse response) {
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
        public Builder body(SearchMetaTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchMetaTablesResponse build() {
            return new SearchMetaTablesResponse(this);
        } 

    } 

}
