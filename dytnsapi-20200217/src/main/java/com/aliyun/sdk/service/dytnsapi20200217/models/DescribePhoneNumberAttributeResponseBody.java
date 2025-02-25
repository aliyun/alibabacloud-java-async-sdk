// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribePhoneNumberAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAttributeResponseBody</p>
 */
public class DescribePhoneNumberAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumberAttribute")
    private PhoneNumberAttribute phoneNumberAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>InvalidParameter</strong>: The specified phone number is invalid or the parameter format is invalid.</li>
         * <li><strong>PhoneNumberNotfound</strong>: No attribute information can be found for the specified phone number.</li>
         * <li><strong>isp.UNKNOWN</strong>: An unknown exception occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The attribute information about the phone number.</p>
         */
        public Builder phoneNumberAttribute(PhoneNumberAttribute phoneNumberAttribute) {
            this.phoneNumberAttribute = phoneNumberAttribute;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberAttributeResponseBody build() {
            return new DescribePhoneNumberAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneNumberAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneNumberAttributeResponseBody</p>
     */
    public static class PhoneNumberAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicCarrier")
        private String basicCarrier;

        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("IsNumberPortability")
        private Boolean isNumberPortability;

        @com.aliyun.core.annotation.NameInMap("NumberSegment")
        private Long numberSegment;

        @com.aliyun.core.annotation.NameInMap("Province")
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
             * <p>The basic carrier. Valid values:</p>
             * <ul>
             * <li><strong>China Mobile</strong></li>
             * <li><strong>China Unicom</strong></li>
             * <li><strong>China Telecom</strong></li>
             * </ul>
             */
            public Builder basicCarrier(String basicCarrier) {
                this.basicCarrier = basicCarrier;
                return this;
            }

            /**
             * <p>The actual carrier, including the virtual network operator (VNO). If the phone number involves mobile number portability, the value of this parameter is the carrier after mobile number portability.</p>
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * <p>The city where the phone number is registered.</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>Indicates whether the phone number involves mobile number portability. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isNumberPortability(Boolean isNumberPortability) {
                this.isNumberPortability = isNumberPortability;
                return this;
            }

            /**
             * <p>The number segment to which the phone number belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>139</p>
             */
            public Builder numberSegment(Long numberSegment) {
                this.numberSegment = numberSegment;
                return this;
            }

            /**
             * <p>The province where the phone number is registered.</p>
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
