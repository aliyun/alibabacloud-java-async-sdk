// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link FreeResourceClusterControlItem} extends {@link TeaModel}
 *
 * <p>FreeResourceClusterControlItem</p>
 */
public class FreeResourceClusterControlItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterID")
    private String clusterID;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("CrossClusters")
    private Boolean crossClusters;

    @com.aliyun.core.annotation.NameInMap("EnableFreeResource")
    private Boolean enableFreeResource;

    @com.aliyun.core.annotation.NameInMap("FreeResourceClusterControlId")
    private String freeResourceClusterControlId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("RegionID")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(FreeResourceClusterControlItem model) {
            this.clusterID = model.clusterID;
            this.clusterName = model.clusterName;
            this.crossClusters = model.crossClusters;
            this.enableFreeResource = model.enableFreeResource;
            this.freeResourceClusterControlId = model.freeResourceClusterControlId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.regionID = model.regionID;
        } 

        /**
         * ClusterID.
         */
        public Builder clusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CrossClusters.
         */
        public Builder crossClusters(Boolean crossClusters) {
            this.crossClusters = crossClusters;
            return this;
        }

        /**
         * EnableFreeResource.
         */
        public Builder enableFreeResource(Boolean enableFreeResource) {
            this.enableFreeResource = enableFreeResource;
            return this;
        }

        /**
         * FreeResourceClusterControlId.
         */
        public Builder freeResourceClusterControlId(String freeResourceClusterControlId) {
            this.freeResourceClusterControlId = freeResourceClusterControlId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifyTime.
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * RegionID.
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
