// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainByParamResponse</p>
 */
public class QueryDomainByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainByParamResponseBody body;

    private QueryDomainByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainByParamResponse create() {
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
    public QueryDomainByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainByParamResponseBody body);

        @Override
        QueryDomainByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainByParamResponse response) {
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
        public Builder body(QueryDomainByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainByParamResponse build() {
            return new QueryDomainByParamResponse(this);
        } 

    } 

}
