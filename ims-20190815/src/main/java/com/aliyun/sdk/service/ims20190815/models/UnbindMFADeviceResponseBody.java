// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindMFADeviceResponseBody</p>
 */
public class UnbindMFADeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFADevice")
    private MFADevice MFADevice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information of the MFA device.</p>
         */
        public Builder MFADevice(MFADevice MFADevice) {
            this.MFADevice = MFADevice;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A26CB3E9-1021-452A-AC57-3134B3BA0E4C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindMFADeviceResponseBody build() {
            return new UnbindMFADeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UnbindMFADeviceResponseBody} extends {@link TeaModel}
     *
     * <p>UnbindMFADeviceResponseBody</p>
     */
    public static class MFADevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SerialNumber")
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
             * <p>The serial number of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::151298381312****:mfa/device001</p>
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
