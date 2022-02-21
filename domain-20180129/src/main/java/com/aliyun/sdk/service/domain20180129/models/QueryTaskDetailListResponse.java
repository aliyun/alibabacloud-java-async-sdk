// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailListResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailListResponse</p>
 */
public class QueryTaskDetailListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskDetailListResponseBody body;

    private QueryTaskDetailListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskDetailListResponse create() {
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
    public QueryTaskDetailListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskDetailListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskDetailListResponseBody body);

        @Override
        QueryTaskDetailListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskDetailListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskDetailListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskDetailListResponse response) {
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
        public Builder body(QueryTaskDetailListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskDetailListResponse build() {
            return new QueryTaskDetailListResponse(this);
        } 

    } 

}
