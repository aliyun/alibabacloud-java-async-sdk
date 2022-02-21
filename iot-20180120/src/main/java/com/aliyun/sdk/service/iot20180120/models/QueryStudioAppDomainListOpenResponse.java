// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStudioAppDomainListOpenResponse} extends {@link TeaModel}
 *
 * <p>QueryStudioAppDomainListOpenResponse</p>
 */
public class QueryStudioAppDomainListOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryStudioAppDomainListOpenResponseBody body;

    private QueryStudioAppDomainListOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryStudioAppDomainListOpenResponse create() {
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
    public QueryStudioAppDomainListOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStudioAppDomainListOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryStudioAppDomainListOpenResponseBody body);

        @Override
        QueryStudioAppDomainListOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStudioAppDomainListOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryStudioAppDomainListOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStudioAppDomainListOpenResponse response) {
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
        public Builder body(QueryStudioAppDomainListOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStudioAppDomainListOpenResponse build() {
            return new QueryStudioAppDomainListOpenResponse(this);
        } 

    } 

}
