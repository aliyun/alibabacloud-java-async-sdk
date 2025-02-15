// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeStatisticalDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeStatisticalDataRequest</p>
 */
public class DescribeStatisticalDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeUnit")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Day/Hour</p>
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
