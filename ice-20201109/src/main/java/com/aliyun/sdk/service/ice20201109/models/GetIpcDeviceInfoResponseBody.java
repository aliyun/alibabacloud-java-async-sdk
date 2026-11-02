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
         * <p>The list of device identity information.</p>
         */
        public Builder deviceInfos(java.util.List<DeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
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
             * <p>The capability. Valid values:</p>
             * <ul>
             * <li>understand: Understanding.</li>
             * <li>understand-reid: Understanding with ReID.</li>
             * <li>search: Search.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>understand</p>
             */
            public Builder capability(String capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d123</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The expiration time in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-02-11T12:00:00Z</p>
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
