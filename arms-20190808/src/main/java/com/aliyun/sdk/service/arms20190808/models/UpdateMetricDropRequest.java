// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MetricDrop.
         */
        public Builder metricDrop(String metricDrop) {
            this.putQueryParameter("MetricDrop", metricDrop);
            this.metricDrop = metricDrop;
            return this;
        }

        /**
         * RegionId.
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
