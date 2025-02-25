// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>The information of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
             * <p>The name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:mfa/device002</p>
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
