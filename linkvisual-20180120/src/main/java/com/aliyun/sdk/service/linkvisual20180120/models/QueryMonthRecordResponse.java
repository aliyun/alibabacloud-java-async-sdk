// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthRecordResponse} extends {@link TeaModel}
 *
 * <p>QueryMonthRecordResponse</p>
 */
public class QueryMonthRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMonthRecordResponseBody body;

    private QueryMonthRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMonthRecordResponse create() {
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
    public QueryMonthRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMonthRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMonthRecordResponseBody body);

        @Override
        QueryMonthRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMonthRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMonthRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMonthRecordResponse response) {
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
        public Builder body(QueryMonthRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMonthRecordResponse build() {
            return new QueryMonthRecordResponse(this);
        } 

    } 

}
