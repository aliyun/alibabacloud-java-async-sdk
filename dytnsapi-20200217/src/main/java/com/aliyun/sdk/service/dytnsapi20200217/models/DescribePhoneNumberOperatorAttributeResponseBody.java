// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberOperatorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeResponseBody</p>
 */
public class DescribePhoneNumberOperatorAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberOperatorAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   **OK**: The request is successful.
         * *   **InvalidParameter**: The specified phone number is invalid or the parameter format is invalid.
         * *   **PhoneNumberNotfound**: No attribute information can be found for the specified phone number.
         * *   **isp.UNKNOWN**: An unknown exception occurred.
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberOperatorAttributeResponseBody build() {
            return new DescribePhoneNumberOperatorAttributeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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
             * *   **China Broadnet**
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
