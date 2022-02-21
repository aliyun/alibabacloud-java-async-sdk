// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySettlementBillResponse} extends {@link TeaModel}
 *
 * <p>QuerySettlementBillResponse</p>
 */
public class QuerySettlementBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySettlementBillResponseBody body;

    private QuerySettlementBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySettlementBillResponse create() {
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
    public QuerySettlementBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySettlementBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySettlementBillResponseBody body);

        @Override
        QuerySettlementBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySettlementBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySettlementBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySettlementBillResponse response) {
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
        public Builder body(QuerySettlementBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySettlementBillResponse build() {
            return new QuerySettlementBillResponse(this);
        } 

    } 

}
