// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OccupySecretResRequest} extends {@link RequestModel}
 *
 * <p>OccupySecretResRequest</p>
 */
public class OccupySecretResRequest extends Request {
    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("IsDisplayPool")
    private Boolean isDisplayPool;

    @Query
    @NameInMap("NoLike")
    private String noLike;

    @Query
    @NameInMap("OrderDetailId")
    @Validation(required = true)
    private Long orderDetailId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PartnerKey")
    private String partnerKey;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResType")
    @Validation(required = true)
    private Long resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretNoType")
    @Validation(required = true)
    private Integer secretNoType;

    @Query
    @NameInMap("TotalCount")
    @Validation(required = true)
    private Integer totalCount;

    @Query
    @NameInMap("secretNo")
    private String secretNo;

    private OccupySecretResRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.isDisplayPool = builder.isDisplayPool;
        this.noLike = builder.noLike;
        this.orderDetailId = builder.orderDetailId;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.partnerKey = builder.partnerKey;
        this.prodCode = builder.prodCode;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNoType = builder.secretNoType;
        this.totalCount = builder.totalCount;
        this.secretNo = builder.secretNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OccupySecretResRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return isDisplayPool
     */
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
    }

    /**
     * @return noLike
     */
    public String getNoLike() {
        return this.noLike;
    }

    /**
     * @return orderDetailId
     */
    public Long getOrderDetailId() {
        return this.orderDetailId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return partnerKey
     */
    public String getPartnerKey() {
        return this.partnerKey;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resType
     */
    public Long getResType() {
        return this.resType;
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

    /**
     * @return secretNoType
     */
    public Integer getSecretNoType() {
        return this.secretNoType;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    public static final class Builder extends Request.Builder<OccupySecretResRequest, Builder> {
        private String city; 
        private Boolean isDisplayPool; 
        private String noLike; 
        private Long orderDetailId; 
        private Long orderId; 
        private Long ownerId; 
        private String partnerKey; 
        private String prodCode; 
        private Long resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer secretNoType; 
        private Integer totalCount; 
        private String secretNo; 

        private Builder() {
            super();
        } 

        private Builder(OccupySecretResRequest request) {
            super(request);
            this.city = request.city;
            this.isDisplayPool = request.isDisplayPool;
            this.noLike = request.noLike;
            this.orderDetailId = request.orderDetailId;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.partnerKey = request.partnerKey;
            this.prodCode = request.prodCode;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNoType = request.secretNoType;
            this.totalCount = request.totalCount;
            this.secretNo = request.secretNo;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * IsDisplayPool.
         */
        public Builder isDisplayPool(Boolean isDisplayPool) {
            this.putQueryParameter("IsDisplayPool", isDisplayPool);
            this.isDisplayPool = isDisplayPool;
            return this;
        }

        /**
         * NoLike.
         */
        public Builder noLike(String noLike) {
            this.putQueryParameter("NoLike", noLike);
            this.noLike = noLike;
            return this;
        }

        /**
         * OrderDetailId.
         */
        public Builder orderDetailId(Long orderDetailId) {
            this.putQueryParameter("OrderDetailId", orderDetailId);
            this.orderDetailId = orderDetailId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
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
         * PartnerKey.
         */
        public Builder partnerKey(String partnerKey) {
            this.putQueryParameter("PartnerKey", partnerKey);
            this.partnerKey = partnerKey;
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
         * ResType.
         */
        public Builder resType(Long resType) {
            this.putQueryParameter("ResType", resType);
            this.resType = resType;
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

        /**
         * SecretNoType.
         */
        public Builder secretNoType(Integer secretNoType) {
            this.putQueryParameter("SecretNoType", secretNoType);
            this.secretNoType = secretNoType;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        /**
         * secretNo.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("secretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        @Override
        public OccupySecretResRequest build() {
            return new OccupySecretResRequest(this);
        } 

    } 

}
