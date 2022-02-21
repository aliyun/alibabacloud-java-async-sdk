// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardDetailsRequest</p>
 */
public class ListDashboardDetailsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("SceneIds")
    @Validation(required = true)
    private String sceneIds;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("TraceIds")
    @Validation(required = true)
    private String traceIds;

    private ListDashboardDetailsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.sceneIds = builder.sceneIds;
        this.startTime = builder.startTime;
        this.traceIds = builder.traceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return sceneIds
     */
    public String getSceneIds() {
        return this.sceneIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceIds
     */
    public String getTraceIds() {
        return this.traceIds;
    }

    public static final class Builder extends Request.Builder<ListDashboardDetailsRequest, Builder> {
        private String instanceId; 
        private Long endTime; 
        private String metricType; 
        private String sceneIds; 
        private Long startTime; 
        private String traceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardDetailsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.endTime = response.endTime;
            this.metricType = response.metricType;
            this.sceneIds = response.sceneIds;
            this.startTime = response.startTime;
            this.traceIds = response.traceIds;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * SceneIds.
         */
        public Builder sceneIds(String sceneIds) {
            this.putQueryParameter("SceneIds", sceneIds);
            this.sceneIds = sceneIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TraceIds.
         */
        public Builder traceIds(String traceIds) {
            this.putQueryParameter("TraceIds", traceIds);
            this.traceIds = traceIds;
            return this;
        }

        @Override
        public ListDashboardDetailsRequest build() {
            return new ListDashboardDetailsRequest(this);
        } 

    } 

}
