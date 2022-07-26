// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightBillSettlementQueryResponse} extends {@link TeaModel}
 *
 * <p>FlightBillSettlementQueryResponse</p>
 */
public class FlightBillSettlementQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightBillSettlementQueryResponseBody body;

    private FlightBillSettlementQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightBillSettlementQueryResponse create() {
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
    public FlightBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightBillSettlementQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightBillSettlementQueryResponseBody body);

        @Override
        FlightBillSettlementQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightBillSettlementQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightBillSettlementQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightBillSettlementQueryResponse response) {
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
        public Builder body(FlightBillSettlementQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightBillSettlementQueryResponse build() {
            return new FlightBillSettlementQueryResponse(this);
        } 

    } 

}
