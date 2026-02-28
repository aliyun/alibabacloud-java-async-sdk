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
 * {@link BatchCheckVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckVehicleDeviceResponseBody</p>
 */
public class BatchCheckVehicleDeviceResponseBody extends TeaModel {
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

    private BatchCheckVehicleDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckVehicleDeviceResponseBody create() {
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

        private Builder(BatchCheckVehicleDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public BatchCheckVehicleDeviceResponseBody build() {
            return new BatchCheckVehicleDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCheckVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckVehicleDeviceResponseBody</p>
     */
    public static class InvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        private String manufacturer;

        private InvalidDetailList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.errorMsg = builder.errorMsg;
            this.manufacturer = builder.manufacturer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDetailList create() {
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
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
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
            private String errorMsg; 
            private String manufacturer; 

            private Builder() {
            } 

            private Builder(InvalidDetailList model) {
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.deviceName = model.deviceName;
                this.errorMsg = model.errorMsg;
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            public InvalidDetailList build() {
                return new InvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCheckVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckVehicleDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private java.util.List<InvalidDetailList> invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceIdList")
        private java.util.List<String> invalidDeviceIdList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceModelList")
        private java.util.List<String> invalidDeviceModelList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private java.util.List<String> invalidDeviceNameList;

        @com.aliyun.core.annotation.NameInMap("InvalidManufacturerList")
        private java.util.List<String> invalidManufacturerList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceIdList")
        private java.util.List<String> repeatedDeviceIdList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private java.util.List<String> repeatedDeviceNameList;

        private Data(Builder builder) {
            this.invalidDetailList = builder.invalidDetailList;
            this.invalidDeviceIdList = builder.invalidDeviceIdList;
            this.invalidDeviceModelList = builder.invalidDeviceModelList;
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.invalidManufacturerList = builder.invalidManufacturerList;
            this.repeatedDeviceIdList = builder.repeatedDeviceIdList;
            this.repeatedDeviceNameList = builder.repeatedDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidDetailList
         */
        public java.util.List<InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidDeviceIdList
         */
        public java.util.List<String> getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        /**
         * @return invalidDeviceModelList
         */
        public java.util.List<String> getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        /**
         * @return invalidDeviceNameList
         */
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return invalidManufacturerList
         */
        public java.util.List<String> getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        /**
         * @return repeatedDeviceIdList
         */
        public java.util.List<String> getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private java.util.List<InvalidDetailList> invalidDetailList; 
            private java.util.List<String> invalidDeviceIdList; 
            private java.util.List<String> invalidDeviceModelList; 
            private java.util.List<String> invalidDeviceNameList; 
            private java.util.List<String> invalidManufacturerList; 
            private java.util.List<String> repeatedDeviceIdList; 
            private java.util.List<String> repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.invalidDetailList = model.invalidDetailList;
                this.invalidDeviceIdList = model.invalidDeviceIdList;
                this.invalidDeviceModelList = model.invalidDeviceModelList;
                this.invalidDeviceNameList = model.invalidDeviceNameList;
                this.invalidManufacturerList = model.invalidManufacturerList;
                this.repeatedDeviceIdList = model.repeatedDeviceIdList;
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(java.util.List<InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidDeviceIdList.
             */
            public Builder invalidDeviceIdList(java.util.List<String> invalidDeviceIdList) {
                this.invalidDeviceIdList = invalidDeviceIdList;
                return this;
            }

            /**
             * InvalidDeviceModelList.
             */
            public Builder invalidDeviceModelList(java.util.List<String> invalidDeviceModelList) {
                this.invalidDeviceModelList = invalidDeviceModelList;
                return this;
            }

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * InvalidManufacturerList.
             */
            public Builder invalidManufacturerList(java.util.List<String> invalidManufacturerList) {
                this.invalidManufacturerList = invalidManufacturerList;
                return this;
            }

            /**
             * RepeatedDeviceIdList.
             */
            public Builder repeatedDeviceIdList(java.util.List<String> repeatedDeviceIdList) {
                this.repeatedDeviceIdList = repeatedDeviceIdList;
                return this;
            }

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
