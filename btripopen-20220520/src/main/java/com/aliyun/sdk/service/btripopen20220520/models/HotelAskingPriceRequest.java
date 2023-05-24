// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelAskingPriceRequest} extends {@link RequestModel}
 *
 * <p>HotelAskingPriceRequest</p>
 */
public class HotelAskingPriceRequest extends Request {
    @Query
    @NameInMap("adult_num")
    private String adultNum;

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
    private String cityCode;

    @Query
    @NameInMap("city_name")
    private String cityName;

    @Query
    @NameInMap("dir")
    private Integer dir;

    @Query
    @NameInMap("hotel_star")
    private String hotelStar;

    @Query
    @NameInMap("is_protocol")
    private Boolean isProtocol;

    @Query
    @NameInMap("payment_type")
    private Integer paymentType;

    @Query
    @NameInMap("shids")
    @Validation(required = true)
    private java.util.List < Long > shids;

    @Query
    @NameInMap("sort_code")
    private Integer sortCode;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelAskingPriceRequest(Builder builder) {
        super(builder);
        this.adultNum = builder.adultNum;
        this.btripUserId = builder.btripUserId;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.cityCode = builder.cityCode;
        this.cityName = builder.cityName;
        this.dir = builder.dir;
        this.hotelStar = builder.hotelStar;
        this.isProtocol = builder.isProtocol;
        this.paymentType = builder.paymentType;
        this.shids = builder.shids;
        this.sortCode = builder.sortCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelAskingPriceRequest create() {
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
     * @return cityName
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * @return dir
     */
    public Integer getDir() {
        return this.dir;
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelAskingPriceRequest, Builder> {
        private String adultNum; 
        private String btripUserId; 
        private String checkInDate; 
        private String checkOutDate; 
        private String cityCode; 
        private String cityName; 
        private Integer dir; 
        private String hotelStar; 
        private Boolean isProtocol; 
        private Integer paymentType; 
        private java.util.List < Long > shids; 
        private Integer sortCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelAskingPriceRequest request) {
            super(request);
            this.adultNum = request.adultNum;
            this.btripUserId = request.btripUserId;
            this.checkInDate = request.checkInDate;
            this.checkOutDate = request.checkOutDate;
            this.cityCode = request.cityCode;
            this.cityName = request.cityName;
            this.dir = request.dir;
            this.hotelStar = request.hotelStar;
            this.isProtocol = request.isProtocol;
            this.paymentType = request.paymentType;
            this.shids = request.shids;
            this.sortCode = request.sortCode;
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
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * 入住日期，YYYY-MM-DD HH:mm:ss
         */
        public Builder checkInDate(String checkInDate) {
            this.putQueryParameter("check_in_date", checkInDate);
            this.checkInDate = checkInDate;
            return this;
        }

        /**
         * 离店日期，YYYY-MM-DD HH:mm:ss
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
         * 城市Name
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("city_name", cityName);
            this.cityName = cityName;
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
         * 支付方式0:企业支付；1个人支付
         */
        public Builder paymentType(Integer paymentType) {
            this.putQueryParameter("payment_type", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 筛选酒店Id(分页个数最大20)
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelAskingPriceRequest build() {
            return new HotelAskingPriceRequest(this);
        } 

    } 

}
