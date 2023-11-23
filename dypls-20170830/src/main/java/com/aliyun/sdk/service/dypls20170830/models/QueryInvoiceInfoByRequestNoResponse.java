// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvoiceInfoByRequestNoResponse} extends {@link TeaModel}
 *
 * <p>QueryInvoiceInfoByRequestNoResponse</p>
 */
public class QueryInvoiceInfoByRequestNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInvoiceInfoByRequestNoResponseBody body;

    private QueryInvoiceInfoByRequestNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryInvoiceInfoByRequestNoResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public QueryInvoiceInfoByRequestNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInvoiceInfoByRequestNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryInvoiceInfoByRequestNoResponseBody body);

        @Override
        QueryInvoiceInfoByRequestNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInvoiceInfoByRequestNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryInvoiceInfoByRequestNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInvoiceInfoByRequestNoResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryInvoiceInfoByRequestNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInvoiceInfoByRequestNoResponse build() {
            return new QueryInvoiceInfoByRequestNoResponse(this);
        } 

    } 

}
