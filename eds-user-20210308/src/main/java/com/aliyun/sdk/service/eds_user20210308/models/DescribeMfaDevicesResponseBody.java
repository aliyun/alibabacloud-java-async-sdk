// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMfaDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMfaDevicesResponseBody</p>
 */
public class DescribeMfaDevicesResponseBody extends TeaModel {
    @NameInMap("MfaDevices")
    private java.util.List < MfaDevices> mfaDevices;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMfaDevicesResponseBody(Builder builder) {
        this.mfaDevices = builder.mfaDevices;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMfaDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return mfaDevices
     */
    public java.util.List < MfaDevices> getMfaDevices() {
        return this.mfaDevices;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MfaDevices> mfaDevices; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details about the virtual MFA devices.
         */
        public Builder mfaDevices(java.util.List < MfaDevices> mfaDevices) {
            this.mfaDevices = mfaDevices;
            return this;
        }

        /**
         * The token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMfaDevicesResponseBody build() {
            return new DescribeMfaDevicesResponseBody(this);
        } 

    } 

    public static class MfaDevices extends TeaModel {
        @NameInMap("ConsecutiveFails")
        private Integer consecutiveFails;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("Email")
        private String email;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("GmtEnabled")
        private String gmtEnabled;

        @NameInMap("GmtUnlock")
        private String gmtUnlock;

        @NameInMap("Id")
        private Long id;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
        private String status;

        private MfaDevices(Builder builder) {
            this.consecutiveFails = builder.consecutiveFails;
            this.deviceType = builder.deviceType;
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.gmtEnabled = builder.gmtEnabled;
            this.gmtUnlock = builder.gmtUnlock;
            this.id = builder.id;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MfaDevices create() {
            return builder().build();
        }

        /**
         * @return consecutiveFails
         */
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return gmtEnabled
         */
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

        /**
         * @return gmtUnlock
         */
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer consecutiveFails; 
            private String deviceType; 
            private String email; 
            private String endUserId; 
            private String gmtEnabled; 
            private String gmtUnlock; 
            private Long id; 
            private String serialNumber; 
            private String status; 

            /**
             * The number of consecutive failures to bind the virtual MFA device, or the number of MFA failures based on the virtual MFA device.
             */
            public Builder consecutiveFails(Integer consecutiveFails) {
                this.consecutiveFails = consecutiveFails;
                return this;
            }

            /**
             * The types of the virtual MFA device. Set the value to TOTP_VIRTUAL, which indicates that the virtual MFA devices follow the Time-based One-time Password (TOTP) algorithm.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * This parameter is unavailable.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The username of the convenience user that uses the virtual MFA device.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The time when the virtual MFA device was enabled. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder gmtEnabled(String gmtEnabled) {
                this.gmtEnabled = gmtEnabled;
                return this;
            }

            /**
             * The time when a locked virtual MFA device is automatically unlocked. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder gmtUnlock(String gmtUnlock) {
                this.gmtUnlock = gmtUnlock;
                return this;
            }

            /**
             * This parameter is unavailable.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The serial number of the virtual MFA device, which is a unique identifier.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The status of the virtual MFA device. Valid values:
             * <p>
             * 
             * *   UNBOUND
             * *   NORMAL
             * *   LOCKED
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MfaDevices build() {
                return new MfaDevices(this);
            } 

        } 

    }
}
