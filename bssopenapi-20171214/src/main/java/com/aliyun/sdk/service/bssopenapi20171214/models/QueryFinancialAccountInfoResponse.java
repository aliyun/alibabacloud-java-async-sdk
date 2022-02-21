// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFinancialAccountInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryFinancialAccountInfoResponse</p>
 */
public class QueryFinancialAccountInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFinancialAccountInfoResponseBody body;

    private QueryFinancialAccountInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFinancialAccountInfoResponse create() {
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
    public QueryFinancialAccountInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFinancialAccountInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFinancialAccountInfoResponseBody body);

        @Override
        QueryFinancialAccountInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFinancialAccountInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFinancialAccountInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFinancialAccountInfoResponse response) {
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
        public Builder body(QueryFinancialAccountInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFinancialAccountInfoResponse build() {
            return new QueryFinancialAccountInfoResponse(this);
        } 

    } 

}
