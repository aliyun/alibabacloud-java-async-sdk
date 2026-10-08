// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Address> addresses;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<Address> getAddresses() {
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
    public java.util.Map<String, ?> getCustomLabels() {
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
        private java.util.List<Address> addresses; 
        private String createTime; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String locationDateClusterEndTime; 
        private String locationDateClusterLevel; 
        private String locationDateClusterStartTime; 
        private String objectId; 
        private String title; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(LocationDateCluster model) {
            this.addresses = model.addresses;
            this.createTime = model.createTime;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.locationDateClusterEndTime = model.locationDateClusterEndTime;
            this.locationDateClusterLevel = model.locationDateClusterLevel;
            this.locationDateClusterStartTime = model.locationDateClusterStartTime;
            this.objectId = model.objectId;
            this.title = model.title;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The addresses.</p>
         */
        public Builder addresses(java.util.List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The time when the spatiotemporal cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-16T13:14:34.882523669+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The custom ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * <p>The custom labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;User&quot;: &quot;Jane&quot;
         * }</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The end time of the spatiotemporal cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-02T23:59:59.999999999+08:00</p>
         */
        public Builder locationDateClusterEndTime(String locationDateClusterEndTime) {
            this.locationDateClusterEndTime = locationDateClusterEndTime;
            return this;
        }

        /**
         * <p>The administrative level of the spatiotemporal cluster.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>country</li>
         * <li>province</li>
         * <li>city</li>
         * <li>district</li>
         * <li>township</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>province</p>
         */
        public Builder locationDateClusterLevel(String locationDateClusterLevel) {
            this.locationDateClusterLevel = locationDateClusterLevel;
            return this;
        }

        /**
         * <p>The start time of the spatiotemporal cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-01T00:00:00+08:00</p>
         */
        public Builder locationDateClusterStartTime(String locationDateClusterStartTime) {
            this.locationDateClusterStartTime = locationDateClusterStartTime;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>location-date-cluster-14f48cb3-079d-4595-80c4-5735284b****</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The custom title.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州一日游</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The time when the spatiotemporal cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-16T13:15:05.65746784+08:00</p>
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
