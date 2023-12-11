// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDISyncTaskConfigProcessResultResponse} extends {@link TeaModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultResponse</p>
 */
public class QueryDISyncTaskConfigProcessResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDISyncTaskConfigProcessResultResponseBody body;

    private QueryDISyncTaskConfigProcessResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDISyncTaskConfigProcessResultResponse create() {
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
    public QueryDISyncTaskConfigProcessResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDISyncTaskConfigProcessResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDISyncTaskConfigProcessResultResponseBody body);

        @Override
        QueryDISyncTaskConfigProcessResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDISyncTaskConfigProcessResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDISyncTaskConfigProcessResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDISyncTaskConfigProcessResultResponse response) {
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
        public Builder body(QueryDISyncTaskConfigProcessResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDISyncTaskConfigProcessResultResponse build() {
            return new QueryDISyncTaskConfigProcessResultResponse(this);
        } 

    } 

}
