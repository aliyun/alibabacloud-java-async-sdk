// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBImportTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDBImportTaskStatusResponse</p>
 */
public class QueryDBImportTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDBImportTaskStatusResponseBody body;

    private QueryDBImportTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDBImportTaskStatusResponse create() {
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
    public QueryDBImportTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDBImportTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDBImportTaskStatusResponseBody body);

        @Override
        QueryDBImportTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDBImportTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDBImportTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDBImportTaskStatusResponse response) {
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
        public Builder body(QueryDBImportTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDBImportTaskStatusResponse build() {
            return new QueryDBImportTaskStatusResponse(this);
        } 

    } 

}
