// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCertifyInfoListResponse} extends {@link TeaModel}
 *
 * <p>QueryCertifyInfoListResponse</p>
 */
public class QueryCertifyInfoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCertifyInfoListResponseBody body;

    private QueryCertifyInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryCertifyInfoListResponse create() {
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
    public QueryCertifyInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCertifyInfoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryCertifyInfoListResponseBody body);

        @Override
        QueryCertifyInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCertifyInfoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryCertifyInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCertifyInfoListResponse response) {
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
        public Builder body(QueryCertifyInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCertifyInfoListResponse build() {
            return new QueryCertifyInfoListResponse(this);
        } 

    } 

}
