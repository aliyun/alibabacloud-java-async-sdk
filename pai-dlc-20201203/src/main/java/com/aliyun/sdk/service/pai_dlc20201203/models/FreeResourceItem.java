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
 * {@link FreeResourceItem} extends {@link TeaModel}
 *
 * <p>FreeResourceItem</p>
 */
public class FreeResourceItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableNumber")
    private Long availableNumber;

    @com.aliyun.core.annotation.NameInMap("ClusterID")
    private String clusterID;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("FreeResourceId")
    private String freeResourceId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("RegionID")
    private String regionID;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(FreeResourceItem model) {
            this.availableNumber = model.availableNumber;
            this.clusterID = model.clusterID;
            this.clusterName = model.clusterName;
            this.freeResourceId = model.freeResourceId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.regionID = model.regionID;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder availableNumber(Long availableNumber) {
            this.availableNumber = availableNumber;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         */
        public Builder clusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The idle resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>freeres-whateversth</p>
         */
        public Builder freeResourceId(String freeResourceId) {
            this.freeResourceId = freeResourceId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-18T12:52:15Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-18T12:52:15Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inner</p>
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
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
