// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DescribeApplicationHealthCheckReportsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationHealthCheckReportsRequest</p>
 */
public class DescribeApplicationHealthCheckReportsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeApplicationHealthCheckReportsRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationHealthCheckReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationHealthCheckReportsRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationHealthCheckReportsRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The IDs of the internal-facing applications. You can specify up to 100 application IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the default value is the current time. If only the start time is specified, the end time is set to 5 minutes after the start time. The end time must be later than the start time, and the maximum query time range is 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000600</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the default value is 5 minutes before the end time. If only the end time is specified, the start time is set to 5 minutes before the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeApplicationHealthCheckReportsRequest build() {
            return new DescribeApplicationHealthCheckReportsRequest(this);
        } 

    } 

}
