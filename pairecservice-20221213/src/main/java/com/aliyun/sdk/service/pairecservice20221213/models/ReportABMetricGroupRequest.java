// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ReportABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>ReportABMetricGroupRequest</p>
 */
public class ReportABMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
            this.regionId = request.regionId;
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
         * <p>The ID of the AB metric group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.putPathParameter("ABMetricGroupId", ABMetricGroupId);
            this.ABMetricGroupId = ABMetricGroupId;
            return this;
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
         * <p>The ID of the base experiment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder baseExperimentId(String baseExperimentId) {
            this.putBodyParameter("BaseExperimentId", baseExperimentId);
            this.baseExperimentId = baseExperimentId;
            return this;
        }

        /**
         * <p>The dimension fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gender&quot;:&quot;man&quot;}</p>
         */
        public Builder dimensionFields(String dimensionFields) {
            this.putBodyParameter("DimensionFields", dimensionFields);
            this.dimensionFields = dimensionFields;
            return this;
        }

        /**
         * <p>The end date.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-01</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The ID of the experiment group. You can call the <a href="https://help.aliyun.com/document_detail/2402573.html">ListExperimentGroups</a> operation to obtain the ID of the experiment group. This parameter is required for offline and real-time reports.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putBodyParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * <p>The IDs of the experiments. You can call the <a href="https://help.aliyun.com/document_detail/2402582.html">ListExperiments</a> operation to obtain the IDs of the experiments.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3,4,5</p>
         */
        public Builder experimentIds(String experimentIds) {
            this.putBodyParameter("ExperimentIds", experimentIds);
            this.experimentIds = experimentIds;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the report.</p>
         * <ul>
         * <li><p>Realtime: real-time report.</p>
         * </li>
         * <li><p>Offline: offline report.</p>
         * </li>
         * <li><p>Market: dashboard report.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Offline</p>
         */
        public Builder reportType(String reportType) {
            this.putBodyParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The ID of the scene. You can call the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation to obtain the scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-01</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The time statistics method. This parameter is required for real-time reports.</p>
         * <ul>
         * <li><p>Hour: The statistics are collected by hour.</p>
         * </li>
         * <li><p>Day: The statistics are accumulated from 00:00 on the current day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
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
