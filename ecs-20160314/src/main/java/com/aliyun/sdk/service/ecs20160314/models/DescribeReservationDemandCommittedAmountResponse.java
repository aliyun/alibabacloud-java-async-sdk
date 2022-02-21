// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservationDemandCommittedAmountResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservationDemandCommittedAmountResponse</p>
 */
public class DescribeReservationDemandCommittedAmountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservationDemandCommittedAmountResponseBody body;

    private DescribeReservationDemandCommittedAmountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservationDemandCommittedAmountResponse create() {
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
    public DescribeReservationDemandCommittedAmountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservationDemandCommittedAmountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservationDemandCommittedAmountResponseBody body);

        @Override
        DescribeReservationDemandCommittedAmountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservationDemandCommittedAmountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservationDemandCommittedAmountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservationDemandCommittedAmountResponse response) {
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
        public Builder body(DescribeReservationDemandCommittedAmountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservationDemandCommittedAmountResponse build() {
            return new DescribeReservationDemandCommittedAmountResponse(this);
        } 

    } 

}
