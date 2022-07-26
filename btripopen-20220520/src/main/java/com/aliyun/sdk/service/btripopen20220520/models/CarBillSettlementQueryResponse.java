// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarBillSettlementQueryResponse} extends {@link TeaModel}
 *
 * <p>CarBillSettlementQueryResponse</p>
 */
public class CarBillSettlementQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CarBillSettlementQueryResponseBody body;

    private CarBillSettlementQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CarBillSettlementQueryResponse create() {
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
    public CarBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CarBillSettlementQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CarBillSettlementQueryResponseBody body);

        @Override
        CarBillSettlementQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CarBillSettlementQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CarBillSettlementQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CarBillSettlementQueryResponse response) {
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
        public Builder body(CarBillSettlementQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CarBillSettlementQueryResponse build() {
            return new CarBillSettlementQueryResponse(this);
        } 

    } 

}
