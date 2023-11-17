// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreezeStorageOrderRequest} extends {@link RequestModel}
 *
 * <p>FreezeStorageOrderRequest</p>
 */
public class FreezeStorageOrderRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DeviceNoOwner")
    private Boolean deviceNoOwner;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private FreezeStorageOrderRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.deviceNoOwner = builder.deviceNoOwner;
        this.iotId = builder.iotId;
        this.orderId = builder.orderId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreezeStorageOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceNoOwner
     */
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<FreezeStorageOrderRequest, Builder> {
        private String deviceName; 
        private Boolean deviceNoOwner; 
        private String iotId; 
        private String orderId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(FreezeStorageOrderRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.deviceNoOwner = request.deviceNoOwner;
            this.iotId = request.iotId;
            this.orderId = request.orderId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceNoOwner.
         */
        public Builder deviceNoOwner(Boolean deviceNoOwner) {
            this.putQueryParameter("DeviceNoOwner", deviceNoOwner);
            this.deviceNoOwner = deviceNoOwner;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public FreezeStorageOrderRequest build() {
            return new FreezeStorageOrderRequest(this);
        } 

    } 

}
