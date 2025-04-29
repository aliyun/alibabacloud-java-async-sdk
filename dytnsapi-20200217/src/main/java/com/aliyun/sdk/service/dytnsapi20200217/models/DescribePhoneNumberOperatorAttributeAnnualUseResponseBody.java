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
 * {@link DescribePhoneNumberOperatorAttributeAnnualUseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeAnnualUseResponseBody</p>
 */
public class DescribePhoneNumberOperatorAttributeAnnualUseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberOperatorAttributeAnnualUseResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeAnnualUseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePhoneNumberOperatorAttributeAnnualUseResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody build() {
            return new DescribePhoneNumberOperatorAttributeAnnualUseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneNumberOperatorAttributeAnnualUseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneNumberOperatorAttributeAnnualUseResponseBody</p>
     */
    public static class Data extends TeaModel {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.basicCarrier = model.basicCarrier;
                this.carrier = model.carrier;
                this.city = model.city;
                this.isNumberPortability = model.isNumberPortability;
                this.numberSegment = model.numberSegment;
                this.province = model.province;
            } 

            /**
             * BasicCarrier.
             */
            public Builder basicCarrier(String basicCarrier) {
                this.basicCarrier = basicCarrier;
                return this;
            }

            /**
             * Carrier.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * IsNumberPortability.
             */
            public Builder isNumberPortability(Boolean isNumberPortability) {
                this.isNumberPortability = isNumberPortability;
                return this;
            }

            /**
             * NumberSegment.
             */
            public Builder numberSegment(Long numberSegment) {
                this.numberSegment = numberSegment;
                return this;
            }

            /**
             * Province.
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
