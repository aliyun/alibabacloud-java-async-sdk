// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHotlineInQueueResponse} extends {@link TeaModel}
 *
 * <p>QueryHotlineInQueueResponse</p>
 */
public class QueryHotlineInQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryHotlineInQueueResponseBody body;

    private QueryHotlineInQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryHotlineInQueueResponse create() {
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
    public QueryHotlineInQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryHotlineInQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryHotlineInQueueResponseBody body);

        @Override
        QueryHotlineInQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryHotlineInQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryHotlineInQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryHotlineInQueueResponse response) {
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
        public Builder body(QueryHotlineInQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryHotlineInQueueResponse build() {
            return new QueryHotlineInQueueResponse(this);
        } 

    } 

}
