// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVerificationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVerificationInfoResponseBody</p>
 */
public class GetVerificationInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEmailDevice")
    private SecurityEmailDevice securityEmailDevice;

    @com.aliyun.core.annotation.NameInMap("SecurityPhoneDevice")
    private SecurityPhoneDevice securityPhoneDevice;

    private GetVerificationInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEmailDevice = builder.securityEmailDevice;
        this.securityPhoneDevice = builder.securityPhoneDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVerificationInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEmailDevice
     */
    public SecurityEmailDevice getSecurityEmailDevice() {
        return this.securityEmailDevice;
    }

    /**
     * @return securityPhoneDevice
     */
    public SecurityPhoneDevice getSecurityPhoneDevice() {
        return this.securityPhoneDevice;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityEmailDevice securityEmailDevice; 
        private SecurityPhoneDevice securityPhoneDevice; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityEmailDevice.
         */
        public Builder securityEmailDevice(SecurityEmailDevice securityEmailDevice) {
            this.securityEmailDevice = securityEmailDevice;
            return this;
        }

        /**
         * SecurityPhoneDevice.
         */
        public Builder securityPhoneDevice(SecurityPhoneDevice securityPhoneDevice) {
            this.securityPhoneDevice = securityPhoneDevice;
            return this;
        }

        public GetVerificationInfoResponseBody build() {
            return new GetVerificationInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVerificationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVerificationInfoResponseBody</p>
     */
    public static class SecurityEmailDevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SecurityEmailDevice(Builder builder) {
            this.email = builder.email;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEmailDevice create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String email; 
            private String status; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SecurityEmailDevice build() {
                return new SecurityEmailDevice(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVerificationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVerificationInfoResponseBody</p>
     */
    public static class SecurityPhoneDevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SecurityPhoneDevice(Builder builder) {
            this.areaCode = builder.areaCode;
            this.phoneNumber = builder.phoneNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPhoneDevice create() {
            return builder().build();
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String areaCode; 
            private String phoneNumber; 
            private String status; 

            /**
             * AreaCode.
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SecurityPhoneDevice build() {
                return new SecurityPhoneDevice(this);
            } 

        } 

    }
}
