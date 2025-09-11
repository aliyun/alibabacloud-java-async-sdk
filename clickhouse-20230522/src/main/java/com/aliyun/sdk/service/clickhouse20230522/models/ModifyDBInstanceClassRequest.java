// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link ModifyDBInstanceClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceClassRequest</p>
 */
public class ModifyDBInstanceClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMax")
    private Integer nodeScaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMin")
    private Integer nodeScaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private Long scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private Long scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageQuota")
    private String storageQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyDBInstanceClassRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeCount = builder.nodeCount;
        this.nodeScaleMax = builder.nodeScaleMax;
        this.nodeScaleMin = builder.nodeScaleMin;
        this.regionId = builder.regionId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.storageQuota = builder.storageQuota;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassRequest create() {
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
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeScaleMax
     */
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    /**
     * @return nodeScaleMin
     */
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scaleMax
     */
    public Long getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public Long getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return storageQuota
     */
    public String getStorageQuota() {
        return this.storageQuota;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceClassRequest, Builder> {
        private String DBInstanceId; 
        private Integer nodeCount; 
        private Integer nodeScaleMax; 
        private Integer nodeScaleMin; 
        private String regionId; 
        private Long scaleMax; 
        private Long scaleMin; 
        private String storageQuota; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceClassRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.nodeCount = request.nodeCount;
            this.nodeScaleMax = request.nodeScaleMax;
            this.nodeScaleMin = request.nodeScaleMin;
            this.regionId = request.regionId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.storageQuota = request.storageQuota;
            this.storageType = request.storageType;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeScaleMax.
         */
        public Builder nodeScaleMax(Integer nodeScaleMax) {
            this.putQueryParameter("NodeScaleMax", nodeScaleMax);
            this.nodeScaleMax = nodeScaleMax;
            return this;
        }

        /**
         * NodeScaleMin.
         */
        public Builder nodeScaleMin(Integer nodeScaleMin) {
            this.putQueryParameter("NodeScaleMin", nodeScaleMin);
            this.nodeScaleMin = nodeScaleMin;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The maximum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder scaleMax(Long scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleMin(Long scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * StorageQuota.
         */
        public Builder storageQuota(String storageQuota) {
            this.putQueryParameter("StorageQuota", storageQuota);
            this.storageQuota = storageQuota;
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
        public ModifyDBInstanceClassRequest build() {
            return new ModifyDBInstanceClassRequest(this);
        } 

    } 

}
