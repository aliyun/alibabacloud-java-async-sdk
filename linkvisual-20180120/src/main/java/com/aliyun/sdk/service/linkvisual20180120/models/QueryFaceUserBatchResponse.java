// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserBatchResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceUserBatchResponse</p>
 */
public class QueryFaceUserBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceUserBatchResponseBody body;

    private QueryFaceUserBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceUserBatchResponse create() {
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
    public QueryFaceUserBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceUserBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceUserBatchResponseBody body);

        @Override
        QueryFaceUserBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceUserBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceUserBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceUserBatchResponse response) {
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
        public Builder body(QueryFaceUserBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceUserBatchResponse build() {
            return new QueryFaceUserBatchResponse(this);
        } 

    } 

}
