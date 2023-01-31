// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionOccupancyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionOccupancyOrderResponseBody</p>
 */
public class CreatePhysicalConnectionOccupancyOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionOccupancyOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionOccupancyOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionOccupancyOrderResponseBody build() {
            return new CreatePhysicalConnectionOccupancyOrderResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OrderId")
        private String orderId;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String orderId; 

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
