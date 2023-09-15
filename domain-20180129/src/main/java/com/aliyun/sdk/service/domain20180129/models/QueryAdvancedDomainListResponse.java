// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAdvancedDomainListResponse} extends {@link TeaModel}
 *
 * <p>QueryAdvancedDomainListResponse</p>
 */
public class QueryAdvancedDomainListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAdvancedDomainListResponseBody body;

    private QueryAdvancedDomainListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryAdvancedDomainListResponse create() {
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
    public QueryAdvancedDomainListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAdvancedDomainListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryAdvancedDomainListResponseBody body);

        @Override
        QueryAdvancedDomainListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAdvancedDomainListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryAdvancedDomainListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAdvancedDomainListResponse response) {
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
        public Builder body(QueryAdvancedDomainListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAdvancedDomainListResponse build() {
            return new QueryAdvancedDomainListResponse(this);
        } 

    } 

}
