// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricDataRequest</p>
 */
public class DescribeMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggreOps")
    private String aggreOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggreOverLineOps")
    private String aggreOverLineOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeMetricDataRequest(Builder builder) {
        super(builder);
        this.aggreOps = builder.aggreOps;
        this.aggreOverLineOps = builder.aggreOverLineOps;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.metricName = builder.metricName;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggreOps
     */
    public String getAggreOps() {
        return this.aggreOps;
    }

    /**
     * @return aggreOverLineOps
     */
    public String getAggreOverLineOps() {
        return this.aggreOverLineOps;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricDataRequest, Builder> {
        private String aggreOps; 
        private String aggreOverLineOps; 
        private String dimensions; 
        private String endTime; 
        private String metricName; 
        private Integer period; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricDataRequest request) {
            super(request);
            this.aggreOps = request.aggreOps;
            this.aggreOverLineOps = request.aggreOverLineOps;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.metricName = request.metricName;
            this.period = request.period;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Aggregation method in time dimension. Valid values:</p>
         * <ul>
         * <li>SUM</li>
         * <li>COUNT</li>
         * <li>AVG</li>
         * <li>MAX</li>
         * <li>MIN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        public Builder aggreOps(String aggreOps) {
            this.putQueryParameter("AggreOps", aggreOps);
            this.aggreOps = aggreOps;
            return this;
        }

        /**
         * AggreOverLineOps.
         */
        public Builder aggreOverLineOps(String aggreOverLineOps) {
            this.putQueryParameter("AggreOverLineOps", aggreOverLineOps);
            this.aggreOverLineOps = aggreOverLineOps;
            return this;
        }

        /**
         * <p>The dimension map in the JSON format. A dimension is a key-value pair. Valid dimension key: diskId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;diskId&quot;:[&quot;d-bp14xxxx&quot;,&quot;d-bp11xxxx&quot;]}</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end of the time range to query. The specified time must be later than the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the metric. Valid values:</p>
         * <ul>
         * <li>disk_bps_percent</li>
         * <li>disk_iops_percent</li>
         * <li>disk_read_block_size</li>
         * <li>disk_read_bps</li>
         * <li>disk_read_iops</li>
         * <li>disk_read_latency</li>
         * <li>disk_write_block_size</li>
         * <li>disk_write_bps</li>
         * <li>disk_write_iops</li>
         * <li>disk_write_latency</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk_bps_percent</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The interval at which metric data is collected. Unit: seconds. Default value: 60. Valid values: 60, 300, 600, and 3600, which support queries for time ranges of up to 2 hours, 2 hours, 1 day, and 7 days, respectively. For example, if you set Period to 60, the end time is less than 2 hours from the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. You can specify a point in time that is up to one year apart from the current time. If StartTime and EndTime are both unspecified, the monitoring metric data of the last Period value is queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T01:50:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricDataRequest build() {
            return new DescribeMetricDataRequest(this);
        } 

    } 

}
