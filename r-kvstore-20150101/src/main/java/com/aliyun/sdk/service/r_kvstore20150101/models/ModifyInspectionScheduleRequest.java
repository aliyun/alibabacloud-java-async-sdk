// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyInspectionScheduleRequest} extends {@link RequestModel}
 *
 * <p>ModifyInspectionScheduleRequest</p>
 */
public class ModifyInspectionScheduleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Long enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionItems")
    private String inspectionItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionWindow")
    private String inspectionWindow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportLanguage")
    private String reportLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleId")
    private String scheduleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleName")
    private String scheduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    private ModifyInspectionScheduleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cronExpression = builder.cronExpression;
        this.enabled = builder.enabled;
        this.inspectionItems = builder.inspectionItems;
        this.inspectionWindow = builder.inspectionWindow;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.reportLanguage = builder.reportLanguage;
        this.scheduleId = builder.scheduleId;
        this.scheduleName = builder.scheduleName;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInspectionScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return enabled
     */
    public Long getEnabled() {
        return this.enabled;
    }

    /**
     * @return inspectionItems
     */
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    /**
     * @return inspectionWindow
     */
    public String getInspectionWindow() {
        return this.inspectionWindow;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return reportLanguage
     */
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    /**
     * @return scheduleId
     */
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<ModifyInspectionScheduleRequest, Builder> {
        private String regionId; 
        private String cronExpression; 
        private Long enabled; 
        private String inspectionItems; 
        private String inspectionWindow; 
        private String instanceId; 
        private String instanceIds; 
        private String reportLanguage; 
        private String scheduleId; 
        private String scheduleName; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInspectionScheduleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cronExpression = request.cronExpression;
            this.enabled = request.enabled;
            this.inspectionItems = request.inspectionItems;
            this.inspectionWindow = request.inspectionWindow;
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.reportLanguage = request.reportLanguage;
            this.scheduleId = request.scheduleId;
            this.scheduleName = request.scheduleName;
            this.timezone = request.timezone;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Long enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * InspectionItems.
         */
        public Builder inspectionItems(String inspectionItems) {
            this.putQueryParameter("InspectionItems", inspectionItems);
            this.inspectionItems = inspectionItems;
            return this;
        }

        /**
         * <p>1h</p>
         * 
         * <strong>example:</strong>
         * <p>1h</p>
         */
        public Builder inspectionWindow(String inspectionWindow) {
            this.putQueryParameter("InspectionWindow", inspectionWindow);
            this.inspectionWindow = inspectionWindow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
         * ScheduleId.
         */
        public Builder scheduleId(String scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * ScheduleName.
         */
        public Builder scheduleName(String scheduleName) {
            this.putQueryParameter("ScheduleName", scheduleName);
            this.scheduleName = scheduleName;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        @Override
        public ModifyInspectionScheduleRequest build() {
            return new ModifyInspectionScheduleRequest(this);
        } 

    } 

}
