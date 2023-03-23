// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreeResourceItem} extends {@link TeaModel}
 *
 * <p>FreeResourceItem</p>
 */
public class FreeResourceItem extends TeaModel {
    @NameInMap("AvailableNumber")
    private Long availableNumber;

    @NameInMap("ClusterID")
    private String clusterID;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("FreeResourceId")
    private String freeResourceId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("RegionID")
    private String regionID;

    @NameInMap("ResourceType")
    private String resourceType;

    private FreeResourceItem(Builder builder) {
        this.availableNumber = builder.availableNumber;
        this.clusterID = builder.clusterID;
        this.clusterName = builder.clusterName;
        this.freeResourceId = builder.freeResourceId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.regionID = builder.regionID;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreeResourceItem create() {
        return builder().build();
    }

    /**
     * @return availableNumber
     */
    public Long getAvailableNumber() {
        return this.availableNumber;
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
     * @return freeResourceId
     */
    public String getFreeResourceId() {
        return this.freeResourceId;
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

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private Long availableNumber; 
        private String clusterID; 
        private String clusterName; 
        private String freeResourceId; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String regionID; 
        private String resourceType; 

        /**
         * 资源数量
         */
        public Builder availableNumber(Long availableNumber) {
            this.availableNumber = availableNumber;
            return this;
        }

        /**
         * 集群Id
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
         * 空闲资源Id
         */
        public Builder freeResourceId(String freeResourceId) {
            this.freeResourceId = freeResourceId;
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
         * 域Id
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public FreeResourceItem build() {
            return new FreeResourceItem(this);
        } 

    } 

}
