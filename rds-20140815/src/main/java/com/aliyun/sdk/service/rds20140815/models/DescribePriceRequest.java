// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNode")
    private java.util.List<DBNode> DBNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUsedType")
    private Integer instanceUsedType;

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
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private String timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    @com.aliyun.core.annotation.Validation(maximum = 999, minimum = 1)
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.DBNode = builder.DBNode;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceUsedType = builder.instanceUsedType;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serverlessConfig = builder.serverlessConfig;
        this.timeType = builder.timeType;
        this.usedTime = builder.usedTime;
        this.zoneId = builder.zoneId;
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
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return DBNode
     */
    public java.util.List<DBNode> getDBNode() {
        return this.DBNode;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return instanceUsedType
     */
    public Integer getInstanceUsedType() {
        return this.instanceUsedType;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return timeType
     */
    public String getTimeType() {
        return this.timeType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private String clientToken; 
        private String commodityCode; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private java.util.List<DBNode> DBNode; 
        private String engine; 
        private String engineVersion; 
        private Integer instanceUsedType; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private Integer quantity; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ServerlessConfig serverlessConfig; 
        private String timeType; 
        private Integer usedTime; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.DBNode = request.DBNode;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.instanceUsedType = request.instanceUsedType;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serverlessConfig = request.serverlessConfig;
            this.timeType = request.timeType;
            this.usedTime = request.usedTime;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz*****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The commodity code of the instance. Valid values:</p>
         * <ul>
         * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rds</strong> (default): The instance is a subscription primary instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance. This value is available at the international site (alibabacloud.com).</li>
         * <li><strong>rds_intl</strong>: The instance is a subscription primary instance. This value is available at the international site (alibabacloud.com).</li>
         * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the international site (alibabacloud.com).</li>
         * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance. This value is available at the international site (alibabacloud.com).</li>
         * </ul>
         * <blockquote>
         * <p> If you want to query the price of a read-only instance, you must specify this parameter.</p>
         * </blockquote>
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
         * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s1.small</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The ID of the instance for which you want to change the specifications or the instance that you want to renew.</p>
         * <blockquote>
         * <ul>
         * <li>If you want to query the price of a specification change order or a renewal order, you must specify this parameter.</li>
         * <li>If the instance is a read-only instance, you must set this parameter to the ID of its primary instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The storage capacity of the instance. Unit: GB. You can increase the storage capacity at a step size of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>general_essd</strong>: premium Enterprise SSD (ESSD)</li>
         * <li><strong>local_ssd</strong>: premium local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: performance level 1 (PL1) ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The information about the node.</p>
         * <blockquote>
         * <p> This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
         * </blockquote>
         */
        public Builder DBNode(java.util.List<DBNode> DBNode) {
            String DBNodeShrink = shrink(DBNode, "DBNode", "json");
            this.putQueryParameter("DBNode", DBNodeShrink);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>MariaDB</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li>Valid values if you set Engine to <strong>MySQL</strong>: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
         * <li>Valid values if you set Engine to <strong>SQL Server</strong>: <strong>08r2_ent_ha</strong>(cloud disks, discontinued), <strong>2008r2</strong>(high-performance local disks, discontinued), <strong>2012</strong> (SQL Server EE Basic)<strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
         * <li>Valid values if you set Engine to <strong>PostgreSQL</strong>: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
         * <li>Valid value if you set Engine to <strong>MariaDB</strong>: <strong>10.3</strong></li>
         * </ul>
         * <blockquote>
         * <p> The following information describes the valid values when you set Engine to SQLServer: <code>_ent</code> specifies SQL Server EE on RDS Cluster Edition, <code>_ent_ha</code> specifies SQL Server EE, <code>_std_ha</code> specifies SQL Server SE, and <code>_web</code> specifies SQL Server Web.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The role of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: primary instance</li>
         * <li><strong>3</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instanceUsedType(Integer instanceUsedType) {
            this.putQueryParameter("InstanceUsedType", instanceUsedType);
            this.instanceUsedType = instanceUsedType;
            return this;
        }

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li><strong>BUY</strong></li>
         * <li><strong>RENEW</strong></li>
         * <li><strong>UPGRADE</strong></li>
         * <li><strong>DOWNGRADE</strong></li>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The number of instances that you want to purchase. Valid values: <strong>0 to 30</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The settings of the serverless instance.</p>
         * <blockquote>
         * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </blockquote>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription instance. This parameter is required when <strong>CommodityCode</strong> is set to <strong>rds</strong>, <strong>rds_rordspre_public_cn</strong>, <strong>rds_intl</strong>, or <strong>rds_rordspre_public_intl</strong>. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>The subscription duration of the instance.</p>
         * <ul>
         * <li>If you set the <strong>TimeType</strong> parameter to <strong>Year</strong>, the value of the UsedTime parameter ranges from <strong>1 to 100</strong>.</li>
         * <li>If you set the <strong>TimeType</strong> parameter to <strong>Month</strong>, the value of the UsedTime parameter ranges from <strong>1 to 999</strong>.</li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The zone ID of the primary instance. You can call the DescribeRegions operation to query the most recent zone list.</p>
         * <blockquote>
         * <p> If you specify a virtual private cloud (VPC) and a vSwitch, this parameter is required to identify the zone for the vSwitch.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class DBNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNode(Builder builder) {
            this.classCode = builder.classCode;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String classCode; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNode model) {
                this.classCode = model.classCode;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n2.small.xc</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Double maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Double minCapacity;

        private ServerlessConfig(Builder builder) {
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return maxCapacity
         */
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Double maxCapacity; 
            private Double minCapacity; 

            private Builder() {
            } 

            private Builder(ServerlessConfig model) {
                this.maxCapacity = model.maxCapacity;
                this.minCapacity = model.minCapacity;
            } 

            /**
             * <p>The maximum number of RDS Capacity Units (RCUs).</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
}
