// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBaselineRequest} extends {@link RequestModel}
 *
 * <p>CreateBaselineRequest</p>
 */
public class CreateBaselineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertMarginThreshold")
    private Integer alertMarginThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baselineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baselineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OvertimeSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OvertimeSettings> overtimeSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private CreateBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertMarginThreshold = builder.alertMarginThreshold;
        this.baselineName = builder.baselineName;
        this.baselineType = builder.baselineType;
        this.nodeIds = builder.nodeIds;
        this.overtimeSettings = builder.overtimeSettings;
        this.owner = builder.owner;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
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
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
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

    public static final class Builder extends Request.Builder<CreateBaselineRequest, Builder> {
        private String regionId; 
        private Integer alertMarginThreshold; 
        private String baselineName; 
        private String baselineType; 
        private String nodeIds; 
        private java.util.List < OvertimeSettings> overtimeSettings; 
        private String owner; 
        private Integer priority; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertMarginThreshold = request.alertMarginThreshold;
            this.baselineName = request.baselineName;
            this.baselineType = request.baselineType;
            this.nodeIds = request.nodeIds;
            this.overtimeSettings = request.overtimeSettings;
            this.owner = request.owner;
            this.priority = request.priority;
            this.projectId = request.projectId;
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
         * The alert margin threshold of the baseline. Unit: minutes.
         */
        public Builder alertMarginThreshold(Integer alertMarginThreshold) {
            this.putBodyParameter("AlertMarginThreshold", alertMarginThreshold);
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }

        /**
         * The name of the baseline.
         */
        public Builder baselineName(String baselineName) {
            this.putBodyParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * The type of the baseline. Valid values: DAILY and HOURLY.
         */
        public Builder baselineType(String baselineType) {
            this.putBodyParameter("BaselineType", baselineType);
            this.baselineType = baselineType;
            return this;
        }

        /**
         * The ancestor nodes of nodes in the baseline.
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * The settings of the committed completion time of the baseline.
         */
        public Builder overtimeSettings(java.util.List < OvertimeSettings> overtimeSettings) {
            this.putBodyParameter("OvertimeSettings", overtimeSettings);
            this.overtimeSettings = overtimeSettings;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the baseline owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The priority of the baseline. Valid values: {1,3,5,7,8}.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to query the ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateBaselineRequest build() {
            return new CreateBaselineRequest(this);
        } 

    } 

    public static class OvertimeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cycle")
        private Integer cycle;

        @com.aliyun.core.annotation.NameInMap("Time")
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
             * The cycle that corresponds to the committed completion time. For a day-level baseline, set this parameter to 1. For an hour-level baseline, set this parameter to a value that is no more than 24.
             */
            public Builder cycle(Integer cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * The committed completion time in the hh:mm format. Valid values of hh: \[0,47]. Valid values of mm: \[0,59].
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
