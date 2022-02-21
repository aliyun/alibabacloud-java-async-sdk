// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualMFADeviceResponseBody</p>
 */
public class CreateVirtualMFADeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualMFADevice")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VirtualMFADevice.
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
        @NameInMap("Base32StringSeed")
        private String base32StringSeed;

        @NameInMap("QRCodePNG")
        private String QRCodePNG;

        @NameInMap("SerialNumber")
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
             * Base32StringSeed.
             */
            public Builder base32StringSeed(String base32StringSeed) {
                this.base32StringSeed = base32StringSeed;
                return this;
            }

            /**
             * QRCodePNG.
             */
            public Builder QRCodePNG(String QRCodePNG) {
                this.QRCodePNG = QRCodePNG;
                return this;
            }

            /**
             * SerialNumber.
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
