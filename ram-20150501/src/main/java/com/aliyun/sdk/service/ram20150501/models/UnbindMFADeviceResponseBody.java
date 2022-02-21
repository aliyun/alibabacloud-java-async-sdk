// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindMFADeviceResponseBody</p>
 */
public class UnbindMFADeviceResponseBody extends TeaModel {
    @NameInMap("MFADevice")
    private MFADevice MFADevice;

    @NameInMap("RequestId")
    private String requestId;

    private UnbindMFADeviceResponseBody(Builder builder) {
        this.MFADevice = builder.MFADevice;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindMFADeviceResponseBody create() {
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
         * MFADevice.
         */
        public Builder MFADevice(MFADevice MFADevice) {
            this.MFADevice = MFADevice;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindMFADeviceResponseBody build() {
            return new UnbindMFADeviceResponseBody(this);
        } 

    } 

    public static class MFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        private String serialNumber;

        private MFADevice(Builder builder) {
            this.serialNumber = builder.serialNumber;
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

        public static final class Builder {
            private String serialNumber; 

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            public MFADevice build() {
                return new MFADevice(this);
            } 

        } 

    }
}
