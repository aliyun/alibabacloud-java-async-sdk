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
 * {@link CreateInspectionScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateInspectionScheduleRequest</p>
 */
public class CreateInspectionScheduleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

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
    @com.aliyun.core.annotation.NameInMap("ScheduleName")
    private String scheduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    private CreateInspectionScheduleRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.inspectionItems = builder.inspectionItems;
        this.inspectionWindow = builder.inspectionWindow;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.reportLanguage = builder.reportLanguage;
        this.scheduleName = builder.scheduleName;
        this.securityToken = builder.securityToken;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspectionScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
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
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<CreateInspectionScheduleRequest, Builder> {
        private String cronExpression; 
        private String inspectionItems; 
        private String inspectionWindow; 
        private String instanceId; 
        private String instanceIds; 
        private String reportLanguage; 
        private String scheduleName; 
        private String securityToken; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspectionScheduleRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.inspectionItems = request.inspectionItems;
            this.inspectionWindow = request.inspectionWindow;
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.reportLanguage = request.reportLanguage;
            this.scheduleName = request.scheduleName;
            this.securityToken = request.securityToken;
            this.timezone = request.timezone;
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
         * InspectionItems.
         */
        public Builder inspectionItems(String inspectionItems) {
            this.putQueryParameter("InspectionItems", inspectionItems);
            this.inspectionItems = inspectionItems;
            return this;
        }

        /**
         * InspectionWindow.
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
         * <p>ta-bp11iljddg37xxxx</p>
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
         * ScheduleName.
         */
        public Builder scheduleName(String scheduleName) {
            this.putQueryParameter("ScheduleName", scheduleName);
            this.scheduleName = scheduleName;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
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
        public CreateInspectionScheduleRequest build() {
            return new CreateInspectionScheduleRequest(this);
        } 

    } 

}
