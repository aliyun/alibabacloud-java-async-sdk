// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link PurchaseStorageCapacityUnitResponseBody} extends {@link TeaModel}
 *
 * <p>PurchaseStorageCapacityUnitResponseBody</p>
 */
public class PurchaseStorageCapacityUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageCapacityUnitIds")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PurchaseStorageCapacityUnitResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.storageCapacityUnitIds = model.storageCapacityUnitIds;
        } 

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>204135153880****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the SCUs.</p>
         */
        public Builder storageCapacityUnitIds(StorageCapacityUnitIds storageCapacityUnitIds) {
            this.storageCapacityUnitIds = storageCapacityUnitIds;
            return this;
        }

        public PurchaseStorageCapacityUnitResponseBody build() {
            return new PurchaseStorageCapacityUnitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PurchaseStorageCapacityUnitResponseBody} extends {@link TeaModel}
     *
     * <p>PurchaseStorageCapacityUnitResponseBody</p>
     */
    public static class StorageCapacityUnitIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageCapacityUnitId")
        private java.util.List<String> storageCapacityUnitId;

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
        public java.util.List<String> getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        public static final class Builder {
            private java.util.List<String> storageCapacityUnitId; 

            private Builder() {
            } 

            private Builder(StorageCapacityUnitIds model) {
                this.storageCapacityUnitId = model.storageCapacityUnitId;
            } 

            /**
             * StorageCapacityUnitId.
             */
            public Builder storageCapacityUnitId(java.util.List<String> storageCapacityUnitId) {
                this.storageCapacityUnitId = storageCapacityUnitId;
                return this;
            }

            public StorageCapacityUnitIds build() {
                return new StorageCapacityUnitIds(this);
            } 

        } 

    }
}
