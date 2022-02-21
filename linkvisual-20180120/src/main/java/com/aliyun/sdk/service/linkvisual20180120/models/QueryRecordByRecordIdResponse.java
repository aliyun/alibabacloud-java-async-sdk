// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordByRecordIdResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordByRecordIdResponse</p>
 */
public class QueryRecordByRecordIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordByRecordIdResponseBody body;

    private QueryRecordByRecordIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordByRecordIdResponse create() {
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
    public QueryRecordByRecordIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordByRecordIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordByRecordIdResponseBody body);

        @Override
        QueryRecordByRecordIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordByRecordIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordByRecordIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordByRecordIdResponse response) {
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
        public Builder body(QueryRecordByRecordIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordByRecordIdResponse build() {
            return new QueryRecordByRecordIdResponse(this);
        } 

    } 

}
