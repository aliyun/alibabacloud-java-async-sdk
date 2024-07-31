// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstanceMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstanceMetricDataResponseBody</p>
 */
public class DescribeDatabaseInstanceMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataFormat")
    private String dataFormat;

    @com.aliyun.core.annotation.NameInMap("MetricData")
    private String metricData;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private DescribeDatabaseInstanceMetricDataResponseBody(Builder builder) {
        this.dataFormat = builder.dataFormat;
        this.metricData = builder.metricData;
        this.metricName = builder.metricName;
        this.requestId = builder.requestId;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return metricData
     */
    public String getMetricData() {
        return this.metricData;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private String dataFormat; 
        private String metricData; 
        private String metricName; 
        private String requestId; 
        private String unit; 

        /**
         * The data format. Valid values:
         * <p>
         * 
         * *   cpuusage\&memusage
         * *   active_session\&total_session
         * *   ins_size\&data_size\&log_size\&tmp_size\&other_size
         * *   io
         */
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * The monitoring data.
         */
        public Builder metricData(String metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * The name of the metric. Valid values:
         * <p>
         * 
         * *   MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.
         * *   MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.
         * *   MySQL_Sessions : The total number of active connections.
         * *   MySQL_IOPS: The IOPS of the instance.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The unit of the monitoring metric.
         * <p>
         * 
         * *   %
         * *   int
         * *   MB
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public DescribeDatabaseInstanceMetricDataResponseBody build() {
            return new DescribeDatabaseInstanceMetricDataResponseBody(this);
        } 

    } 

}
