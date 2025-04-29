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
 * {@link HotelGoodsQueryRequest} extends {@link RequestModel}
 *
 * <p>HotelGoodsQueryRequest</p>
 */
public class HotelGoodsQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("adult_num")
    private String adultNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agreement_price")
    private Boolean agreementPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("begin_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("breakfast_included")
    private Boolean breakfastIncluded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city_code")
    private String cityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hotel_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pay_over_type")
    private Integer payOverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("payment_type")
    private Integer paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("special_invoice")
    private Boolean specialInvoice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("super_man")
    private Integer superMan;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-28</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("end_date", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>182873</p>
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
