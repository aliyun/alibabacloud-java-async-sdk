// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelGoodsQueryRequest} extends {@link RequestModel}
 *
 * <p>HotelGoodsQueryRequest</p>
 */
public class HotelGoodsQueryRequest extends Request {
    @Query
    @NameInMap("adult_num")
    private String adultNum;

    @Query
    @NameInMap("agreement_price")
    private Boolean agreementPrice;

    @Query
    @NameInMap("begin_date")
    @Validation(required = true)
    private String beginDate;

    @Query
    @NameInMap("breakfast_included")
    private Boolean breakfastIncluded;

    @Query
    @NameInMap("btrip_user_id")
    @Validation(required = true)
    private String btripUserId;

    @Query
    @NameInMap("city_code")
    private String cityCode;

    @Query
    @NameInMap("end_date")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("hotel_id")
    @Validation(required = true)
    private String hotelId;

    @Query
    @NameInMap("pay_over_type")
    private Integer payOverType;

    @Query
    @NameInMap("payment_type")
    private Integer paymentType;

    @Query
    @NameInMap("special_invoice")
    private Boolean specialInvoice;

    @Query
    @NameInMap("super_man")
    private Integer superMan;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelGoodsQueryRequest(Builder builder) {
        super(builder);
        this.adultNum = builder.adultNum;
        this.agreementPrice = builder.agreementPrice;
        this.beginDate = builder.beginDate;
        this.breakfastIncluded = builder.breakfastIncluded;
        this.btripUserId = builder.btripUserId;
        this.cityCode = builder.cityCode;
        this.endDate = builder.endDate;
        this.hotelId = builder.hotelId;
        this.payOverType = builder.payOverType;
        this.paymentType = builder.paymentType;
        this.specialInvoice = builder.specialInvoice;
        this.superMan = builder.superMan;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelGoodsQueryRequest create() {
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
     * @return agreementPrice
     */
    public Boolean getAgreementPrice() {
        return this.agreementPrice;
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return breakfastIncluded
     */
    public Boolean getBreakfastIncluded() {
        return this.breakfastIncluded;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
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
     * @return specialInvoice
     */
    public Boolean getSpecialInvoice() {
        return this.specialInvoice;
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

    public static final class Builder extends Request.Builder<HotelGoodsQueryRequest, Builder> {
        private String adultNum; 
        private Boolean agreementPrice; 
        private String beginDate; 
        private Boolean breakfastIncluded; 
        private String btripUserId; 
        private String cityCode; 
        private String endDate; 
        private String hotelId; 
        private Integer payOverType; 
        private Integer paymentType; 
        private Boolean specialInvoice; 
        private Integer superMan; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelGoodsQueryRequest request) {
            super(request);
            this.adultNum = request.adultNum;
            this.agreementPrice = request.agreementPrice;
            this.beginDate = request.beginDate;
            this.breakfastIncluded = request.breakfastIncluded;
            this.btripUserId = request.btripUserId;
            this.cityCode = request.cityCode;
            this.endDate = request.endDate;
            this.hotelId = request.hotelId;
            this.payOverType = request.payOverType;
            this.paymentType = request.paymentType;
            this.specialInvoice = request.specialInvoice;
            this.superMan = request.superMan;
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
         * agreement_price.
         */
        public Builder agreementPrice(Boolean agreementPrice) {
            this.putQueryParameter("agreement_price", agreementPrice);
            this.agreementPrice = agreementPrice;
            return this;
        }

        /**
         * begin_date.
         */
        public Builder beginDate(String beginDate) {
            this.putQueryParameter("begin_date", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * breakfast_included.
         */
        public Builder breakfastIncluded(Boolean breakfastIncluded) {
            this.putQueryParameter("breakfast_included", breakfastIncluded);
            this.breakfastIncluded = breakfastIncluded;
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
         * city_code.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * end_date.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("end_date", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * hotel_id.
         */
        public Builder hotelId(String hotelId) {
            this.putQueryParameter("hotel_id", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * pay_over_type.
         */
        public Builder payOverType(Integer payOverType) {
            this.putQueryParameter("pay_over_type", payOverType);
            this.payOverType = payOverType;
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
         * special_invoice.
         */
        public Builder specialInvoice(Boolean specialInvoice) {
            this.putQueryParameter("special_invoice", specialInvoice);
            this.specialInvoice = specialInvoice;
            return this;
        }

        /**
         * super_man.
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
        public HotelGoodsQueryRequest build() {
            return new HotelGoodsQueryRequest(this);
        } 

    } 

}
