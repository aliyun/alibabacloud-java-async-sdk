// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvoicingCustomerListResponse} extends {@link TeaModel}
 *
 * <p>QueryInvoicingCustomerListResponse</p>
 */
public class QueryInvoicingCustomerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInvoicingCustomerListResponseBody body;

    private QueryInvoicingCustomerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInvoicingCustomerListResponse create() {
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
    public QueryInvoicingCustomerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInvoicingCustomerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInvoicingCustomerListResponseBody body);

        @Override
        QueryInvoicingCustomerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInvoicingCustomerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInvoicingCustomerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInvoicingCustomerListResponse response) {
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
        public Builder body(QueryInvoicingCustomerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInvoicingCustomerListResponse build() {
            return new QueryInvoicingCustomerListResponse(this);
        } 

    } 

}
