// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelSearchResponseBody} extends {@link TeaModel}
 *
 * <p>HotelSearchResponseBody</p>
 */
public class HotelSearchResponseBody extends TeaModel {
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

        private Builder() {
        } 

        private Builder(HotelSearchResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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

    /**
     * 
     * {@link HotelSearchResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSearchResponseBody</p>
     */
    public static class DiscountDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label_name")
        private java.util.List<String> labelName;

        @com.aliyun.core.annotation.NameInMap("money_desc")
        private String moneyDesc;

        private DiscountDetail(Builder builder) {
            this.labelName = builder.labelName;
            this.moneyDesc = builder.moneyDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscountDetail create() {
            return builder().build();
        }

        /**
         * @return labelName
         */
        public java.util.List<String> getLabelName() {
            return this.labelName;
        }

        /**
         * @return moneyDesc
         */
        public String getMoneyDesc() {
            return this.moneyDesc;
        }

        public static final class Builder {
            private java.util.List<String> labelName; 
            private String moneyDesc; 

            private Builder() {
            } 

            private Builder(DiscountDetail model) {
                this.labelName = model.labelName;
                this.moneyDesc = model.moneyDesc;
            } 

            /**
             * label_name.
             */
            public Builder labelName(java.util.List<String> labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * money_desc.
             */
            public Builder moneyDesc(String moneyDesc) {
                this.moneyDesc = moneyDesc;
                return this;
            }

            public DiscountDetail build() {
                return new DiscountDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSearchResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSearchResponseBody</p>
     */
    public static class DiscountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cash_reduce_total")
        private String cashReduceTotal;

        @com.aliyun.core.annotation.NameInMap("dinamic_label")
        private String dinamicLabel;

        @com.aliyun.core.annotation.NameInMap("discount_detail")
        private java.util.List<DiscountDetail> discountDetail;

        @com.aliyun.core.annotation.NameInMap("sub_title")
        private String subTitle;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private DiscountDesc(Builder builder) {
            this.cashReduceTotal = builder.cashReduceTotal;
            this.dinamicLabel = builder.dinamicLabel;
            this.discountDetail = builder.discountDetail;
            this.subTitle = builder.subTitle;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscountDesc create() {
            return builder().build();
        }

        /**
         * @return cashReduceTotal
         */
        public String getCashReduceTotal() {
            return this.cashReduceTotal;
        }

        /**
         * @return dinamicLabel
         */
        public String getDinamicLabel() {
            return this.dinamicLabel;
        }

        /**
         * @return discountDetail
         */
        public java.util.List<DiscountDetail> getDiscountDetail() {
            return this.discountDetail;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cashReduceTotal; 
            private String dinamicLabel; 
            private java.util.List<DiscountDetail> discountDetail; 
            private String subTitle; 
            private String title; 

            private Builder() {
            } 

            private Builder(DiscountDesc model) {
                this.cashReduceTotal = model.cashReduceTotal;
                this.dinamicLabel = model.dinamicLabel;
                this.discountDetail = model.discountDetail;
                this.subTitle = model.subTitle;
                this.title = model.title;
            } 

            /**
             * cash_reduce_total.
             */
            public Builder cashReduceTotal(String cashReduceTotal) {
                this.cashReduceTotal = cashReduceTotal;
                return this;
            }

            /**
             * dinamic_label.
             */
            public Builder dinamicLabel(String dinamicLabel) {
                this.dinamicLabel = dinamicLabel;
                return this;
            }

            /**
             * discount_detail.
             */
            public Builder discountDetail(java.util.List<DiscountDetail> discountDetail) {
                this.discountDetail = discountDetail;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DiscountDesc build() {
                return new DiscountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelSearchResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSearchResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("brand_name")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("btand_code")
        private String btandCode;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("discount_desc")
        private DiscountDesc discountDesc;

        @com.aliyun.core.annotation.NameInMap("distance")
        private Integer distance;

        @com.aliyun.core.annotation.NameInMap("district_code")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("hotel_address")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("hotel_code")
        private String hotelCode;

        @com.aliyun.core.annotation.NameInMap("hotel_en_name")
        private String hotelEnName;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("hotel_star")
        private String hotelStar;

        @com.aliyun.core.annotation.NameInMap("image_url")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("is_protocol")
        private Boolean isProtocol;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("min_price")
        private Double minPrice;

        @com.aliyun.core.annotation.NameInMap("original_min_price")
        private Double originalMinPrice;

        @com.aliyun.core.annotation.NameInMap("score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("tel")
        private String tel;

        private Items(Builder builder) {
            this.brandName = builder.brandName;
            this.btandCode = builder.btandCode;
            this.cityCode = builder.cityCode;
            this.discountDesc = builder.discountDesc;
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
         * @return discountDesc
         */
        public DiscountDesc getDiscountDesc() {
            return this.discountDesc;
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
            private DiscountDesc discountDesc; 
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.brandName = model.brandName;
                this.btandCode = model.btandCode;
                this.cityCode = model.cityCode;
                this.discountDesc = model.discountDesc;
                this.distance = model.distance;
                this.districtCode = model.districtCode;
                this.hotelAddress = model.hotelAddress;
                this.hotelCode = model.hotelCode;
                this.hotelEnName = model.hotelEnName;
                this.hotelName = model.hotelName;
                this.hotelStar = model.hotelStar;
                this.imageUrl = model.imageUrl;
                this.isProtocol = model.isProtocol;
                this.location = model.location;
                this.minPrice = model.minPrice;
                this.originalMinPrice = model.originalMinPrice;
                this.score = model.score;
                this.status = model.status;
                this.tel = model.tel;
            } 

            /**
             * brand_name.
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * btand_code.
             */
            public Builder btandCode(String btandCode) {
                this.btandCode = btandCode;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * discount_desc.
             */
            public Builder discountDesc(DiscountDesc discountDesc) {
                this.discountDesc = discountDesc;
                return this;
            }

            /**
             * distance.
             */
            public Builder distance(Integer distance) {
                this.distance = distance;
                return this;
            }

            /**
             * district_code.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
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
             * hotel_en_name.
             */
            public Builder hotelEnName(String hotelEnName) {
                this.hotelEnName = hotelEnName;
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
             * hotel_star.
             */
            public Builder hotelStar(String hotelStar) {
                this.hotelStar = hotelStar;
                return this;
            }

            /**
             * image_url.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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

            /**
             * score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * tel.
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
    /**
     * 
     * {@link HotelSearchResponseBody} extends {@link TeaModel}
     *
     * <p>HotelSearchResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        private Module(Builder builder) {
            this.count = builder.count;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.count = model.count;
                this.items = model.items;
            } 

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
