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
         * mfa device list
         */
        public Builder mfaDevices(java.util.List < MfaDevices> mfaDevices) {
            this.mfaDevices = mfaDevices;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
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
             * ConsecutiveFails.
             */
            public Builder consecutiveFails(Integer consecutiveFails) {
                this.consecutiveFails = consecutiveFails;
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
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * GmtEnabled.
             */
            public Builder gmtEnabled(String gmtEnabled) {
                this.gmtEnabled = gmtEnabled;
                return this;
            }

            /**
             * GmtUnlock.
             */
            public Builder gmtUnlock(String gmtUnlock) {
                this.gmtUnlock = gmtUnlock;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
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
