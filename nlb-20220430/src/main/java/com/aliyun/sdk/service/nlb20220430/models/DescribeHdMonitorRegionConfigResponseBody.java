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
 * {@link DescribeHdMonitorRegionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHdMonitorRegionConfigResponseBody</p>
 */
public class DescribeHdMonitorRegionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogProject")
    private String logProject;

    @com.aliyun.core.annotation.NameInMap("MetricStore")
    private String metricStore;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHdMonitorRegionConfigResponseBody(Builder builder) {
        this.logProject = builder.logProject;
        this.metricStore = builder.metricStore;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHdMonitorRegionConfigResponseBody create() {
        return builder().build();
    }

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String logProject; 
        private String metricStore; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHdMonitorRegionConfigResponseBody model) {
            this.logProject = model.logProject;
            this.metricStore = model.metricStore;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor-cn-hangzhou-223794579283657556</p>
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The name of the Metricstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor-cn-hangzhou-metricStore-1</p>
         */
        public Builder metricStore(String metricStore) {
            this.metricStore = metricStore;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHdMonitorRegionConfigResponseBody build() {
            return new DescribeHdMonitorRegionConfigResponseBody(this);
        } 

    } 

}
