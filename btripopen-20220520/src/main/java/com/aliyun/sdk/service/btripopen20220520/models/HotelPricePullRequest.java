// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelPricePullRequest} extends {@link RequestModel}
 *
 * <p>HotelPricePullRequest</p>
 */
public class HotelPricePullRequest extends Request {
    @Query
    @NameInMap("btrip_user_id")
    private String btripUserId;

    @Query
    @NameInMap("check_in")
    private String checkIn;

    @Query
    @NameInMap("check_out")
    private String checkOut;

    @Query
    @NameInMap("city_code")
    private Integer cityCode;

    @Query
    @NameInMap("hotel_ids")
    private java.util.List < String > hotelIds;

    @Query
    @NameInMap("payment_type")
    private Integer paymentType;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelPricePullRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.cityCode = builder.cityCode;
        this.hotelIds = builder.hotelIds;
        this.paymentType = builder.paymentType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelPricePullRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return checkIn
     */
    public String getCheckIn() {
        return this.checkIn;
    }

    /**
     * @return checkOut
     */
    public String getCheckOut() {
        return this.checkOut;
    }

    /**
     * @return cityCode
     */
    public Integer getCityCode() {
        return this.cityCode;
    }

    /**
     * @return hotelIds
     */
    public java.util.List < String > getHotelIds() {
        return this.hotelIds;
    }

    /**
     * @return paymentType
     */
    public Integer getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelPricePullRequest, Builder> {
        private String btripUserId; 
        private String checkIn; 
        private String checkOut; 
        private Integer cityCode; 
        private java.util.List < String > hotelIds; 
        private Integer paymentType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelPricePullRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.checkIn = request.checkIn;
            this.checkOut = request.checkOut;
            this.cityCode = request.cityCode;
            this.hotelIds = request.hotelIds;
            this.paymentType = request.paymentType;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
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
         * check_in.
         */
        public Builder checkIn(String checkIn) {
            this.putQueryParameter("check_in", checkIn);
            this.checkIn = checkIn;
            return this;
        }

        /**
         * check_out.
         */
        public Builder checkOut(String checkOut) {
            this.putQueryParameter("check_out", checkOut);
            this.checkOut = checkOut;
            return this;
        }

        /**
         * city_code.
         */
        public Builder cityCode(Integer cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * hotel_ids.
         */
        public Builder hotelIds(java.util.List < String > hotelIds) {
            String hotelIdsShrink = shrink(hotelIds, "hotel_ids", "json");
            this.putQueryParameter("hotel_ids", hotelIdsShrink);
            this.hotelIds = hotelIds;
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelPricePullRequest build() {
            return new HotelPricePullRequest(this);
        } 

    } 

}
