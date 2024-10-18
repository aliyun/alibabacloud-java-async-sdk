// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreCheckCreateOrderForDeleteDBNodesRequest} extends {@link RequestModel}
 *
 * <p>PreCheckCreateOrderForDeleteDBNodesRequest</p>
 */
public class PreCheckCreateOrderForDeleteDBNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    private java.util.List < String > DBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private PreCheckCreateOrderForDeleteDBNodesRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.businessInfo = builder.businessInfo;
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBNodeId = builder.DBNodeId;
        this.engineVersion = builder.engineVersion;
        this.nodeType = builder.nodeType;
        this.ownerId = builder.ownerId;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCheckCreateOrderForDeleteDBNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBNodeId
     */
    public java.util.List < String > getDBNodeId() {
        return this.DBNodeId;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<PreCheckCreateOrderForDeleteDBNodesRequest, Builder> {
        private Boolean autoPay; 
        private String businessInfo; 
        private String clientToken; 
        private String commodityCode; 
        private String DBInstanceId; 
        private java.util.List < String > DBNodeId; 
        private String engineVersion; 
        private String nodeType; 
        private Long ownerId; 
        private String promotionCode; 
        private String regionId; 
        private String resource; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(PreCheckCreateOrderForDeleteDBNodesRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.businessInfo = request.businessInfo;
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.DBInstanceId = request.DBInstanceId;
            this.DBNodeId = request.DBNodeId;
            this.engineVersion = request.engineVersion;
            this.nodeType = request.nodeType;
            this.ownerId = request.ownerId;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ol>
         * <li><strong>true</strong>: automatically completes the payment. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
         * </ol>
         * <blockquote>
         * <p> The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The additional business information about the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;promotion_input_param&quot;:&quot;{\&quot;promotionFilter\&quot;:{},\&quot;promotionOptionCode\&quot;:\&quot;youhui_quan\&quot;}&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOC****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The commodity code. Valid value:</p>
         * <ul>
         * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance.</li>
         * <li><strong>rds</strong>: The instance is a subscription primary instance.</li>
         * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance.</li>
         * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance.</li>
         * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance.</li>
         * <li><strong>rds_intl</strong>: The instance is a subscription primary instance.</li>
         * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance.</li>
         * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz9rziy3he051if82</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The node IDs.</p>
         */
        public Builder DBNodeId(java.util.List < String > DBNodeId) {
            String DBNodeIdShrink = shrink(DBNodeId, "DBNodeId", "json");
            this.putQueryParameter("DBNodeId", DBNodeIdShrink);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * <p>The major engine version of the destination instance. The value of this parameter varies based on the value of <strong>Engine</strong>.</p>
         * <ul>
         * <li>Valid values when Engine is set to MySQL: <strong>5.5, 5.6, 5.7, and 8.0</strong></li>
         * <li>Valid values when Engine is set to SQLServer: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent</strong></li>
         * <li>Valid values when Engine is set to PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The type of the database node. Valid value:</p>
         * <ul>
         * <li><strong>Master</strong>: the primary node</li>
         * <li><strong>Slave</strong>: the secondary node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>aliwood-1688-mobile-promotion</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The resource of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public PreCheckCreateOrderForDeleteDBNodesRequest build() {
            return new PreCheckCreateOrderForDeleteDBNodesRequest(this);
        } 

    } 

}
