// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDatabaseInstanceMetricDataResponseBody model) {
            this.dataFormat = model.dataFormat;
            this.metricData = model.metricData;
            this.metricName = model.metricName;
            this.requestId = model.requestId;
            this.unit = model.unit;
        } 

        /**
         * <p>The data format. Valid values:</p>
         * <ul>
         * <li>cpuusage&amp;memusage</li>
         * <li>active_session&amp;total_session</li>
         * <li>ins_size&amp;data_size&amp;log_size&amp;tmp_size&amp;other_size</li>
         * <li>io</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpuusage&amp;memusage</p>
         */
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * <p>The monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>[  {     &quot;date&quot;: &quot; 2022-09-06T04:04:00Z&quot;,&quot;value&quot;:&quot;0.77&amp;3.69&quot;  } ]</p>
         */
        public Builder metricData(String metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * <p>The name of the metric. Valid values:</p>
         * <ul>
         * <li>MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.</li>
         * <li>MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.</li>
         * <li>MySQL_Sessions : The total number of active connections.</li>
         * <li>MySQL_IOPS: The IOPS of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL_MemCpuUsage</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The unit of the monitoring metric.</p>
         * <ul>
         * <li>%</li>
         * <li>int</li>
         * <li>MB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>%</p>
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
