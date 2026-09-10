// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeClassListRequest} extends {@link RequestModel}
 *
 * <p>DescribeClassListRequest</p>
 */
public class DescribeClassListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterHa")
    private String masterHa;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeClassListRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.masterHa = builder.masterHa;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClassListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return masterHa
     */
    public String getMasterHa() {
        return this.masterHa;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<DescribeClassListRequest, Builder> {
        private String commodityCode; 
        private String masterHa; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClassListRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.masterHa = request.masterHa;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The commodity code. Valid values:</p>
         * <ul>
         * <li><p>polardb_sub: subscription for the Chinese mainland.</p>
         * </li>
         * <li><p>polardb_sub_intl: subscription for regions in Hong Kong (China) and outside the Chinese mainland.</p>
         * </li>
         * <li><p>polardb_payg: pay-as-you-go for the Chinese mainland.</p>
         * </li>
         * <li><p>polardb_payg_intl: pay-as-you-go for regions in Hong Kong (China) and outside the Chinese mainland.</p>
         * </li>
         * <li><p>polardb_sub_jushita: Jushita subscription.</p>
         * </li>
         * <li><p>polardb_payg_jushita: Jushita pay-as-you-go.</p>
         * </li>
         * <li><p>polardb_sub_cainiao: Cainiao subscription.</p>
         * </li>
         * <li><p>polardb_payg_cainiao: Cainiao pay-as-you-go.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you use an Alibaba Cloud China site account, you can view only the commodity codes for the Chinese mainland.</p>
         * </li>
         * <li><p>If you use an Alibaba Cloud international site account, you can view only the commodity codes for regions outside the Chinese mainland.</p>
         * </li>
         * <li><p>If you use a Jushita account, you can view only the commodity codes for Jushita.</p>
         * </li>
         * <li><p>If you use a Cainiao account, you can view only the commodity codes for Cainiao.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_sub</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The number of nodes. Valid values:</p>
         * <ul>
         * <li><p>single: single node.</p>
         * </li>
         * <li><p>cluster: cluster.</p>
         * </li>
         * <li><p>all: single node and cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder masterHa(String masterHa) {
            this.putQueryParameter("MasterHa", masterHa);
            this.masterHa = masterHa;
            return this;
        }

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li><p>BUY: new purchase.</p>
         * </li>
         * <li><p>UPGRADE: changes the configuration.</p>
         * </li>
         * <li><p>RENEW: renews the instance.</p>
         * </li>
         * <li><p>CONVERT: changes the billing method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p>This parameter is required if you use an Alibaba Cloud international site account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public DescribeClassListRequest build() {
            return new DescribeClassListRequest(this);
        } 

    } 

}
