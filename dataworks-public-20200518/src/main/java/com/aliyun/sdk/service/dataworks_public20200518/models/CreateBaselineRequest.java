// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBaselineRequest} extends {@link RequestModel}
 *
 * <p>CreateBaselineRequest</p>
 */
public class CreateBaselineRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AlertMarginThreshold")
    private Integer alertMarginThreshold;

    @Body
    @NameInMap("BaselineName")
    @Validation(required = true)
    private String baselineName;

    @Body
    @NameInMap("BaselineType")
    @Validation(required = true)
    private String baselineType;

    @Body
    @NameInMap("OvertimeSettings")
    @Validation(required = true)
    private java.util.List < OvertimeSettings> overtimeSettings;

    @Body
    @NameInMap("Owner")
    @Validation(required = true)
    private String owner;

    @Body
    @NameInMap("Priority")
    @Validation(required = true)
    private Integer priority;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("TaskIds")
    private String taskIds;

    private CreateBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertMarginThreshold = builder.alertMarginThreshold;
        this.baselineName = builder.baselineName;
        this.baselineType = builder.baselineType;
        this.overtimeSettings = builder.overtimeSettings;
        this.owner = builder.owner;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBaselineRequest create() {
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
     * @return alertMarginThreshold
     */
    public Integer getAlertMarginThreshold() {
        return this.alertMarginThreshold;
    }

    /**
     * @return baselineName
     */
    public String getBaselineName() {
        return this.baselineName;
    }

    /**
     * @return baselineType
     */
    public String getBaselineType() {
        return this.baselineType;
    }

    /**
     * @return overtimeSettings
     */
    public java.util.List < OvertimeSettings> getOvertimeSettings() {
        return this.overtimeSettings;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<CreateBaselineRequest, Builder> {
        private String regionId; 
        private Integer alertMarginThreshold; 
        private String baselineName; 
        private String baselineType; 
        private java.util.List < OvertimeSettings> overtimeSettings; 
        private String owner; 
        private Integer priority; 
        private Long projectId; 
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertMarginThreshold = request.alertMarginThreshold;
            this.baselineName = request.baselineName;
            this.baselineType = request.baselineType;
            this.overtimeSettings = request.overtimeSettings;
            this.owner = request.owner;
            this.priority = request.priority;
            this.projectId = request.projectId;
            this.taskIds = request.taskIds;
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
         * 基线预警余量
         */
        public Builder alertMarginThreshold(Integer alertMarginThreshold) {
            this.putBodyParameter("AlertMarginThreshold", alertMarginThreshold);
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }

        /**
         * 基线名
         */
        public Builder baselineName(String baselineName) {
            this.putBodyParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * 基线类型 (DAILY, HOURLY)
         */
        public Builder baselineType(String baselineType) {
            this.putBodyParameter("BaselineType", baselineType);
            this.baselineType = baselineType;
            return this;
        }

        /**
         * 基线承诺时间
         */
        public Builder overtimeSettings(java.util.List < OvertimeSettings> overtimeSettings) {
            this.putBodyParameter("OvertimeSettings", overtimeSettings);
            this.overtimeSettings = overtimeSettings;
            return this;
        }

        /**
         * 责任人
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * 基线优先级
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * 项目id
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(String taskIds) {
            this.putBodyParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public CreateBaselineRequest build() {
            return new CreateBaselineRequest(this);
        } 

    } 

    public static class OvertimeSettings extends TeaModel {
        @NameInMap("Cycle")
        private Integer cycle;

        @NameInMap("Time")
        private String time;

        private OvertimeSettings(Builder builder) {
            this.cycle = builder.cycle;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OvertimeSettings create() {
            return builder().build();
        }

        /**
         * @return cycle
         */
        public Integer getCycle() {
            return this.cycle;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer cycle; 
            private String time; 

            /**
             * 周期，取值范围 [1,24]
             */
            public Builder cycle(Integer cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * 承诺时间，hh:mm格式，hh的取值范围为[0,47]，mm的取值范围为[0,59]
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public OvertimeSettings build() {
                return new OvertimeSettings(this);
            } 

        } 

    }
}
