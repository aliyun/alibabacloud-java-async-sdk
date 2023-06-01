// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelSearchResponseBody} extends {@link TeaModel}
 *
 * <p>HotelSearchResponseBody</p>
 */
public class HotelSearchResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private HotelSearchResponseBody(Builder builder) {
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

    public static HotelSearchResponseBody create() {
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

        public HotelSearchResponseBody build() {
            return new HotelSearchResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("brand_name")
        private String brandName;

        @NameInMap("btand_code")
        private String btandCode;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("distance")
        private Integer distance;

        @NameInMap("district_code")
        private String districtCode;

        @NameInMap("hotel_address")
        private String hotelAddress;

        @NameInMap("hotel_code")
        private String hotelCode;

        @NameInMap("hotel_en_name")
        private String hotelEnName;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("hotel_star")
        private String hotelStar;

        @NameInMap("image_url")
        private String imageUrl;

        @NameInMap("is_protocol")
        private Boolean isProtocol;

        @NameInMap("location")
        private String location;

        @NameInMap("min_price")
        private Double minPrice;

        @NameInMap("original_min_price")
        private Double originalMinPrice;

        @NameInMap("score")
        private String score;

        @NameInMap("status")
        private Integer status;

        @NameInMap("tel")
        private String tel;

        private Items(Builder builder) {
            this.brandName = builder.brandName;
            this.btandCode = builder.btandCode;
            this.cityCode = builder.cityCode;
            this.distance = builder.distance;
            this.districtCode = builder.districtCode;
            this.hotelAddress = builder.hotelAddress;
            this.hotelCode = builder.hotelCode;
            this.hotelEnName = builder.hotelEnName;
            this.hotelName = builder.hotelName;
            this.hotelStar = builder.hotelStar;
            this.imageUrl = builder.imageUrl;
            this.isProtocol = builder.isProtocol;
            this.location = builder.location;
            this.minPrice = builder.minPrice;
            this.originalMinPrice = builder.originalMinPrice;
            this.score = builder.score;
            this.status = builder.status;
            this.tel = builder.tel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return btandCode
         */
        public String getBtandCode() {
            return this.btandCode;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return distance
         */
        public Integer getDistance() {
            return this.distance;
        }

        /**
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
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
         * @return hotelEnName
         */
        public String getHotelEnName() {
            return this.hotelEnName;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelStar
         */
        public String getHotelStar() {
            return this.hotelStar;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
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

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tel
         */
        public String getTel() {
            return this.tel;
        }

        public static final class Builder {
            private String brandName; 
            private String btandCode; 
            private String cityCode; 
            private Integer distance; 
            private String districtCode; 
            private String hotelAddress; 
            private String hotelCode; 
            private String hotelEnName; 
            private String hotelName; 
            private String hotelStar; 
            private String imageUrl; 
            private Boolean isProtocol; 
            private String location; 
            private Double minPrice; 
            private Double originalMinPrice; 
            private String score; 
            private Integer status; 
            private String tel; 

            /**
             * 品牌名称
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * 品牌code
             */
            public Builder btandCode(String btandCode) {
                this.btandCode = btandCode;
                return this;
            }

            /**
             * 城市Code
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 位置距离 单位：米
             */
            public Builder distance(Integer distance) {
                this.distance = distance;
                return this;
            }

            /**
             * 行政区code
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * 酒店地址
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * 酒店code
             */
            public Builder hotelCode(String hotelCode) {
                this.hotelCode = hotelCode;
                return this;
            }

            /**
             * 酒店英文名称
             */
            public Builder hotelEnName(String hotelEnName) {
                this.hotelEnName = hotelEnName;
                return this;
            }

            /**
             * 酒店名称
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * 酒店星级
             */
            public Builder hotelStar(String hotelStar) {
                this.hotelStar = hotelStar;
                return this;
            }

            /**
             * 酒店主图
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * 是否是协议价
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * 酒店经纬度
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * 酒店起价
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

            /**
             * 评分
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * 房态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 酒店电话
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("items")
        private java.util.List < Items> items;

        private Module(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
