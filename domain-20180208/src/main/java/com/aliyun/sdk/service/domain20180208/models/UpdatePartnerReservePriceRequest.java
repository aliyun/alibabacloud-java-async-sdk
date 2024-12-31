// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link UpdatePartnerReservePriceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePartnerReservePriceRequest</p>
 */
public class UpdatePartnerReservePriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BiddingId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer biddingId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartnerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String partnerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservePrice")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder biddingId(Integer biddingId) {
            this.putBodyParameter("BiddingId", biddingId);
            this.biddingId = biddingId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder partnerType(String partnerType) {
            this.putBodyParameter("PartnerType", partnerType);
            this.partnerType = partnerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
