// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
 *
 * <p>HotelSuggestV2ResponseBody</p>
 */
public class HotelSuggestV2ResponseBody extends TeaModel {
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

    private HotelSuggestV2ResponseBody(Builder builder) {
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

    public static HotelSuggestV2ResponseBody create() {
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

        public HotelSuggestV2ResponseBody build() {
            return new HotelSuggestV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class GuessSuggestInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private Integer cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("display_name")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("region")
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("type_desc")
        private String typeDesc;

        private GuessSuggestInfos(Builder builder) {
            this.address = builder.address;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.displayName = builder.displayName;
            this.hotelId = builder.hotelId;
            this.icon = builder.icon;
            this.point = builder.point;
            this.price = builder.price;
            this.region = builder.region;
            this.type = builder.type;
            this.typeDesc = builder.typeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuessSuggestInfos create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cityCode
         */
        public Integer getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeDesc
         */
        public String getTypeDesc() {
            return this.typeDesc;
        }

        public static final class Builder {
            private String address; 
            private Integer cityCode; 
            private String cityName; 
            private String displayName; 
            private String hotelId; 
            private String icon; 
            private String point; 
            private String price; 
            private Integer region; 
            private Integer type; 
            private String typeDesc; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(Integer cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * display_name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * region.
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * type_desc.
             */
            public Builder typeDesc(String typeDesc) {
                this.typeDesc = typeDesc;
                return this;
            }

            public GuessSuggestInfos build() {
                return new GuessSuggestInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class BusinessAreaWithCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private Integer cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("display_name")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("region")
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("type_desc")
        private String typeDesc;

        private BusinessAreaWithCity(Builder builder) {
            this.address = builder.address;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.displayName = builder.displayName;
            this.hotelId = builder.hotelId;
            this.icon = builder.icon;
            this.point = builder.point;
            this.price = builder.price;
            this.region = builder.region;
            this.type = builder.type;
            this.typeDesc = builder.typeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessAreaWithCity create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cityCode
         */
        public Integer getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeDesc
         */
        public String getTypeDesc() {
            return this.typeDesc;
        }

        public static final class Builder {
            private String address; 
            private Integer cityCode; 
            private String cityName; 
            private String displayName; 
            private String hotelId; 
            private String icon; 
            private String point; 
            private String price; 
            private Integer region; 
            private Integer type; 
            private String typeDesc; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(Integer cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * display_name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * region.
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * type_desc.
             */
            public Builder typeDesc(String typeDesc) {
                this.typeDesc = typeDesc;
                return this;
            }

            public BusinessAreaWithCity build() {
                return new BusinessAreaWithCity(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class KeywordSuggestInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("business_area_with_city")
        private java.util.List < BusinessAreaWithCity> businessAreaWithCity;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private Integer cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("display_name")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("region")
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("type_desc")
        private String typeDesc;

        private KeywordSuggestInfos(Builder builder) {
            this.address = builder.address;
            this.businessAreaWithCity = builder.businessAreaWithCity;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.displayName = builder.displayName;
            this.hotelId = builder.hotelId;
            this.icon = builder.icon;
            this.point = builder.point;
            this.price = builder.price;
            this.region = builder.region;
            this.type = builder.type;
            this.typeDesc = builder.typeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordSuggestInfos create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return businessAreaWithCity
         */
        public java.util.List < BusinessAreaWithCity> getBusinessAreaWithCity() {
            return this.businessAreaWithCity;
        }

        /**
         * @return cityCode
         */
        public Integer getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeDesc
         */
        public String getTypeDesc() {
            return this.typeDesc;
        }

        public static final class Builder {
            private String address; 
            private java.util.List < BusinessAreaWithCity> businessAreaWithCity; 
            private Integer cityCode; 
            private String cityName; 
            private String displayName; 
            private String hotelId; 
            private String icon; 
            private String point; 
            private String price; 
            private Integer region; 
            private Integer type; 
            private String typeDesc; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * business_area_with_city.
             */
            public Builder businessAreaWithCity(java.util.List < BusinessAreaWithCity> businessAreaWithCity) {
                this.businessAreaWithCity = businessAreaWithCity;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(Integer cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * display_name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * region.
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * type_desc.
             */
            public Builder typeDesc(String typeDesc) {
                this.typeDesc = typeDesc;
                return this;
            }

            public KeywordSuggestInfos build() {
                return new KeywordSuggestInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class PopularInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("display_name")
        private String displayName;

        private PopularInfos(Builder builder) {
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopularInfos create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String displayName; 

            /**
             * display_name.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public PopularInfos build() {
                return new PopularInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class PopularSuggestInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("popular_infos")
        private java.util.List < PopularInfos> popularInfos;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private PopularSuggestInfos(Builder builder) {
            this.icon = builder.icon;
            this.popularInfos = builder.popularInfos;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopularSuggestInfos create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return popularInfos
         */
        public java.util.List < PopularInfos> getPopularInfos() {
            return this.popularInfos;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String icon; 
            private java.util.List < PopularInfos> popularInfos; 
            private String title; 

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * popular_infos.
             */
            public Builder popularInfos(java.util.List < PopularInfos> popularInfos) {
                this.popularInfos = popularInfos;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public PopularSuggestInfos build() {
                return new PopularSuggestInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSuggestV2ResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSuggestV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("guess_suggest_infos")
        private java.util.List < GuessSuggestInfos> guessSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("keyword_suggest_infos")
        private java.util.List < KeywordSuggestInfos> keywordSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("popular_suggest_infos")
        private java.util.List < PopularSuggestInfos> popularSuggestInfos;

        @com.aliyun.core.annotation.NameInMap("tips")
        private String tips;

        private Module(Builder builder) {
            this.guessSuggestInfos = builder.guessSuggestInfos;
            this.keywordSuggestInfos = builder.keywordSuggestInfos;
            this.popularSuggestInfos = builder.popularSuggestInfos;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return guessSuggestInfos
         */
        public java.util.List < GuessSuggestInfos> getGuessSuggestInfos() {
            return this.guessSuggestInfos;
        }

        /**
         * @return keywordSuggestInfos
         */
        public java.util.List < KeywordSuggestInfos> getKeywordSuggestInfos() {
            return this.keywordSuggestInfos;
        }

        /**
         * @return popularSuggestInfos
         */
        public java.util.List < PopularSuggestInfos> getPopularSuggestInfos() {
            return this.popularSuggestInfos;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private java.util.List < GuessSuggestInfos> guessSuggestInfos; 
            private java.util.List < KeywordSuggestInfos> keywordSuggestInfos; 
            private java.util.List < PopularSuggestInfos> popularSuggestInfos; 
            private String tips; 

            /**
             * guess_suggest_infos.
             */
            public Builder guessSuggestInfos(java.util.List < GuessSuggestInfos> guessSuggestInfos) {
                this.guessSuggestInfos = guessSuggestInfos;
                return this;
            }

            /**
             * keyword_suggest_infos.
             */
            public Builder keywordSuggestInfos(java.util.List < KeywordSuggestInfos> keywordSuggestInfos) {
                this.keywordSuggestInfos = keywordSuggestInfos;
                return this;
            }

            /**
             * popular_suggest_infos.
             */
            public Builder popularSuggestInfos(java.util.List < PopularSuggestInfos> popularSuggestInfos) {
                this.popularSuggestInfos = popularSuggestInfos;
                return this;
            }

            /**
             * tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
