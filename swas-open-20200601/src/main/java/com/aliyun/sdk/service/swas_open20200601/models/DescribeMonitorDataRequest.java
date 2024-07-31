// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorDataRequest</p>
 */
public class DescribeMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Length")
    private String length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeMonitorDataRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return period
     */
    public String getPeriod() {
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

    public static final class Builder extends Request.Builder<DescribeMonitorDataRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private String instanceId; 
        private String length; 
        private String metricName; 
        private String nextToken; 
        private String period; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorDataRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.length = request.length;
            this.metricName = request.metricName;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The end of the time range to query. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 January 1, 1970.
         * *   Time format: YYYY-MM-DDThh:mm:ssZ.
         * 
         * > The interval between the start time and the end time is less than or equal to 31 days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 1440.
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * The name of the metric. Valid values:
         * <p>
         * 
         * *   MEMORY_ACTUALUSEDSPACE: the memory usage. Unit: bytes.
         * *   DISKUSAGE_USED: the disk usage. Unit: bytes.
         * *   CPU_UTILIZATION: the CPU usage, in percentage.
         * *   VPC_PUBLICIP_INTERNETOUT_RATE: the outbound bandwidth. Unit: bits/s.
         * *   VPC_PUBLICIP_INTERNETIN_RATE: the inbound bandwidth. Unit: bits/s.
         * *   DISK_READ_IOPS: the read IOPS of the disk. Unit: count/s.
         * *   DISK_WRITE_IOPS: the write IOPS of the disk. Unit: count/s.
         * *   FLOW_USED: the traffic usage. Unit: bytes.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The interval at which the monitoring data is queried. Valid values: 60, 300, and 900. Unit: seconds.
         * <p>
         * 
         * > 
         * 
         * If MetricName is set to FLOW_USED, Period is set to 3600 (one hour). In other cases, set Period based on your business requirements.
         * 
         * **
         * 
         * ****
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 January 1, 1970.
         * *   Time format: YYYY-MM-DDThh:mm:ssZ.
         * 
         * > The specified time range includes the end time and excludes the start time. The start time must be earlier than the end time.
         * 
         * The interval between the start time and the end time is less than or equal to 31 days.
         * 
         * **
         * 
         * ****
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMonitorDataRequest build() {
            return new DescribeMonitorDataRequest(this);
        } 

    } 

}
