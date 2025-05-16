// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryExportDomainExpireSnatchsResponse} extends {@link TeaModel}
 *
 * <p>QueryExportDomainExpireSnatchsResponse</p>
 */
public class QueryExportDomainExpireSnatchsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryExportDomainExpireSnatchsResponseBody body;

    private QueryExportDomainExpireSnatchsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryExportDomainExpireSnatchsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public QueryExportDomainExpireSnatchsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryExportDomainExpireSnatchsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryExportDomainExpireSnatchsResponseBody body);

        @Override
        QueryExportDomainExpireSnatchsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryExportDomainExpireSnatchsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryExportDomainExpireSnatchsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryExportDomainExpireSnatchsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(QueryExportDomainExpireSnatchsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryExportDomainExpireSnatchsResponse build() {
            return new QueryExportDomainExpireSnatchsResponse(this);
        } 

    } 

}
