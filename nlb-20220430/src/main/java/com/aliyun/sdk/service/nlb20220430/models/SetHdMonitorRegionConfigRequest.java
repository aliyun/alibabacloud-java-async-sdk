// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
         * <p>The name of the Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor-cn-hangzhou-223794579283657556</p>
         */
        public Builder logProject(String logProject) {
            this.putQueryParameter("LogProject", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The name of the MetricStore in Simple Log Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor-cn-hangzhou-metricStore-1</p>
         */
        public Builder metricStore(String metricStore) {
            this.putQueryParameter("MetricStore", metricStore);
            this.metricStore = metricStore;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2399192.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public SetHdMonitorRegionConfigRequest build() {
            return new SetHdMonitorRegionConfigRequest(this);
        } 

    } 

}
