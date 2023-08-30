// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstanceMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseInstanceMetricDataRequest</p>
 */
public class DescribeDatabaseInstanceMetricDataRequest extends Request {
    @Query
    @NameInMap("DatabaseInstanceId")
    @Validation(required = true)
    private String databaseInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
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
         * The ID of the Simple Database Service instance.
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
         * <p>
         * 
         * > The time displayed in the Simple Application Server console is in the format of UTC+8.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
         * <p>
         * 
         * > The time displayed in the Simple Application Server console is in the format of UTC+8.
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
