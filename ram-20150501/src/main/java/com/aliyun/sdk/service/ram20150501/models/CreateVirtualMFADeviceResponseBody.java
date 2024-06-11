// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualMFADeviceResponseBody</p>
 */
public class CreateVirtualMFADeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualMFADevice")
    private VirtualMFADevice virtualMFADevice;

    private CreateVirtualMFADeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualMFADevice = builder.virtualMFADevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualMFADeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualMFADevice
     */
    public VirtualMFADevice getVirtualMFADevice() {
        return this.virtualMFADevice;
    }

    public static final class Builder {
        private String requestId; 
        private VirtualMFADevice virtualMFADevice; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the MFA device.
         */
        public Builder virtualMFADevice(VirtualMFADevice virtualMFADevice) {
            this.virtualMFADevice = virtualMFADevice;
            return this;
        }

        public CreateVirtualMFADeviceResponseBody build() {
            return new CreateVirtualMFADeviceResponseBody(this);
        } 

    } 

    public static class VirtualMFADevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Base32StringSeed")
        private String base32StringSeed;

        @com.aliyun.core.annotation.NameInMap("QRCodePNG")
        private String QRCodePNG;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        private VirtualMFADevice(Builder builder) {
            this.base32StringSeed = builder.base32StringSeed;
            this.QRCodePNG = builder.QRCodePNG;
            this.serialNumber = builder.serialNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualMFADevice create() {
            return builder().build();
        }

        /**
         * @return base32StringSeed
         */
        public String getBase32StringSeed() {
            return this.base32StringSeed;
        }

        /**
         * @return QRCodePNG
         */
        public String getQRCodePNG() {
            return this.QRCodePNG;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public static final class Builder {
            private String base32StringSeed; 
            private String QRCodePNG; 
            private String serialNumber; 

            /**
             * The key of the MFA device.
             */
            public Builder base32StringSeed(String base32StringSeed) {
                this.base32StringSeed = base32StringSeed;
                return this;
            }

            /**
             * The Base64-encoded QR code, in the PNG format.
             */
            public Builder QRCodePNG(String QRCodePNG) {
                this.QRCodePNG = QRCodePNG;
                return this;
            }

            /**
             * The serial number of the MFA device.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            public VirtualMFADevice build() {
                return new VirtualMFADevice(this);
            } 

        } 

    }
}
