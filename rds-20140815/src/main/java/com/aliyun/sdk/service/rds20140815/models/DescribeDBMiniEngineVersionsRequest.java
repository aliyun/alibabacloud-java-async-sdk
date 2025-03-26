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
 * {@link DescribeDBMiniEngineVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBMiniEngineVersionsRequest</p>
 */
public class DescribeDBMiniEngineVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorVersionTag")
    private String minorVersionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private DescribeDBMiniEngineVersionsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.minorVersionTag = builder.minorVersionTag;
        this.nodeType = builder.nodeType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBMiniEngineVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
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
     * @return minorVersionTag
     */
    public String getMinorVersionTag() {
        return this.minorVersionTag;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<DescribeDBMiniEngineVersionsRequest, Builder> {
        private String DBInstanceId; 
        private String dedicatedHostGroupId; 
        private String engine; 
        private String engineVersion; 
        private String minorVersionTag; 
        private String nodeType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBMiniEngineVersionsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.minorVersionTag = request.minorVersionTag;
            this.nodeType = request.nodeType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageType = request.storageType;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-4n*****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The database engine of the instance. Valid values: <strong>MySQL</strong> and <strong>PostgreSQL</strong>.</p>
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
         * <li>Valid values when you set the Engine parameter to MySQL: <strong>8.0</strong>, <strong>5.7</strong>, <strong>5.6</strong>, and <strong>5.5</strong></li>
         * <li>Valid values when you set the Engine parameter to PostgreSQL: <strong>15.0</strong>, <strong>14.0</strong>, <strong>13.0</strong>, <strong>12.0</strong>, <strong>11.0</strong>, and <strong>10.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The minor engine version of the instance. You can specify this parameter to query the minor engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_20220731</p>
         */
        public Builder minorVersionTag(String minorVersionTag) {
            this.putQueryParameter("MinorVersionTag", minorVersionTag);
            this.minorVersionTag = minorVersionTag;
            return this;
        }

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD) of performance level 1 (PL1)</li>
         * <li><strong>cloud_essd2</strong>: ESSD of PL2</li>
         * <li><strong>cloud_essd3</strong>: ESSD of PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public DescribeDBMiniEngineVersionsRequest build() {
            return new DescribeDBMiniEngineVersionsRequest(this);
        } 

    } 

}
