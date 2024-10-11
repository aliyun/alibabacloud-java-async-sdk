// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardMetricsRequest</p>
 */
public class ListDashboardMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricQuery")
    private String metricQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricView")
    private String metricView;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
    private Long startTime;

    private ListDashboardMetricsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.metricQuery = builder.metricQuery;
        this.metricType = builder.metricType;
        this.metricView = builder.metricView;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardMetricsRequest create() {
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
     * @return metricQuery
     */
    public String getMetricQuery() {
        return this.metricQuery;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return metricView
     */
    public String getMetricView() {
        return this.metricView;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListDashboardMetricsRequest, Builder> {
        private String instanceId; 
        private Long endTime; 
        private String metricQuery; 
        private String metricType; 
        private String metricView; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardMetricsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.metricQuery = request.metricQuery;
            this.metricType = request.metricType;
            this.metricView = request.metricView;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The type of the metric. Valid values:</p>
         * <p>USER_ACTION_PV_COUNT: the number of page views</p>
         * <p>USER_ACTION_UV_COUNT: the number of unique views</p>
         * <p>USER_ACTION_PV_RATIO: the conversion rate</p>
         * <p>USER_ACTION_UV_RATIO: the traffic consumed per person</p>
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
         * <p>The statistical results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * metricQuery.
         */
        public Builder metricQuery(String metricQuery) {
            this.putQueryParameter("metricQuery", metricQuery);
            this.metricQuery = metricQuery;
            return this;
        }

        /**
         * <p>The statistical results.</p>
         * 
         * <strong>example:</strong>
         * <p>The details about the metric.</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("metricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * metricView.
         */
        public Builder metricView(String metricView) {
            this.putQueryParameter("metricView", metricView);
            this.metricView = metricView;
            return this;
        }

        /**
         * <p>USERACTIONPV_COUNT</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListDashboardMetricsRequest build() {
            return new ListDashboardMetricsRequest(this);
        } 

    } 

}
