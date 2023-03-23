// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreeResourceClusterControlItem} extends {@link TeaModel}
 *
 * <p>FreeResourceClusterControlItem</p>
 */
public class FreeResourceClusterControlItem extends TeaModel {
    @NameInMap("ClusterID")
    private String clusterID;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("CrossClusters")
    private Boolean crossClusters;

    @NameInMap("EnableFreeResource")
    private Boolean enableFreeResource;

    @NameInMap("FreeResourceClusterControlId")
    private String freeResourceClusterControlId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("RegionID")
    private String regionID;

    private FreeResourceClusterControlItem(Builder builder) {
        this.clusterID = builder.clusterID;
        this.clusterName = builder.clusterName;
        this.crossClusters = builder.crossClusters;
        this.enableFreeResource = builder.enableFreeResource;
        this.freeResourceClusterControlId = builder.freeResourceClusterControlId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.regionID = builder.regionID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreeResourceClusterControlItem create() {
        return builder().build();
    }

    /**
     * @return clusterID
     */
    public String getClusterID() {
        return this.clusterID;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return crossClusters
     */
    public Boolean getCrossClusters() {
        return this.crossClusters;
    }

    /**
     * @return enableFreeResource
     */
    public Boolean getEnableFreeResource() {
        return this.enableFreeResource;
    }

    /**
     * @return freeResourceClusterControlId
     */
    public String getFreeResourceClusterControlId() {
        return this.freeResourceClusterControlId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return regionID
     */
    public String getRegionID() {
        return this.regionID;
    }

    public static final class Builder {
        private String clusterID; 
        private String clusterName; 
        private Boolean crossClusters; 
        private Boolean enableFreeResource; 
        private String freeResourceClusterControlId; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String regionID; 

        /**
         * 集群ID
         */
        public Builder clusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        /**
         * 集群名
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * 是否允许跨集群超卖
         */
        public Builder crossClusters(Boolean crossClusters) {
            this.crossClusters = crossClusters;
            return this;
        }

        /**
         * 是否打开集群超卖
         */
        public Builder enableFreeResource(Boolean enableFreeResource) {
            this.enableFreeResource = enableFreeResource;
            return this;
        }

        /**
         * 超卖资源集群控制Id
         */
        public Builder freeResourceClusterControlId(String freeResourceClusterControlId) {
            this.freeResourceClusterControlId = freeResourceClusterControlId;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 修改时间
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * 区域id
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
            return this;
        }

        public FreeResourceClusterControlItem build() {
            return new FreeResourceClusterControlItem(this);
        } 

    } 

}
