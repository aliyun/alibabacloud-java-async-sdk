// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @Query
    @NameInMap("DBNode")
    private java.util.List < DBNode> DBNode;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("InstanceUsedType")
    private Integer instanceUsedType;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Quantity")
    @Validation(required = true)
    private Integer quantity;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @Query
    @NameInMap("TimeType")
    private String timeType;

    @Query
    @NameInMap("UsedTime")
    @Validation(maximum = 999, minimum = 1)
    private Integer usedTime;

    @Query
    @NameInMap("ZoneId")
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
    public java.util.List < DBNode> getDBNode() {
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
        private java.util.List < DBNode> DBNode; 
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The commodity code of the instance. Valid values:
         * <p>
         * 
         * *   **bards**: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).
         * *   **rds**: The instance is a subscription primary instance. This is the default value. This value is available at the China site (aliyun.com).
         * *   **rords**: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).
         * *   **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).
         * *   **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).
         * *   **rds_intl**: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).
         * *   **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).
         * *   **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
         * 
         * > If you want to query the price of a read-only instance, you must specify this parameter.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The ID of the instance for which you want to change the specifications or the instance that you want to renew.
         * <p>
         * 
         * > *   If you want to query the price of an specification change order or a renewal order, you must specify this parameter.
         * > *   If the instance is a read-only instance, you must set this parameter to the ID of its primary instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: GB. You can increase the storage capacity at a step size of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD
         * *   **cloud_ssd**: standard SSD
         * *   **cloud_essd**: PL1 ESSD
         * *   **cloud_essd2**: PL2 ESSD
         * *   **cloud_essd3**: PL3 ESSD
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The information about the node.
         * <p>
         * 
         * >  This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
         */
        public Builder DBNode(java.util.List < DBNode> DBNode) {
            String DBNodeShrink = shrink(DBNode, "DBNode", "json");
            this.putQueryParameter("DBNode", DBNodeShrink);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * The database engine of the instance. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQLServer**
         * *   **PostgreSQL**
         * *   **MariaDB**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The database engine version of the instance.
         * <p>
         * 
         * *   Valid values if you set Engine to **MySQL**: **5.5**, **5.6**, **5.7**, and **8.0**
         * *   Valid values if you set Engine to **SQLServer**: **08r2\_ent_ha** (cloud disks, discontinued), **2008r2**(local disks, discontinued), **2012** (SQL Server EE Basic), **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_ent**, **2017\_std_ha**, **2017\_web**, **2019\_ent**, **2019\_std_ha**, **2019\_web**, **2022\_ent**, **2022\_std_ha**, and **2022\_web**
         * *   Valid values if you set Engine to **PostgreSQL**: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**
         * *   Valid value if you set Engine to **MariaDB**: **10.3**
         * 
         * >  The following information describes the valid values when you set Engine to SQLServer: `_ent` specifies SQL Server EE on RDS Cluster Edition, `_ent_ha` specifies SQL Server EE, `_std_ha` specifies SQL Server SE, and `_web` specifies SQL Server Web.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The role of the instance. Valid values:
         * <p>
         * 
         * *   **0**: primary instance
         * *   **3**: read-only instance
         */
        public Builder instanceUsedType(Integer instanceUsedType) {
            this.putQueryParameter("InstanceUsedType", instanceUsedType);
            this.instanceUsedType = instanceUsedType;
            return this;
        }

        /**
         * The order type. Valid values:
         * <p>
         * 
         * *   **BUY**: purchase order
         * *   **UPGRADE**: specification change order
         * *   **RENEW**: renewal order
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
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **Prepaid**: subscription
         * *   **Postpaid**: pay-as-you-go
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The number of instances that you want to purchase. Valid values: **0 to 30**.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
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
         * The settings of the serverless instance.
         * <p>
         * 
         * > ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * The billing cycle of the subscription instance. This parameter is required when **CommodityCode** is set to **rds**, **rds_rordspre_public_cn**, **rds_intl**, or **rds_rordspre_public_intl**. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * The subscription duration of the instance.
         * <p>
         * 
         * *   If you set the **TimeType** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 100**.
         * *   If you set the **TimeType** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 999**.
         * 
         * Default value: **1**.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The zone ID of the primary instance. You can call the DescribeRegions operation to query the most recent zone list.
         * <p>
         * 
         * >  If you specify a virtual private cloud (VPC) and a vSwitch, this parameter is required to identify the zone for the vSwitch.
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

    public static class DBNode extends TeaModel {
        @NameInMap("ClassCode")
        private String classCode;

        @NameInMap("ZoneId")
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

            /**
             * The instance type of the node.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The zone ID of the node.
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
    public static class ServerlessConfig extends TeaModel {
        @NameInMap("MaxCapacity")
        private Double maxCapacity;

        @NameInMap("MinCapacity")
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

            /**
             * The maximum number of RDS Capacity Units (RCUs).
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum number of RCUs.
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
