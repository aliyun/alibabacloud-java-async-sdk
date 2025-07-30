// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheSize")
    private String cacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNodeCount")
    private Integer clusterNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNodeType")
    private String clusterNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private Double scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private Double scaleMin;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.cacheSize = builder.cacheSize;
        this.clusterNodeCount = builder.clusterNodeCount;
        this.clusterNodeType = builder.clusterNodeType;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterId = builder.DBClusterId;
        this.DBInstanceId = builder.DBInstanceId;
        this.engine = builder.engine;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheSize
     */
    public String getCacheSize() {
        return this.cacheSize;
    }

    /**
     * @return clusterNodeCount
     */
    public Integer getClusterNodeCount() {
        return this.clusterNodeCount;
    }

    /**
     * @return clusterNodeType
     */
    public String getClusterNodeType() {
        return this.clusterNodeType;
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
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
     * @return scaleMax
     */
    public Double getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public Double getScaleMin() {
        return this.scaleMin;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String cacheSize; 
        private Integer clusterNodeCount; 
        private String clusterNodeType; 
        private String DBClusterClass; 
        private String DBClusterId; 
        private String DBInstanceId; 
        private String engine; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Double scaleMax; 
        private Double scaleMin; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.cacheSize = request.cacheSize;
            this.clusterNodeCount = request.clusterNodeCount;
            this.clusterNodeType = request.clusterNodeType;
            this.DBClusterClass = request.DBClusterClass;
            this.DBClusterId = request.DBClusterId;
            this.DBInstanceId = request.DBInstanceId;
            this.engine = request.engine;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
        } 

        /**
         * <p>The size of the reserved cache.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder cacheSize(String cacheSize) {
            this.putQueryParameter("CacheSize", cacheSize);
            this.cacheSize = cacheSize;
            return this;
        }

        /**
         * ClusterNodeCount.
         */
        public Builder clusterNodeCount(Integer clusterNodeCount) {
            this.putQueryParameter("ClusterNodeCount", clusterNodeCount);
            this.clusterNodeCount = clusterNodeCount;
            return this;
        }

        /**
         * ClusterNodeType.
         */
        public Builder clusterNodeType(String clusterNodeType) {
            this.putQueryParameter("ClusterNodeType", clusterNodeType);
            this.clusterNodeType = clusterNodeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-xxxb9f2w-be</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The database engine of the instance. Set the value to selectdb.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
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
         * ScaleMax.
         */
        public Builder scaleMax(Double scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * ScaleMin.
         */
        public Builder scaleMin(Double scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
