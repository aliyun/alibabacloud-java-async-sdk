// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseStorageCapacityUnitResponseBody} extends {@link TeaModel}
 *
 * <p>PurchaseStorageCapacityUnitResponseBody</p>
 */
public class PurchaseStorageCapacityUnitResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageCapacityUnitIds")
    private StorageCapacityUnitIds storageCapacityUnitIds;

    private PurchaseStorageCapacityUnitResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.storageCapacityUnitIds = builder.storageCapacityUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseStorageCapacityUnitResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageCapacityUnitIds
     */
    public StorageCapacityUnitIds getStorageCapacityUnitIds() {
        return this.storageCapacityUnitIds;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private StorageCapacityUnitIds storageCapacityUnitIds; 

        /**
         * The order ID.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IDs of the SCUs.
         */
        public Builder storageCapacityUnitIds(StorageCapacityUnitIds storageCapacityUnitIds) {
            this.storageCapacityUnitIds = storageCapacityUnitIds;
            return this;
        }

        public PurchaseStorageCapacityUnitResponseBody build() {
            return new PurchaseStorageCapacityUnitResponseBody(this);
        } 

    } 

    public static class StorageCapacityUnitIds extends TeaModel {
        @NameInMap("StorageCapacityUnitId")
        private java.util.List < String > storageCapacityUnitId;

        private StorageCapacityUnitIds(Builder builder) {
            this.storageCapacityUnitId = builder.storageCapacityUnitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageCapacityUnitIds create() {
            return builder().build();
        }

        /**
         * @return storageCapacityUnitId
         */
        public java.util.List < String > getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        public static final class Builder {
            private java.util.List < String > storageCapacityUnitId; 

            /**
             * StorageCapacityUnitId.
             */
            public Builder storageCapacityUnitId(java.util.List < String > storageCapacityUnitId) {
                this.storageCapacityUnitId = storageCapacityUnitId;
                return this;
            }

            public StorageCapacityUnitIds build() {
                return new StorageCapacityUnitIds(this);
            } 

        } 

    }
}
