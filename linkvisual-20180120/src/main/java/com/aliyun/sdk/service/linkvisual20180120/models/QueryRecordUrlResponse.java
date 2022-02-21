// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordUrlResponse</p>
 */
public class QueryRecordUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordUrlResponseBody body;

    private QueryRecordUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordUrlResponse create() {
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
    public QueryRecordUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordUrlResponseBody body);

        @Override
        QueryRecordUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordUrlResponse response) {
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
        public Builder body(QueryRecordUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordUrlResponse build() {
            return new QueryRecordUrlResponse(this);
        } 

    } 

}
