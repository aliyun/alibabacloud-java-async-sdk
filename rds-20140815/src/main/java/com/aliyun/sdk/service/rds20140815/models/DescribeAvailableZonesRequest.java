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
 * {@link DescribeAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableZonesRequest</p>
 */
public class DescribeAvailableZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispenseMode")
    private String dispenseMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><p>Regular instance</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
         * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: RDS High-availability Edition for ApsaraDB RDS for MySQL.</li>
         * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The commodity code of the instance. This operation can return the resources that you can purchase based on the specified commodity code. Valid values:</p>
         * <ul>
         * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rds</strong>: The instance is a subscription primary instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).</li>
         * <li><strong>rds_intl</strong>: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).</li>
         * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).</li>
         * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance. This value is available at the International site (alibabacloud.com).</li>
         * <li><strong>rds_serverless_public_cn</strong>: The instance is a serverless instance. This value is available at the China site (aliyun.com).</li>
         * <li><strong>rds_serverless_public_intl</strong>: The instance is a serverless instance. This value is available at the International site (alibabacloud.com).</li>
         * </ul>
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
         * <p>The ID of the primary instance. If you want to query the read-only instances that you can purchase for a primary instance, you can specify this parameter.</p>
         * <p>If you set <strong>CommodityCode</strong> to one of the following values, you must specify this parameter:</p>
         * <ul>
         * <li><strong>rords_intl</strong></li>
         * <li><strong>rds_rordspre_public_intl</strong></li>
         * <li><strong>rords</strong></li>
         * <li><strong>rds_rordspre_public_cn</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Specifies whether to return the zones in which the single-zone deployment method is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): returns the zones.</li>
         * <li><strong>0</strong>: does not return the zones.</li>
         * </ul>
         * <blockquote>
         * <p> The single-zone deployment method allows you to deploy an instance that runs RDS Enterprise Edition in a single zone.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dispenseMode(String dispenseMode) {
            this.putQueryParameter("DispenseMode", dispenseMode);
            this.dispenseMode = dispenseMode;
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
         * <p>The database engine version. Valid values:</p>
         * <ul>
         * <li><p>Regular instance</p>
         * <ul>
         * <li>Valid values if you set Engine to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
         * <li>Valid values if you set Engine to SQLServer: <strong>2008r2</strong>, <strong>08r2_ent_ha</strong>, <strong>2012</strong>, <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_std_ha</strong>, <strong>2017_ent</strong>, <strong>2019_std_ha</strong>, and <strong>2019_ent</strong></li>
         * <li>Valid values if you set Engine to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
         * <li>Valid value when you set Engine to MariaDB: <strong>10.3</strong></li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li>Valid values if you set Engine to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
         * <li>Valid values if you set Engine to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
         * <li>Valid value if you set Engine to PostgreSQL: <strong>14.0</strong></li>
         * </ul>
         * <p>**</p>
         * <p><strong>Note</strong>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </li>
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
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The zone ID. If the instance spans more than one zone, the value of this parameter contains an <code>MAZ</code> part, such as <code>cn-hangzhou-MAZ6(b,f)</code> and <code>cn-hangzhou-MAZ5(b,e,f)</code>. You can call the DescribeRegions operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
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
