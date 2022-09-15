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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * MinorVersionTag.
         */
        public Builder minorVersionTag(String minorVersionTag) {
            this.putQueryParameter("MinorVersionTag", minorVersionTag);
            this.minorVersionTag = minorVersionTag;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * RegionId.
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
         * StorageType.
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
