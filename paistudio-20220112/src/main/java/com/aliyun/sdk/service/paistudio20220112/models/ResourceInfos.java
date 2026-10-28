// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResourceInfos} extends {@link TeaModel}
 *
 * <p>ResourceInfos</p>
 */
public class ResourceInfos extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("GpuCardType")
    private String gpuCardType;

    @com.aliyun.core.annotation.NameInMap("MachineModel")
    private String machineModel;

    @com.aliyun.core.annotation.NameInMap("MaxQuota")
    private Long maxQuota;

    @com.aliyun.core.annotation.NameInMap("NetworkPodId")
    private String networkPodId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("UsedQuota")
    private Long usedQuota;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ResourceInfos(Builder builder) {
        this.clusterId = builder.clusterId;
        this.ecsSpec = builder.ecsSpec;
        this.gpuCardType = builder.gpuCardType;
        this.machineModel = builder.machineModel;
        this.maxQuota = builder.maxQuota;
        this.networkPodId = builder.networkPodId;
        this.regionId = builder.regionId;
        this.usedQuota = builder.usedQuota;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInfos create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return gpuCardType
     */
    public String getGpuCardType() {
        return this.gpuCardType;
    }

    /**
     * @return machineModel
     */
    public String getMachineModel() {
        return this.machineModel;
    }

    /**
     * @return maxQuota
     */
    public Long getMaxQuota() {
        return this.maxQuota;
    }

    /**
     * @return networkPodId
     */
    public String getNetworkPodId() {
        return this.networkPodId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usedQuota
     */
    public Long getUsedQuota() {
        return this.usedQuota;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String clusterId; 
        private String ecsSpec; 
        private String gpuCardType; 
        private String machineModel; 
        private Long maxQuota; 
        private String networkPodId; 
        private String regionId; 
        private Long usedQuota; 
        private String userId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(ResourceInfos model) {
            this.clusterId = model.clusterId;
            this.ecsSpec = model.ecsSpec;
            this.gpuCardType = model.gpuCardType;
            this.machineModel = model.machineModel;
            this.maxQuota = model.maxQuota;
            this.networkPodId = model.networkPodId;
            this.regionId = model.regionId;
            this.usedQuota = model.usedQuota;
            this.userId = model.userId;
            this.userName = model.userName;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ECS instance type information.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn5-c8g1.2xlarge</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The GPU card type.</p>
         */
        public Builder gpuCardType(String gpuCardType) {
            this.gpuCardType = gpuCardType;
            return this;
        }

        /**
         * <p>The machine model.</p>
         */
        public Builder machineModel(String machineModel) {
            this.machineModel = machineModel;
            return this;
        }

        /**
         * <p>The maximum quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxQuota(Long maxQuota) {
            this.maxQuota = maxQuota;
            return this;
        }

        /**
         * <p>The network pod ID.</p>
         */
        public Builder networkPodId(String networkPodId) {
            this.networkPodId = networkPodId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder usedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public ResourceInfos build() {
            return new ResourceInfos(this);
        } 

    } 

}
