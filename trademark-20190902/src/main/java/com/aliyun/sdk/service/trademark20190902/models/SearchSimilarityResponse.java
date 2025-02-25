// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarityResponse} extends {@link TeaModel}
 *
 * <p>SearchSimilarityResponse</p>
 */
public class SearchSimilarityResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SearchSimilarityResponseBody body;

    private SearchSimilarityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SearchSimilarityResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public SearchSimilarityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchSimilarityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SearchSimilarityResponseBody body);

        @Override
        SearchSimilarityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchSimilarityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SearchSimilarityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchSimilarityResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SearchSimilarityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchSimilarityResponse build() {
            return new SearchSimilarityResponse(this);
        } 

    } 

}
