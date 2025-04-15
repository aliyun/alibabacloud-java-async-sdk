// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenStructMvRecommendTaskModel} extends {@link TeaModel}
 *
 * <p>OpenStructMvRecommendTaskModel</p>
 */
public class OpenStructMvRecommendTaskModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LastRunAt")
    private String lastRunAt;

    @com.aliyun.core.annotation.NameInMap("ScanQueriesRange")
    private Integer scanQueriesRange;

    @com.aliyun.core.annotation.NameInMap("SchedulingSettings")
    private String schedulingSettings;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private OpenStructMvRecommendTaskModel(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastRunAt = builder.lastRunAt;
        this.scanQueriesRange = builder.scanQueriesRange;
        this.schedulingSettings = builder.schedulingSettings;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructMvRecommendTaskModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastRunAt
     */
    public String getLastRunAt() {
        return this.lastRunAt;
    }

    /**
     * @return scanQueriesRange
     */
    public Integer getScanQueriesRange() {
        return this.scanQueriesRange;
    }

    /**
     * @return schedulingSettings
     */
    public String getSchedulingSettings() {
        return this.schedulingSettings;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String lastRunAt; 
        private Integer scanQueriesRange; 
        private String schedulingSettings; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(OpenStructMvRecommendTaskModel model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.lastRunAt = model.lastRunAt;
            this.scanQueriesRange = model.scanQueriesRange;
            this.schedulingSettings = model.schedulingSettings;
            this.taskName = model.taskName;
        } 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * LastRunAt.
         */
        public Builder lastRunAt(String lastRunAt) {
            this.lastRunAt = lastRunAt;
            return this;
        }

        /**
         * ScanQueriesRange.
         */
        public Builder scanQueriesRange(Integer scanQueriesRange) {
            this.scanQueriesRange = scanQueriesRange;
            return this;
        }

        /**
         * SchedulingSettings.
         */
        public Builder schedulingSettings(String schedulingSettings) {
            this.schedulingSettings = schedulingSettings;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public OpenStructMvRecommendTaskModel build() {
            return new OpenStructMvRecommendTaskModel(this);
        } 

    } 

}
