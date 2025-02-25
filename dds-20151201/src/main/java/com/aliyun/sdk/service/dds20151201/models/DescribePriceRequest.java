// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderParamOut")
    private String orderParamOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

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

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.businessInfo = builder.businessInfo;
        this.commodityCode = builder.commodityCode;
        this.couponNo = builder.couponNo;
        this.DBInstances = builder.DBInstances;
        this.orderParamOut = builder.orderParamOut;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return DBInstances
     */
    public String getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return orderParamOut
     */
    public String getOrderParamOut() {
        return this.orderParamOut;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private String businessInfo; 
        private String commodityCode; 
        private String couponNo; 
        private String DBInstances; 
        private String orderParamOut; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.businessInfo = request.businessInfo;
            this.commodityCode = request.commodityCode;
            this.couponNo = request.couponNo;
            this.DBInstances = request.DBInstances;
            this.orderParamOut = request.orderParamOut;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The business information. This is an additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AccountPassword&quot;:&quot;Pw123456&quot;,&quot;DBInstanceDescription&quot;:&quot;test&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The code of the instance. Valid values:</p>
         * <ul>
         * <li><strong>dds</strong>: a replica set instance that uses the pay-as-you-go billing method</li>
         * <li><strong>badds</strong>: a replica set instance that uses the subscription billing method</li>
         * <li><strong>dds_sharding</strong>: a sharded cluster instance that uses the pay-as-you-go billing method</li>
         * <li><strong>badds_sharding</strong>: a sharded cluster instance that uses the subscription billing method</li>
         * <li><strong>badds_sharding_intl</strong>: a sharded cluster instance that uses the subscription billing method and is available on the International site (alibabacloud.com)</li>
         * <li><strong>dds_sharding_intl</strong>: a sharded cluster instance that uses the pay-as-you-go billing method and is available on the International site (alibabacloud.com)</li>
         * <li><strong>badds_sharding_jp</strong>: a sharded cluster instance that uses the subscription billing method and is available on the Japan site (jp.alibabacloud.com)</li>
         * <li><strong>badds_intl</strong>: a replica set instance that uses the subscription billing method and is available on the International site (alibabacloud.com)</li>
         * <li><strong>dds_intl</strong>: a replica set instance that uses the pay-as-you-go billing method and is available on the International site (alibabacloud.com)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>badds</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>Specifies whether to use coupons. Default value: null. Valid values:</p>
         * <ul>
         * <li><strong>default</strong> or <strong>null</strong>: uses coupons.</li>
         * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use coupons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>A JSON string that contains the details of the instance. For more information about the parameter and sample JSON formats, see <a href="https://help.aliyun.com/document_detail/197291.html">DescribePrice</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;DBInstanceId&quot;:&quot;dds-bp1b6e54e7cc****&quot;, &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, &quot;Engine&quot;:&quot;MongoDB&quot;, &quot;EngineVersion&quot;:&quot; 5.0&quot;, &quot;DBInstanceClass&quot;:&quot;mdb.shard.2x.xlarge.d&quot;, &quot;DBInstanceStorage&quot;:30, &quot;ChargeType&quot;:&quot;PrePaid&quot;, &quot;Period&quot;:1, &quot;StorageType&quot;:&quot;cloud_essd1&quot; } ]</p>
         */
        public Builder DBInstances(String DBInstances) {
            this.putQueryParameter("DBInstances", DBInstances);
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>Specifies whether to return the OrderParams parameter. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder orderParamOut(String orderParamOut) {
            this.putQueryParameter("OrderParamOut", orderParamOut);
            this.orderParamOut = orderParamOut;
            return this;
        }

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li><strong>BUY</strong></li>
         * <li><strong>UPGRADE</strong></li>
         * <li><strong>RENEW</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The code of the service. Default value: <strong>dds</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>dds</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
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
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

}
