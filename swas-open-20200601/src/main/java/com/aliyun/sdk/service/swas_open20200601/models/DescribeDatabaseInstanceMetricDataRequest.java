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
 * {@link DescribeDatabaseInstanceMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseInstanceMetricDataRequest</p>
 */
public class DescribeDatabaseInstanceMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDatabaseInstanceMetricDataRequest(Builder builder) {
        super(builder);
        this.databaseInstanceId = builder.databaseInstanceId;
        this.endTime = builder.endTime;
        this.metricName = builder.metricName;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceMetricDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseInstanceId
     */
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
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

    public static final class Builder extends Request.Builder<DescribeDatabaseInstanceMetricDataRequest, Builder> {
        private String databaseInstanceId; 
        private String endTime; 
        private String metricName; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabaseInstanceMetricDataRequest request) {
            super(request);
            this.databaseInstanceId = request.databaseInstanceId;
            this.endTime = request.endTime;
            this.metricName = request.metricName;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the Simple Database Service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db-38263fa955774501a2ae1bdaed6f****</p>
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-07T04:04Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL_MemCpuUsage</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The region ID of the Simple Database Service instance. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T04:04Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDatabaseInstanceMetricDataRequest build() {
            return new DescribeDatabaseInstanceMetricDataRequest(this);
        } 

    } 

}
