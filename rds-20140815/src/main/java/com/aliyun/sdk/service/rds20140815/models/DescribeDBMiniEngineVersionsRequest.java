// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBMiniEngineVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBMiniEngineVersionsRequest</p>
 */
public class DescribeDBMiniEngineVersionsRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    private String engineVersion;

    @Query
    @NameInMap("MinorVersionTag")
    private String minorVersionTag;

    @Query
    @NameInMap("NodeType")
    private String nodeType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StorageType")
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
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The database engine of the instance. Valid values: **MySQL** and **PostgreSQL**.
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
         * *   Valid values when you set the Engine parameter to MySQL: **8.0**, **5.7**, **5.6**, and **5.5**
         * *   Valid values when you set the Engine parameter to PostgreSQL: **15.0**, **14.0**, **13.0**, **12.0**, **11.0**, and **10.0**
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The minor engine version of the instance. You can specify this parameter to query the minor engine version of the instance.
         */
        public Builder minorVersionTag(String minorVersionTag) {
            this.putQueryParameter("MinorVersionTag", minorVersionTag);
            this.minorVersionTag = minorVersionTag;
            return this;
        }

        /**
         * The instance edition. Valid values:
         * <p>
         * 
         * *   **Basic**: RDS Basic Edition
         * *   **HighAvailability**: RDS High-availability Edition
         * *   **Finance**: RDS Enterprise Edition
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD
         * *   **cloud_ssd**: standard SSD
         * *   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1)
         * *   **cloud_essd2**: ESSD of PL2
         * *   **cloud_essd3**: ESSD of PL3
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
