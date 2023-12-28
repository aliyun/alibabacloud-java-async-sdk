// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAttributeResponseBody</p>
 */
public class DescribePhoneNumberAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PhoneNumberAttribute")
    private PhoneNumberAttribute phoneNumberAttribute;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.phoneNumberAttribute = builder.phoneNumberAttribute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return phoneNumberAttribute
     */
    public PhoneNumberAttribute getPhoneNumberAttribute() {
        return this.phoneNumberAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private PhoneNumberAttribute phoneNumberAttribute; 
        private String requestId; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   **OK**: The request is successful.
         * *   **InvalidParameter**: The specified phone number is invalid or the parameter format is invalid.
         * *   **PhoneNumberNotfound**: No attribute information can be found for the specified phone number.
         * *   **isp.UNKNOWN**: An unknown exception occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The attribute information about the phone number.
         */
        public Builder phoneNumberAttribute(PhoneNumberAttribute phoneNumberAttribute) {
            this.phoneNumberAttribute = phoneNumberAttribute;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberAttributeResponseBody build() {
            return new DescribePhoneNumberAttributeResponseBody(this);
        } 

    } 

    public static class PhoneNumberAttribute extends TeaModel {
        @NameInMap("BasicCarrier")
        private String basicCarrier;

        @NameInMap("Carrier")
        private String carrier;

        @NameInMap("City")
        private String city;

        @NameInMap("IsNumberPortability")
        private Boolean isNumberPortability;

        @NameInMap("NumberSegment")
        private Long numberSegment;

        @NameInMap("Province")
        private String province;

        private PhoneNumberAttribute(Builder builder) {
            this.basicCarrier = builder.basicCarrier;
            this.carrier = builder.carrier;
            this.city = builder.city;
            this.isNumberPortability = builder.isNumberPortability;
            this.numberSegment = builder.numberSegment;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumberAttribute create() {
            return builder().build();
        }

        /**
         * @return basicCarrier
         */
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return isNumberPortability
         */
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        /**
         * @return numberSegment
         */
        public Long getNumberSegment() {
            return this.numberSegment;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String basicCarrier; 
            private String carrier; 
            private String city; 
            private Boolean isNumberPortability; 
            private Long numberSegment; 
            private String province; 

            /**
             * The basic carrier. Valid values:
             * <p>
             * 
             * *   **China Mobile**
             * *   **China Unicom**
             * *   **China Telecom**
             */
            public Builder basicCarrier(String basicCarrier) {
                this.basicCarrier = basicCarrier;
                return this;
            }

            /**
             * The actual carrier, including the virtual network operator (VNO). If the phone number involves mobile number portability, the value of this parameter is the carrier after mobile number portability.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * The city where the phone number is registered.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Indicates whether the phone number involves mobile number portability. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isNumberPortability(Boolean isNumberPortability) {
                this.isNumberPortability = isNumberPortability;
                return this;
            }

            /**
             * The number segment to which the phone number belongs.
             */
            public Builder numberSegment(Long numberSegment) {
                this.numberSegment = numberSegment;
                return this;
            }

            /**
             * The province where the phone number is registered.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public PhoneNumberAttribute build() {
                return new PhoneNumberAttribute(this);
            } 

        } 

    }
}
