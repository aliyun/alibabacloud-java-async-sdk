// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertHistorysResponse} extends {@link TeaModel}
 *
 * <p>SearchAlertHistorysResponse</p>
 */
public class SearchAlertHistorysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchAlertHistorysResponseBody body;

    private SearchAlertHistorysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchAlertHistorysResponse create() {
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
    public SearchAlertHistorysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchAlertHistorysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchAlertHistorysResponseBody body);

        @Override
        SearchAlertHistorysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchAlertHistorysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchAlertHistorysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchAlertHistorysResponse response) {
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
        public Builder body(SearchAlertHistorysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchAlertHistorysResponse build() {
            return new SearchAlertHistorysResponse(this);
        } 

    } 

}
