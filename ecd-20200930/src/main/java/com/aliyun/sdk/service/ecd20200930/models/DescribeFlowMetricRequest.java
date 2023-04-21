// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowMetricRequest</p>
 */
public class DescribeFlowMetricRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("Period")
    @Validation(required = true, maximum = 900, minimum = 60)
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeFlowMetricRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.metricType = builder.metricType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
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

    public static final class Builder extends Request.Builder<DescribeFlowMetricRequest, Builder> {
        private String endTime; 
        private String instanceId; 
        private String instanceType; 
        private String metricType; 
        private Integer period; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowMetricRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.metricType = request.metricType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query data. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the instance. The value can be the ID of the cloud desktop or the ID of the Internet access package.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the instance. You can select a cloud desktop or a network package as an instance. If you select a cloud desktop as an instance, you need to configure the `InstanceId` and `MetricType` parameters. If you select a network package as an instance, you also need to must configure the parameters.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The type of the monitoring data. The monitoring data includes the inbound bandwidth and the outbound bandwidth of the cloud desktop, or the workspace bandwidth that is originated from or destined for the Internet.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * The interval at which monitoring data is collected. Unit: seconds.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
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
         * *   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeFlowMetricRequest build() {
            return new DescribeFlowMetricRequest(this);
        } 

    } 

}
