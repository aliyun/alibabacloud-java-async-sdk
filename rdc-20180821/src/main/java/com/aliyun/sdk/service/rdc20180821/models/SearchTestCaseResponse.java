// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTestCaseResponse} extends {@link TeaModel}
 *
 * <p>SearchTestCaseResponse</p>
 */
public class SearchTestCaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTestCaseResponseBody body;

    private SearchTestCaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTestCaseResponse create() {
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
    public SearchTestCaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTestCaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTestCaseResponseBody body);

        @Override
        SearchTestCaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTestCaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTestCaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTestCaseResponse response) {
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
        public Builder body(SearchTestCaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTestCaseResponse build() {
            return new SearchTestCaseResponse(this);
        } 

    } 

}
