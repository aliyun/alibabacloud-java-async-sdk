// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePartnerReservePriceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePartnerReservePriceRequest</p>
 */
public class UpdatePartnerReservePriceRequest extends Request {
    @Body
    @NameInMap("BiddingId")
    @Validation(required = true)
    private Integer biddingId;

    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("PartnerType")
    @Validation(required = true)
    private String partnerType;

    @Body
    @NameInMap("ReservePrice")
    @Validation(required = true)
    private Double reservePrice;

    private UpdatePartnerReservePriceRequest(Builder builder) {
        super(builder);
        this.biddingId = builder.biddingId;
        this.domainName = builder.domainName;
        this.partnerType = builder.partnerType;
        this.reservePrice = builder.reservePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePartnerReservePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biddingId
     */
    public Integer getBiddingId() {
        return this.biddingId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return partnerType
     */
    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * @return reservePrice
     */
    public Double getReservePrice() {
        return this.reservePrice;
    }

    public static final class Builder extends Request.Builder<UpdatePartnerReservePriceRequest, Builder> {
        private Integer biddingId; 
        private String domainName; 
        private String partnerType; 
        private Double reservePrice; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePartnerReservePriceRequest request) {
            super(request);
            this.biddingId = request.biddingId;
            this.domainName = request.domainName;
            this.partnerType = request.partnerType;
            this.reservePrice = request.reservePrice;
        } 

        /**
         * BiddingId.
         */
        public Builder biddingId(Integer biddingId) {
            this.putBodyParameter("BiddingId", biddingId);
            this.biddingId = biddingId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * PartnerType.
         */
        public Builder partnerType(String partnerType) {
            this.putBodyParameter("PartnerType", partnerType);
            this.partnerType = partnerType;
            return this;
        }

        /**
         * ReservePrice.
         */
        public Builder reservePrice(Double reservePrice) {
            this.putBodyParameter("ReservePrice", reservePrice);
            this.reservePrice = reservePrice;
            return this;
        }

        @Override
        public UpdatePartnerReservePriceRequest build() {
            return new UpdatePartnerReservePriceRequest(this);
        } 

    } 

}
