// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelSearchRequest} extends {@link RequestModel}
 *
 * <p>HotelSearchRequest</p>
 */
public class HotelSearchRequest extends Request {
    @Query
    @NameInMap("adult_num")
    private String adultNum;

    @Query
    @NameInMap("brand_code")
    private java.util.List < String > brandCode;

    @Query
    @NameInMap("btrip_user_id")
    private String btripUserId;

    @Query
    @NameInMap("check_in_date")
    @Validation(required = true)
    private String checkInDate;

    @Query
    @NameInMap("check_out_date")
    @Validation(required = true)
    private String checkOutDate;

    @Query
    @NameInMap("city_code")
    @Validation(required = true)
    private String cityCode;

    @Query
    @NameInMap("dir")
    private Integer dir;

    @Query
    @NameInMap("distance")
    private Integer distance;

    @Query
    @NameInMap("district_code")
    private String districtCode;

    @Query
    @NameInMap("hotel_star")
    private String hotelStar;

    @Query
    @NameInMap("is_protocol")
    private Boolean isProtocol;

    @Query
    @NameInMap("key_words")
    private String keyWords;

    @Query
    @NameInMap("location")
    private String location;

    @Query
    @NameInMap("max_price")
    private Double maxPrice;

    @Query
    @NameInMap("min_price")
    private Double minPrice;

    @Query
    @NameInMap("page_no")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("page_size")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("pay_over_type")
    private Integer payOverType;

    @Query
    @NameInMap("payment_type")
    private Integer paymentType;

    @Query
    @NameInMap("shids")
    private java.util.List < Long > shids;

    @Query
    @NameInMap("sort_code")
    @Validation(required = true)
    private Integer sortCode;

