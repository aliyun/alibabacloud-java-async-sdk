// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMgsApipageResponse} extends {@link TeaModel}
 *
 * <p>QueryMgsApipageResponse</p>
 */
public class QueryMgsApipageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMgsApipageResponseBody body;

    private QueryMgsApipageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryMgsApipageResponse create() {
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
    public QueryMgsApipageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMgsApipageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryMgsApipageResponseBody body);

        @Override
        QueryMgsApipageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMgsApipageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryMgsApipageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMgsApipageResponse response) {
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
        public Builder body(QueryMgsApipageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMgsApipageResponse build() {
            return new QueryMgsApipageResponse(this);
        } 

    } 

}
