// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link LocationDateCluster} extends {@link TeaModel}
 *
 * <p>LocationDateCluster</p>
 */
public class LocationDateCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private Address address;

    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("custom_labels")
    private java.util.Map<String, String> customLabels;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("end_time")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("start_time")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private LocationDateCluster(Builder builder) {
        this.address = builder.address;
        this.clusterId = builder.clusterId;
        this.createdAt = builder.createdAt;
        this.customLabels = builder.customLabels;
        this.driveId = builder.driveId;
        this.endTime = builder.endTime;
        this.level = builder.level;
        this.startTime = builder.startTime;
        this.title = builder.title;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocationDateCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Address address; 
        private String clusterId; 
        private String createdAt; 
        private java.util.Map<String, String> customLabels; 
        private String driveId; 
        private String endTime; 
        private String level; 
        private String startTime; 
        private String title; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(LocationDateCluster model) {
            this.address = model.address;
            this.clusterId = model.clusterId;
            this.createdAt = model.createdAt;
            this.customLabels = model.customLabels;
            this.driveId = model.driveId;
            this.endTime = model.endTime;
            this.level = model.level;
            this.startTime = model.startTime;
            this.title = model.title;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * address.
         */
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(java.util.Map<String, String> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * end_time.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * start_time.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public LocationDateCluster build() {
            return new LocationDateCluster(this);
        } 

    } 

}
