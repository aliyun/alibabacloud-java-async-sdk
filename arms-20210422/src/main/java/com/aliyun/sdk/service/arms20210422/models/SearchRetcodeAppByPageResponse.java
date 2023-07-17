// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchRetcodeAppByPageResponse} extends {@link TeaModel}
 *
 * <p>SearchRetcodeAppByPageResponse</p>
 */
public class SearchRetcodeAppByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchRetcodeAppByPageResponseBody body;

    private SearchRetcodeAppByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchRetcodeAppByPageResponse create() {
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
    public SearchRetcodeAppByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchRetcodeAppByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchRetcodeAppByPageResponseBody body);

        @Override
        SearchRetcodeAppByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchRetcodeAppByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchRetcodeAppByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchRetcodeAppByPageResponse response) {
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
        public Builder body(SearchRetcodeAppByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchRetcodeAppByPageResponse build() {
            return new SearchRetcodeAppByPageResponse(this);
        } 

    } 

}
