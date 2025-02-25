// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchIgraphDemoResponse} extends {@link TeaModel}
 *
 * <p>SearchIgraphDemoResponse</p>
 */
public class SearchIgraphDemoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private SearchIgraphDemoResponseBody body;

    private SearchIgraphDemoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SearchIgraphDemoResponse create() {
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
    public SearchIgraphDemoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchIgraphDemoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SearchIgraphDemoResponseBody body);

        @Override
        SearchIgraphDemoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchIgraphDemoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SearchIgraphDemoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchIgraphDemoResponse response) {
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
        public Builder body(SearchIgraphDemoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchIgraphDemoResponse build() {
            return new SearchIgraphDemoResponse(this);
        } 

    } 

}
