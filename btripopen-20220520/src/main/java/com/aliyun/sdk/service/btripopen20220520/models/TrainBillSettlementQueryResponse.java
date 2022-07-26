// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainBillSettlementQueryResponse} extends {@link TeaModel}
 *
 * <p>TrainBillSettlementQueryResponse</p>
 */
public class TrainBillSettlementQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainBillSettlementQueryResponseBody body;

    private TrainBillSettlementQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainBillSettlementQueryResponse create() {
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
    public TrainBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainBillSettlementQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainBillSettlementQueryResponseBody body);

        @Override
        TrainBillSettlementQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainBillSettlementQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainBillSettlementQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainBillSettlementQueryResponse response) {
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
        public Builder body(TrainBillSettlementQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainBillSettlementQueryResponse build() {
            return new TrainBillSettlementQueryResponse(this);
        } 

    } 

}
