// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateFinanceTaxResponse} extends {@link TeaModel}
 *
 * <p>OperateFinanceTaxResponse</p>
 */
public class OperateFinanceTaxResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OperateFinanceTaxResponseBody body;

    private OperateFinanceTaxResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OperateFinanceTaxResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public OperateFinanceTaxResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateFinanceTaxResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OperateFinanceTaxResponseBody body);

        @Override
        OperateFinanceTaxResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateFinanceTaxResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OperateFinanceTaxResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateFinanceTaxResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(OperateFinanceTaxResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateFinanceTaxResponse build() {
            return new OperateFinanceTaxResponse(this);
        } 

    } 

}
