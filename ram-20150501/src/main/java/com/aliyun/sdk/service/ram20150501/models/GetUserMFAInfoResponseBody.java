// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserMFAInfoResponseBody</p>
 */
public class GetUserMFAInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFADevice")
    private MFADevice MFADevice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserMFAInfoResponseBody(Builder builder) {
        this.MFADevice = builder.MFADevice;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMFAInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return MFADevice
     */
    public MFADevice getMFADevice() {
        return this.MFADevice;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MFADevice MFADevice; 
        private String requestId; 

        /**
         * The information about the MFA device that is attached to the RAM user.
         */
        public Builder MFADevice(MFADevice MFADevice) {
            this.MFADevice = MFADevice;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserMFAInfoResponseBody build() {
            return new GetUserMFAInfoResponseBody(this);
        } 

    } 

    public static class MFADevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MFADevice(Builder builder) {
            this.serialNumber = builder.serialNumber;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MFADevice create() {
            return builder().build();
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String serialNumber; 
            private String type; 

            /**
             * The serial number of the MFA device.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The type of the MFA device. Valid values:
             * <p>
             * 
             * *   VMFA: virtual MFA device
             * *   U2F: Universal 2nd Factor (U2F) security key
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MFADevice build() {
                return new MFADevice(this);
            } 

        } 

    }
}
