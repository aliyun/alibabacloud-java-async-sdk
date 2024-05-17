// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcdpAimResponse} extends {@link TeaModel}
 *
 * <p>QueryMcdpAimResponse</p>
 */
public class QueryMcdpAimResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMcdpAimResponseBody body;

    private QueryMcdpAimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryMcdpAimResponse create() {
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
    public QueryMcdpAimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcdpAimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryMcdpAimResponseBody body);

        @Override
        QueryMcdpAimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcdpAimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryMcdpAimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcdpAimResponse response) {
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
        public Builder body(QueryMcdpAimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcdpAimResponse build() {
            return new QueryMcdpAimResponse(this);
        } 

    } 

}
