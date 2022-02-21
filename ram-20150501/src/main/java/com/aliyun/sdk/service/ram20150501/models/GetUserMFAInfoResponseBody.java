// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserMFAInfoResponseBody</p>
 */
public class GetUserMFAInfoResponseBody extends TeaModel {
    @NameInMap("MFADevice")
    private MFADevice MFADevice;

    @NameInMap("RequestId")
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

        public GetUserMFAInfoResponseBody build() {
            return new GetUserMFAInfoResponseBody(this);
        } 

    } 

    public static class MFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Type")
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
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Type.
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
