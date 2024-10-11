// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardDetailsRequest</p>
 */
public class ListDashboardDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("experimentIds")
    private String experimentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("matchTypes")
    private String matchTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("traceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceIds;

    private ListDashboardDetailsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.experimentIds = builder.experimentIds;
        this.matchTypes = builder.matchTypes;
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
     * @return experimentIds
     */
    public String getExperimentIds() {
        return this.experimentIds;
    }

    /**
     * @return matchTypes
     */
    public String getMatchTypes() {
        return this.matchTypes;
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
        private String experimentIds; 
        private String matchTypes; 
        private String metricType; 
        private String sceneIds; 
        private Long startTime; 
        private String traceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardDetailsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.experimentIds = request.experimentIds;
            this.matchTypes = request.matchTypes;
            this.metricType = request.metricType;
            this.sceneIds = request.sceneIds;
            this.startTime = request.startTime;
            this.traceIds = request.traceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1588521600</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * experimentIds.
         */
        public Builder experimentIds(String experimentIds) {
            this.putQueryParameter("experimentIds", experimentIds);
            this.experimentIds = experimentIds;
            return this;
        }

        /**
         * matchTypes.
         */
        public Builder matchTypes(String matchTypes) {
            this.putQueryParameter("matchTypes", matchTypes);
            this.matchTypes = matchTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("metricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sceneIds(String sceneIds) {
            this.putQueryParameter("sceneIds", sceneIds);
            this.sceneIds = sceneIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1588521600</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder traceIds(String traceIds) {
            this.putQueryParameter("traceIds", traceIds);
            this.traceIds = traceIds;
            return this;
        }

        @Override
        public ListDashboardDetailsRequest build() {
            return new ListDashboardDetailsRequest(this);
        } 

    } 

}
