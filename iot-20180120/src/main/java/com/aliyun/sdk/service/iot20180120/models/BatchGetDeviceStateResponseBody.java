// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetDeviceStateResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetDeviceStateResponseBody</p>
 */
public class BatchGetDeviceStateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceStatusList")
    private DeviceStatusList deviceStatusList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetDeviceStateResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceStatusList = builder.deviceStatusList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetDeviceStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceStatusList
     */
    public DeviceStatusList getDeviceStatusList() {
        return this.deviceStatusList;
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
        private DeviceStatusList deviceStatusList; 
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
         * DeviceStatusList.
         */
        public Builder deviceStatusList(DeviceStatusList deviceStatusList) {
            this.deviceStatusList = deviceStatusList;
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

        public BatchGetDeviceStateResponseBody build() {
            return new BatchGetDeviceStateResponseBody(this);
        } 

    } 

    public static class DeviceStatus extends TeaModel {
        @NameInMap("AsAddress")
        private String asAddress;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @NameInMap("Status")
        private String status;

        private DeviceStatus(Builder builder) {
            this.asAddress = builder.asAddress;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceStatus create() {
            return builder().build();
        }

        /**
         * @return asAddress
         */
        public String getAsAddress() {
            return this.asAddress;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
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
         * @return lastOnlineTime
         */
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String asAddress; 
            private String deviceId; 
            private String deviceName; 
            private String iotId; 
            private String lastOnlineTime; 
            private String status; 

            /**
             * AsAddress.
             */
            public Builder asAddress(String asAddress) {
                this.asAddress = asAddress;
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
             * LastOnlineTime.
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DeviceStatus build() {
                return new DeviceStatus(this);
            } 

        } 

    }
    public static class DeviceStatusList extends TeaModel {
        @NameInMap("DeviceStatus")
        private java.util.List < DeviceStatus> deviceStatus;

        private DeviceStatusList(Builder builder) {
            this.deviceStatus = builder.deviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceStatusList create() {
            return builder().build();
        }

        /**
         * @return deviceStatus
         */
        public java.util.List < DeviceStatus> getDeviceStatus() {
            return this.deviceStatus;
        }

        public static final class Builder {
            private java.util.List < DeviceStatus> deviceStatus; 

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(java.util.List < DeviceStatus> deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            public DeviceStatusList build() {
                return new DeviceStatusList(this);
            } 

        } 

    }
}
