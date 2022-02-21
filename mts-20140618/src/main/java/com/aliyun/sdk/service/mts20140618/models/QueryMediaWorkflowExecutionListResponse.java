// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaWorkflowExecutionListResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaWorkflowExecutionListResponse</p>
 */
public class QueryMediaWorkflowExecutionListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMediaWorkflowExecutionListResponseBody body;

    private QueryMediaWorkflowExecutionListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMediaWorkflowExecutionListResponse create() {
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
    public QueryMediaWorkflowExecutionListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaWorkflowExecutionListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMediaWorkflowExecutionListResponseBody body);

        @Override
        QueryMediaWorkflowExecutionListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaWorkflowExecutionListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMediaWorkflowExecutionListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaWorkflowExecutionListResponse response) {
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
        public Builder body(QueryMediaWorkflowExecutionListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaWorkflowExecutionListResponse build() {
            return new QueryMediaWorkflowExecutionListResponse(this);
        } 

    } 

}
