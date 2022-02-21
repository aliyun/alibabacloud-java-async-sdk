// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTemplateByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryTemplateByParamResponse</p>
 */
public class QueryTemplateByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTemplateByParamResponseBody body;

    private QueryTemplateByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTemplateByParamResponse create() {
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
    public QueryTemplateByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTemplateByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTemplateByParamResponseBody body);

        @Override
        QueryTemplateByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTemplateByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTemplateByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTemplateByParamResponse response) {
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
        public Builder body(QueryTemplateByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTemplateByParamResponse build() {
            return new QueryTemplateByParamResponse(this);
        } 

    } 

}
