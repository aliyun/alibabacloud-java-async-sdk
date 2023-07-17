// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByPageResponse} extends {@link TeaModel}
 *
 * <p>SearchTraceAppByPageResponse</p>
 */
public class SearchTraceAppByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTraceAppByPageResponseBody body;

    private SearchTraceAppByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTraceAppByPageResponse create() {
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
    public SearchTraceAppByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTraceAppByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTraceAppByPageResponseBody body);

        @Override
        SearchTraceAppByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTraceAppByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTraceAppByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTraceAppByPageResponse response) {
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
        public Builder body(SearchTraceAppByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTraceAppByPageResponse build() {
            return new SearchTraceAppByPageResponse(this);
        } 

    } 

}
