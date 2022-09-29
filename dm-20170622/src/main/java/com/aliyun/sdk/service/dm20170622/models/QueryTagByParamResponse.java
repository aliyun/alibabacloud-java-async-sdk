// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryTagByParamResponse</p>
 */
public class QueryTagByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTagByParamResponseBody body;

    private QueryTagByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTagByParamResponse create() {
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
    public QueryTagByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTagByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTagByParamResponseBody body);

        @Override
        QueryTagByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTagByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTagByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTagByParamResponse response) {
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
        public Builder body(QueryTagByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTagByParamResponse build() {
            return new QueryTagByParamResponse(this);
        } 

    } 

}
