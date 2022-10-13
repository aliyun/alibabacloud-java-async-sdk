// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticalDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeStatisticalDataRequest</p>
 */
public class DescribeStatisticalDataRequest extends Request {
    @Query
    @NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @Query
    @NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TimeUnit")
    @Validation(required = true)
    private String timeUnit;

    private DescribeStatisticalDataRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.instanceId = builder.instanceId;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatisticalDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTimeLeftRange
     */
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    /**
     * @return beginTimeRightRange
     */
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<DescribeStatisticalDataRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String instanceId; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStatisticalDataRequest request) {
            super(request);
            this.beginTimeLeftRange = request.beginTimeLeftRange;
            this.beginTimeRightRange = request.beginTimeRightRange;
            this.instanceId = request.instanceId;
            this.timeUnit = request.timeUnit;
        } 

        /**
         * BeginTimeLeftRange.
         */
        public Builder beginTimeLeftRange(Long beginTimeLeftRange) {
            this.putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange);
            this.beginTimeLeftRange = beginTimeLeftRange;
            return this;
        }

        /**
         * BeginTimeRightRange.
         */
        public Builder beginTimeRightRange(Long beginTimeRightRange) {
            this.putQueryParameter("BeginTimeRightRange", beginTimeRightRange);
            this.beginTimeRightRange = beginTimeRightRange;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("TimeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public DescribeStatisticalDataRequest build() {
            return new DescribeStatisticalDataRequest(this);
        } 

    } 

}
