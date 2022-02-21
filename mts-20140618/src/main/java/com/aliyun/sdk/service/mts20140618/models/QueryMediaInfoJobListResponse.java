// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaInfoJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaInfoJobListResponse</p>
 */
public class QueryMediaInfoJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMediaInfoJobListResponseBody body;

    private QueryMediaInfoJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMediaInfoJobListResponse create() {
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
    public QueryMediaInfoJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaInfoJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMediaInfoJobListResponseBody body);

        @Override
        QueryMediaInfoJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaInfoJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMediaInfoJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaInfoJobListResponse response) {
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
        public Builder body(QueryMediaInfoJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaInfoJobListResponse build() {
            return new QueryMediaInfoJobListResponse(this);
        } 

    } 

}
