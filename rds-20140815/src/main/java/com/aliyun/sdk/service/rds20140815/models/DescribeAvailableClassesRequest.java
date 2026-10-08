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
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><p>Regular instances</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition</li>
         * <li><strong>HighAvailability</strong>: high-availability series</li>
         * <li><strong>cluster</strong>: Cluster Edition (applicable only to MySQL and PostgreSQL)</li>
         * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
         * </ul>
         * </li>
         * <li><p>Serverless instances</p>
         * <ul>
         * <li><strong>serverless_basic</strong>: Serverless Basic Edition (applicable only to MySQL and PostgreSQL)</li>
         * <li><strong>serverless_standard</strong>: Serverless high availability series (applicable only to MySQL and PostgreSQL)</li>
         * <li><strong>serverless_ha</strong>: SQL Server Serverless high availability series</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a serverless instance.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The commodity code of the instance. Valid values:</p>
         * <ul>
         * <li><strong>bards</strong>: pay-as-you-go primary instance (China site)</li>
         * <li><strong>rds</strong>: subscription primary instance (China site)</li>
         * <li><strong>rords</strong>: pay-as-you-go read-only instance (China site)</li>
         * <li><strong>rds_rordspre_public_cn</strong>: subscription read-only instance (China site)</li>
         * <li><strong>bards_intl</strong>: pay-as-you-go primary instance (international site)</li>
         * <li><strong>rds_intl</strong>: subscription primary instance (international site)</li>
         * <li><strong>rords_intl</strong>: pay-as-you-go read-only instance (international site)</li>
         * <li><strong>rds_rordspre_public_intl</strong>: subscription read-only instance (international site)</li>
         * <li><strong>rds_serverless_public_cn</strong>: serverless (China site)</li>
         * <li><strong>rds_serverless_public_intl</strong>: serverless (international site)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you query a read-only instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bards</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The instance storage type. Valid values:</p>
         * <ul>
         * <li><strong>general_essd</strong>: premium performance disk</li>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd0</strong>: PL0 ESSD cloud disk</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD cloud disk</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD cloud disk</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD cloud disk</li>
         * </ul>
         * <blockquote>
         * <p>Serverless instances support only PL1 ESSD cloud disks. Set this parameter to <strong>cloud_essd</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <li><p>Regular instances</p>
         * <ul>
         * <li>MySQL: <strong>5.5, 5.6, 5.7, 8.0</strong></li>
         * <li>SQL Server: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, 2019_ent</strong></li>
         * <li>PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0</strong></li>
         * <li>MariaDB: <strong>10.3</strong></li>
         * </ul>
         * </li>
         * <li><p>Serverless instances</p>
         * <ul>
         * <li>MySQL: <strong>5.7</strong>, <strong>8.0</strong></li>
         * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, <strong>2019_std_sl</strong></li>
         * <li>PostgreSQL: <strong>14.0, 15.0, 16.0, 17.0</strong></li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Serverless</strong>: serverless</li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The order type. The only valid value is <strong>BUY</strong>.</p>
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
         * <p>The region ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the region ID.</p>
         * <p>This parameter is required.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The zone ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the zone ID.</p>
         * <blockquote>
         * <p>If DescribeDBInstanceAttribute returns a multi-zone value (such as <code>cn-hangzhou-MAZ9(g,h)</code>), specify a single zone. Example: <code>cn-hangzhou-g</code> or <code>cn-hangzhou-j</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
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
