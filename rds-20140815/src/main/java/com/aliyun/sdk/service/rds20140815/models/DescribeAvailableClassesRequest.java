// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableClassesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableClassesRequest</p>
 */
public class DescribeAvailableClassesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private DescribeAvailableClassesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.commodityCode = builder.commodityCode;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceChargeType = builder.instanceChargeType;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableClassesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeAvailableClassesRequest, Builder> {
        private String category; 
        private String commodityCode; 
        private String DBInstanceId; 
        private String DBInstanceStorageType; 
        private String engine; 
        private String engineVersion; 
        private String instanceChargeType; 
        private String orderType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableClassesRequest request) {
            super(request);
            this.category = request.category;
            this.commodityCode = request.commodityCode;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.instanceChargeType = request.instanceChargeType;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   Regular instance
         * 
         *     *   **Basic**: RDS Basic Edition
         *     *   **HighAvailability**: RDS High-availability Edition
         *     *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL
         *     *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server
         *     *   **Finance**: RDS Enterprise Edition
         * 
         * *   Serverless instance
         * 
         *     *   **serverless_basic**: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.
         *     *   **serverless_standard**: RDS High-availability Edition for ApsaraDB RDS for MySQL.
         *     *   **serverless_ha**: RDS High-availability Edition for ApsaraDB RDS for SQL Server.
         * 
         *     > If you create a serverless instance, you must specify this parameter.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The commodity code of the instance. Valid values:
         * <p>
         * 
         * *   **bards**: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).
         * *   **rds**: The instance is a subscription primary instance. This value is available at the China site (aliyun.com).
         * *   **rords**: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).
         * *   **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).
         * *   **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).
         * *   **rds_intl**: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).
         * *   **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).
         * *   **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available at the International site (alibabacloud.com).
         * *   **rds_serverless_public_cn**: The instance is a serverless instance. This value is available at the China site (aliyun.com).
         * *   **rds_serverless_public_intl**: The instance is a serverless instance. This value is available at the International site (alibabacloud.com).
         * 
         * > If you want to query the price of a read-only instance, you must specify this parameter.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD. This is the recommended storage type.
         * *   **cloud_ssd**: standard SSD.
         * *   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1)
         * *   **cloud_essd2**: ESSDs of PL2
         * *   **cloud_essd3**: ESSD of PL3
         * 
         * > Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to **cloud_essd**.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The database engine that is run by the instance. Valid values:
         * <p>
         * 
         * * **MySQL**
         * * **SQLServer**
         * * **PostgreSQL**
         * * **MariaDB**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The database engine version of the instance. Valid values:
         * <p>
         * 
         * *   Regular instance
         * 
         *     *   Valid values if you set Engine to MySQL: **5.5, 5.6, 5.7, and 8.0**
         *     *   Valid values if you set Engine to SQLServer: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**
         *     *   Valid values if you set Engine to PostgreSQL: **10.0, 11.0, 12.0, 13.0, 14.0, and 15.0**
         *     *   Valid value when you set Engine to MariaDB: **10.3**
         * 
         * *   Serverless instance
         * 
         *     *   Valid values if you set Engine to MySQL: **5.7** and **8.0**
         *     *   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**
         *     *   Valid value if you set Engine to PostgreSQL: **14.0**
         * 
         *     > ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **Prepaid**: subscription
         * *   **Postpaid**: pay-as-you-go
         * *   **Serverless**: serverless
         * 
         * > ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The type of the order. Set the value to **BUY**
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The region ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The zone ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the zone ID of the instance.
         * <p>
         * 
         * >  If the DescribeDBInstanceAttribute operation returns multiple zones, you must specify only one of the returned zones. For example, if the DescribeDBInstanceAttribute operation returns `cn-hangzhou-MAZ9(g,h)`, you can set this parameter to `cn-hangzhou-g` or `cn-hangzhou-h`.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableClassesRequest build() {
            return new DescribeAvailableClassesRequest(this);
        } 

    } 

}
