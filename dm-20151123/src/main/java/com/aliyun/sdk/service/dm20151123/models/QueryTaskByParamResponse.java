// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskByParamResponse</p>
 */
public class QueryTaskByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskByParamResponseBody body;

    private QueryTaskByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskByParamResponse create() {
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
    public QueryTaskByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskByParamResponseBody body);

        @Override
        QueryTaskByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskByParamResponse response) {
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
        public Builder body(QueryTaskByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskByParamResponse build() {
            return new QueryTaskByParamResponse(this);
        } 

    } 

}
