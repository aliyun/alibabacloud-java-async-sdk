// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyScheduledTaskRequest</p>
 */
public class ModifyScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportLanguage")
    private String reportLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private String timeRange;

    private ModifyScheduledTaskRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.frequency = builder.frequency;
        this.instanceIds = builder.instanceIds;
        this.name = builder.name;
        this.reportLanguage = builder.reportLanguage;
        this.scheduledId = builder.scheduledId;
        this.startTime = builder.startTime;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduledTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reportLanguage
     */
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    /**
     * @return scheduledId
     */
    public String getScheduledId() {
        return this.scheduledId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<ModifyScheduledTaskRequest, Builder> {
        private String description; 
        private String frequency; 
        private String instanceIds; 
        private String name; 
        private String reportLanguage; 
        private String scheduledId; 
        private String startTime; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScheduledTaskRequest request) {
            super(request);
            this.description = request.description;
            this.frequency = request.frequency;
            this.instanceIds = request.instanceIds;
            this.name = request.name;
            this.reportLanguage = request.reportLanguage;
            this.scheduledId = request.scheduledId;
            this.startTime = request.startTime;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>The description of the new inspection configuration.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
         * <ul>
         * <li>DAILY</li>
         * <li>Monday</li>
         * <li>Tuesday</li>
         * <li>Wednesday</li>
         * <li>Thursday</li>
         * <li>Friday</li>
         * <li>Saturday</li>
         * <li>Sunday</li>
         * </ul>
         * <h3><a href="#daily--dailymonday--daily-"></a>Note: DAILY takes precedence over other values. For example, if you enter DAILY,Monday, the backend will use DAILY as the inspection frequency.</h3>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The new list of related instances. Separate multiple instances with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The name of the new inspection configuration.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ReportLanguage.
         */
        public Builder reportLanguage(String reportLanguage) {
            this.putQueryParameter("ReportLanguage", reportLanguage);
            this.reportLanguage = reportLanguage;
            return this;
        }

        /**
         * <p>The ID of the scheduled inspection configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
         */
        public Builder scheduledId(String scheduledId) {
            this.putQueryParameter("ScheduledId", scheduledId);
            this.scheduledId = scheduledId;
            return this;
        }

        /**
         * <p>The new execution time of the inspection task. Specify the time in the ISO 8601 standard in the HH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The inspection time range. The default value is the latest 24 hours. Valid values: 1 to 168. The maximum value is 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public ModifyScheduledTaskRequest build() {
            return new ModifyScheduledTaskRequest(this);
        } 

    } 

}
