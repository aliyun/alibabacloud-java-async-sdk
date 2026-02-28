// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchImportVehicleDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchImportVehicleDeviceRequest</p>
 */
public class BatchImportVehicleDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceList> deviceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private BatchImportVehicleDeviceRequest(Builder builder) {
        super(builder);
        this.deviceList = builder.deviceList;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchImportVehicleDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List<DeviceList> getDeviceList() {
        return this.deviceList;
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

    public static final class Builder extends Request.Builder<BatchImportVehicleDeviceRequest, Builder> {
        private java.util.List<DeviceList> deviceList; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchImportVehicleDeviceRequest request) {
            super(request);
            this.deviceList = request.deviceList;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceList(java.util.List<DeviceList> deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * <p>BatchImportVehicleDevice</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Bw****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public BatchImportVehicleDeviceRequest build() {
            return new BatchImportVehicleDeviceRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchImportVehicleDeviceRequest} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceRequest</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        private String manufacturer;

        private DeviceList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.manufacturer = builder.manufacturer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceModel; 
            private String deviceName; 
            private String deviceSecret; 
            private String manufacturer; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.manufacturer = model.manufacturer;
            } 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceSecret.
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
