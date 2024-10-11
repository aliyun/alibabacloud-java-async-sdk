// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterResponseBody</p>
 */
public class CreateClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterResponseBody create() {
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

        public CreateClusterResponseBody build() {
            return new CreateClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
        private String virtualWareHouseId;

        private Data(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
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
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
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
            private String DBClusterId; 
            private Long orderId; 
            private String virtualWareHouseId; 

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

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
