// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoRaNodesTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateLoRaNodesTaskRequest</p>
 */
public class CreateLoRaNodesTaskRequest extends Request {
    @Query
    @NameInMap("DeviceInfo")
    @Validation(required = true)
    private java.util.List < DeviceInfo> deviceInfo;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private CreateLoRaNodesTaskRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoRaNodesTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public java.util.List < DeviceInfo> getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<CreateLoRaNodesTaskRequest, Builder> {
        private java.util.List < DeviceInfo> deviceInfo; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoRaNodesTaskRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(java.util.List < DeviceInfo> deviceInfo) {
            this.putQueryParameter("DeviceInfo", deviceInfo);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
        public CreateLoRaNodesTaskRequest build() {
            return new CreateLoRaNodesTaskRequest(this);
        } 

    } 

    public static class DeviceInfo extends TeaModel {
        @NameInMap("DevEui")
        private String devEui;

        @NameInMap("PinCode")
        private String pinCode;

        private DeviceInfo(Builder builder) {
            this.devEui = builder.devEui;
            this.pinCode = builder.pinCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return devEui
         */
        public String getDevEui() {
            return this.devEui;
        }

        /**
         * @return pinCode
         */
        public String getPinCode() {
            return this.pinCode;
        }

        public static final class Builder {
            private String devEui; 
            private String pinCode; 

            /**
             * DevEui.
             */
            public Builder devEui(String devEui) {
                this.devEui = devEui;
                return this;
            }

            /**
             * PinCode.
             */
            public Builder pinCode(String pinCode) {
                this.pinCode = pinCode;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
}
