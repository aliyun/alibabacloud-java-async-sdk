// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVirtualWareHouseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualWareHouseResponseBody</p>
 */
public class CreateVirtualWareHouseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVirtualWareHouseResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualWareHouseResponseBody create() {
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

        public CreateVirtualWareHouseResponseBody build() {
            return new CreateVirtualWareHouseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVirtualWareHouseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVirtualWareHouseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
        private String virtualWareHouseId;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
            this.virtualWareHouseId = builder.virtualWareHouseId;
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
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return virtualWareHouseId
         */
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        public static final class Builder {
            private Long orderId; 
            private String virtualWareHouseId; 

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * VirtualWareHouseId.
             */
            public Builder virtualWareHouseId(String virtualWareHouseId) {
                this.virtualWareHouseId = virtualWareHouseId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