    @Query
    @NameInMap("super_man")
    private Integer superMan;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelSearchRequest(Builder builder) {
        super(builder);
        this.adultNum = builder.adultNum;
        this.brandCode = builder.brandCode;
        this.btripUserId = builder.btripUserId;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.cityCode = builder.cityCode;
        this.dir = builder.dir;
        this.distance = builder.distance;
        this.districtCode = builder.districtCode;
        this.hotelStar = builder.hotelStar;
        this.isProtocol = builder.isProtocol;
        this.keyWords = builder.keyWords;
        this.location = builder.location;
        this.maxPrice = builder.maxPrice;
        this.minPrice = builder.minPrice;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.payOverType = builder.payOverType;
        this.paymentType = builder.paymentType;
        this.shids = builder.shids;
        this.sortCode = builder.sortCode;
        this.superMan = builder.superMan;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adultNum
     */
    public String getAdultNum() {
        return this.adultNum;
    }

    /**
     * @return brandCode
     */
    public java.util.List < String > getBrandCode() {
        return this.brandCode;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return checkInDate
     */
    public String getCheckInDate() {
        return this.checkInDate;
    }

    /**
     * @return checkOutDate
     */
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return dir
     */
    public Integer getDir() {
        return this.dir;
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
     * @return hotelStar
     */
    public String getHotelStar() {
        return this.hotelStar;
    }

    /**
     * @return isProtocol
     */
    public Boolean getIsProtocol() {
        return this.isProtocol;
    }

    /**
     * @return keyWords
     */
    public String getKeyWords() {
        return this.keyWords;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return maxPrice
     */
    public Double getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return minPrice
     */
    public Double getMinPrice() {
        return this.minPrice;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return payOverType
     */
    public Integer getPayOverType() {
        return this.payOverType;
    }

    /**
     * @return paymentType
     */
    public Integer getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return shids
     */
    public java.util.List < Long > getShids() {
        return this.shids;
    }

    /**
     * @return sortCode
     */
    public Integer getSortCode() {
        return this.sortCode;
    }

    /**
     * @return superMan
     */
    public Integer getSuperMan() {
        return this.superMan;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelSearchRequest, Builder> {
        private String adultNum; 
        private java.util.List < String > brandCode; 
        private String btripUserId; 
        private String checkInDate; 
        private String checkOutDate; 
        private String cityCode; 
        private Integer dir; 
        private Integer distance; 
        private String districtCode; 
        private String hotelStar; 
        private Boolean isProtocol; 
        private String keyWords; 
        private String location; 
        private Double maxPrice; 
        private Double minPrice; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Integer payOverType; 
        private Integer paymentType; 
        private java.util.List < Long > shids; 
        private Integer sortCode; 
        private Integer superMan; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelSearchRequest request) {
            super(request);
            this.adultNum = request.adultNum;
            this.brandCode = request.brandCode;
            this.btripUserId = request.btripUserId;
            this.checkInDate = request.checkInDate;
            this.checkOutDate = request.checkOutDate;
            this.cityCode = request.cityCode;
            this.dir = request.dir;
            this.distance = request.distance;
            this.districtCode = request.districtCode;
            this.hotelStar = request.hotelStar;
            this.isProtocol = request.isProtocol;
            this.keyWords = request.keyWords;
            this.location = request.location;
            this.maxPrice = request.maxPrice;
            this.minPrice = request.minPrice;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.payOverType = request.payOverType;
            this.paymentType = request.paymentType;
            this.shids = request.shids;
            this.sortCode = request.sortCode;
            this.superMan = request.superMan;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 成人数
         */
        public Builder adultNum(String adultNum) {
            this.putQueryParameter("adult_num", adultNum);
            this.adultNum = adultNum;
            return this;
        }

        /**
         * 筛选品牌code列表
         */
        public Builder brandCode(java.util.List < String > brandCode) {
            String brandCodeShrink = shrink(brandCode, "brand_code", "json");
            this.putQueryParameter("brand_code", brandCodeShrink);
            this.brandCode = brandCode;
            return this;
        }

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * 入住日期，yyyy-MM-dd
         */
        public Builder checkInDate(String checkInDate) {
            this.putQueryParameter("check_in_date", checkInDate);
            this.checkInDate = checkInDate;
            return this;
        }

        /**
         * 离店日期，yyyy-MM-dd
         */
        public Builder checkOutDate(String checkOutDate) {
            this.putQueryParameter("check_out_date", checkOutDate);
            this.checkOutDate = checkOutDate;
            return this;
        }

        /**
         * 城市code
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * 排序方向
         */
        public Builder dir(Integer dir) {
            this.putQueryParameter("dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * 搜索距离范围，单位：米
         */
        public Builder distance(Integer distance) {
            this.putQueryParameter("distance", distance);
            this.distance = distance;
            return this;
        }

        /**
         * 行政区code
         */
        public Builder districtCode(String districtCode) {
            this.putQueryParameter("district_code", districtCode);
            this.districtCode = districtCode;
            return this;
        }

        /**
         * 筛选星级列表
         */
        public Builder hotelStar(String hotelStar) {
            this.putQueryParameter("hotel_star", hotelStar);
            this.hotelStar = hotelStar;
            return this;
        }

        /**
         * 只查协议酒店
         */
        public Builder isProtocol(Boolean isProtocol) {
            this.putQueryParameter("is_protocol", isProtocol);
            this.isProtocol = isProtocol;
            return this;
        }

        /**
         * 关键词（关键词搜索时用)
         */
        public Builder keyWords(String keyWords) {
            this.putQueryParameter("key_words", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * 经纬度（高德），经度在前维度在后
         */
        public Builder location(String location) {
            this.putQueryParameter("location", location);
            this.location = location;
            return this;
        }

        /**
         * 最高金额
         */
        public Builder maxPrice(Double maxPrice) {
            this.putQueryParameter("max_price", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * 最低金额
         */
        public Builder minPrice(Double minPrice) {
            this.putQueryParameter("min_price", minPrice);
            this.minPrice = minPrice;
            return this;
        }

        /**
         * 第几页，默认1
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * 每页几条，默认20
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 是否支持混合支付 0 支持 1不支持
         */
        public Builder payOverType(Integer payOverType) {
            this.putQueryParameter("pay_over_type", payOverType);
            this.payOverType = payOverType;
            return this;
        }

        /**
         * 支付方式0:企业支付；1个人支付
         */
        public Builder paymentType(Integer paymentType) {
            this.putQueryParameter("payment_type", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 筛选酒店Id
         */
        public Builder shids(java.util.List < Long > shids) {
            String shidsShrink = shrink(shids, "shids", "json");
            this.putQueryParameter("shids", shidsShrink);
            this.shids = shids;
            return this;
        }

        /**
         * 排序方式
         */
        public Builder sortCode(Integer sortCode) {
            this.putQueryParameter("sort_code", sortCode);
            this.sortCode = sortCode;
            return this;
        }

        /**
         * 角色0表示普通人，1表示特殊申请人
         */
        public Builder superMan(Integer superMan) {
            this.putQueryParameter("super_man", superMan);
            this.superMan = superMan;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelSearchRequest build() {
            return new HotelSearchRequest(this);
        } 

    } 

}
