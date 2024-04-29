// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupIdByGroupNameResponse} extends {@link TeaModel}
 *
 * <p>QueryGroupIdByGroupNameResponse</p>
 */
public class QueryGroupIdByGroupNameResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryGroupIdByGroupNameResponseBody body;

    private QueryGroupIdByGroupNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryGroupIdByGroupNameResponse create() {
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
    public QueryGroupIdByGroupNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryGroupIdByGroupNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryGroupIdByGroupNameResponseBody body);

        @Override
        QueryGroupIdByGroupNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryGroupIdByGroupNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryGroupIdByGroupNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryGroupIdByGroupNameResponse response) {
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
        public Builder body(QueryGroupIdByGroupNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryGroupIdByGroupNameResponse build() {
            return new QueryGroupIdByGroupNameResponse(this);
        } 

    } 

}
