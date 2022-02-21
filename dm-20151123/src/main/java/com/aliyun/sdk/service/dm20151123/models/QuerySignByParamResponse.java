// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySignByParamResponse} extends {@link TeaModel}
 *
 * <p>QuerySignByParamResponse</p>
 */
public class QuerySignByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySignByParamResponseBody body;

    private QuerySignByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySignByParamResponse create() {
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
    public QuerySignByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySignByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySignByParamResponseBody body);

        @Override
        QuerySignByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySignByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySignByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySignByParamResponse response) {
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
        public Builder body(QuerySignByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySignByParamResponse build() {
            return new QuerySignByParamResponse(this);
        } 

    } 

}
