// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateMetricDropRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricDropRequest</p>
 */
public class UpdateMetricDropRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricDrop")
    private String metricDrop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateMetricDropRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.metricDrop = builder.metricDrop;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricDropRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return metricDrop
     */
    public String getMetricDrop() {
        return this.metricDrop;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateMetricDropRequest, Builder> {
        private String clusterId; 
        private String metricDrop; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricDropRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.metricDrop = request.metricDrop;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c3ca36c8e2693403d85c0d9f8bb1d7b6c</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of discarded metrics. Specify one metric name in each line.</p>
         * 
         * <strong>example:</strong>
         * <p>apiserver_request_duration_seconds_bucket
         * etcd_request_duration_seconds_bucket
         * apiserver_request_total
         * container_tasks_state</p>
         */
        public Builder metricDrop(String metricDrop) {
            this.putQueryParameter("MetricDrop", metricDrop);
            this.metricDrop = metricDrop;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateMetricDropRequest build() {
            return new UpdateMetricDropRequest(this);
        } 

    } 

}
