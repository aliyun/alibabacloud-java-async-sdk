// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceShadowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceShadowResponseBody</p>
 */
public class DescribeDeviceShadowResponseBody extends TeaModel {
    @NameInMap("DeviceShadow")
    private DeviceShadow deviceShadow;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceShadowResponseBody(Builder builder) {
        this.deviceShadow = builder.deviceShadow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceShadowResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceShadow
     */
    public DeviceShadow getDeviceShadow() {
        return this.deviceShadow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceShadow deviceShadow; 
        private String requestId; 

        /**
         * DeviceShadow.
         */
        public Builder deviceShadow(DeviceShadow deviceShadow) {
            this.deviceShadow = deviceShadow;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeviceShadowResponseBody build() {
            return new DescribeDeviceShadowResponseBody(this);
        } 

    } 

    public static class DeviceShadow extends TeaModel {
        @NameInMap("DeviceInfo")
        private String deviceInfo;

        @NameInMap("DeviceShadow")
        private String deviceShadow;

        private DeviceShadow(Builder builder) {
            this.deviceInfo = builder.deviceInfo;
            this.deviceShadow = builder.deviceShadow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceShadow create() {
            return builder().build();
        }

        /**
         * @return deviceInfo
         */
        public String getDeviceInfo() {
            return this.deviceInfo;
        }

        /**
         * @return deviceShadow
         */
        public String getDeviceShadow() {
            return this.deviceShadow;
        }

        public static final class Builder {
            private String deviceInfo; 
            private String deviceShadow; 

            /**
             * DeviceInfo.
             */
            public Builder deviceInfo(String deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            /**
             * DeviceShadow.
             */
            public Builder deviceShadow(String deviceShadow) {
                this.deviceShadow = deviceShadow;
                return this;
            }

            public DeviceShadow build() {
                return new DeviceShadow(this);
            } 

        } 

    }
}
