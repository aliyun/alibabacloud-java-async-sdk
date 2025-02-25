// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>ReportABMetricGroupRequest</p>
 */
public class ReportABMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseExperimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DimensionFields")
    private String dimensionFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeStatisticsMethod")
    private String timeStatisticsMethod;

    private ReportABMetricGroupRequest(Builder builder) {
        super(builder);
        this.ABMetricGroupId = builder.ABMetricGroupId;
        this.baseExperimentId = builder.baseExperimentId;
        this.dimensionFields = builder.dimensionFields;
        this.endDate = builder.endDate;
        this.experimentGroupId = builder.experimentGroupId;
        this.experimentIds = builder.experimentIds;
        this.instanceId = builder.instanceId;
        this.reportType = builder.reportType;
        this.sceneId = builder.sceneId;
        this.startDate = builder.startDate;
        this.timeStatisticsMethod = builder.timeStatisticsMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportABMetricGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricGroupId
     */
    public String getABMetricGroupId() {
        return this.ABMetricGroupId;
    }

    /**
     * @return baseExperimentId
     */
    public String getBaseExperimentId() {
        return this.baseExperimentId;
    }

    /**
     * @return dimensionFields
     */
    public String getDimensionFields() {
        return this.dimensionFields;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return experimentIds
     */
    public String getExperimentIds() {
        return this.experimentIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return timeStatisticsMethod
     */
    public String getTimeStatisticsMethod() {
        return this.timeStatisticsMethod;
    }

    public static final class Builder extends Request.Builder<ReportABMetricGroupRequest, Builder> {
        private String ABMetricGroupId; 
        private String baseExperimentId; 
        private String dimensionFields; 
        private String endDate; 
        private String experimentGroupId; 
        private String experimentIds; 
        private String instanceId; 
        private String reportType; 
        private String sceneId; 
        private String startDate; 
        private String timeStatisticsMethod; 

        private Builder() {
            super();
        } 

        private Builder(ReportABMetricGroupRequest request) {
            super(request);
            this.ABMetricGroupId = request.ABMetricGroupId;
            this.baseExperimentId = request.baseExperimentId;
            this.dimensionFields = request.dimensionFields;
            this.endDate = request.endDate;
            this.experimentGroupId = request.experimentGroupId;
            this.experimentIds = request.experimentIds;
            this.instanceId = request.instanceId;
            this.reportType = request.reportType;
            this.sceneId = request.sceneId;
            this.startDate = request.startDate;
            this.timeStatisticsMethod = request.timeStatisticsMethod;
        } 

        /**
         * ABMetricGroupId.
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.putPathParameter("ABMetricGroupId", ABMetricGroupId);
            this.ABMetricGroupId = ABMetricGroupId;
            return this;
        }

        /**
         * BaseExperimentId.
         */
        public Builder baseExperimentId(String baseExperimentId) {
            this.putBodyParameter("BaseExperimentId", baseExperimentId);
            this.baseExperimentId = baseExperimentId;
            return this;
        }

        /**
         * DimensionFields.
         */
        public Builder dimensionFields(String dimensionFields) {
            this.putBodyParameter("DimensionFields", dimensionFields);
            this.dimensionFields = dimensionFields;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putBodyParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * ExperimentIds.
         */
        public Builder experimentIds(String experimentIds) {
            this.putBodyParameter("ExperimentIds", experimentIds);
            this.experimentIds = experimentIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ReportType.
         */
        public Builder reportType(String reportType) {
            this.putBodyParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TimeStatisticsMethod.
         */
        public Builder timeStatisticsMethod(String timeStatisticsMethod) {
            this.putBodyParameter("TimeStatisticsMethod", timeStatisticsMethod);
            this.timeStatisticsMethod = timeStatisticsMethod;
            return this;
        }

        @Override
        public ReportABMetricGroupRequest build() {
            return new ReportABMetricGroupRequest(this);
        } 

    } 

}
