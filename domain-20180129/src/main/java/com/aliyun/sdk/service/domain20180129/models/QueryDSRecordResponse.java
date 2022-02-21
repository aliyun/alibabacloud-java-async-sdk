// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDSRecordResponse} extends {@link TeaModel}
 *
 * <p>QueryDSRecordResponse</p>
 */
public class QueryDSRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDSRecordResponseBody body;

    private QueryDSRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDSRecordResponse create() {
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
    public QueryDSRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDSRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDSRecordResponseBody body);

        @Override
        QueryDSRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDSRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDSRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDSRecordResponse response) {
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
        public Builder body(QueryDSRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDSRecordResponse build() {
            return new QueryDSRecordResponse(this);
        } 

    } 

}
