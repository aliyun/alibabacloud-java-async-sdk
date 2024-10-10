// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDevicesResponseBody</p>
 */
public class CheckDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceCheckInfos")
    private DeviceCheckInfos deviceCheckInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDevicesResponseBody(Builder builder) {
        this.deviceCheckInfos = builder.deviceCheckInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceCheckInfos
     */
    public DeviceCheckInfos getDeviceCheckInfos() {
        return this.deviceCheckInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceCheckInfos deviceCheckInfos; 
        private String requestId; 

        /**
         * DeviceCheckInfos.
         */
        public Builder deviceCheckInfos(DeviceCheckInfos deviceCheckInfos) {
            this.deviceCheckInfos = deviceCheckInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDevicesResponseBody build() {
            return new CheckDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>CheckDevicesResponseBody</p>
     */
    public static class DeviceCheckInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        private DeviceCheckInfo(Builder builder) {
            this.available = builder.available;
            this.deviceId = builder.deviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceCheckInfo create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        public static final class Builder {
            private Boolean available; 
            private String deviceId; 

            /**
             * Available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            public DeviceCheckInfo build() {
                return new DeviceCheckInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>CheckDevicesResponseBody</p>
     */
    public static class DeviceCheckInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceCheckInfo")
        private java.util.List < DeviceCheckInfo> deviceCheckInfo;

        private DeviceCheckInfos(Builder builder) {
            this.deviceCheckInfo = builder.deviceCheckInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceCheckInfos create() {
            return builder().build();
        }

        /**
         * @return deviceCheckInfo
         */
        public java.util.List < DeviceCheckInfo> getDeviceCheckInfo() {
            return this.deviceCheckInfo;
        }

        public static final class Builder {
            private java.util.List < DeviceCheckInfo> deviceCheckInfo; 

            /**
             * DeviceCheckInfo.
             */
            public Builder deviceCheckInfo(java.util.List < DeviceCheckInfo> deviceCheckInfo) {
                this.deviceCheckInfo = deviceCheckInfo;
                return this;
            }

            public DeviceCheckInfos build() {
                return new DeviceCheckInfos(this);
            } 

        } 

    }
}
