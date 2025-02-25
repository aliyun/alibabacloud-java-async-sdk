// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaWorkflowListResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaWorkflowListResponse</p>
 */
public class QueryMediaWorkflowListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMediaWorkflowListResponseBody body;

    private QueryMediaWorkflowListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryMediaWorkflowListResponse create() {
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
    public QueryMediaWorkflowListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaWorkflowListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryMediaWorkflowListResponseBody body);

        @Override
        QueryMediaWorkflowListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaWorkflowListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryMediaWorkflowListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaWorkflowListResponse response) {
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
        public Builder body(QueryMediaWorkflowListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaWorkflowListResponse build() {
            return new QueryMediaWorkflowListResponse(this);
        } 

    } 

}
