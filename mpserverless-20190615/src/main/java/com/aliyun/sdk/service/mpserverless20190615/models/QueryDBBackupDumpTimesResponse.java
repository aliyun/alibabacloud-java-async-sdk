// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBBackupDumpTimesResponse} extends {@link TeaModel}
 *
 * <p>QueryDBBackupDumpTimesResponse</p>
 */
public class QueryDBBackupDumpTimesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDBBackupDumpTimesResponseBody body;

    private QueryDBBackupDumpTimesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDBBackupDumpTimesResponse create() {
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
    public QueryDBBackupDumpTimesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDBBackupDumpTimesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDBBackupDumpTimesResponseBody body);

        @Override
        QueryDBBackupDumpTimesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDBBackupDumpTimesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDBBackupDumpTimesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDBBackupDumpTimesResponse response) {
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
        public Builder body(QueryDBBackupDumpTimesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDBBackupDumpTimesResponse build() {
            return new QueryDBBackupDumpTimesResponse(this);
        } 

    } 

}
