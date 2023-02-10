// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportVehicleDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchImportVehicleDeviceRequest</p>
 */
public class BatchImportVehicleDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceList")
    @Validation(required = true)
    private java.util.List < DeviceList> deviceList;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
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
    public java.util.List < DeviceList> getDeviceList() {
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
        private java.util.List < DeviceList> deviceList; 
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
         * DeviceList.
         */
        public Builder deviceList(java.util.List < DeviceList> deviceList) {
            this.putQueryParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
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
        public BatchImportVehicleDeviceRequest build() {
            return new BatchImportVehicleDeviceRequest(this);
        } 

    } 

    public static class DeviceList extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceModel")
        @Validation(required = true)
        private String deviceModel;

        @NameInMap("Manufacturer")
        @Validation(required = true)
        private String manufacturer;

        private DeviceList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
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
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceModel; 
            private String manufacturer; 

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
