// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRequest</p>
 */
public class DeleteMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MetricId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteMetricRequest(Builder builder) {
        super(builder);
        this.metricId = builder.metricId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRequest, Builder> {
        private String metricId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRequest request) {
            super(request);
            this.metricId = request.metricId;
            this.regionId = request.regionId;
        } 

        /**
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.putPathParameter("MetricId", metricId);
            this.metricId = metricId;
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

        @Override
        public DeleteMetricRequest build() {
            return new DeleteMetricRequest(this);
        } 

    } 

}
