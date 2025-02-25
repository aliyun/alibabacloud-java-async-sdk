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
 * {@link Activity} extends {@link TeaModel}
 *
 * <p>Activity</p>
 */
public class Activity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activity_id")
    private String activityId;

    @com.aliyun.core.annotation.NameInMap("device")
    private String device;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("event_type")
    private Integer eventType;

    @com.aliyun.core.annotation.NameInMap("latest_event_time")
    private String latestEventTime;

    @com.aliyun.core.annotation.NameInMap("resource_category")
    private Integer resourceCategory;

    @com.aliyun.core.annotation.NameInMap("resource_list")
    private java.util.List<java.util.Map<String, ?>> resourceList;

    @com.aliyun.core.annotation.NameInMap("total_resource_count")
    private Long totalResourceCount;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private Activity(Builder builder) {
        this.activityId = builder.activityId;
        this.device = builder.device;
        this.driveId = builder.driveId;
        this.eventType = builder.eventType;
        this.latestEventTime = builder.latestEventTime;
        this.resourceCategory = builder.resourceCategory;
        this.resourceList = builder.resourceList;
        this.totalResourceCount = builder.totalResourceCount;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Activity create() {
        return builder().build();
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return eventType
     */
    public Integer getEventType() {
        return this.eventType;
    }

    /**
     * @return latestEventTime
     */
    public String getLatestEventTime() {
        return this.latestEventTime;
    }

    /**
     * @return resourceCategory
     */
    public Integer getResourceCategory() {
        return this.resourceCategory;
    }

    /**
     * @return resourceList
     */
    public java.util.List<java.util.Map<String, ?>> getResourceList() {
        return this.resourceList;
    }

    /**
     * @return totalResourceCount
     */
    public Long getTotalResourceCount() {
        return this.totalResourceCount;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String activityId; 
        private String device; 
        private String driveId; 
        private Integer eventType; 
        private String latestEventTime; 
        private Integer resourceCategory; 
        private java.util.List<java.util.Map<String, ?>> resourceList; 
        private Long totalResourceCount; 
        private String userId; 

        /**
         * activity_id.
         */
        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        /**
         * device.
         */
        public Builder device(String device) {
            this.device = device;
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
         * event_type.
         */
        public Builder eventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * latest_event_time.
         */
        public Builder latestEventTime(String latestEventTime) {
            this.latestEventTime = latestEventTime;
            return this;
        }

        /**
         * resource_category.
         */
        public Builder resourceCategory(Integer resourceCategory) {
            this.resourceCategory = resourceCategory;
            return this;
        }

        /**
         * resource_list.
         */
        public Builder resourceList(java.util.List<java.util.Map<String, ?>> resourceList) {
            this.resourceList = resourceList;
            return this;
        }

        /**
         * total_resource_count.
         */
        public Builder totalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Activity build() {
            return new Activity(this);
        } 

    } 

}
