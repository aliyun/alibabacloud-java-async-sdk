// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeInstanceSceneRuleResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceSceneRuleResponse</p>
 */
public class QueryEdgeInstanceSceneRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeInstanceSceneRuleResponseBody body;

    private QueryEdgeInstanceSceneRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeInstanceSceneRuleResponse create() {
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
    public QueryEdgeInstanceSceneRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeInstanceSceneRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeInstanceSceneRuleResponseBody body);

        @Override
        QueryEdgeInstanceSceneRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeInstanceSceneRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeInstanceSceneRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeInstanceSceneRuleResponse response) {
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
        public Builder body(QueryEdgeInstanceSceneRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeInstanceSceneRuleResponse build() {
            return new QueryEdgeInstanceSceneRuleResponse(this);
        } 

    } 

}
