// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IeHotelBillSettlementQueryResponse} extends {@link TeaModel}
 *
 * <p>IeHotelBillSettlementQueryResponse</p>
 */
public class IeHotelBillSettlementQueryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private IeHotelBillSettlementQueryResponseBody body;

    private IeHotelBillSettlementQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static IeHotelBillSettlementQueryResponse create() {
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
    public IeHotelBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IeHotelBillSettlementQueryResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(IeHotelBillSettlementQueryResponseBody body);

        @Override
        IeHotelBillSettlementQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IeHotelBillSettlementQueryResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private IeHotelBillSettlementQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IeHotelBillSettlementQueryResponse response) {
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
        public Builder body(IeHotelBillSettlementQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IeHotelBillSettlementQueryResponse build() {
            return new IeHotelBillSettlementQueryResponse(this);
        } 

    } 

}
