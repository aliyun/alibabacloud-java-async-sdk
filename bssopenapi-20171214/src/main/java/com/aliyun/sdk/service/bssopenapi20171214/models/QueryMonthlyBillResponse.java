// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyBillResponse} extends {@link TeaModel}
 *
 * <p>QueryMonthlyBillResponse</p>
 */
public class QueryMonthlyBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMonthlyBillResponseBody body;

    private QueryMonthlyBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMonthlyBillResponse create() {
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
    public QueryMonthlyBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMonthlyBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMonthlyBillResponseBody body);

        @Override
        QueryMonthlyBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMonthlyBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMonthlyBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMonthlyBillResponse response) {
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
        public Builder body(QueryMonthlyBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMonthlyBillResponse build() {
            return new QueryMonthlyBillResponse(this);
        } 

    } 

}
