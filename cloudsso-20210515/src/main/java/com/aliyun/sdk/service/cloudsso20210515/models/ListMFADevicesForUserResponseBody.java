// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMFADevicesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListMFADevicesForUserResponseBody</p>
 */
public class ListMFADevicesForUserResponseBody extends TeaModel {
    @NameInMap("MFADevices")
    private java.util.List < MFADevices> MFADevices;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListMFADevicesForUserResponseBody(Builder builder) {
        this.MFADevices = builder.MFADevices;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMFADevicesForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return MFADevices
     */
    public java.util.List < MFADevices> getMFADevices() {
        return this.MFADevices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < MFADevices> MFADevices; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * MFADevices.
         */
        public Builder MFADevices(java.util.List < MFADevices> MFADevices) {
            this.MFADevices = MFADevices;
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
         * TotalCounts.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListMFADevicesForUserResponseBody build() {
            return new ListMFADevicesForUserResponseBody(this);
        } 

    } 

    public static class MFADevices extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("UserId")
        private String userId;

        private MFADevices(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.deviceType = builder.deviceType;
            this.effectiveTime = builder.effectiveTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MFADevices create() {
            return builder().build();
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
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private String deviceType; 
            private String effectiveTime; 
            private String userId; 

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
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MFADevices build() {
                return new MFADevices(this);
            } 

        } 

    }
}
