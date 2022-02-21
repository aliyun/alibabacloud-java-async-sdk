// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTableResponse} extends {@link TeaModel}
 *
 * <p>SearchTableResponse</p>
 */
public class SearchTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTableResponseBody body;

    private SearchTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTableResponse create() {
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
    public SearchTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTableResponseBody body);

        @Override
        SearchTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTableResponse response) {
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
        public Builder body(SearchTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTableResponse build() {
            return new SearchTableResponse(this);
        } 

    } 

}
