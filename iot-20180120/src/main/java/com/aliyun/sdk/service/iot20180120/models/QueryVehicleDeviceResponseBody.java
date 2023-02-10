// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVehicleDeviceResponseBody</p>
 */
public class QueryVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryVehicleDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVehicleDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryVehicleDeviceResponseBody build() {
            return new QueryVehicleDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthCode")
        private String authCode;

        @NameInMap("City")
        private String city;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("Manufacturer")
        private String manufacturer;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("Province")
        private String province;

        @NameInMap("RegisterTime")
        private Long registerTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("VehicleColour")
        private String vehicleColour;

        @NameInMap("VehicleNumber")
        private String vehicleNumber;

        private Data(Builder builder) {
            this.authCode = builder.authCode;
            this.city = builder.city;
            this.createTime = builder.createTime;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.manufacturer = builder.manufacturer;
            this.modifiedTime = builder.modifiedTime;
            this.productKey = builder.productKey;
            this.province = builder.province;
            this.registerTime = builder.registerTime;
            this.status = builder.status;
            this.vehicleColour = builder.vehicleColour;
            this.vehicleNumber = builder.vehicleNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authCode
         */
        public String getAuthCode() {
            return this.authCode;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return registerTime
         */
        public Long getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vehicleColour
         */
        public String getVehicleColour() {
            return this.vehicleColour;
        }

        /**
         * @return vehicleNumber
         */
        public String getVehicleNumber() {
            return this.vehicleNumber;
        }

        public static final class Builder {
            private String authCode; 
            private String city; 
            private Long createTime; 
            private String deviceId; 
            private String deviceModel; 
            private String deviceName; 
            private String iotId; 
            private String manufacturer; 
            private Long modifiedTime; 
            private String productKey; 
            private String province; 
            private Long registerTime; 
            private String status; 
            private String vehicleColour; 
            private String vehicleNumber; 

            /**
             * AuthCode.
             */
            public Builder authCode(String authCode) {
                this.authCode = authCode;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
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
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * RegisterTime.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VehicleColour.
             */
            public Builder vehicleColour(String vehicleColour) {
                this.vehicleColour = vehicleColour;
                return this;
            }

            /**
             * VehicleNumber.
             */
            public Builder vehicleNumber(String vehicleNumber) {
                this.vehicleNumber = vehicleNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
