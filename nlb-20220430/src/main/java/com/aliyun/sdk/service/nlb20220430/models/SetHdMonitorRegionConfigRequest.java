// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHdMonitorRegionConfigRequest} extends {@link RequestModel}
 *
 * <p>SetHdMonitorRegionConfigRequest</p>
 */
public class SetHdMonitorRegionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logProject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetHdMonitorRegionConfigRequest(Builder builder) {
        super(builder);
        this.logProject = builder.logProject;
        this.metricStore = builder.metricStore;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHdMonitorRegionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return metricStore
     */
    public String getMetricStore() {
        return this.metricStore;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetHdMonitorRegionConfigRequest, Builder> {
        private String logProject; 
        private String metricStore; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetHdMonitorRegionConfigRequest request) {
            super(request);
            this.logProject = request.logProject;
            this.metricStore = request.metricStore;
            this.regionId = request.regionId;
        } 

        /**
         * LogProject.
         */
        public Builder logProject(String logProject) {
            this.putQueryParameter("LogProject", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * MetricStore.
         */
        public Builder metricStore(String metricStore) {
            this.putQueryParameter("MetricStore", metricStore);
            this.metricStore = metricStore;
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
        public SetHdMonitorRegionConfigRequest build() {
            return new SetHdMonitorRegionConfigRequest(this);
        } 

    } 

}
