// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchLogResponse} extends {@link TeaModel}
 *
 * <p>SearchLogResponse</p>
 */
public class SearchLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchLogResponseBody body;

    private SearchLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchLogResponse create() {
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
    public SearchLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchLogResponseBody body);

        @Override
        SearchLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchLogResponse response) {
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
        public Builder body(SearchLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchLogResponse build() {
            return new SearchLogResponse(this);
        } 

    } 

}
