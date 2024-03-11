// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bizworks20210408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUsageResponse} extends {@link TeaModel}
 *
 * <p>QueryUsageResponse</p>
 */
public class QueryUsageResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryUsageResponseBody body;

    private QueryUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryUsageResponse create() {
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
    public QueryUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryUsageResponseBody body);

        @Override
        QueryUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUsageResponse response) {
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
        public Builder body(QueryUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUsageResponse build() {
            return new QueryUsageResponse(this);
        } 

    } 

}
