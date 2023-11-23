// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBuyPageResCountRequest} extends {@link RequestModel}
 *
 * <p>QueryBuyPageResCountRequest</p>
 */
public class QueryBuyPageResCountRequest extends Request {
    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("Like")
    private String like;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResType")
    @Validation(required = true)
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpecId")
    private Long specId;

    private QueryBuyPageResCountRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.like = builder.like;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBuyPageResCountRequest create() {
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
     * @return like
     */
    public String getLike() {
        return this.like;
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
     * @return resType
     */
    public Integer getResType() {
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
     * @return specId
     */
    public Long getSpecId() {
        return this.specId;
    }

    public static final class Builder extends Request.Builder<QueryBuyPageResCountRequest, Builder> {
        private String city; 
        private String like; 
        private Long ownerId; 
        private String prodCode; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long specId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBuyPageResCountRequest request) {
            super(request);
            this.city = request.city;
            this.like = request.like;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.specId = request.specId;
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
         * Like.
         */
        public Builder like(String like) {
            this.putQueryParameter("Like", like);
            this.like = like;
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
         * ResType.
         */
        public Builder resType(Integer resType) {
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
         * SpecId.
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public QueryBuyPageResCountRequest build() {
            return new QueryBuyPageResCountRequest(this);
        } 

    } 

}
