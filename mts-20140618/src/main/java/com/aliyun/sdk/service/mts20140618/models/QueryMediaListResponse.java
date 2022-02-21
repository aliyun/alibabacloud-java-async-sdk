// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaListResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaListResponse</p>
 */
public class QueryMediaListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMediaListResponseBody body;

    private QueryMediaListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMediaListResponse create() {
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
    public QueryMediaListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMediaListResponseBody body);

        @Override
        QueryMediaListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMediaListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaListResponse response) {
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
        public Builder body(QueryMediaListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaListResponse build() {
            return new QueryMediaListResponse(this);
        } 

    } 

}
