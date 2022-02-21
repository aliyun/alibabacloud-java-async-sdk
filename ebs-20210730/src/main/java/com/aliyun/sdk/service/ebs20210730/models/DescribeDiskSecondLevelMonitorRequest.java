// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskSecondLevelMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskSecondLevelMonitorRequest</p>
 */
public class DescribeDiskSecondLevelMonitorRequest extends Request {
    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDiskSecondLevelMonitorRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.endTime = builder.endTime;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskSecondLevelMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
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
    public Long getPeriod() {
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

    public static final class Builder extends Request.Builder<DescribeDiskSecondLevelMonitorRequest, Builder> {
        private String diskId; 
        private String endTime; 
        private Long period; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskSecondLevelMonitorRequest response) {
            super(response);
            this.diskId = response.diskId;
            this.endTime = response.endTime;
            this.period = response.period;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
        } 

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDiskSecondLevelMonitorRequest build() {
            return new DescribeDiskSecondLevelMonitorRequest(this);
        } 

    } 

}
