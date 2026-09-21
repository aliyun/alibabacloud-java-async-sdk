// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeAutoScalingHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoScalingHistoryRequest</p>
 */
public class DescribeAutoScalingHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScalingTaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoScalingTaskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of elastic scaling task to query. Currently, only <strong>SPEC</strong> is supported, which indicates querying the automatic performance scaling history.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPEC</p>
         */
        public Builder autoScalingTaskType(String autoScalingTaskType) {
            this.putQueryParameter("AutoScalingTaskType", autoScalingTaskType);
            this.autoScalingTaskType = autoScalingTaskType;
            return this;
        }

        /**
         * <p>The end time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1676605305796</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>Currently, only ApsaraDB RDS for MySQL instances are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The start time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The start time cannot be earlier than 45 days before the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1675833788056</p>
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
