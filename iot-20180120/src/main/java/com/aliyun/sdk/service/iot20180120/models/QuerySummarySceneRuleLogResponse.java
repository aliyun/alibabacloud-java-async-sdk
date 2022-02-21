// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySummarySceneRuleLogResponse} extends {@link TeaModel}
 *
 * <p>QuerySummarySceneRuleLogResponse</p>
 */
public class QuerySummarySceneRuleLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySummarySceneRuleLogResponseBody body;

    private QuerySummarySceneRuleLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySummarySceneRuleLogResponse create() {
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
    public QuerySummarySceneRuleLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySummarySceneRuleLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySummarySceneRuleLogResponseBody body);

        @Override
        QuerySummarySceneRuleLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySummarySceneRuleLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySummarySceneRuleLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySummarySceneRuleLogResponse response) {
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
        public Builder body(QuerySummarySceneRuleLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySummarySceneRuleLogResponse build() {
            return new QuerySummarySceneRuleLogResponse(this);
        } 

    } 

}
