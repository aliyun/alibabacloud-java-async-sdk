// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

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
 * {@link DescribeNumberHLRResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNumberHLRResponseBody</p>
 */
public class DescribeNumberHLRResponseBody extends TeaModel {
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

    private DescribeNumberHLRResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNumberHLRResponseBody create() {
        return builder().build();
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

        public DescribeNumberHLRResponseBody build() {
            return new DescribeNumberHLRResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNumberHLRResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberHLRResponseBody</p>
     */
    public static class Call extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleansedCode")
        private String cleansedCode;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Long maxLength;

        @com.aliyun.core.annotation.NameInMap("MinLength")
        private Long minLength;

        private Call(Builder builder) {
            this.cleansedCode = builder.cleansedCode;
            this.maxLength = builder.maxLength;
            this.minLength = builder.minLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Call create() {
            return builder().build();
        }

        /**
         * @return cleansedCode
         */
        public String getCleansedCode() {
            return this.cleansedCode;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return minLength
         */
        public Long getMinLength() {
            return this.minLength;
        }

        public static final class Builder {
            private String cleansedCode; 
            private Long maxLength; 
            private Long minLength; 

            /**
             * <p>call</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder cleansedCode(String cleansedCode) {
                this.cleansedCode = cleansedCode;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            public Call build() {
                return new Call(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNumberHLRResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberHLRResponseBody</p>
     */
    public static class Live extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("Roaming")
        private String roaming;

        @com.aliyun.core.annotation.NameInMap("RoamingCountry")
        private String roamingCountry;

        @com.aliyun.core.annotation.NameInMap("SubscriberStatus")
        private String subscriberStatus;

        private Live(Builder builder) {
            this.deviceStatus = builder.deviceStatus;
            this.roaming = builder.roaming;
            this.roamingCountry = builder.roamingCountry;
            this.subscriberStatus = builder.subscriberStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Live create() {
            return builder().build();
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return roaming
         */
        public String getRoaming() {
            return this.roaming;
        }

        /**
         * @return roamingCountry
         */
        public String getRoamingCountry() {
            return this.roamingCountry;
        }

        /**
         * @return subscriberStatus
         */
        public String getSubscriberStatus() {
            return this.subscriberStatus;
        }

        public static final class Builder {
            private String deviceStatus; 
            private String roaming; 
            private String roamingCountry; 
            private String subscriberStatus; 

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * Roaming.
             */
            public Builder roaming(String roaming) {
                this.roaming = roaming;
                return this;
            }

            /**
             * RoamingCountry.
             */
            public Builder roamingCountry(String roamingCountry) {
                this.roamingCountry = roamingCountry;
                return this;
            }

            /**
             * SubscriberStatus.
             */
            public Builder subscriberStatus(String subscriberStatus) {
                this.subscriberStatus = subscriberStatus;
                return this;
            }

            public Live build() {
                return new Live(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNumberHLRResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberHLRResponseBody</p>
     */
    public static class Sms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleansedCode")
        private Long cleansedCode;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Long maxLength;

        @com.aliyun.core.annotation.NameInMap("MinLength")
        private Long minLength;

        private Sms(Builder builder) {
            this.cleansedCode = builder.cleansedCode;
            this.maxLength = builder.maxLength;
            this.minLength = builder.minLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sms create() {
            return builder().build();
        }

        /**
         * @return cleansedCode
         */
        public Long getCleansedCode() {
            return this.cleansedCode;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return minLength
         */
        public Long getMinLength() {
            return this.minLength;
        }

        public static final class Builder {
            private Long cleansedCode; 
            private Long maxLength; 
            private Long minLength; 

            /**
             * <p>sms</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder cleansedCode(Long cleansedCode) {
                this.cleansedCode = cleansedCode;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            public Sms build() {
                return new Sms(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNumberHLRResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberHLRResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Blocked")
        private String blocked;

        @com.aliyun.core.annotation.NameInMap("Call")
        private Call call;

        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CountryIso3")
        private String countryIso3;

        @com.aliyun.core.annotation.NameInMap("Live")
        private Live live;

        @com.aliyun.core.annotation.NameInMap("PhoneType")
        private String phoneType;

        @com.aliyun.core.annotation.NameInMap("Sms")
        private Sms sms;

        private Data(Builder builder) {
            this.blocked = builder.blocked;
            this.call = builder.call;
            this.carrier = builder.carrier;
            this.city = builder.city;
            this.countryIso3 = builder.countryIso3;
            this.live = builder.live;
            this.phoneType = builder.phoneType;
            this.sms = builder.sms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blocked
         */
        public String getBlocked() {
            return this.blocked;
        }

        /**
         * @return call
         */
        public Call getCall() {
            return this.call;
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
         * @return countryIso3
         */
        public String getCountryIso3() {
            return this.countryIso3;
        }

        /**
         * @return live
         */
        public Live getLive() {
            return this.live;
        }

        /**
         * @return phoneType
         */
        public String getPhoneType() {
            return this.phoneType;
        }

        /**
         * @return sms
         */
        public Sms getSms() {
            return this.sms;
        }

        public static final class Builder {
            private String blocked; 
            private Call call; 
            private String carrier; 
            private String city; 
            private String countryIso3; 
            private Live live; 
            private String phoneType; 
            private Sms sms; 

            /**
             * Blocked.
             */
            public Builder blocked(String blocked) {
                this.blocked = blocked;
                return this;
            }

            /**
             * Call.
             */
            public Builder call(Call call) {
                this.call = call;
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
             * CountryIso3.
             */
            public Builder countryIso3(String countryIso3) {
                this.countryIso3 = countryIso3;
                return this;
            }

            /**
             * Live.
             */
            public Builder live(Live live) {
                this.live = live;
                return this;
            }

            /**
             * PhoneType.
             */
            public Builder phoneType(String phoneType) {
                this.phoneType = phoneType;
                return this;
            }

            /**
             * Sms.
             */
            public Builder sms(Sms sms) {
                this.sms = sms;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
