// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HotelStaticInfoRequest} extends {@link RequestModel}
 *
 * <p>HotelStaticInfoRequest</p>
 */
public class HotelStaticInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hotel_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > hotelIds;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelStaticInfoRequest(Builder builder) {
        super(builder);
        this.hotelIds = builder.hotelIds;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelStaticInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelIds
     */
    public java.util.List < String > getHotelIds() {
        return this.hotelIds;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelStaticInfoRequest, Builder> {
        private java.util.List < String > hotelIds; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelStaticInfoRequest request) {
            super(request);
            this.hotelIds = request.hotelIds;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotelIds(java.util.List < String > hotelIds) {
            String hotelIdsShrink = shrink(hotelIds, "hotel_ids", "json");
            this.putQueryParameter("hotel_ids", hotelIdsShrink);
            this.hotelIds = hotelIds;
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
        public HotelStaticInfoRequest build() {
            return new HotelStaticInfoRequest(this);
        } 

    } 

}
