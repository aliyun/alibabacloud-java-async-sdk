// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindAllUserByDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindAllUserByDeviceRequest</p>
 */
public class UnbindAllUserByDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("UnbindSubDevice")
    private Boolean unbindSubDevice;

    private UnbindAllUserByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.productKey = builder.productKey;
        this.unbindSubDevice = builder.unbindSubDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAllUserByDeviceRequest create() {
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
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return unbindSubDevice
     */
    public Boolean getUnbindSubDevice() {
        return this.unbindSubDevice;
    }

    public static final class Builder extends Request.Builder<UnbindAllUserByDeviceRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String productKey; 
        private Boolean unbindSubDevice; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAllUserByDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.productKey = request.productKey;
            this.unbindSubDevice = request.unbindSubDevice;
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
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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

        /**
         * UnbindSubDevice.
         */
        public Builder unbindSubDevice(Boolean unbindSubDevice) {
            this.putQueryParameter("UnbindSubDevice", unbindSubDevice);
            this.unbindSubDevice = unbindSubDevice;
            return this;
        }

        @Override
        public UnbindAllUserByDeviceRequest build() {
            return new UnbindAllUserByDeviceRequest(this);
        } 

    } 

}
