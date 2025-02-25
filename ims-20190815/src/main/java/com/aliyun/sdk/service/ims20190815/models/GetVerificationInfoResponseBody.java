// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B182C041-8C64-5F2F-A07B-FC67FAF89CF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the email.</p>
         */
        public Builder securityEmailDevice(SecurityEmailDevice securityEmailDevice) {
            this.securityEmailDevice = securityEmailDevice;
            return this;
        }

        /**
         * <p>The information about the mobile phone.</p>
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
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The status of the email. Valid values:</p>
             * <ul>
             * <li>active: The email is activated.</li>
             * <li>pending: The email is pending for activation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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
             * <p>The international dialing code.</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>13900001234</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The status of the mobile phone. Valid values:</p>
             * <ul>
             * <li>active: The mobile phone is activated.</li>
             * <li>pending: The mobile phone is pending for activation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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
