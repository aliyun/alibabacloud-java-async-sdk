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
 * {@link HotelAskingPriceRequest} extends {@link RequestModel}
 *
 * <p>HotelAskingPriceRequest</p>
 */
public class HotelAskingPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("adult_num")
    private String adultNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("check_in_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkInDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("check_out_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkOutDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city_code")
    private String cityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city_name")
    private String cityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dir")
    private Integer dir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hotel_star")
    private String hotelStar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("is_protocol")
    private Boolean isProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("payment_type")
    private Integer paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> shids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort_code")
    private Integer sortCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
    public java.util.List<Long> getShids() {
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
        private java.util.List<Long> shids; 
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
         * adult_num.
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-22 00:00:00</p>
         */
        public Builder checkInDate(String checkInDate) {
            this.putQueryParameter("check_in_date", checkInDate);
            this.checkInDate = checkInDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-22 00:00:00</p>
         */
        public Builder checkOutDate(String checkOutDate) {
            this.putQueryParameter("check_out_date", checkOutDate);
            this.checkOutDate = checkOutDate;
            return this;
        }

        /**
         * city_code.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * city_name.
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("city_name", cityName);
            this.cityName = cityName;
            return this;
        }

        /**
         * dir.
         */
        public Builder dir(Integer dir) {
            this.putQueryParameter("dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * hotel_star.
         */
        public Builder hotelStar(String hotelStar) {
            this.putQueryParameter("hotel_star", hotelStar);
            this.hotelStar = hotelStar;
            return this;
        }

        /**
         * is_protocol.
         */
        public Builder isProtocol(Boolean isProtocol) {
            this.putQueryParameter("is_protocol", isProtocol);
            this.isProtocol = isProtocol;
            return this;
        }

        /**
         * payment_type.
         */
        public Builder paymentType(Integer paymentType) {
            this.putQueryParameter("payment_type", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder shids(java.util.List<Long> shids) {
            String shidsShrink = shrink(shids, "shids", "json");
            this.putQueryParameter("shids", shidsShrink);
            this.shids = shids;
            return this;
        }

        /**
         * sort_code.
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
