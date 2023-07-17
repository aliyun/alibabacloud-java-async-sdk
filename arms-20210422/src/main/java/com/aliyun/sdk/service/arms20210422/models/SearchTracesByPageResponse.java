// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesByPageResponse} extends {@link TeaModel}
 *
 * <p>SearchTracesByPageResponse</p>
 */
public class SearchTracesByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTracesByPageResponseBody body;

    private SearchTracesByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTracesByPageResponse create() {
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
    public SearchTracesByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTracesByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTracesByPageResponseBody body);

        @Override
        SearchTracesByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTracesByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTracesByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTracesByPageResponse response) {
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
        public Builder body(SearchTracesByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTracesByPageResponse build() {
            return new SearchTracesByPageResponse(this);
        } 

    } 

}
