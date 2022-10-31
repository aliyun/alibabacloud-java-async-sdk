// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCasterRequest} extends {@link RequestModel}
 *
 * <p>CreateCasterRequest</p>
 */
public class CreateCasterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterName")
    private String casterName;

    @Query
    @NameInMap("CasterTemplate")
    private String casterTemplate;

    @Query
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("ExpireTime")
    private String expireTime;

    @Query
    @NameInMap("NormType")
    @Validation(required = true)
    private Integer normType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PurchaseTime")
    private String purchaseTime;

    private CreateCasterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterName = builder.casterName;
        this.casterTemplate = builder.casterTemplate;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.expireTime = builder.expireTime;
        this.normType = builder.normType;
        this.ownerId = builder.ownerId;
        this.purchaseTime = builder.purchaseTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCasterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return casterTemplate
     */
    public String getCasterTemplate() {
        return this.casterTemplate;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return normType
     */
    public Integer getNormType() {
        return this.normType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return purchaseTime
     */
    public String getPurchaseTime() {
        return this.purchaseTime;
    }

    public static final class Builder extends Request.Builder<CreateCasterRequest, Builder> {
        private String regionId; 
        private String casterName; 
        private String casterTemplate; 
        private String chargeType; 
        private String clientToken; 
        private String expireTime; 
        private Integer normType; 
        private Long ownerId; 
        private String purchaseTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateCasterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterName = request.casterName;
            this.casterTemplate = request.casterTemplate;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.expireTime = request.expireTime;
            this.normType = request.normType;
            this.ownerId = request.ownerId;
            this.purchaseTime = request.purchaseTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CasterName.
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * CasterTemplate.
         */
        public Builder casterTemplate(String casterTemplate) {
            this.putQueryParameter("CasterTemplate", casterTemplate);
            this.casterTemplate = casterTemplate;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * NormType.
         */
        public Builder normType(Integer normType) {
            this.putQueryParameter("NormType", normType);
            this.normType = normType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PurchaseTime.
         */
        public Builder purchaseTime(String purchaseTime) {
            this.putQueryParameter("PurchaseTime", purchaseTime);
            this.purchaseTime = purchaseTime;
            return this;
        }

        @Override
        public CreateCasterRequest build() {
            return new CreateCasterRequest(this);
        } 

    } 

}
