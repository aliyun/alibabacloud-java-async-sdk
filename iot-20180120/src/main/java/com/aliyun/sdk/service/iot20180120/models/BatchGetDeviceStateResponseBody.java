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
 * {@link BatchGetDeviceStateResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetDeviceStateResponseBody</p>
 */
public class BatchGetDeviceStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceStatusList")
    private DeviceStatusList deviceStatusList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(BatchGetDeviceStateResponseBody model) {
            this.code = model.code;
            this.deviceStatusList = model.deviceStatusList;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device status information returned if the call is successful. For more information, see the following parameters that are included in the DeviceStatus parameter.</p>
         */
        public Builder deviceStatusList(DeviceStatusList deviceStatusList) {
            this.deviceStatusList = deviceStatusList;
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
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
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

        public BatchGetDeviceStateResponseBody build() {
            return new BatchGetDeviceStateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetDeviceStateResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetDeviceStateResponseBody</p>
     */
    public static class DeviceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsAddress")
        private String asAddress;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private DeviceStatus(Builder builder) {
            this.asAddress = builder.asAddress;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
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

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String asAddress; 
            private String deviceId; 
            private String deviceName; 
            private String iotId; 
            private String lastOnlineTime; 
            private String status; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(DeviceStatus model) {
                this.asAddress = model.asAddress;
                this.deviceId = model.deviceId;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.lastOnlineTime = model.lastOnlineTime;
                this.status = model.status;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The IP address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.1</p>
             */
            public Builder asAddress(String asAddress) {
                this.asAddress = asAddress;
                return this;
            }

            /**
             * <p>The ID of the device (expired).</p>
             * <blockquote>
             * <p> This parameter is no longer supported. Do not use this parameter to identify a device. You can use the value of the <strong>IotId</strong>** parameter or a combination of the values of the **<strong>ProductKey</strong> and DeviceName parameters to identify a device.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dwnS41bhNxjslDAI****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>dwnS41bhNxjslDAI****000100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The last time when the device was online.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-17 16:19:11</p>
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * <p>The status of the device. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
             * <li><strong>DISABLE</strong>: The device is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public DeviceStatus build() {
                return new DeviceStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetDeviceStateResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetDeviceStateResponseBody</p>
     */
    public static class DeviceStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private java.util.List<DeviceStatus> deviceStatus;

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
        public java.util.List<DeviceStatus> getDeviceStatus() {
            return this.deviceStatus;
        }

        public static final class Builder {
            private java.util.List<DeviceStatus> deviceStatus; 

            private Builder() {
            } 

            private Builder(DeviceStatusList model) {
                this.deviceStatus = model.deviceStatus;
            } 

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(java.util.List<DeviceStatus> deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            public DeviceStatusList build() {
                return new DeviceStatusList(this);
            } 

        } 

    }
}
