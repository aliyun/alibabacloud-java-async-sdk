// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetIpcDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpcDeviceInfoResponseBody</p>
 */
public class GetIpcDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceInfos")
    private java.util.List<DeviceInfos> deviceInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private GetIpcDeviceInfoResponseBody(Builder builder) {
        this.deviceInfos = builder.deviceInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpcDeviceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfos
     */
    public java.util.List<DeviceInfos> getDeviceInfos() {
        return this.deviceInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<DeviceInfos> deviceInfos; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GetIpcDeviceInfoResponseBody model) {
            this.deviceInfos = model.deviceInfos;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * DeviceInfos.
         */
        public Builder deviceInfos(java.util.List<DeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetIpcDeviceInfoResponseBody build() {
            return new GetIpcDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIpcDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetIpcDeviceInfoResponseBody</p>
     */
    public static class DeviceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        private String capability;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        private DeviceInfos(Builder builder) {
            this.capability = builder.capability;
            this.deviceId = builder.deviceId;
            this.expireTime = builder.expireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfos create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public String getCapability() {
            return this.capability;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        public static final class Builder {
            private String capability; 
            private String deviceId; 
            private String expireTime; 

            private Builder() {
            } 

            private Builder(DeviceInfos model) {
                this.capability = model.capability;
                this.deviceId = model.deviceId;
                this.expireTime = model.expireTime;
            } 

            /**
             * Capability.
             */
            public Builder capability(String capability) {
                this.capability = capability;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            public DeviceInfos build() {
                return new DeviceInfos(this);
            } 

        } 

    }
}
