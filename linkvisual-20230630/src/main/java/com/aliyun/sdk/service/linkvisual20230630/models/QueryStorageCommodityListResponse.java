// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStorageCommodityListResponse} extends {@link TeaModel}
 *
 * <p>QueryStorageCommodityListResponse</p>
 */
public class QueryStorageCommodityListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryStorageCommodityListResponseBody body;

    private QueryStorageCommodityListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryStorageCommodityListResponse create() {
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
    public QueryStorageCommodityListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStorageCommodityListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryStorageCommodityListResponseBody body);

        @Override
        QueryStorageCommodityListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStorageCommodityListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryStorageCommodityListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStorageCommodityListResponse response) {
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
        public Builder body(QueryStorageCommodityListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStorageCommodityListResponse build() {
            return new QueryStorageCommodityListResponse(this);
        } 

    } 

}