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
 * {@link CreateInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInspectionTaskRequest</p>
 */
public class CreateInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionItems")
    private String inspectionItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportLanguage")
    private String reportLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateInspectionTaskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.inspectionItems = builder.inspectionItems;
        this.instanceIds = builder.instanceIds;
        this.reportLanguage = builder.reportLanguage;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return inspectionItems
     */
    public String getInspectionItems() {
        return this.inspectionItems;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateInspectionTaskRequest, Builder> {
        private String endTime; 
        private String inspectionItems; 
        private String instanceIds; 
        private String reportLanguage; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspectionTaskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.inspectionItems = request.inspectionItems;
            this.instanceIds = request.instanceIds;
            this.reportLanguage = request.reportLanguage;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. By default, the time range of the task is the latest 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-30T02:10:48Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The inspection items. Separates multiple items with commas (,). If this parameter is empty or not specified, all inspection items are executed.</p>
         * <h3><a href="#"></a>Valid values:</h3>
         * <ul>
         * <li>instance_info</li>
         * <li>resource_usage</li>
         * <li>connection_session_management</li>
         * <li>performance_metrics</li>
         * <li>slow_query_analysis</li>
         * <li>error_log_analysis</li>
         * <li>lock_wait_deadlock_analysis</li>
         * <li>backup_recovery_analysis</li>
         * <li>high_availability_disaster_recovery_analysis</li>
         * <li>security_configuration_analysis</li>
         * <li>storage_engine_analysis</li>
         * <li>schema_object_analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance_info, resource_usage</p>
         */
        public Builder inspectionItems(String inspectionItems) {
            this.putQueryParameter("InspectionItems", inspectionItems);
            this.inspectionItems = inspectionItems;
            return this;
        }

        /**
         * <p>The instances covered by the task. Separates multiple instance IDs with commas (,).</p>
         * <p>This parameter is required.</p>
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
         * ReportLanguage.
         */
        public Builder reportLanguage(String reportLanguage) {
            this.putQueryParameter("ReportLanguage", reportLanguage);
            this.reportLanguage = reportLanguage;
            return this;
        }

        /**
         * <p>The start time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. By default, the time range of the task is the latest 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-28T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateInspectionTaskRequest build() {
            return new CreateInspectionTaskRequest(this);
        } 

    } 

}
