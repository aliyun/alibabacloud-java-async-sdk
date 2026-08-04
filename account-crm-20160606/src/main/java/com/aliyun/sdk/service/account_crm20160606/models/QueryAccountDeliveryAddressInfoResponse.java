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
 * {@link QueryAccountDeliveryAddressInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryAccountDeliveryAddressInfoResponse</p>
 */
public class QueryAccountDeliveryAddressInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryAccountDeliveryAddressInfoResponseBody body;

    private QueryAccountDeliveryAddressInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryAccountDeliveryAddressInfoResponse create() {
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
    public QueryAccountDeliveryAddressInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAccountDeliveryAddressInfoResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryAccountDeliveryAddressInfoResponseBody body);

        @Override
        QueryAccountDeliveryAddressInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAccountDeliveryAddressInfoResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryAccountDeliveryAddressInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAccountDeliveryAddressInfoResponse response) {
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
        public Builder body(QueryAccountDeliveryAddressInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAccountDeliveryAddressInfoResponse build() {
            return new QueryAccountDeliveryAddressInfoResponse(this);
        } 

    } 

}
