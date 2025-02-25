// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsInstanceMonitorRequest</p>
 */
public class DescribeDrdsInstanceMonitorRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("PeriodMultiple")
    private Integer periodMultiple;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeDrdsInstanceMonitorRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.periodMultiple = builder.periodMultiple;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return periodMultiple
     */
    public Integer getPeriodMultiple() {
        return this.periodMultiple;
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsInstanceMonitorRequest, Builder> {
        private String drdsInstanceId; 
        private Long endTime; 
        private String key; 
        private Integer periodMultiple; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsInstanceMonitorRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.periodMultiple = request.periodMultiple;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The end time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.
         * <p>
         * 
         * >  If the time range that you specify is less than 1 hour, the monitoring data that is collected in a 1-hour period before the end time is returned.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The performance monitoring metrics. You can specify one or more metrics. Separate multiple metric names with commas (,).
         * <p>
         * 
         * >  For more information about performance monitoring metrics, see [Monitor instances](~~186703~~).
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The multiple of the default time interval that you want to use to collect monitoring data. By default, the system collects monitoring data of resources at an interval of 1 minute. If you set the value of this parameter to 2, the system collects monitoring data of the instance at an interval of 2 minutes.
         */
        public Builder periodMultiple(Integer periodMultiple) {
            this.putQueryParameter("PeriodMultiple", periodMultiple);
            this.periodMultiple = periodMultiple;
            return this;
        }

        /**
         * The ID of the region where the instance is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The start time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDrdsInstanceMonitorRequest build() {
            return new DescribeDrdsInstanceMonitorRequest(this);
        } 

    } 

}
