// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewRequest} extends {@link RequestModel}
 *
 * <p>RenewRequest</p>
 */
public class RenewRequest extends Request {
    @Body
    @NameInMap("ApiProduct")
    private String apiProduct;

    @Body
    @NameInMap("ApiRevision")
    private String apiRevision;

    @Query
    @NameInMap("BuyNum")
    private Integer buyNum;

    @Query
    @NameInMap("Iccid")
    private String iccid;

    @Query
    @NameInMap("OfferCode")
    private String offerCode;

    @Query
    @NameInMap("RechargeType")
    private String rechargeType;

    @Query
    @NameInMap("SerialNo")
    private String serialNo;

    private RenewRequest(Builder builder) {
        super(builder);
        this.apiProduct = builder.apiProduct;
        this.apiRevision = builder.apiRevision;
        this.buyNum = builder.buyNum;
        this.iccid = builder.iccid;
        this.offerCode = builder.offerCode;
        this.rechargeType = builder.rechargeType;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProduct
     */
    public String getApiProduct() {
        return this.apiProduct;
    }

    /**
     * @return apiRevision
     */
    public String getApiRevision() {
        return this.apiRevision;
    }

    /**
     * @return buyNum
     */
    public Integer getBuyNum() {
        return this.buyNum;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return offerCode
     */
    public String getOfferCode() {
        return this.offerCode;
    }

    /**
     * @return rechargeType
     */
    public String getRechargeType() {
        return this.rechargeType;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<RenewRequest, Builder> {
        private String apiProduct; 
        private String apiRevision; 
        private Integer buyNum; 
        private String iccid; 
        private String offerCode; 
        private String rechargeType; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(RenewRequest request) {
            super(request);
            this.apiProduct = request.apiProduct;
            this.apiRevision = request.apiRevision;
            this.buyNum = request.buyNum;
            this.iccid = request.iccid;
            this.offerCode = request.offerCode;
            this.rechargeType = request.rechargeType;
            this.serialNo = request.serialNo;
        } 

        /**
         * ApiProduct.
         */
        public Builder apiProduct(String apiProduct) {
            this.putBodyParameter("ApiProduct", apiProduct);
            this.apiProduct = apiProduct;
            return this;
        }

        /**
         * ApiRevision.
         */
        public Builder apiRevision(String apiRevision) {
            this.putBodyParameter("ApiRevision", apiRevision);
            this.apiRevision = apiRevision;
            return this;
        }

        /**
         * BuyNum.
         */
        public Builder buyNum(Integer buyNum) {
            this.putQueryParameter("BuyNum", buyNum);
            this.buyNum = buyNum;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * OfferCode.
         */
        public Builder offerCode(String offerCode) {
            this.putQueryParameter("OfferCode", offerCode);
            this.offerCode = offerCode;
            return this;
        }

        /**
         * RechargeType.
         */
        public Builder rechargeType(String rechargeType) {
            this.putQueryParameter("RechargeType", rechargeType);
            this.rechargeType = rechargeType;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public RenewRequest build() {
            return new RenewRequest(this);
        } 

    } 

}
