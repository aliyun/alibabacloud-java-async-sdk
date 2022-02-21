// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVirtualNumberRelationRequest} extends {@link RequestModel}
 *
 * <p>AddVirtualNumberRelationRequest</p>
 */
public class AddVirtualNumberRelationRequest extends Request {
    @Query
    @NameInMap("CorpNameList")
    private String corpNameList;

    @Query
    @NameInMap("NumberList")
    @Validation(required = true)
    private String numberList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNum")
    @Validation(required = true)
    private String phoneNum;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteType")
    @Validation(required = true, maximum = 99999)
    private Integer routeType;

    private AddVirtualNumberRelationRequest(Builder builder) {
        super(builder);
        this.corpNameList = builder.corpNameList;
        this.numberList = builder.numberList;
        this.ownerId = builder.ownerId;
        this.phoneNum = builder.phoneNum;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeType = builder.routeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirtualNumberRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpNameList
     */
    public String getCorpNameList() {
        return this.corpNameList;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return routeType
     */
    public Integer getRouteType() {
        return this.routeType;
    }

    public static final class Builder extends Request.Builder<AddVirtualNumberRelationRequest, Builder> {
        private String corpNameList; 
        private String numberList; 
        private Long ownerId; 
        private String phoneNum; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer routeType; 

        private Builder() {
            super();
        } 

        private Builder(AddVirtualNumberRelationRequest response) {
            super(response);
            this.corpNameList = response.corpNameList;
            this.numberList = response.numberList;
            this.ownerId = response.ownerId;
            this.phoneNum = response.phoneNum;
            this.prodCode = response.prodCode;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.routeType = response.routeType;
        } 

        /**
         * CorpNameList.
         */
        public Builder corpNameList(String corpNameList) {
            this.putQueryParameter("CorpNameList", corpNameList);
            this.corpNameList = corpNameList;
            return this;
        }

        /**
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
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
         * PhoneNum.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
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
         * RouteType.
         */
        public Builder routeType(Integer routeType) {
            this.putQueryParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        @Override
        public AddVirtualNumberRelationRequest build() {
            return new AddVirtualNumberRelationRequest(this);
        } 

    } 

}
