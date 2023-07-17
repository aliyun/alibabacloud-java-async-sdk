// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEventsResponse} extends {@link TeaModel}
 *
 * <p>SearchEventsResponse</p>
 */
public class SearchEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchEventsResponseBody body;

    private SearchEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchEventsResponse create() {
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
    public SearchEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchEventsResponseBody body);

        @Override
        SearchEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchEventsResponse response) {
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
        public Builder body(SearchEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchEventsResponse build() {
            return new SearchEventsResponse(this);
        } 

    } 

}
