// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChangeLogListResponse} extends {@link TeaModel}
 *
 * <p>QueryChangeLogListResponse</p>
 */
public class QueryChangeLogListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryChangeLogListResponseBody body;

    private QueryChangeLogListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryChangeLogListResponse create() {
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
     * @return body
     */
    public QueryChangeLogListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryChangeLogListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryChangeLogListResponseBody body);

        @Override
        QueryChangeLogListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryChangeLogListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryChangeLogListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryChangeLogListResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(QueryChangeLogListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryChangeLogListResponse build() {
            return new QueryChangeLogListResponse(this);
        } 

    } 

}
