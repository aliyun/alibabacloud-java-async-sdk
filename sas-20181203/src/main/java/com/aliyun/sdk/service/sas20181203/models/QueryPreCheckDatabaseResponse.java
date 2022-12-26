// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPreCheckDatabaseResponse} extends {@link TeaModel}
 *
 * <p>QueryPreCheckDatabaseResponse</p>
 */
public class QueryPreCheckDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPreCheckDatabaseResponseBody body;

    private QueryPreCheckDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPreCheckDatabaseResponse create() {
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
    public QueryPreCheckDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPreCheckDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPreCheckDatabaseResponseBody body);

        @Override
        QueryPreCheckDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPreCheckDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPreCheckDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPreCheckDatabaseResponse response) {
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
        public Builder body(QueryPreCheckDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPreCheckDatabaseResponse build() {
            return new QueryPreCheckDatabaseResponse(this);
        } 

    } 

}
