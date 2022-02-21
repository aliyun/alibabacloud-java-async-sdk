// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDatabaseResponse} extends {@link TeaModel}
 *
 * <p>SearchDatabaseResponse</p>
 */
public class SearchDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchDatabaseResponseBody body;

    private SearchDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchDatabaseResponse create() {
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
    public SearchDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchDatabaseResponseBody body);

        @Override
        SearchDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchDatabaseResponse response) {
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
        public Builder body(SearchDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchDatabaseResponse build() {
            return new SearchDatabaseResponse(this);
        } 

    } 

}
