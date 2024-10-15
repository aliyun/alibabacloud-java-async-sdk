// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelAskingPriceResponseBody} extends {@link TeaModel}
 *
 * <p>HotelAskingPriceResponseBody</p>
 */
public class HotelAskingPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelAskingPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelAskingPriceResponseBody create() {
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelAskingPriceResponseBody build() {
            return new HotelAskingPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelAskingPriceResponseBody} extends {@link TeaModel}
     *
     * <p>HotelAskingPriceResponseBody</p>
     */
    public static class HotelAskingPriceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("hotel_address")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("hotel_code")
        private String hotelCode;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("is_protocol")
        private Boolean isProtocol;

        @com.aliyun.core.annotation.NameInMap("min_price")
        private Double minPrice;

        @com.aliyun.core.annotation.NameInMap("original_min_price")
        private Double originalMinPrice;

        private HotelAskingPriceDetails(Builder builder) {
            this.cityCode = builder.cityCode;
            this.hotelAddress = builder.hotelAddress;
            this.hotelCode = builder.hotelCode;
            this.hotelName = builder.hotelName;
            this.isProtocol = builder.isProtocol;
            this.minPrice = builder.minPrice;
            this.originalMinPrice = builder.originalMinPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelAskingPriceDetails create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelCode
         */
        public String getHotelCode() {
            return this.hotelCode;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return minPrice
         */
        public Double getMinPrice() {
            return this.minPrice;
        }

        /**
         * @return originalMinPrice
         */
        public Double getOriginalMinPrice() {
            return this.originalMinPrice;
        }

        public static final class Builder {
            private String cityCode; 
            private String hotelAddress; 
            private String hotelCode; 
            private String hotelName; 
            private Boolean isProtocol; 
            private Double minPrice; 
            private Double originalMinPrice; 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * hotel_address.
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * hotel_code.
             */
            public Builder hotelCode(String hotelCode) {
                this.hotelCode = hotelCode;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * is_protocol.
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * min_price.
             */
            public Builder minPrice(Double minPrice) {
                this.minPrice = minPrice;
                return this;
            }

            /**
             * original_min_price.
             */
            public Builder originalMinPrice(Double originalMinPrice) {
                this.originalMinPrice = originalMinPrice;
                return this;
            }

            public HotelAskingPriceDetails build() {
                return new HotelAskingPriceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelAskingPriceResponseBody} extends {@link TeaModel}
     *
     * <p>HotelAskingPriceResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_asking_price_details")
        private java.util.List < HotelAskingPriceDetails> hotelAskingPriceDetails;

        private Module(Builder builder) {
            this.hotelAskingPriceDetails = builder.hotelAskingPriceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hotelAskingPriceDetails
         */
        public java.util.List < HotelAskingPriceDetails> getHotelAskingPriceDetails() {
            return this.hotelAskingPriceDetails;
        }

        public static final class Builder {
            private java.util.List < HotelAskingPriceDetails> hotelAskingPriceDetails; 

            /**
             * hotel_asking_price_details.
             */
            public Builder hotelAskingPriceDetails(java.util.List < HotelAskingPriceDetails> hotelAskingPriceDetails) {
                this.hotelAskingPriceDetails = hotelAskingPriceDetails;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
