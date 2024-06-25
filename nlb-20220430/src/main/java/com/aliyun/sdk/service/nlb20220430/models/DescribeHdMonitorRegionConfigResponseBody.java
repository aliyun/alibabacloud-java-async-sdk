// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * LogProject.
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * MetricStore.
         */
        public Builder metricStore(String metricStore) {
            this.metricStore = metricStore;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
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
