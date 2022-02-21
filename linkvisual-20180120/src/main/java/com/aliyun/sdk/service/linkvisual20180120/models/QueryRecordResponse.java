// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordResponse</p>
 */
public class QueryRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordResponseBody body;

    private QueryRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordResponse create() {
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
    public QueryRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordResponseBody body);

        @Override
        QueryRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordResponse response) {
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
        public Builder body(QueryRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordResponse build() {
            return new QueryRecordResponse(this);
        } 

    } 

}
