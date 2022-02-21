// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEvaluateListResponse} extends {@link TeaModel}
 *
 * <p>QueryEvaluateListResponse</p>
 */
public class QueryEvaluateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEvaluateListResponseBody body;

    private QueryEvaluateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEvaluateListResponse create() {
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
    public QueryEvaluateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEvaluateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEvaluateListResponseBody body);

        @Override
        QueryEvaluateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEvaluateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEvaluateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEvaluateListResponse response) {
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
        public Builder body(QueryEvaluateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEvaluateListResponse build() {
            return new QueryEvaluateListResponse(this);
        } 

    } 

}
