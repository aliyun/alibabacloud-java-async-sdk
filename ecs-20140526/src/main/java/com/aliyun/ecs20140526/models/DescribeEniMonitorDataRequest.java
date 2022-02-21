// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEniMonitorDataRequest</p>
 */
public class DescribeEniMonitorDataRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("EniId")
    private String eniId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Period")
    private Integer period;

    private DescribeEniMonitorDataRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.eniId = builder.eniId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEniMonitorDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return eniId
     */
    public String getEniId() {
        return this.eniId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<DescribeEniMonitorDataRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String eniId; 
        private String regionId; 
        private String instanceId; 
        private String startTime; 
        private String endTime; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEniMonitorDataRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.eniId = response.eniId;
            this.regionId = response.regionId;
            this.instanceId = response.instanceId;
            this.startTime = response.startTime;
            this.endTime = response.endTime;
            this.period = response.period;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the secondary Eni. By default, all secondary Enis associated with a specified instance are queried.
         */
        public Builder eniId(String eniId) {
            this.putQueryParameter("EniId", eniId);
            this.eniId = eniId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance to which the secondary Eni is bound.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The start time of obtaining data. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ. If the specified seconds (ss) is not 00, it is automatically converted to the next minute.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The end of the time range to query data. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ. If the specified seconds (ss) is not 00, it is automatically converted to the next minute.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The interval between obtaining monitoring data. Unit: seconds. Valid values:
         * <p>
         * -60.
         * -600.
         * -3600.
         * 
         * Default value: 60.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public DescribeEniMonitorDataRequest build() {
            return new DescribeEniMonitorDataRequest(this);
        } 

    } 

}
