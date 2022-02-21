// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResellerUserAvailableQuotaResponse} extends {@link TeaModel}
 *
 * <p>QueryResellerUserAvailableQuotaResponse</p>
 */
public class QueryResellerUserAvailableQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryResellerUserAvailableQuotaResponseBody body;

    private QueryResellerUserAvailableQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryResellerUserAvailableQuotaResponse create() {
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
    public QueryResellerUserAvailableQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResellerUserAvailableQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryResellerUserAvailableQuotaResponseBody body);

        @Override
        QueryResellerUserAvailableQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResellerUserAvailableQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryResellerUserAvailableQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResellerUserAvailableQuotaResponse response) {
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
        public Builder body(QueryResellerUserAvailableQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResellerUserAvailableQuotaResponse build() {
            return new QueryResellerUserAvailableQuotaResponse(this);
        } 

    } 

}
