// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHBaseHaDBResponse} extends {@link TeaModel}
 *
 * <p>QueryHBaseHaDBResponse</p>
 */
public class QueryHBaseHaDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryHBaseHaDBResponseBody body;

    private QueryHBaseHaDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryHBaseHaDBResponse create() {
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
    public QueryHBaseHaDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryHBaseHaDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryHBaseHaDBResponseBody body);

        @Override
        QueryHBaseHaDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryHBaseHaDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryHBaseHaDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryHBaseHaDBResponse response) {
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
        public Builder body(QueryHBaseHaDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryHBaseHaDBResponse build() {
            return new QueryHBaseHaDBResponse(this);
        } 

    } 

}
