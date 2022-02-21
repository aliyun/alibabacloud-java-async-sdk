// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaCensorJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaCensorJobListResponse</p>
 */
public class QueryMediaCensorJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMediaCensorJobListResponseBody body;

    private QueryMediaCensorJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMediaCensorJobListResponse create() {
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
    public QueryMediaCensorJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaCensorJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMediaCensorJobListResponseBody body);

        @Override
        QueryMediaCensorJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaCensorJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMediaCensorJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaCensorJobListResponse response) {
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
        public Builder body(QueryMediaCensorJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaCensorJobListResponse build() {
            return new QueryMediaCensorJobListResponse(this);
        } 

    } 

}
