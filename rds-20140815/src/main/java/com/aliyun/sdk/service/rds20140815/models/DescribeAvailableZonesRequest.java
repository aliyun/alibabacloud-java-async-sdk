// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableZonesRequest</p>
 */
public class DescribeAvailableZonesRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @Query
    @NameInMap("DispenseMode")
    private String dispenseMode;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeAvailableZonesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.commodityCode = builder.commodityCode;
        this.DBInstanceName = builder.DBInstanceName;
        this.dispenseMode = builder.dispenseMode;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableZonesRequest create() {
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dispenseMode
     */
    public String getDispenseMode() {
        return this.dispenseMode;
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

    public static final class Builder extends Request.Builder<DescribeAvailableZonesRequest, Builder> {
        private String category; 
        private String commodityCode; 
        private String DBInstanceName; 
        private String dispenseMode; 
        private String engine; 
        private String engineVersion; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableZonesRequest request) {
            super(request);
            this.category = request.category;
            this.commodityCode = request.commodityCode;
            this.DBInstanceName = request.DBInstanceName;
            this.dispenseMode = request.dispenseMode;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   **Basic**: RDS Basic Edition.
         * *   **HighAvailability**: RDS High-availability Edition.
         * *   **cluster**: RDS Cluster Edition for MySQL.
         * *   **AlwaysOn**: RDS Cluster Edition for SQL Server.
         * *   **Finance**: RDS Enterprise Edition.
         * 
         * **Serverless instances**
         * 
         * *   **serverless_basic**: RDS Serverless Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.
         * *   **serverless_standard**: RDS Serverless High-availability Edition for MySQL.
         * *   **serverless_ha** RDS Serverless High-availability Edition for SQL Server.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The commodity code of the instance. This operation can return the resources that you can purchase based on the specified commodity code. Valid values:
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
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The ID of the primary instance. If you want to query the read-only instances that you can purchase for a primary instance, you can specify this parameter.
         * <p>
         * 
         * If you set **CommodityCode** to one of the following values, you must specify this parameter:
         * 
         * *   **rords_intl**
         * *   **rds_rordspre_public_intl**
         * *   **rords**
         * *   **rds_rordspre_public_cn**
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Specifies whether to return the zones in which the single-zone deployment method is supported. Valid values:
         * <p>
         * 
         * *   **1** (default): returns the zones.
         * *   **0**: does not return the zones.
         * 
         * > The single-zone deployment method allows you to deploy an instance that runs RDS Enterprise Edition in a single zone.
         */
        public Builder dispenseMode(String dispenseMode) {
            this.putQueryParameter("DispenseMode", dispenseMode);
            this.dispenseMode = dispenseMode;
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
         * The database engine version of the instance. Valid values:
         * <p>
         * 
         * *   Valid values if you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**
         * *   Valid values if you set Engine to SQLServer: **2008r2**, **08r2\_ent_ha**, **2012**, **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_std_ha**, **2017\_ent**, **2019\_std_ha**, and **2019\_ent**
         * *   Valid values if you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**
         * *   Valid value if you set Engine to MariaDB: **10.3**
         * 
         * **Serverless instances**
         * 
         * *   Valid values if you set Engine to MySQL: **5.7** and **8.0**
         * *   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**
         * *   Valid value if you set Engine to PostgreSQL: **14.0**
         * 
         * > ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
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
         * The zone ID of the instance. If the instance spans more than one zone, the value of this parameter contains an `MAZ` part, such as `cn-hangzhou-MAZ6(b,f)` and `cn-hangzhou-MAZ5(b,e,f)`. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableZonesRequest build() {
            return new DescribeAvailableZonesRequest(this);
        } 

    } 

}
