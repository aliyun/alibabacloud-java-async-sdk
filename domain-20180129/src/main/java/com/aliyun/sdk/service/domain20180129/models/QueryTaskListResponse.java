// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskListResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskListResponse</p>
 */
public class QueryTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskListResponseBody body;

    private QueryTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskListResponse create() {
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
    public QueryTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskListResponseBody body);

        @Override
        QueryTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskListResponse response) {
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
        public Builder body(QueryTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskListResponse build() {
            return new QueryTaskListResponse(this);
        } 

    } 

}
