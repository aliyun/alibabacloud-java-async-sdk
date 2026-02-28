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
 * {@link QueryVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVehicleDeviceResponseBody</p>
 */
public class QueryVehicleDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryVehicleDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device information returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryVehicleDeviceResponseBody build() {
            return new QueryVehicleDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVehicleDeviceResponseBody</p>
     */
    public static class JtProtocolDeviceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthCode")
        private String authCode;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RegisterTime")
        private String registerTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VehicleColour")
        private String vehicleColour;

        @com.aliyun.core.annotation.NameInMap("VehicleNumber")
        private String vehicleNumber;

        private JtProtocolDeviceData(Builder builder) {
            this.authCode = builder.authCode;
            this.city = builder.city;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.manufacturer = builder.manufacturer;
            this.province = builder.province;
            this.registerTime = builder.registerTime;
            this.status = builder.status;
            this.vehicleColour = builder.vehicleColour;
            this.vehicleNumber = builder.vehicleNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JtProtocolDeviceData create() {
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

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return registerTime
         */
        public String getRegisterTime() {
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
            private String deviceId; 
            private String deviceModel; 
            private String manufacturer; 
            private String province; 
            private String registerTime; 
            private String status; 
            private String vehicleColour; 
            private String vehicleNumber; 

            private Builder() {
            } 

            private Builder(JtProtocolDeviceData model) {
                this.authCode = model.authCode;
                this.city = model.city;
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.manufacturer = model.manufacturer;
                this.province = model.province;
                this.registerTime = model.registerTime;
                this.status = model.status;
                this.vehicleColour = model.vehicleColour;
                this.vehicleNumber = model.vehicleNumber;
            } 

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
            public Builder registerTime(String registerTime) {
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

            public JtProtocolDeviceData build() {
                return new JtProtocolDeviceData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVehicleDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("JtProtocolDeviceData")
        private JtProtocolDeviceData jtProtocolDeviceData;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.jtProtocolDeviceData = builder.jtProtocolDeviceData;
            this.modifiedTime = builder.modifiedTime;
            this.productKey = builder.productKey;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return jtProtocolDeviceData
         */
        public JtProtocolDeviceData getJtProtocolDeviceData() {
            return this.jtProtocolDeviceData;
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
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Long createTime; 
            private String deviceName; 
            private String iotId; 
            private JtProtocolDeviceData jtProtocolDeviceData; 
            private Long modifiedTime; 
            private String productKey; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.jtProtocolDeviceData = model.jtProtocolDeviceData;
                this.modifiedTime = model.modifiedTime;
                this.productKey = model.productKey;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The timestamp when the device was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1557062301656</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID is a unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>dm0001</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * JtProtocolDeviceData.
             */
            public Builder jtProtocolDeviceData(JtProtocolDeviceData jtProtocolDeviceData) {
                this.jtProtocolDeviceData = jtProtocolDeviceData;
                return this;
            }

            /**
             * <p>The timestamp when the device was last updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1657062301656</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the gateway product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
