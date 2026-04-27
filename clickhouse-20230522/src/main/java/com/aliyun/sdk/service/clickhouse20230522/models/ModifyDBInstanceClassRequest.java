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
    @com.aliyun.core.annotation.NameInMap("AutoScaleConfig")
    private AutoScaleConfig autoScaleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputingGroupId")
    private String computingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 1)
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMax")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 4)
    private Integer nodeScaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMin")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 4)
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
    private Long storageQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyDBInstanceClassRequest(Builder builder) {
        super(builder);
        this.autoScaleConfig = builder.autoScaleConfig;
        this.computingGroupId = builder.computingGroupId;
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
     * @return autoScaleConfig
     */
    public AutoScaleConfig getAutoScaleConfig() {
        return this.autoScaleConfig;
    }

    /**
     * @return computingGroupId
     */
    public String getComputingGroupId() {
        return this.computingGroupId;
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
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceClassRequest, Builder> {
        private AutoScaleConfig autoScaleConfig; 
        private String computingGroupId; 
        private String DBInstanceId; 
        private Integer nodeCount; 
        private Integer nodeScaleMax; 
        private Integer nodeScaleMin; 
        private String regionId; 
        private Long scaleMax; 
        private Long scaleMin; 
        private Long storageQuota; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceClassRequest request) {
            super(request);
            this.autoScaleConfig = request.autoScaleConfig;
            this.computingGroupId = request.computingGroupId;
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
         * AutoScaleConfig.
         */
        public Builder autoScaleConfig(AutoScaleConfig autoScaleConfig) {
            String autoScaleConfigShrink = shrink(autoScaleConfig, "AutoScaleConfig", "json");
            this.putQueryParameter("AutoScaleConfig", autoScaleConfigShrink);
            this.autoScaleConfig = autoScaleConfig;
            return this;
        }

        /**
         * ComputingGroupId.
         */
        public Builder computingGroupId(String computingGroupId) {
            this.putQueryParameter("ComputingGroupId", computingGroupId);
            this.computingGroupId = computingGroupId;
            return this;
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
        public Builder storageQuota(Long storageQuota) {
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

    /**
     * 
     * {@link ModifyDBInstanceClassRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceClassRequest</p>
     */
    public static class VSwitchInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitchInfos(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchInfos create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitchInfos model) {
                this.vSwitchIds = model.vSwitchIds;
                this.zoneId = model.zoneId;
            } 

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchInfos build() {
                return new VSwitchInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBInstanceClassRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceClassRequest</p>
     */
    public static class AutoScaleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BurstNum")
        @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 1)
        private Integer burstNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchInfos")
        private java.util.List<VSwitchInfos> vSwitchInfos;

        private AutoScaleConfig(Builder builder) {
            this.burstNum = builder.burstNum;
            this.status = builder.status;
            this.vSwitchInfos = builder.vSwitchInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoScaleConfig create() {
            return builder().build();
        }

        /**
         * @return burstNum
         */
        public Integer getBurstNum() {
            return this.burstNum;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchInfos
         */
        public java.util.List<VSwitchInfos> getVSwitchInfos() {
            return this.vSwitchInfos;
        }

        public static final class Builder {
            private Integer burstNum; 
            private String status; 
            private java.util.List<VSwitchInfos> vSwitchInfos; 

            private Builder() {
            } 

            private Builder(AutoScaleConfig model) {
                this.burstNum = model.burstNum;
                this.status = model.status;
                this.vSwitchInfos = model.vSwitchInfos;
            } 

            /**
             * BurstNum.
             */
            public Builder burstNum(Integer burstNum) {
                this.burstNum = burstNum;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchInfos.
             */
            public Builder vSwitchInfos(java.util.List<VSwitchInfos> vSwitchInfos) {
                this.vSwitchInfos = vSwitchInfos;
                return this;
            }

            public AutoScaleConfig build() {
                return new AutoScaleConfig(this);
            } 

        } 

    }
}
