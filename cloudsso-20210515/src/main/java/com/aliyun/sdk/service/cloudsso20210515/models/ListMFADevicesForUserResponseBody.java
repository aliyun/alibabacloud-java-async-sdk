// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMFADevicesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListMFADevicesForUserResponseBody</p>
 */
public class ListMFADevicesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFADevices")
    private java.util.List < MFADevices> MFADevices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
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
         * <p>The MFA devices.</p>
         */
        public Builder MFADevices(java.util.List < MFADevices> MFADevices) {
            this.MFADevices = MFADevices;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8B9982ED-FD0D-5622-8EA0-7B768685DCE7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of MFA devices.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListMFADevicesForUserResponseBody build() {
            return new ListMFADevicesForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMFADevicesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListMFADevicesForUserResponseBody</p>
     */
    public static class MFADevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The ID of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>mfa-00ujhet8pycljj7j****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The name of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice-MFA1</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The type of the MFA device. The value is fixed as TOTP, which indicates a virtual MFA device. Virtual MFA devices are based on the Time-based One-time Password (TOTP) algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>TOTP</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The time when the MFA device was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-29T09:14:06Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>u-00q8wbq42wiltcrk****</p>
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
