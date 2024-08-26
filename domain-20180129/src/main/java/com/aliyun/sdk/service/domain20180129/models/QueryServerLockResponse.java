// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryServerLockResponse} extends {@link TeaModel}
 *
 * <p>QueryServerLockResponse</p>
 */
public class QueryServerLockResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryServerLockResponseBody body;

    private QueryServerLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryServerLockResponse create() {
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
    public QueryServerLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryServerLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryServerLockResponseBody body);

        @Override
        QueryServerLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryServerLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryServerLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryServerLockResponse response) {
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
        public Builder body(QueryServerLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryServerLockResponse build() {
            return new QueryServerLockResponse(this);
        } 

    } 

}
