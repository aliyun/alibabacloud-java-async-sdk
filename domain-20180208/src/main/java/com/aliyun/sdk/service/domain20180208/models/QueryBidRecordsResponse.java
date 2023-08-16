// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBidRecordsResponse} extends {@link TeaModel}
 *
 * <p>QueryBidRecordsResponse</p>
 */
public class QueryBidRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBidRecordsResponseBody body;

    private QueryBidRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBidRecordsResponse create() {
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
    public QueryBidRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBidRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBidRecordsResponseBody body);

        @Override
        QueryBidRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBidRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBidRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBidRecordsResponse response) {
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
        public Builder body(QueryBidRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBidRecordsResponse build() {
            return new QueryBidRecordsResponse(this);
        } 

    } 

}
