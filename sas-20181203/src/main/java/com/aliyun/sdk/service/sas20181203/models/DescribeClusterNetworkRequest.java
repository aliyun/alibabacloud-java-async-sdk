// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterNetworkRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNetworkRequest</p>
 */
public class DescribeClusterNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeClusterNetworkRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeClusterNetworkRequest, Builder> {
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNetworkRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end timestamp of the query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The days between the start timestamp and the end timestamp cannot exceed <strong>seven</strong> days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656038940435</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start timestamp of the query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The days between the start timestamp and the end timestamp cannot exceed <strong>seven</strong> days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656038740435</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeClusterNetworkRequest build() {
            return new DescribeClusterNetworkRequest(this);
        } 

    } 

}
