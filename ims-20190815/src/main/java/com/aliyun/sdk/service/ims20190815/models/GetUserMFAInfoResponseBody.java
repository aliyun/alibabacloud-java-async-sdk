// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserMFAInfoResponseBody</p>
 */
public class GetUserMFAInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsMFAEnable")
    private Boolean isMFAEnable;

    @com.aliyun.core.annotation.NameInMap("MFADevice")
    private MFADevice MFADevice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserMFAInfoResponseBody(Builder builder) {
        this.isMFAEnable = builder.isMFAEnable;
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
     * @return isMFAEnable
     */
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
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
        private Boolean isMFAEnable; 
        private MFADevice MFADevice; 
        private String requestId; 

        /**
         * <p>Indicates whether the MFA device is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isMFAEnable(Boolean isMFAEnable) {
            this.isMFAEnable = isMFAEnable;
            return this;
        }

        /**
         * <p>The information about the MFA device.</p>
         */
        public Builder MFADevice(MFADevice MFADevice) {
            this.MFADevice = MFADevice;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FCF7322A-20A9-4F68-8B7F-F86958839BC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserMFAInfoResponseBody build() {
            return new GetUserMFAInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserMFAInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserMFAInfoResponseBody</p>
     */
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
             * <p>The serial number of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::177242285274****:mfa/device001</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The type of the MFA device. Valid values:</p>
             * <ul>
             * <li>VMFA: virtual MFA device</li>
             * <li>U2F: Universal 2nd Factor (U2F) security key</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VMFA</p>
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
