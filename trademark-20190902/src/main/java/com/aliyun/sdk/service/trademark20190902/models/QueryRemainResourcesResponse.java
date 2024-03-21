// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRemainResourcesResponse} extends {@link TeaModel}
 *
 * <p>QueryRemainResourcesResponse</p>
 */
public class QueryRemainResourcesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryRemainResourcesResponseBody body;

    private QueryRemainResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryRemainResourcesResponse create() {
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
    public QueryRemainResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRemainResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryRemainResourcesResponseBody body);

        @Override
        QueryRemainResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRemainResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryRemainResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRemainResourcesResponse response) {
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
        public Builder body(QueryRemainResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRemainResourcesResponse build() {
            return new QueryRemainResourcesResponse(this);
        } 

    } 

}
