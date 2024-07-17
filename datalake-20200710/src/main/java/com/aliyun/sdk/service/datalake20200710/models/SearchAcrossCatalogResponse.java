// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAcrossCatalogResponse} extends {@link TeaModel}
 *
 * <p>SearchAcrossCatalogResponse</p>
 */
public class SearchAcrossCatalogResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SearchAcrossCatalogResponseBody body;

    private SearchAcrossCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SearchAcrossCatalogResponse create() {
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
    public SearchAcrossCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchAcrossCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SearchAcrossCatalogResponseBody body);

        @Override
        SearchAcrossCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchAcrossCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SearchAcrossCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchAcrossCatalogResponse response) {
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
        public Builder body(SearchAcrossCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchAcrossCatalogResponse build() {
            return new SearchAcrossCatalogResponse(this);
        } 

    } 

}
