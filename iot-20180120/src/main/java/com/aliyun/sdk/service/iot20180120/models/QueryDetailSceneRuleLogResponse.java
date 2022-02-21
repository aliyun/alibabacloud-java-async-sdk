// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDetailSceneRuleLogResponse} extends {@link TeaModel}
 *
 * <p>QueryDetailSceneRuleLogResponse</p>
 */
public class QueryDetailSceneRuleLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDetailSceneRuleLogResponseBody body;

    private QueryDetailSceneRuleLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDetailSceneRuleLogResponse create() {
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
    public QueryDetailSceneRuleLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDetailSceneRuleLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDetailSceneRuleLogResponseBody body);

        @Override
        QueryDetailSceneRuleLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDetailSceneRuleLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDetailSceneRuleLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDetailSceneRuleLogResponse response) {
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
        public Builder body(QueryDetailSceneRuleLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDetailSceneRuleLogResponse build() {
            return new QueryDetailSceneRuleLogResponse(this);
        } 

    } 

}
