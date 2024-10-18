// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LocationDateCluster} extends {@link TeaModel}
 *
 * <p>LocationDateCluster</p>
 */
public class LocationDateCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List < Address > addresses;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.NameInMap("LocationDateClusterEndTime")
    private String locationDateClusterEndTime;

    @com.aliyun.core.annotation.NameInMap("LocationDateClusterLevel")
    private String locationDateClusterLevel;

    @com.aliyun.core.annotation.NameInMap("LocationDateClusterStartTime")
    private String locationDateClusterStartTime;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private LocationDateCluster(Builder builder) {
        this.addresses = builder.addresses;
        this.createTime = builder.createTime;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.locationDateClusterEndTime = builder.locationDateClusterEndTime;
        this.locationDateClusterLevel = builder.locationDateClusterLevel;
        this.locationDateClusterStartTime = builder.locationDateClusterStartTime;
        this.objectId = builder.objectId;
        this.title = builder.title;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocationDateCluster create() {
        return builder().build();
    }

    /**
     * @return addresses
     */
    public java.util.List < Address > getAddresses() {
        return this.addresses;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return locationDateClusterEndTime
     */
    public String getLocationDateClusterEndTime() {
        return this.locationDateClusterEndTime;
    }

    /**
     * @return locationDateClusterLevel
     */
    public String getLocationDateClusterLevel() {
        return this.locationDateClusterLevel;
    }

    /**
     * @return locationDateClusterStartTime
     */
    public String getLocationDateClusterStartTime() {
        return this.locationDateClusterStartTime;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List < Address > addresses; 
        private String createTime; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private String locationDateClusterEndTime; 
        private String locationDateClusterLevel; 
        private String locationDateClusterStartTime; 
        private String objectId; 
        private String title; 
        private String updateTime; 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < Address > addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CustomId.
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * LocationDateClusterEndTime.
         */
        public Builder locationDateClusterEndTime(String locationDateClusterEndTime) {
            this.locationDateClusterEndTime = locationDateClusterEndTime;
            return this;
        }

        /**
         * LocationDateClusterLevel.
         */
        public Builder locationDateClusterLevel(String locationDateClusterLevel) {
            this.locationDateClusterLevel = locationDateClusterLevel;
            return this;
        }

        /**
         * LocationDateClusterStartTime.
         */
        public Builder locationDateClusterStartTime(String locationDateClusterStartTime) {
            this.locationDateClusterStartTime = locationDateClusterStartTime;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public LocationDateCluster build() {
            return new LocationDateCluster(this);
        } 

    } 

}
