// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBExportTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDBExportTaskStatusResponse</p>
 */
public class QueryDBExportTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDBExportTaskStatusResponseBody body;

    private QueryDBExportTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDBExportTaskStatusResponse create() {
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
    public QueryDBExportTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDBExportTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDBExportTaskStatusResponseBody body);

        @Override
        QueryDBExportTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDBExportTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDBExportTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDBExportTaskStatusResponse response) {
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
        public Builder body(QueryDBExportTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDBExportTaskStatusResponse build() {
            return new QueryDBExportTaskStatusResponse(this);
        } 

    } 

}
