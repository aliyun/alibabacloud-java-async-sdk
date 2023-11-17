// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoScalingHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoScalingHistoryRequest</p>
 */
public class DescribeAutoScalingHistoryRequest extends Request {
    @Query
    @NameInMap("AutoScalingTaskType")
    @Validation(required = true)
    private String autoScalingTaskType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeAutoScalingHistoryRequest(Builder builder) {
        super(builder);
        this.autoScalingTaskType = builder.autoScalingTaskType;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoScalingHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScalingTaskType
     */
    public String getAutoScalingTaskType() {
        return this.autoScalingTaskType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAutoScalingHistoryRequest, Builder> {
        private String autoScalingTaskType; 
        private Long endTime; 
        private String instanceId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoScalingHistoryRequest request) {
            super(request);
            this.autoScalingTaskType = request.autoScalingTaskType;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
        } 

        /**
         * The type of the auto scaling task that you want to query. Set the value to **SPEC**, which indicates that you can query the history of only automatic performance scaling tasks.
         */
        public Builder autoScalingTaskType(String autoScalingTaskType) {
            this.putQueryParameter("AutoScalingTaskType", autoScalingTaskType);
            this.autoScalingTaskType = autoScalingTaskType;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * > Only ApsaraDB RDS for MySQL instances are supported.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * > The maximum time range that can be specified is 45 days.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAutoScalingHistoryRequest build() {
            return new DescribeAutoScalingHistoryRequest(this);
        } 

    } 

}
