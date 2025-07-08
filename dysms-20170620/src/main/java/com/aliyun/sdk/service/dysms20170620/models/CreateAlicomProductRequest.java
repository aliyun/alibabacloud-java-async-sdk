// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateAlicomProductRequest} extends {@link RequestModel}
 *
 * <p>CreateAlicomProductRequest</p>
 */
public class CreateAlicomProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusOffer")
    private Long busOffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusOffers")
    private String busOffers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prodId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateAlicomProductRequest(Builder builder) {
        super(builder);
        this.busOffer = builder.busOffer;
        this.busOffers = builder.busOffers;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.prodId = builder.prodId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlicomProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return busOffer
     */
    public Long getBusOffer() {
        return this.busOffer;
    }

    /**
     * @return busOffers
     */
    public String getBusOffers() {
        return this.busOffers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return prodId
     */
    public String getProdId() {
        return this.prodId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateAlicomProductRequest, Builder> {
        private Long busOffer; 
        private String busOffers; 
        private Long ownerId; 
        private String prodCode; 
        private String prodId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlicomProductRequest request) {
            super(request);
            this.busOffer = request.busOffer;
            this.busOffers = request.busOffers;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.prodId = request.prodId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BusOffer.
         */
        public Builder busOffer(Long busOffer) {
            this.putQueryParameter("BusOffer", busOffer);
            this.busOffer = busOffer;
            return this;
        }

        /**
         * BusOffers.
         */
        public Builder busOffers(String busOffers) {
            this.putQueryParameter("BusOffers", busOffers);
            this.busOffers = busOffers;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder prodId(String prodId) {
            this.putQueryParameter("ProdId", prodId);
            this.prodId = prodId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateAlicomProductRequest build() {
            return new CreateAlicomProductRequest(this);
        } 

    } 

}
