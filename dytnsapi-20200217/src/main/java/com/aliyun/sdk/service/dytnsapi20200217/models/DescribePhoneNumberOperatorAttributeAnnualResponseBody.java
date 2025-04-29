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
 * {@link DescribePhoneNumberOperatorAttributeAnnualResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeAnnualResponseBody</p>
 */
public class DescribePhoneNumberOperatorAttributeAnnualResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribePhoneNumberOperatorAttributeAnnualResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeAnnualResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribePhoneNumberOperatorAttributeAnnualResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBody build() {
            return new DescribePhoneNumberOperatorAttributeAnnualResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneNumberOperatorAttributeAnnualResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneNumberOperatorAttributeAnnualResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicCarrier")
        private String basicCarrier;

        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Mts")
        private String mts;

        @com.aliyun.core.annotation.NameInMap("NumberPortability")
        private Boolean numberPortability;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private Data(Builder builder) {
            this.basicCarrier = builder.basicCarrier;
            this.carrier = builder.carrier;
            this.city = builder.city;
            this.mts = builder.mts;
            this.numberPortability = builder.numberPortability;
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
         * @return mts
         */
        public String getMts() {
            return this.mts;
        }

        /**
         * @return numberPortability
         */
        public Boolean getNumberPortability() {
            return this.numberPortability;
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
            private String mts; 
            private Boolean numberPortability; 
            private String province; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.basicCarrier = model.basicCarrier;
                this.carrier = model.carrier;
                this.city = model.city;
                this.mts = model.mts;
                this.numberPortability = model.numberPortability;
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
             * Mts.
             */
            public Builder mts(String mts) {
                this.mts = mts;
                return this;
            }

            /**
             * NumberPortability.
             */
            public Builder numberPortability(Boolean numberPortability) {
                this.numberPortability = numberPortability;
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
