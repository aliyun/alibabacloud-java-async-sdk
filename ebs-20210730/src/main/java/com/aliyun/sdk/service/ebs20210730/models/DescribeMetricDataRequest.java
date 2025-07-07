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
    @com.aliyun.core.annotation.NameInMap("GroupByLabels")
    private java.util.List<String> groupByLabels;

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
        this.groupByLabels = builder.groupByLabels;
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
     * @return groupByLabels
     */
    public java.util.List<String> getGroupByLabels() {
        return this.groupByLabels;
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
        private java.util.List<String> groupByLabels; 
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
            this.groupByLabels = request.groupByLabels;
            this.metricName = request.metricName;
            this.period = request.period;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Aggregation method over time. Possible values include:</p>
         * <ul>
         * <li>SUM_OVER_TIME</li>
         * <li>COUNT_OVER_TIME</li>
         * <li>AVG_OVER_TIME</li>
         * <li>MAX_OVER_TIME</li>
         * <li>MIN_OVER_TIME</li>
         * <li>SUM_OVER_TIME_LCRO: Sum over a left-closed, right-open interval</li>
         * <li>AVG_OVER_TIME_LCRO: Average over a left-closed, right-open interval</li>
         * <li>SUM_OVER_TIME_LORC: Sum over a left-open, right-closed interval</li>
         * <li>AVG_OVER_TIME_LORC: Average over a left-open, right-closed interval</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVG_OVER_TIME</p>
         */
        public Builder aggreOps(String aggreOps) {
            this.putQueryParameter("AggreOps", aggreOps);
            this.aggreOps = aggreOps;
            return this;
        }

        /**
         * <p>Aggregation method between lines. Possible values include:</p>
         * <ul>
         * <li>NON: No aggregation</li>
         * <li>SUM: Sum</li>
         * <li>AVG: Average</li>
         * <li>COUNT: Count</li>
         * <li>MAX: Maximum</li>
         * <li>MIN: Minimum</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NON</p>
         */
        public Builder aggreOverLineOps(String aggreOverLineOps) {
            this.putQueryParameter("AggreOverLineOps", aggreOverLineOps);
            this.aggreOverLineOps = aggreOverLineOps;
            return this;
        }

        /**
         * <p>Dimension map, in JSON format, representing the dimensions being queried. The currently available keys are:</p>
         * <ul>
         * <li>DiskId: Cloud disk name, e.g., d-xxx.</li>
         * <li>DeviceType: Type of cloud disk, system indicates system disk, data indicates data disk.</li>
         * <li>DeviceCategory: Category of cloud disk, e.g., cloud_essd.</li>
         * <li>EcsInstanceId: Name of the ECS instance where the disk is located, e.g., i-xxx.</li>
         * </ul>
         * <p>The returned results are the intersection of all dimension filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DiskId&quot;:[&quot;d-bp14xxxx&quot;,&quot;d-bp11xxxx&quot;], &quot;DeviceCategory&quot;: [&quot;cloud_essd&quot;]}</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end time point for obtaining metric data. It should not be later than the current moment. Represented according to the ISO 8601 standard, using UTC +0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
         * GroupByLabels.
         */
        public Builder groupByLabels(java.util.List<String> groupByLabels) {
            String groupByLabelsShrink = shrink(groupByLabels, "GroupByLabels", "simple");
            this.putQueryParameter("GroupByLabels", groupByLabelsShrink);
            this.groupByLabels = groupByLabels;
            return this;
        }

        /**
         * <p>Metric name. Possible values include:</p>
         * <ul>
         * <li>disk_bps_percent</li>
         * <li>disk_iops_percent</li>
         * <li>disk_read_block_size</li>
         * <li>disk_read_bps</li>
         * <li>disk_read_iops</li>
         * <li>disk_write_block_size</li>
         * <li>disk_write_bps</li>
         * <li>disk_write_iops</li>
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
         * <p>The interval for obtaining metric data. Unit: seconds. The default value is 5 seconds. Possible values include:</p>
         * <ul>
         * <li>5: 5s precision query, can query up to 12 hours of data</li>
         * <li>10: 10s precision query, can query up to 24 hours of data</li>
         * <li>60: 60s precision query, can query up to 7 days of data</li>
         * <li>3600: 3600s precision query, can query up to 30 days of data</li>
         * </ul>
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
         * <p>Region ID.</p>
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
         * <p>The start time point for obtaining metric data. The earliest selectable time is one year before the current moment. When both StartTime and EndTime parameters are empty, it defaults to querying the most recent period&quot;s monitoring metrics. Represented according to the ISO 8601 standard, using UTC +0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
